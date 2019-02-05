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
   * return all the details of all the LeaveDetails.
   * @return the LeaveDetails array
   */
  @SqlQuery("SELECT * FROM LEAVE_DETAILS")
  @Mapper(LeaveDetailsMapper.class)
  List<LeaveDetails> list();

  /**
   * return all the details of all the LeaveDetails.
   * @return the LeaveDetails array
   */

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
}
