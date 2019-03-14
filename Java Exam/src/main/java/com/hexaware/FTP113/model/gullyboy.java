package com.hexaware.FTP113.model;

import com.hexaware.FTP113.persistence.DbConnection;
import com.hexaware.FTP113.persistence.EmployeeDAO;
import com.hexaware.FTP113.persistence.LeaveDetailsDAO;
import java.util.Objects;
import java.util.List;
import java.util.Calendar;
import java.text.ParseException;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;



/**
 * LeaveDetails class to store employee's leave details.
 * @author hexware
 */
public class LeaveDetails {

  /**
   * leaId to store employee's leave id.
   * leaEmpId to store employee id.
   * leaNumberOfDays store leave days.
   * leaStartDate store employee's leave start date.
   * leaEndDate store employee's leave end date.
   * leaLeaveType store employee leave type.
   * leaStatus store employee leave status.
   * leaReason store employee leave reason.
   * leaAppliedOn store employee leave applied on.
   * leaManagerComment store employee manager comments.
   */
  private int leaId;
  private int leaEmpId;
  private int leaNumberOfDays;
  private Date leaStartDate;
  private Date leaEndDate;
  private LeaveType leaLeaveType;
  private SslAppliedStatus leaSslAppliedStatus;
  private LeaveStatus leaStatus;
  private String leaReason;
  private Date leaAppliedOn;
  private String leaManagerComment;

  @Override
  public final boolean equals(final Object obj) {
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    LeaveDetails lea = (LeaveDetails) obj;
    if (Objects.equals(leaId, lea.leaId)
        && Objects.equals(leaEmpId, lea.leaEmpId)
        && Objects.equals(leaNumberOfDays, lea.leaNumberOfDays)
        && Objects.equals(leaStartDate, lea.leaStartDate)
        && Objects.equals(leaEndDate, lea.leaEndDate)
        && Objects.equals(leaLeaveType, lea.leaLeaveType)
        && Objects.equals(leaSslAppliedStatus,lea.leaSslAppliedStatus)
        && Objects.equals(leaStatus, lea.leaStatus)
        && Objects.equals(leaReason, lea.leaReason)
        && Objects.equals(leaAppliedOn, lea.leaAppliedOn)
        && Objects.equals(leaManagerComment, lea.leaManagerComment)) {
      return true;
    }
    return false;
  }
  @Override
  public final int hashCode() {
    return Objects.hash(leaId, leaEmpId, leaNumberOfDays, leaStartDate, leaEndDate, leaLeaveType,
                        leaSslAppliedStatus,leaStatus, leaReason, leaAppliedOn, leaManagerComment);
  }
  @Override
  public final String toString() {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    String dj = sdf.format(leaStartDate);
    String dj1 = sdf.format(leaEndDate);
    String dj2 = sdf.format(leaAppliedOn);
    return "LeaveId: " + leaId + " Employee id: " + leaEmpId + " No of leave days: "
             + leaNumberOfDays + " Start Day of Leave: " + dj + " Leave End Date: "
             + dj1 + " Leave Type: " + leaLeaveType + "Sslappliedstatus:" +leaSslAppliedStatus+ " Leave Status "
             + leaStatus + " Reason for leave: " + leaReason + " Leave Applied On: "
             + dj2 + " Manager Comment: " + leaManagerComment;
  }
  /**
   * Default Constructors for LeaveDetails.
   */
  public LeaveDetails() {

  }
  /**
   * @param argLeaId to initialize employee's leave id.
   * @param argLeaEmpId to initialize employee id.
   * @param argLeaNumberOfDays to initialize leave days.
   * @param argLeaStartDate to initialize leave start date.
   * @param argLeaEndDate to initialize leave end date.
   * @param argLeaLeaveType to initialize leave type.
   * @param argLeaStatus to initialize leave Status.
   * @param argLeaReason to initialize leave reason.
   * @param argLeaAppliedOn to initialize leave applied on.
   * @param argLeaManagerComment to initialize manager comments.
   */
  public LeaveDetails(final int argLeaId, final int argLeaEmpId, final int argLeaNumberOfDays,
                  final Date argLeaStartDate, final Date argLeaEndDate,
                  final LeaveType argLeaLeaveType,final SslAppliedStatus argleaSslAppliedStatus, final LeaveStatus argLeaStatus, final String argLeaReason,
                  final Date argLeaAppliedOn, final String argLeaManagerComment) {
    this.leaId = argLeaId;
    this.leaEmpId = argLeaEmpId;
    this.leaNumberOfDays = argLeaNumberOfDays;
    this.leaStartDate = argLeaStartDate;
    this.leaEndDate = argLeaEndDate;
    this.leaLeaveType = argLeaLeaveType;
    this.leaSslAppliedStatus = argleaSslAppliedStatus;
    this.leaStatus = argLeaStatus;
    this.leaReason = argLeaReason;
    this.leaAppliedOn = argLeaAppliedOn;
    this.leaManagerComment = argLeaManagerComment;
  }

/**
   * Gets the LeaId.
   * @return this Employee's leave id.
   */
  public final int getLeaId() {
    return leaId;
  }

  /**
   *
   * @param argLeaId to set employee leave id.
   */
  public final void setLeaId(final int argLeaId) {
    this.leaId = argLeaId;

  }

  /**
   * Gets the EmpId.
   * @return this Employee's ID.
   */
  public final int getLeaEmpId() {
    return leaEmpId;
  }

  /**
   *
   * @param argEmpId to set employee id.
   */
  public final void setLeaEmpId(final int argEmpId) {
    this.leaEmpId = argEmpId;

  }

  /**
   * Gets the LeaNumberOfDay.
   * @return this Employee's leave days.
   */
  public final int getLeaNumberOfDays() {
    return leaNumberOfDays;
  }

  /**
   *
   * @param argLeaNumberOfDays to set employee leave NumberOfDay.
   */
  public final void setLeaNumberOfDays(final int argLeaNumberOfDays) {
    this.leaNumberOfDays = argLeaNumberOfDays;
  }

  /**
   * Gets the LeaStartDate.
   * @return this Employee's Leave Start date.
   */
  public final Date getLeaStartDate() {
    return leaStartDate;
  }

  /**
   *
   * @param argLeaStartDate to set employee leave start date.
   */
  public final void setLeaStartDate(final Date argLeaStartDate) {
    this.leaStartDate = argLeaStartDate;
  }
  /**
   * Gets the LeaEndDate.
   * @return this Employee's Leave End date.
   */
  public final Date getLeaEndDate() {
    return leaEndDate;
  }

  /**
   *
   * @param argLeaEndDate to set employee leave End date.
   */
  public final void setLeaEndDate(final Date argLeaEndDate) {
    this.leaEndDate = argLeaEndDate;
  }

  /**
   * Gets the LeaLeaveType.
   * @return this Employee's leave Type.
   */
  public final LeaveType getLeaLeaveType() {
    return leaLeaveType;
  }

  /**
   *
   * @param argLeaLeaveType to set employee leave Type.
   */
  public final void setLeaLeaveType(final LeaveType argLeaLeaveType) {
    this.leaLeaveType = argLeaLeaveType;
  }


 /**
   * Gets the LeaLeaveType.
   * @return this Employee's leave Type.
   */
  public final SslAppliedStatus getleaSslAppliedStatus() {
    return leaSslAppliedStatus;
  }

  /**
   *
   * @param argLeaLeaveType to set employee leave Type.
   */
  public final void setleaSslAppliedStatus(final SslAppliedStatus argleaSslAppliedStatus) {
    this.leaSslAppliedStatus = argleaSslAppliedStatus;
  }

  /**
   * Gets the LeaLeaveStatus.
   * @return this Employee's leave Status.
   */
  public final LeaveStatus getLeaStatus() {
    return leaStatus;
  }

  /**
   * @param argLeaStatus to set employee leave Status.
    */
  public final void setLeaStatus(final LeaveStatus argLeaStatus) {
    this.leaStatus = argLeaStatus;
  }

  /**
   * Gets the LeaReason.
   * @return this Employee's leave reason.
   */
  public final String getLeaReason() {
    return leaReason;
  }

  /**
   *
   * @param argLeaReason to set employee leave reason.
   */
  public final void setLeaReason(final String argLeaReason) {
    this.leaReason = argLeaReason;
  }

  /**
   * Gets the LeaAppliedOn.
   * @return this Employee's Leave Applied On.
   */
  public final Date getLeaAppliedOn() {
    return leaAppliedOn;
  }

  /**
   *
   * @param argLeaAppliedOn to set employee leave applied on.
   */
  public final void setLeaAppliedOn(final Date argLeaAppliedOn) {
    this.leaAppliedOn = argLeaAppliedOn;
  }

  /**
   * Gets the LeaManagerComment.
   * @return this Employee's leave Manager Comments.
   */
  public final String getLeaManagerComment() {
    return leaManagerComment;
  }

  /**
   *
   * @param argLeaManagerComment to set employee leave manager comment.
   */
  public final void setLeaManagerComment(final String argLeaManagerComment) {
    this.leaManagerComment = argLeaManagerComment;
  }

  /**
   * The dao for employee.
   * @return connection.
   */
  public static EmployeeDAO edao() {
    DbConnection db = new DbConnection();
    return db.getConnect().onDemand(EmployeeDAO.class);
  }

  /**
   * The dao for LeaveDetails.
   * @return connection.
   */
  public static LeaveDetailsDAO dao() {
    DbConnection db = new DbConnection();
    return db.getConnect().onDemand(LeaveDetailsDAO.class);
  }
  /**
   * list all LeaveHistory details.
   * @param empId to get leave Details.
   * @return all leave details.
   */
  public static LeaveDetails[] listAll(final int empId) {
    List<LeaveDetails> es = dao().leaveHistory(empId);
    return es.toArray(new LeaveDetails[es.size()]);
  }

  /**
   * list pending leave details.
   * @param empId to get pending lev details.
   * @return all pending details.
   */
  public static LeaveDetails[] listPending(final int empId) {
    List<LeaveDetails> es = dao().pending(empId);
    return es.toArray(new LeaveDetails[es.size()]);
  }
  /**
   * @param argLeaId to set leave ID.
   * @param argEmpMgrId to set manager ID.
   * @param argStatus to set approve/deny.
   * @param argLeaManagerComment to set manager responce.
   * @return leave applied statement.
   */
  public static String approveDeny(final int argLeaId,
      final int argEmpMgrId,
      final String argStatus,
      final String argLeaManagerComment) {
    String res = "";
    LeaveDetails ld = dao().listById(argLeaId);
    int noDays = ld.getLeaNumberOfDays();
    int empId = ld.getLeaEmpId();
    Employee ed = Employee.listById(empId);
    int leaAvail = ed.getEmpAvailLeavBal();
    leaAvail = leaAvail + noDays;
    int mgrId = ed.getEmpMgrId();
    String leaStatus = "";
    if (mgrId != argEmpMgrId) {
      res = "You are unauthorised to approve the leave";
    } else {
      if (argStatus.equals("YES")) {
        res = "Leave Approved Sucessfully...";
        leaStatus = "APPROVED";
        dao().approveDeny(argLeaId, leaStatus, argLeaManagerComment);
      } else {
        res = "Leave Rejected";
        leaStatus = "DENIED";
        dao().approveDeny(argLeaId, leaStatus, argLeaManagerComment);
        edao().increment(empId, leaAvail);
      }
    }
    return res;
  }

  /**
   * @param argEmpId to initialize employee's id.
   * @param argLeaStartDate to initialize start date of leave.
   * @param argLeaEndDate to initialize end date of leave.
   * @param argLeaNumberOfDays to initialize leave number of days.
   * @param argLeaType to initialize type of leave.
   * @param argLeaReason to initialize reason for leave.
   * @return string from apply leave.
   * @throws ParseException is thrown in case there is an error in converting data.
   */

  public static String applyLeave(final int argEmpId,
                                  final String argLeaStartDate,
                                  final String argLeaEndDate,
                                  final int argLeaNumberOfDays,
                                  final LeaveType argLeaType,
                                  final String argLeaReason) throws ParseException {
    Date cur = new Date();
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    Date sDate = sdf.parse(argLeaStartDate);
    Date eDate = sdf.parse(argLeaEndDate);
    //Date cDate = sdf.parse(leaAppliedOn);
    long ms = eDate.getTime() - sDate.getTime();
    long leaNumberOfDays = ms / (1000 * 60 * 60 * 24);
    int leavedays = (int) leaNumberOfDays;
    leavedays = leavedays + 1;
    System.out.println("number of days applied" + leavedays);
    String res = "";
    final Date curDate = new Date();
    Employee e = Employee.listById(argEmpId);
    if (e != null) {
      final int empMgrId = e.getEmpMgrId();
      int empAvailLeavBal = e.getEmpAvailLeavBal();
      System.out.println("Available " + empAvailLeavBal);
      int diff = empAvailLeavBal - leavedays;
      System.out.println("difference is " + diff);
      empAvailLeavBal = empAvailLeavBal - diff;
      //System.out.println("Available next" + empAvailLeavBal);
      int count = dao().count(argEmpId, argLeaStartDate, argLeaEndDate);
      System.out.println("Applied Count Status " + count);
      if (count >= 1) {
        res = "Already applied on given date....";
      } else if (leavedays < 0) {
        res = "End date must be greater than Start date... ";
      } else if (diff < 0) {
        Date dt = e.getEmpDateOfJoining();
        Date td = new Date();
        String sdt = sdf.format(dt); 
        System.out.println(sdt);
        String std = sdf.format(td); 
        int mdiff = dao().monthsBetween(std,sdt); 
        System.out.println("Difference  " + mdiff);
        int sslCount = dao().sslCount(argEmpId);
        System.out.println("SSL Count " + sslCount);
        //check he is available for SSL
        //Check he is not applied SSL 
        //Check SSL +EL not cross 30 days 
        if(mdiff >= 6 && sslCount == 0) {
          Scanner option = new Scanner(System.in);
          System.out.println("Wish to Apply for SSL (Yes/No) ");
          String choice = option.next();
          if(choice.equals("YES")) {
            if (leavedays <= 30) {
                LeaveStatus leaStatus = LeaveStatus.PENDING;
                String leaAppliedOn = sdf.format(cur);
                dao().insert(argEmpId, argLeaNumberOfDays, argLeaStartDate, argLeaEndDate,
                     argLeaType, leaStatus, argLeaReason, leaAppliedOn);
                                dao().updateStatus(argEmpId);
                edao().updateBal(argEmpId);
                res = "Leave Applied with Support SSL";
            }
          } else {
            res ="You are not avail your SSL Rejected...";
          }
        } else {
          res = "Insufficient and Already Applied for SSL No Chance.";
        }
    //    res = "Insufficient leave balance.. ";
      } else if (argLeaNumberOfDays != leavedays) {
        res = "Enter Correct No. of Days As.... " + leavedays;
      } else if (sDate.compareTo(curDate) < 0) {
        res = "Start date is less than current date";
      } else if (empMgrId == 0) {
        LeaveStatus leaStatus = LeaveStatus.APPROVED;
        String leaAppliedOn = sdf.format(cur);
        dao().insert(argEmpId, argLeaNumberOfDays, argLeaStartDate, argLeaEndDate,
                     argLeaType, leaStatus, argLeaReason, leaAppliedOn);
        edao().decrement(argEmpId, diff);
        res = "Leave Auto Approved...";
      } else {
        LeaveStatus leaStatus = LeaveStatus.PENDING;
        String leaAppliedOn = sdf.format(cur);
        dao().insert(argEmpId, argLeaNumberOfDays, argLeaStartDate, argLeaEndDate,
                     argLeaType, leaStatus, argLeaReason, leaAppliedOn);
        edao().decrement(argEmpId, diff);
        res = "Leave Applied Successfully...";
      }
    } else {
      res = "EmployId Not Found...";
    }
    return res;
  }
}
