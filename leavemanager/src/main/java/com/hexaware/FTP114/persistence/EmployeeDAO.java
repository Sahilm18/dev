package com.hexaware.FTP114.persistence;

import com.hexaware.FTP114.model.Employee;

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
  @SqlQuery("SELECT * FROM EMPLOYEE_DETAILS")
  @Mapper(EmployeeMapper.class)
  List<Employee> list();

  /**
   * return all the details of the selected employee.
   * @param empID the id of the employee
   * @return the employee object
   */
  @SqlQuery("SELECT * FROM EMPLOYEE_DETAILS WHERE EMP_ID = :empID")
  @Mapper(EmployeeMapper.class)
  Employee find(@Bind("empID") int empID);

  /**
  * update leave balance of the employee.
  * @param empAvlLeaveBal to update leave balance of employee.
  * @param empId to get employee Id.
  */

  @SqlUpdate("UPDATE EMPLOYEE_DETAILS SET EMP_AVL_LEAVEBAL = :empAvlLeaveBal WHERE EMP_ID = :empId")
  @Mapper(EmployeeMapper.class)
  void update(@Bind ("empAvlLeaveBal") int empAvlLeaveBal,
              @Bind ("empId") int empId);

  /**
  * update leaveBalance of the employee after ApplyLeave.
  * @param empAvlLeaveBal to update leave balance of employee.
  * @param empId to get employee Id.
  */

  @SqlUpdate("UPDATE EMPLOYEE_DETAILS SET EMP_AVL_LEAVEBAL = :empAvlLeaveBal WHERE EMP_ID = :empId")
  @Mapper(EmployeeMapper.class)
  void increment(@Bind ("empId") int empId,
                 @Bind ("empAvlLeaveBal") int empAvlLeaveBal);

  /**
  * close with no args is used to close the connection.
  */
  void close();
}
