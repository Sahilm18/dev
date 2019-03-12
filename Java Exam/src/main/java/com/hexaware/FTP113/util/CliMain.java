package com.hexaware.FTP113.util;
import java.text.ParseException;
import java.util.Scanner;
import com.hexaware.FTP113.model.Employee;
import com.hexaware.FTP113.model.LeaveDetails;
import com.hexaware.FTP113.model.LeaveType;

/**
 * Class CliMain provides the command line interface to the leavemanagement
 * application.
 */
public class CliMain {
  private Scanner option = new Scanner(System.in, "UTF-8");

  private void mainMenu() {
    System.out.println("Leave Management System");
    System.out.println("-----------------------");
    System.out.println("1. List All Employees Info");
    System.out.println("2. Display Employee Info");
    System.out.println("3. Apply Leave");
    System.out.println("4. Leave History");
    System.out.println("5. Pending leave");
    System.out.println("6. Approve/Deny");
    System.out.println("7. Exit");
    System.out.println("Enter your choice:");
    int menuOption = option.nextInt();
    mainMenuDetails(menuOption);
  }
  private void mainMenuDetails(final int selectedOption) {
    switch (selectedOption) {
      case 1:
        listEmployeesDetails();
        break;
      case 2:
        listEmployeeDetail();
        break;
      case 3:
        applyLeave();
        break;
      case 4:
        leaveHistory();
        break;
      case 5:
        listPending();
        break;
      case 6:
        approveDeny();
        break;
      case 7:
        // halt since normal exit throws a stacktrace due to jdbc threads not responding
        Runtime.getRuntime().halt(0);

      default:
        System.out.println("Choose from 1 to 6");
    }
    mainMenu();
  }
  private void listEmployeeDetail() {
    System.out.println("Enter an Employee Id");
    int empId = option.nextInt();
    //Employee employee = Employee.listById(empId);
    Employee e = Employee.listById(empId);
    if (e == null) {
      System.out.println("Sorry, No such employee");
    } else {
      System.out.println("-----------------------------------------------------------------------");
      System.out.println("EmpId " + "\t" + " EmpFullName " + "\t" + " EmpEmail Id " + "\t\t\t"
          + "Mobile Number " + "\t" + "Date Of Joining " + "\t" + "Department " + "\t" + "Manager Id "
          + "\t" + "Leave Balance ");
      System.out.println("-----------------------------------------------------------------------");
      System.out.println(e.getEmpId() + "\t" + e.getEmpFullName() + "\t" + e.getEmpEmail() + "\t\t"
          + e.getEmpMobileNo() + "\t" + e.getEmpDateOfJoining() + "\t\t" + e.getEmpDepartment() + "\t"
          + e.getEmpMgrId() + "\t\t" + e.getEmpAvailLeavBal());
    }
  }
  private void listPending() {
    System.out.println("Enter employee(Manager) id:");
    int empId = option.nextInt();
    LeaveDetails[] listPending = LeaveDetails.listPending(empId);
    System.out.println("LeaId " + "\t" + "EmpId " + "\t" + "Days " + "\t"
        + "StartDate " + "\t" + "EndDate " + "\t" + "LeaType " + "\t" + "Status "
        + "\t\t" + "Reason " + "\t    " + "AppliedOn " + "\t\t" + "MgrComment ");
    for (LeaveDetails e : listPending) {
      System.out.println(e.getLeaId() + "\t" + e.getLeaEmpId() + "\t" + e.getLeaNumberOfDays()
          + "\t" + e.getLeaStartDate() + "\t" + e.getLeaEndDate() + "\t"
          + e.getLeaLeaveType() + "\t\t" + e.getLeaStatus() + " \t" + e.getLeaReason()
          + "     \t" + e.getLeaAppliedOn() + "  \t" + e.getLeaManagerComment());
    }
  }
  private void leaveHistory() {
    System.out.println("Enter employee id:");
    int empId = option.nextInt();
    LeaveDetails[] leaveHistory = LeaveDetails.listAll(empId);
    System.out.println("LeaId " + "\t" + "EmpId " + "\t" + "Days " + "\t"
        + "StartDate " + "\t" + "EndDate " + "\t" + "LeaType " + "\t" + "Status "
        + "\t\t" + "Reason " + "\t    " + "AppliedOn " + "\t\t" + "MgrComment ");
    for (LeaveDetails e : leaveHistory) {
      System.out.println(e.getLeaId() + "\t" + e.getLeaEmpId() + "\t" + e.getLeaNumberOfDays()
          + "\t" + e.getLeaStartDate() + "\t" + e.getLeaEndDate() + "\t"
          + e.getLeaLeaveType() + "\t\t" + e.getLeaStatus() + " \t" + e.getLeaReason()
          + "     \t" + e.getLeaAppliedOn() + "  \t" + e.getLeaManagerComment());
    }
  }
  private void approveDeny() {
    System.out.println("Enter leave ID");
    int leaId = option.nextInt();
    System.out.println("Enter Manager ID");
    int empMgrId = option.nextInt();
    System.out.println("Approved (YES/NO) ");
    String leaStatus = option.next();
    System.out.println("Manager Comments ");
    option.nextLine();
    String leaManagerComment = option.nextLine();
    String res = LeaveDetails.approveDeny(leaId, empMgrId, leaStatus, leaManagerComment);
    System.out.println(res);
  }
  private void listEmployeesDetails() {
    Employee[] employee = Employee.listAll();
    System.out.println("-----------------------------------------------------------------------");
    System.out.println("EmpId " + "\t" + " EmpFullName " + "\t" + " EmpEmail Id " + "\t\t\t"
          + "Mobile Number " + "\t" + "Date Of Joining " + "\t" + "Department " + "\t" + "Manager Id "
          + "\t" + "Leave Balance ");
    for (Employee e : employee) {
      System.out.println(e.getEmpId() + "\t" + e.getEmpFullName() + "\t" + e.getEmpEmail() + "\t\t"
          + e.getEmpMobileNo() + "\t" + e.getEmpDateOfJoining() + "\t\t" + e.getEmpDepartment() + "\t"
          + e.getEmpMgrId() + "\t\t" + e.getEmpAvailLeavBal());

    }
  }
  private void applyLeave()  {
    System.out.println("Enter Employee ID: ");
    int empId = option.nextInt();
    System.out.println("Enter start date:(YYYY-MM-DD)");
    String leaStartDate = option.next();
    System.out.println("Enter end Date:(YYYY-MM-DD)");
    String leaEndDate = option.next();
    System.out.println("Enter number of leave Days:");
    int leaNumberOfDays = option.nextInt();
    System.out.println("Enter leave Type:");
    String leaLeaveType = option.next();
    LeaveType lt = LeaveType.valueOf(leaLeaveType);
    System.out.println("Enter leave Reason:");
    String leaReason = option.next();
    String res = "";
    try {
      res = LeaveDetails.applyLeave(empId, leaStartDate, leaEndDate, leaNumberOfDays,
          lt, leaReason);
    } catch (ParseException e) {
      res = "Enter correct date....";
    }
    System.out.println(res);
  }
  /**
   * The main entry point.
   * @param ar the list of arguments
   */
  public static void main(final String[] ar) {
    final CliMain mainObj = new CliMain();
    mainObj.mainMenu();
  }
}
