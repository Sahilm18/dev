package com.hexaware.ftp114.model;
import com.hexaware.ftp114.persistence.DbConnection;
import com.hexaware.ftp114.persistence.EmployeeDAO;
import java.util.List;

public class Employee{

    private int empno;
    private String name;
    private String dept;
    private String desig;
    private int basic;

    public Employee(){

    }

    public Employee(int argEmpno,
                    String argName,
                    String argDept,
                    String argDesig,
                    int argBasic)
    {
        this.empno = argEmpno;
        this.name = argName;
        this.dept = argDept;
        this.desig = argDesig;
        this.basic = argBasic;
    }

    public final int getEmpno(){
        return empno;
    }

    public final void setEmpno(final int argEmpno){
        this.empno = argEmpno;
    }

    public final String getName(){
        return name;
    }

    public final void setName(final String argName){
        this.name = argName;
    }

    public final String getDept(){
        return dept;
    }

    public final void setDept(final String argDept){
        this.dept = argDept;
    }  

    public final String getDesig(){
        return desig;
    }

    public final void setDesig(final String argDesig){
        this.desig = argDesig;
    } 

    public final int getBasic(){
        return basic;
    }

    public final void setBasic(final int argBasic){
        this.basic = argBasic;
    } 

    private static EmployeeDAO dao(){
        DbConnection db = new DbConnection();
        return db.getConnect().onDemand(EmployeeDAO.class);
    }

    public static Employee[] listAll(){
        List<Employee> es = dao().list();
        return es.toArray(new Employee[es.size()]);
    }

    public static void insertEmp(int empno, String name, String dept, String desig, int basic){
        dao().insert(empno, name, dept, desig, basic);
    }

    public static Employee findEmp(int empno){
        return dao().find(empno);
    }
}