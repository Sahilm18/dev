package com.hexaware.FTP113.model;

import com.hexaware.FTP113.persistence.DbConnection;
import com.hexaware.FTP113.persistence.EmployeeDAO;

import java.util.Objects;
import java.util.List;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * Employee class to store employee personal details.
 * @author hexware. 
 */
public class Employee {

  /**
   * empId to store employee id.
   * empFullName store employee name.
     empEmail store employee email.
     empMobileNo store employee number.
     empDateOfJoining store employee DOJ.
     empDepartment store employee MgrId.
     gullboy store employee available gully boy.
     empAvailLeavBal store employee available leave balance.
   */
  private int empId;
  private String empFullName;
  private String empEmail;
  private String empMobileNo;
  private Date empDateOfJoining;
  private String empDepartment;
  private int empMgrId;
  private String gullyboy;
  private int empAvailLeavBal;
  

  @Override
  public final boolean equals(final Object obj) {
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    Employee emp = (Employee) obj;
    if (Objects.equals(empId, emp.empId)
        && Objects.equals(empFullName, emp.empFullName)
        && Objects.equals(empEmail, emp.empEmail)
        && Objects.equals(empMobileNo, emp.empMobileNo)
        && Objects.equals(empDateOfJoining, emp.empDateOfJoining)
        && Objects.equals(empDepartment, emp.empDepartment)
        && Objects.equals(empMgrId, emp.empMgrId)
        && Objects.equals(gullyboy, emp.gullyboy)
        && Objects.equals(empAvailLeavBal, emp.empAvailLeavBal)) {
      return true;
    }
    return false;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(empId, empFullName, empEmail, empMobileNo, empDateOfJoining,
                        empDepartment, empMgrId, gullyboy, empAvailLeavBal);
  }
  @Override
  public final String toString() {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    String dj = sdf.format(empDateOfJoining);
    return " EmpId is: " + empId + " EmpFullName: " + empFullName + " EmpEmail: "
             + empEmail + " EmpMobileNo is: " + empMobileNo + " EmpDateOfJoining: "
             + dj + " EmpDepartment is: " + empDepartment + " EmpMgrId: "
             + empMgrId + " Gullboy: " Gullboy + " EmpAvailLeaveBal: " + empAvailLeavBal; }
  /**
   * Default Constructor.
   */
  public Employee() {

  }

  /**
   * @param argEmpId to initialize employee id.
   * @param argEmpFullName to initialize employee fullname.
   * @param argEmpEmail to initialize employee Email.
   * @param argEmpMobileNo to initialize employee MobileNo.
   * @param argEmpDateOfJoining to initialize employee DOJ.
   * @param argEmpDepartment to initialize employee dept.
   * @param argEmpMgrId to initialize employee manager Id.
     @param arggullyboy to initialize gullboy.
   * @param argEmpAvailLeavBal to initialize employee AvailLeaveBal.
   * 
   */
  public Employee(final int argEmpId, final String argEmpFullName, final String argEmpEmail,
                  final String argEmpMobileNo, final Date argEmpDateOfJoining,
                  final String argEmpDepartment, final int argEmpMgrId,final String arggullyboy,
                  final int argEmpAvailLeavBal,) {
    this.empId = argEmpId;
    this.empFullName = argEmpFullName;
    this.empEmail = argEmpEmail;
    this.empMobileNo = argEmpMobileNo;
    this.empDateOfJoining = argEmpDateOfJoining;
    this.empDepartment = argEmpDepartment;
    this.empMgrId = argEmpMgrId;
    this.empgullyboy = arggullyboy;
    this.empAvailLeavBal = argEmpAvailLeavBal;
    
  }

  /**
   * Gets the EmployeeId.
   * @return this Employee's ID.
   */
  public final int getEmpId() {
    return empId;
  }

  /**
   *
   * @param argEmpId to set employee id.
   */
  public final void setEmpId(final int argEmpId) {
    this.empId = argEmpId;

  }

  /**
   * Gets the EmployeeName.
   * @return this Employee's Name.
   */
  public final String getEmpFullName() {
    return empFullName;
  }
  /**
   *
   * @param argEmpFullName to set employee name.
   */

  public final void setEmpFullName(final String argEmpFullName) {
    this.empFullName = argEmpFullName;
  }
  /**
   * Gets the EmployeeEmail.
   * @return this Employee's Email.
   */
  public final String getEmpEmail() {
    return empEmail;
  }
   /**
   *
   * @param argEmpEmail to set employee name.
   */

  public final void setEmpEmail(final String argEmpEmail) {
    this.empEmail = argEmpEmail;
  }
  /**
   * Gets the EmployeeMobileNo.
   * @return this Employee's MobileNo.
   */
  public final String getEmpMobileNo() {
    return empMobileNo;
  }
  /**
   *
   * @param argEmpMobileNo to set employee MobileNo.
   */

  public final void setEmpMobileNo(final String argEmpMobileNo) {
    this.empMobileNo = argEmpMobileNo;
  }
  /**
   * Gets the EmployeeDOJ.
   * @return this Employee's DOJ.
   */
  public final Date getEmpDateOfJoining() {
    return empDateOfJoining;
  }
  /**
   *
   * @param doj to set employee DOJ.
   */

  public final void setEmpDateOfJoining(final Date doj) {
    this.empDateOfJoining = doj;
  }
  /**
   * Gets the EmployeeDepartment.
   * @return this Employee's Department.
   */
  public final String getEmpDepartment() {
    return empDepartment;
  }
  /**
   *
   * @param argEmpDepartment to set employee Department.
   */

  public final void setEmpDepartment(final String argEmpDepartment) {
    this.empDepartment = argEmpDepartment;
  }
  /**
   * Gets the Employee Manager ID.
   * @return this Employee's Manager ID.
   */
  public final int getEmpMgrId() {
    return empMgrId;
  }

  /**
   *
   * @param argEmpMgrId to set employee manager id.
   */
  public final void setEmpMgrId(final int argEmpMgrId) {
    this.empMgrId = argEmpMgrId;
  }

  public final String getgullyboy() {
    return gullyboy;
  }
  /**
   *
   * @param argGullyboy to set gully boy.
   */

  public final void setgullyboy(final String argGullyboy) {
    this.gullyboy = arggullyboy;
  }
  /**
   * Gets the Employee Available leave balance.
   * @return this Employee's Available leave balance.
   */
  public final int getEmpAvailLeavBal() {
    return empAvailLeavBal;
  }

  /**
   *
   * @param argEmpAvailLeavBal to set employee Available leave balance .
   */
  public final void setEmpAvailLeavBal(final int argEmpAvailLeavBal) {
    this.empAvailLeavBal = argEmpAvailLeavBal;
  }
  

  /**
   * The dao for employee.
   * @return connection.
   */
  public static EmployeeDAO dao() {
    DbConnection db = new DbConnection();
    return db.getConnect().onDemand(EmployeeDAO.class);
  }

  /**
   * list all employee details.
   * @return all employees' details
   */
  public static Employee[] listAll() {

    List<Employee> es = dao().list();
    return es.toArray(new Employee[es.size()]);
  }

  /**
   * list employee details by id.
   * @param empID id to get employee details.
   * @return Employee
   */
  public static Employee listById(final int empID) {
    return dao().find(empID);
  }

}
