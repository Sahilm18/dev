package com.hexaware.FTP114.util;
import java.util.Scanner;
//import com.hexaware.FTP114.model.LeaveStatus;
import com.hexaware.FTP114.model.LeaveType;
import java.text.ParseException;
import com.hexaware.FTP114.model.LeaveDetails;
import com.hexaware.FTP114.model.Employee;


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
    System.out.println("4. Exit");
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
        // halt since normal exit throws a stacktrace due to jdbc threads not responding
        Runtime.getRuntime().halt(0);
      default:
        System.out.println("Choose either 1, 2 or 3");
    }
    mainMenu();
  }
  private void listEmployeeDetail() {
    System.out.println("Enter an Employee Id");
    int empId = option.nextInt();
    Employee employee = Employee.listById(empId);
    if (employee == null) {
      System.out.println("Sorry, No such employee");
    } else {
      System.out.println(employee);
    }
  }
  private void listEmployeesDetails() {
    Employee[] employee = Employee.listAll();
    for (Employee e : employee) {
      System.out.println(e);
    }
  }
  private void applyLeave()  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Employee ID :");
    int empId = sc.nextInt();
    System.out.println("Enter StartDate :(yyyy-MM-dd");
    String levStartDate = sc.next();
    System.out.println("Enter EndDate :(yyyy-MM-dd");
    String levEndDate = sc.next();
    System.out.println("Enter No.Of leave days");
    int levNoOfDays = sc.nextInt();
    System.out.println("Enter leaveType: ");
    String levType = sc.next();
    LeaveType lt = LeaveType.valueOf(levType);
    System.out.println("Enter leaveReason: ");
    String levReason = sc.next();
    String res = "";
    try {
      res = LeaveDetails.applyLeave(empId, levStartDate, levEndDate,
          levNoOfDays, lt, levReason);
    } catch (ParseException e) {
      System.out.println("Enter correct date");
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
