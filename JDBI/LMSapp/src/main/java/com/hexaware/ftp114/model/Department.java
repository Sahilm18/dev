package com.hexaware.ftp114.model;
import com.hexaware.ftp114.persistence.DbConnection;
import com.hexaware.ftp114.persistence.DepartmentDAO;
import java.util.List;

public class Department{

    private int deptno;
    private String dname;
    private String loc;

    public Department(){

    }

    public Department(int argDeptno,
                    String argDname,
                    String argLoc)
    {
        this.deptno = argDeptno;
        this.dname = argDname;
        this.loc = argLoc;
    }

    public final int getDeptno(){
        return deptno;
    }

    public final void setDeptno(final int argDeptno){
        this.deptno = argDeptno;
    }

    public final String getDname(){
        return dname;
    }

    public final void setDname(final String argDname){
        this.dname = argDname;
    }

    public final String getLoc(){
        return loc;
    }

    public final void setLoc(final String argLoc){
        this.loc = argLoc;
    }

    private static DepartmentDAO dao(){
        DbConnection db = new DbConnection();
        return db.getConnect().onDemand(DepartmentDAO.class);
    }

    public static Department[] listAll(){
        List<Department> ds = dao().list();
        return ds.toArray(new Department[ds.size()]);
    }
}    