package com.hexaware.FTP114.model;

import com.hexaware.FTP114.persistence.DbConnection;
import com.hexaware.FTP114.persistence.EmployeeDAO;
import com.hexaware.FTP114.persistence.LeaveDetailsDAO;

import java.util.Objects;
// import java.util.List;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

/**
 * Employee class to store employee personal details.
 * @author hexware
 */
public class LeaveDetails {
  /**
   * levId to store leave id.
   * levNoOfDays to store Leave number of days.
   * levStartDate to store leave StartDate.
   * levEndDate to store laeve EndDate.
   * levType to store LeaveType.
   * levStatus to store LeaveStatus.
   * levReason to store leave Reason.
   * levApplyDate to store leave ApplyDate.
   * levMgrComments to store leave Manager Comments.
   * empId to store employee Id.
   */
  private int levId;
  private int levNoOfDays;
  private Date levStartDate;
  private Date levEndDate;
  private LeaveType levType;
  private LeaveStatus levStatus;
  private String levReason;
  private Date levApplyDate;
  private String levMgrComments;
  private int empId;

  @Override
  public final boolean equals(final Object obj) {
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    LeaveDetails lev = (LeaveDetails) obj;
    if (Objects.equals(levId, lev.levId)) {
      return true;
    }
    return false;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(levId);
  }

  @Override
  public final String toString() {
    return " LevId:" + levId + " Leave No. of days:" + levNoOfDays
             + " Leave StartDate:" + levStartDate + " Leave EndDate:" + levEndDate
             + "Leave Type:" + levType + "Leave Status:" + levStatus
             + " Leave Reason:" + levReason + " Leave Apply Date:" + levApplyDate
             + " Leave Manager Comments:" + levMgrComments + " empId:" + empId;
  }

  /**
  * @param argLevId to initialize Leave ID.
  * @param argLevNoOfDays to initialize Leave Number of days.
  * @param argLevStartDate to initialize Leave Start Date.
  * @param argLevEndDate to initialize Leave End Date.
  * @param argLevType to initialize Leave Type.
  * @param argLevStatus to initialize Leave Status.
  * @param argLevReason to initialize Leave Reason.
  * @param argLevApplyDate to initialize Leave Apply Date.
  * @param argLevMgrComments to initialize Leave Manager Comments.
  * @param argEmpId to initialize Leave ID
  */

  public LeaveDetails(final int argLevId, final int argLevNoOfDays, final Date argLevStartDate,
                     final Date argLevEndDate, final LeaveType argLevType,
                     final LeaveStatus argLevStatus, final String argLevReason,
                     final Date argLevApplyDate,
                     final String argLevMgrComments, final int argEmpId) {
    this.levId = argLevId;
    this.levNoOfDays = argLevNoOfDays;
    this.levStartDate = argLevStartDate;
    this.levEndDate = argLevEndDate;
    this.levType = argLevType;
    this.levStatus = argLevStatus;
    this.levReason = argLevReason;
    this.levApplyDate = argLevApplyDate;
    this.levMgrComments = argLevMgrComments;
    this.empId = argEmpId;
  }

  /**
   * Gets the Leave Id.
   * @return this Leave ID.
   */
  public final int getLevId() {
    return levId;
  }

  /**
   *
   * @param argLevId to set leave id.
   */
  public final void setLevId(final int argLevId) {
    this.levId = argLevId;
  }

  /**
   * Gets the Leave number of days.
   * @return this LeaveNoOfDays.
   */
  public final int getLevNoOfDays() {
    return levNoOfDays;
  }
  /**
   *
   * @param argLevNoOfDays to set LevNoOfDays.
   */
  public final void setLevNoOfDays(final int argLevNoOfDays) {
    this.levNoOfDays = argLevNoOfDays;
  }
  /**
   *Gets the LeaveStartDate.
   *@return this LeaveStartDate.
   */
  public final Date getLevStartDate() {
    return levStartDate;
  }
  /**
   *
   *@param argLevStartDate to set Leave StartDate.
   */
  public final void setLevStartDate(final Date argLevStartDate) {
    this.levStartDate = argLevStartDate;
  }
  /**
   *Gets the LeaveEndDate.
   *@return this LeaveEndDate.
   */
  public final Date getLevEndDate() {
    return levEndDate;
  }
  /**
   *
   *@param argLevEndDate to set Leave EndDate.
   */
  public final void setLevEndDate(final Date argLevEndDate) {
    this.levEndDate = argLevEndDate;
  }
  /**
   * Gets the Leave type.
   * @return this Leave type.
   */
  public final LeaveType getLevType() {
    return levType;
  }
  /**
   *
   * @param argLevType to set LeaveType.
   */
  public final void setLevType(final LeaveType argLevType) {
    this.levType = argLevType;
  }
  /**
   *Gets the Leave Status.
   *@return this Leave Status.
   */
  public final LeaveStatus getLevStatus() {
    return levStatus;
  }

  /**
   *
   *@param argLevStatus to set Employee Leave Status.
   */
  public final void setLevStatus(final LeaveStatus argLevStatus) {
    this.levStatus = argLevStatus;
  }
  /**
   *Gets the Leave Reason.
   *@return this Leave Reason.
   */
  public final String getLevReason() {
    return levReason;
  }

  /**
   *
   *@param argLevReason to set Employee Leave Reason.
   */
  public final void setLevReason(final String argLevReason) {
    this.levReason = argLevReason;
  }
  /**
   *Gets the LeaveApplyDate.
   *@return this LeaveApplyDate.
   */
  public final Date getLevApplyDate() {
    return levApplyDate;
  }
  /**
   *
   *@param argLevApplyDate to set Leave ApplyDate.
   */
  public final void setLevApplyDate(final Date argLevApplyDate) {
    this.levApplyDate = argLevApplyDate;
  }
  /**
   *Gets the Leave Manager Comments.
   *@return this Leave Manager Comments.
   */
  public final String getLevMgrComments() {
    return levMgrComments;
  }

  /**
   *
   *@param argLevMgrComments to set Employee Manager Comments.
   */
  public final void setLevMgrComments(final String argLevMgrComments) {
    this.levMgrComments = argLevMgrComments;
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
   * The dao for LeaveDetails.
   */
  private static LeaveDetailsDAO dao() {
    DbConnection db = new DbConnection();
    return db.getConnect().onDemand(LeaveDetailsDAO.class);
  }

  /**
   * The dao for LeaveDetails.
   */
  private static EmployeeDAO edao() {
    DbConnection db = new DbConnection();
    return db.getConnect().onDemand(EmployeeDAO.class);
  }

  /**
   * @param argEmpId to set employee id
   * @param argLevStartDate to set leave start date
   * @param argLevEndDate to set leave end date
   * @param argLevNoOfDays to set leave number of days
   * @param argLevType to set Leave type
   * @param argLevReason to set Leave Reason
   * @return string from apply Leave
   * @throws ParseException in case there is an error in converting data
   */

  public static String applyLeave(final int argEmpId,
                                  final String argLevStartDate,
                                  final String argLevEndDate,
                                  final int argLevNoOfDays,
                                  final LeaveType argLevType,
                                  final String argLevReason) throws ParseException {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    Date sdate = sdf.parse(argLevStartDate);
    Date edate = sdf.parse(argLevEndDate);
    long ms = edate.getTime() - sdate.getTime();
    long m = ms / (1000 * 24 * 60 * 60);
    int days = (int) m;
    System.out.println(days);
    String res = "";
    Employee e = edao().find(argEmpId);
    int levAvail = e.getEmpAvlLeaveBal();
    int dif = levAvail - argLevNoOfDays;
    if (days < 0) {
      res = "StartDate Must be Greater Than EndDate...";
    } else if (dif < 0) {
      res = "Insufficient Leave Balance...";
    } else {
      days = days + 1;
      LeaveStatus leaveStatus = LeaveStatus.PENDING;
      Date cur = new Date();
      String appliedOn = sdf.format(cur);
      dao().insert(argEmpId, argLevStartDate, argLevEndDate,
          argLevNoOfDays, argLevType, leaveStatus, argLevReason, appliedOn);
      res = "Leave Applied Successfully...";
    }
    return res;
  }
}
