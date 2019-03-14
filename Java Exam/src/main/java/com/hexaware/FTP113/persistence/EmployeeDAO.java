package com.hexaware.FTP113.persistence;

import com.hexaware.FTP113.model.Employee;

import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.Mapper;

import java.util.List;

/**
 * The DAO class for employee.
 */
public interface EmployeeDAO  {
  /**
   * return all the details of all the employees.
   * @return the employee array
   */
  @SqlQuery("SELECT * FROM EMPLOYEE")
  @Mapper(EmployeeMapper.class)
  List<Employee> list();

  /**
   * return all the details of the selected employee.
   * @param empId the id of the employee
   * @return the employee object
   */
  @SqlQuery("SELECT * FROM EMPLOYEE WHERE EMP_ID = :empId")
  @Mapper(EmployeeMapper.class)
  Employee find(@Bind("empId") int empId);

  @SqlUpdate("UPDATE EMPLOYEE SET EMP_AVAILLEAV_BAL=0 WHERE EMP_ID=:empid")
  void updateBal(@Bind("empid") int empid);
  /**
   * Update LeaveBalance after ApplyLeave.
   * @param empId the id of the manager.
   * @param updBal the latest leave Balance.
   */
  @SqlUpdate("UPDATE EMPLOYEE SET EMP_AVAILLEAV_BAL = :updBal WHERE EMP_ID = :empId")
  void decrement(@Bind("empId") int empId, @Bind("updBal") int updBal);
  /**
   * Update LeaveBalance after ApplyLeave.
   * @param empId the id of the manager.
   * @param updBal the latest leave Balance.
   */
  @SqlUpdate("UPDATE EMPLOYEE SET EMP_AVAILLEAV_BAL = :updBal WHERE EMP_ID = :empId")
  void increment(@Bind("updBal") int updBal, @Bind("empId") int empId);
  /**
  * close with no args is used to close the connection.
  */
  void close();
}
