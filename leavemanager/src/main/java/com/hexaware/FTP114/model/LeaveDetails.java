package com.hexaware.FTP114.model;

import com.hexaware.FTP114.persistence.DbConnection;
import com.hexaware.FTP114.persistence.EmployeeDAO;
import com.hexaware.FTP114.persistence.LeaveDetailsDAO;

import java.util.Calendar;
import java.util.Objects;
import java.util.List;
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
   * levStatusMl to store LeaveMaternityStatus.
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
  private LeaveMaternityStatus levStatusMl;
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
    if (Objects.equals(levId, lev.levId)
        && Objects.equals(levNoOfDays, lev.levNoOfDays)
        && Objects.equals(levStartDate, lev.levStartDate)
        && Objects.equals(levEndDate, lev.levEndDate)
        && Objects.equals(levType, lev.levType)
        && Objects.equals(levStatus, lev.levStatus)
        && Objects.equals(levStatusMl, lev.levStatusMl)
        && Objects.equals(levReason, lev.levReason)
        && Objects.equals(levApplyDate, lev.levApplyDate)
        && Objects.equals(levMgrComments, lev.levMgrComments)
        && Objects.equals(empId, lev.empId)) {
      return true;
    }
    return false;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(levId, levNoOfDays, levStartDate, levEndDate, levType,
    levStatus, levStatusMl, levReason, levApplyDate, levMgrComments, empId);
  }

  @Override
  public final String toString() {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    String sd = sdf.format(levStartDate);
    String ed = sdf.format(levEndDate);
    String ad = sdf.format(levApplyDate);
    return " LevId:" + levId + " Leave No. of days:" + levNoOfDays
             + " Leave StartDate:" + sd + " Leave EndDate:" + ed
             + " Leave Type:" + levType + " Leave Status:" + levStatus
             + " Leave MAternity Status:" + levStatusMl
             + " Leave Reason:" + levReason + " Leave Apply Date:" + ad
             + " Leave Manager Comments:" + levMgrComments + " empId:" + empId;
  }
  /**
  * Default Constructor for leaveDetails class.
   */
  public LeaveDetails() {
  }
  /**
  * @param argLevId to initialize Leave ID.
  * @param argLevNoOfDays to initialize Leave Number of days.
  * @param argLevStartDate to initialize Leave Start Date.
  * @param argLevEndDate to initialize Leave End Date.
  * @param argLevType to initialize Leave Type.
  * @param argLevStatus to initialize Leave Status.
  * @param argLevStatusMl to initialize Leave Maternity Status.
  * @param argLevReason to initialize Leave Reason.
  * @param argLevApplyDate to initialize Leave Apply Date.
  * @param argLevMgrComments to initialize Leave Manager Comments.
  * @param argEmpId to initialize Leave ID
  */

  public LeaveDetails(final int argLevId, final int argLevNoOfDays, final Date argLevStartDate,
                     final Date argLevEndDate, final LeaveType argLevType,
                     final LeaveStatus argLevStatus, final LeaveMaternityStatus argLevStatusMl,
                     final String argLevReason, final Date argLevApplyDate,
                     final String argLevMgrComments, final int argEmpId) {
    this.levId = argLevId;
    this.levNoOfDays = argLevNoOfDays;
    this.levStartDate = argLevStartDate;
    this.levEndDate = argLevEndDate;
    this.levType = argLevType;
    this.levStatus = argLevStatus;
    this.levStatusMl = argLevStatusMl;
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
   * @param argLevNoOfDays to set LevNoOfDays.
   */
  public final void setLevNoOfDays(final int argLevNoOfDays) {
    this.levNoOfDays = argLevNoOfDays;
  }

  /**
   * Gets the LeaveStartDate.
   * @return this levStartDate.
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
   *Gets the Leave Maternity Status.
   *@return this Leave Maternity Status.
   */
  public final LeaveMaternityStatus getLevStatusMl() {
    return levStatusMl;
  }

  /**
   *
   *@param argLevStatusMl to set Employee Leave Maternity Status.
   */
  public final void setLevStatusMl(final LeaveMaternityStatus argLevStatusMl) {
    this.levStatusMl = argLevStatusMl;
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
   * @param argEmpId to set employee id.
   */
  public final void setEmpId(final int argEmpId) {
    this.empId = argEmpId;
  }

  /**
   * The dao for LeaveDetails.
   * @return the LeaveDetailsDAO class object.
   */
  public static LeaveDetailsDAO dao() {
    DbConnection db = new DbConnection();
    return db.getConnect().onDemand(LeaveDetailsDAO.class);
  }

  /**
   * The dao for Employee.
   * @return the EmployeeDAO class object.
   */
  public static EmployeeDAO edao() {
    DbConnection db = new DbConnection();
    return db.getConnect().onDemand(EmployeeDAO.class);
  }
  /**
   * list record by LevId.
   * @param levId to get leave details.
   * @return all leave details.
   */
  public static LeaveDetails listById(final int levId) {
    LeaveDetails es = dao().objectById(levId);
    return es;
  }
  /**
   * list all LeaveHistory details.
   * @param empId to get leave details.
   * @return all leave details.
   */
  public static LeaveDetails[] listAll(final int empId) {
    List<LeaveDetails> es = dao().leaveHistory(empId);
    return es.toArray(new LeaveDetails[es.size()]);
  }
  /**
    *list pending leave details.
    * @param empId to get pending lev details.
    * @return all pending details.
   */
  public static LeaveDetails[] listPending(final int empId) {
    List<LeaveDetails> es = dao().pending(empId);
    return es.toArray(new LeaveDetails[es.size()]);
  }

  /**
   * @param argLevId to set leave id.
   * @param argEmpMgrId to set ManagerId.
   * @param argStatus to set Approve or Deny.
   * @param argMgrComment to set Manager Responce.
   * @return leave applied statement.
   */
  public static String approveDeny(final int argLevId,
      final int argEmpMgrId,
      final String argStatus,
      final String argMgrComment) {
    String res = "";
    LeaveDetails ld = LeaveDetails.listById(argLevId);
    if (ld == null) {
      res = "Leave Details not found";
      return res;
    } else {
      int noDays = ld.getLevNoOfDays();
      int empId = ld.getEmpId();
      LeaveType lt = ld.getLevType();
      int levAvail = 0;
      Employee ed = Employee.listById(empId);
      if (lt == LeaveType.ML) {
        levAvail = ed.getEmpAvlLeaveBalMl();
      } else {
        levAvail = ed.getEmpAvlLeaveBalEl();
      }
      levAvail = levAvail + noDays;
      int mgrId = ed.getEmpMgrId();
      System.out.println("Mgr ID  " + mgrId);
      String leavStatus = "";
      String leavStatusMl = "";
      System.out.println(argStatus);
      if (mgrId != argEmpMgrId) {
        res = "You're not authorised to approve/deny the Leave";
      } else {
        if (argStatus.equals("YES")) {
          if (lt == LeaveType.ML) {
            res = "Leave Approved successfully by Manager. Now it'll be escalated to HR.";
            leavStatus = "APPROVED";
            leavStatusMl = "PENDING";
            dao().approveDenyMl(argLevId, leavStatus, leavStatusMl, argMgrComment);
          } else {
            res = "Leave Approved Successfully...";
            leavStatus = "APPROVED";
            levAvail = levAvail - noDays;
            dao().approveDeny(argLevId, leavStatus, argMgrComment);
          }
        } else {
          res = "Leave Rejected";
          leavStatus = "DENIED";
        }
        dao().approveDeny(argLevId, leavStatus, argMgrComment);
        edao().update(levAvail, empId);
      }
      return res;
    }
  }

  /**
   * @param argLevId to set leave id.
   * @param argEmpHrMgrId to set ManagerId.
   * @param argStatus to set Approve or Deny.
   * @param argMgrComment to set Manager Responce.
   * @return leave applied statement.
   */
  public static String approveDenyHr(final int argLevId,
      final int argEmpHrMgrId,
      final String argStatus,
      final String argMgrComment) {
    String res = "";
    LeaveDetails ld = LeaveDetails.listById(argLevId);
    if (ld == null) {
      res = "Leave Details not found";
      return res;
    } else {
      LeaveStatus ls = ld.getLevStatus();
      if (ls == LeaveStatus.APPROVED) {
        int noDays = ld.getLevNoOfDays();
        int empId = ld.getEmpId();
        int levAvail = 0;
        Employee ed = Employee.listById(empId);
        levAvail = ed.getEmpAvlLeaveBalMl();
        String dept = ed.getEmpDept();
        Employee hr = Employee.findHrMgrId(dept);
        int hrMgrId = hr.getEmpId();
        System.out.println("HrMgr ID  " + hrMgrId);
        String leavStatus = "";
        String leavStatusMl = "";
        if (hrMgrId != argEmpHrMgrId) {
          res = "You're not authorised to approve/deny the Leave";
        } else {
          if (argStatus.equals("YES")) {
            res = "Leave Approved Successfully...";
            leavStatus = "APPROVED";
            leavStatusMl = "APPROVED";
            levAvail = levAvail - noDays;
          } else {
            res = "Leave Rejected";
            leavStatus = "APPROVED";
            leavStatusMl = "DENIED";
          }
          dao().approveDenyMl(argLevId, leavStatus, leavStatusMl, argMgrComment);
          edao().updateMl(levAvail, empId);
        }
        return res;
      } else {
        res = "This leave is not approved by Manager.";
        return res;
      }
    }
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
    Date cur = new Date();
    Calendar calObj = Calendar.getInstance();
    calObj.setTime(edate);
    String appliedOn = sdf.format(cur);
    Date cdate = sdf.parse(appliedOn);
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(sdate);
    long ms = edate.getTime() - sdate.getTime();
    long m = ms / (1000 * 24 * 60 * 60);
    int count = dao().count(argEmpId, argLevStartDate, argLevEndDate);
    int days = (int) m;
    LeaveStatus leaveStatus;
    LeaveMaternityStatus leaveStatusMl;
    int levAvail;
    String desgn = "";
    String res = "";
    Employee e = Employee.listById(argEmpId);
    if (e == null) {
      res = "Such employee not found..";
      return res;
    } else {
      if (argLevType == LeaveType.ML) {
        levAvail = e.getEmpAvlLeaveBalMl();
      } else {
        levAvail = e.getEmpAvlLeaveBalEl();
      }
      int lEmpId = e.getEmpId();
      int mgrID = e.getEmpMgrId();
      desgn = e.getEmpDesgn();
      // String desgn = e.getEmpDesgn();
      int dif = levAvail - argLevNoOfDays;
      days = days + 1;
      if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY
          || calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
        res = "StartDate cannot be Saturday or Sunday";
      } else if (calObj.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY
          || calObj.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
        res = "EndDate cannot be Saturday or Sunday......";
      } else if (days < 0) {
        res = "EndDate Must be Greater Than StartDate...";
      } else if (dif < 0) {
        res = "Insufficient Leave Balance...";
      } else if (argLevNoOfDays != days) {
        res = "Enter correct Number of Days as " + days;
      } else if (sdate.compareTo(cdate) < 0) {
        res = " Startdate is less than CurrentDate";
      } else if (count == 1) {
        res = "Already applied on particular date";
      } else {
        if (mgrID == 0) {
          leaveStatus = LeaveStatus.APPROVED;
          leaveStatusMl = LeaveMaternityStatus.APPROVED;
          res = "Leave approved automatically";
        } else if (desgn.equals("HR_MANAGER") && argLevType == LeaveType.ML) {
          leaveStatus = LeaveStatus.APPROVED;
          leaveStatusMl = LeaveMaternityStatus.APPROVED;
          res = "Leave approved automatically";
        } else {
          leaveStatus = LeaveStatus.PENDING;
          leaveStatusMl = LeaveMaternityStatus.PENDING;
          res = "Leave Applied Successfully...";
        }
        dao().insertCeo(argEmpId, argLevStartDate, argLevEndDate,
            argLevNoOfDays, argLevType, leaveStatus, leaveStatusMl, argLevReason, appliedOn);
        levAvail = levAvail - days;
        if (argLevType == LeaveType.ML) {
          edao().updateMl(levAvail, lEmpId);
        } else {
          edao().update(levAvail, lEmpId);
        }
      }
      return res;
    }
  }
}
