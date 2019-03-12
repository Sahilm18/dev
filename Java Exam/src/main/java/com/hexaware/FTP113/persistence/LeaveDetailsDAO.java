package com.hexaware.FTP113.persistence;

import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.Mapper;

//import java.util.Date;
import java.util.List;

import com.hexaware.FTP113.model.LeaveDetails;
import com.hexaware.FTP113.model.LeaveStatus;
import com.hexaware.FTP113.model.LeaveType;
import com.hexaware.FTP113.model.SslAppliedStatus;

/**
 * The DAO class for LeaveDetails.
 */
public interface LeaveDetailsDAO  {
 /**
   * return all the details of all the Leave_Details.
   * @param empId the id of the employee
   * @return the LeaveDetails array
   */
  @SqlQuery("SELECT * FROM Leave_Details WHERE LEA_EMP_ID= :empId")
  @Mapper(LeaveDetailsMapper.class)
  List<LeaveDetails> leaveHistory(@Bind("empId")int empId);

  /**
   * return all the leave details of the selected leave id.
   * @param leaID the id of the employee
   * @return the employee object
   */
  @SqlQuery("SELECT * FROM Leave_Details WHERE Lea_ID = :leaID")
  @Mapper(LeaveDetailsMapper.class)
  LeaveDetails listById(@Bind("leaID") int leaID);

  @SqlQuery("SELECT COUNT(*) FROM LEAVE_DETAILS WHERE LEA_EMP_ID=:empid AND SSL_APPLIED_STATUS='YES'")
  int sslCount(@Bind("empid") int empid);

  @SqlUpdate("UPDATE LEAVE_DETAILS SET SSL_APPLIED_STATUS='YES' WHERE LEA_EMP_ID=:empid")
  void updateStatus(@Bind("empid") int empid);
  
  @SqlQuery("SELECT DATEDIFF(:today, :joinDate) / 30")
  int monthsBetween(@Bind("today") String today, @Bind("joinDate") String joinDate);
  /**
   * return count for already applied leave history.
   * @param empId the id of employee.
   * @param leaStartDate is the start date.
   * @param leaEndDate is the end date.
   * @return total records.
   */
  @SqlQuery("SELECT COUNT(*) FROM LEAVE_DETAILS WHERE LEA_EMP_ID = :empId "
      +
      "         AND LEA_STATUS = 'PENDING' AND "
      +
      "         (LEA_STARTDATE <= :leaStartDate AND LEA_ENDDATE >= :leaStartDate OR "
      +
      "         LEA_STARTDATE <= :leaEndDate AND LEA_ENDDATE >= :leaEndDate)")
  int count(@Bind("empId") int empId,
                  @Bind("leaStartDate") String leaStartDate,
                  @Bind("leaEndDate") String leaEndDate);
   /**
   * return all the details of the employee.
   * @param leaEmpId the employee id
   * @param leaStartDate the employee number of days
   * @param leaEndDate the start date of the employee
   * @param leaNumberOfDays the end date of the employee
   * @param leaLeaveType the reason for leave
   * @param leaStatus the status of the employee
   * @param leaReason the reason for leave
   * @param appliedOn the employee applied for the leave
   */
  @SqlUpdate("insert into LEAVE_Details "
             +
             "             (LEA_EMP_ID, "
             +
             "              LEA_NUMBEROFDAYS, "
             +
             "              LEA_STARTDATE, "
             +
             "              LEA_ENDDATE, "
             +
             "              LEA_LEAVETYPE, "
             +
             "              LEA_STATUS, "
             +
             "              LEA_REASON, "
             +
             "              LEA_APPLIEDON) "
             +
             "values       ( "
             +
             "              :leaEmpId, "
             +
             "              :leaNumberOfDays, "
             +
             "              :leaStartDate, "
             +
             "              :leaEndDate, "
             +
             "              :leaLeaveType, "
             +
             "              :leaStatus, "
             +
             "              :leaReason, "
             +
             "              :leaAppliedOn)")
  void insert(@Bind("leaEmpId") int leaEmpId,
              @Bind("leaNumberOfDays") int leaNumberOfDays,
              @Bind("leaStartDate") String leaStartDate,
              @Bind("leaEndDate") String leaEndDate,
              @Bind("leaLeaveType") LeaveType leaLeaveType,
              @Bind("leaStatus") LeaveStatus leaStatus,
              @Bind("leaReason") String leaReason,
              @Bind("leaAppliedOn") String appliedOn);
  /**
        * return all the details of the selected employee.
  * @param empId the id of the manager.
  * @return the pending leaves of manager.
  */
  @SqlQuery("SELECT * FROM Leave_Details WHERE LEA_EMP_ID IN"
         +
         " (SELECT E2.EMP_ID FROM EMPLOYEE E1 INNER JOIN EMPLOYEE E2 "
         +
         " ON E1.EMP_ID=E2.EMP_MGR_ID "
         +
         " WHERE E1.EMP_ID=:empId) "
         +
         " AND LEA_STATUS='PENDING'"
      )
  @Mapper(LeaveDetailsMapper.class)
  List<LeaveDetails> pending(@Bind("empId") int empId);

  /**
    * Update ApproveDeny status.
    * @param leaStatus The final leave status.
    * @param leaId leave ID for approve/deny.
    * @param leaManagerComment to get manager comment.
    */
  @SqlUpdate("UPDATE LEAVE_DETAILS SET LEA_STATUS = :leaStatus, "
        +
        " LEA_MANAGERCOMMENT = :leaManagerComment WHERE LEA_ID = :leaId")
    void approveDeny(@Bind("leaId") int leaId,
          @Bind("leaStatus") String leaStatus,
          @Bind("leaManagerComment") String leaManagerComment);
  /**
   * close with no args is used to close the connection.
   */
  void close();
}
