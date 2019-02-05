package com.hexaware.FTP114.persistence;


import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import com.hexaware.FTP114.model.LeaveDetails;
import com.hexaware.FTP114.model.LeaveStatus;
import com.hexaware.FTP114.model.LeaveType;
import org.skife.jdbi.v2.sqlobject.customizers.Mapper;

import java.util.List;

/**
 * The DAO class for LeaveDetails.
 */
public interface LeaveDetailsDAO  {
  /**
   * return all the details of selected employee.
   * @param empId the id of the employee.
   * @return the employee object.
   */
  @SqlQuery("SELECT * FROM LEAVE_DETAILS WHERE EMP_ID= :empId")
  @Mapper(LeaveDetailsMapper.class)
  List<LeaveDetails> leaveHistory(@Bind("empId") int  empId);

  /**
   * Update ApproveDeny Status.
   * @param leavStatus the Leave Status final valuer.
   * @param mgrCom the Manager response.
   * @param levId leaveId for approve/Deny.
   */
  @SqlUpdate("UPDATE LEAVE_DETAILS SET LEV_STATUS = :leavStatus, "
        +
        " LEV_MGR_COMMENTS = :mgrCom WHERE LEV_ID = :levId")
    void approveDeny(@Bind("levId") int levId,
          @Bind("leavStatus") String leavStatus,
          @Bind("mgrCom") String mgrCom);

  /**
   * return all the details of selected employee.
   * @param levId the id of the employee.
   * @return the list of employee details.
   */
  @SqlQuery("SELECT * FROM LEAVE_DETAILS WHERE LEV_ID= :levId")
   @Mapper(LeaveDetailsMapper.class)
   List<LeaveDetails> listById(@Bind("levId") int levId);

  /**
   * return all the details of selected employee.
   * @param levId the id of the employee.
   * @return the employee object.
   */
  @SqlQuery("SELECT * FROM LEAVE_DETAILS WHERE LEV_ID= :levId")
  @Mapper(LeaveDetailsMapper.class)
  LeaveDetails objectById(@Bind("levId") int levId);

   /**
   * insert all the details of the LeaveDetails.
   * @param empId the employee id
   * @param levStartDate the start date of the employee
   * @param levEndDate the end date of the employee
   * @param levNoOfDays the number of days
   * @param levType the type of leave
   * @param levStatus the status of leave
   * @param levReason the reason for leave
   * @param levAppliedDate the applied date of the employee
   */
  @SqlUpdate("INSERT INTO LEAVE_DETAILS "
               +
               "             (EMP_ID, "
               +
               "              LEV_STARTDATE, "
               +
               "              LEV_ENDDATE, "
               +
               "              LEV_NO_OF_DAYS, "
               +
               "              LEV_TYPE, "
               +
               "              LEV_STATUS, "
               +
               "              LEV_REASON, "
               +
               "              LEV_APPLIED_ON) "
               +
               "VALUES       ( "
               +
               "              :empId, "
               +
               "              :levStartDate, "
               +
               "              :levEndDate, "
               +
               "              :levNoOfDays, "
               +
               "              :levType, "
               +
               "              :levStatus, "
               +
               "              :levReason, "
               +
               "              :levAppliedDate)")
    void insert(@Bind("empId") int empId,
                @Bind("levStartDate") String levStartDate,
                @Bind("levEndDate") String levEndDate,
                @Bind("levNoOfDays") int levNoOfDays,
                @Bind("levType") LeaveType levType,
                @Bind("levStatus") LeaveStatus levStatus,
                @Bind("levReason") String levReason,
                @Bind("levAppliedDate") String levAppliedDate);

  /**
    * return count for already applied leave history.
    * @param empId the id of the empolyee.
    * @param levStartDate of the startdate.
    * @param levEndDate of the enddate.
    * @return total records.
 */
  @SqlQuery("SELECT COUNT(*) FROM LEAVE_DETAILS WHERE EMP_ID = :empId"
      +
      " AND LEV_STATUS = 'PENDING' AND "
      +
      " (LEV_STARTDATE <= :levStartDate AND LEV_ENDDATE >= :levStartDate OR "
      +
      " LEV_STARTDATE <= :levEndDate AND LEV_ENDDATE >= :levEndDate)")
    int count(@Bind("empId") int empId,
              @Bind("levStartDate") String levStartDate,
              @Bind("levEndDate") String levEndDate);
  /**
    * return all the details of the selected employee.
    * @param empId the id of the manager.
    * @return the pending leaves of manager.
 */
  @SqlQuery("SELECT * FROM leave_Details WHERE EMP_ID IN "
         +
         " (SELECT E2.Emp_Id FROM EMPLOYEE_DETAILS E1 INNER JOIN EMPLOYEE_DETAILS E2 "
         +
         " ON E1.EMP_ID=E2.MANAGER_ID "
         +
         " WHERE E1.EMP_ID=:empId) "
         +
         " AND LEV_STATUS='PENDING'"
      )
  @Mapper(LeaveDetailsMapper.class)
 List<LeaveDetails> pending(@Bind("empId") int empId);
}
