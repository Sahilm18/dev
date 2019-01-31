package com.hexaware.ftp114.util;
import java.util.Scanner;

import com.hexaware.ftp114.model.Employee;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class CliMainInsert{

    public static void main(final String[] ar){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee no. ");
        int empno = Integer.parseInt(sc.nextLine());
        System.out.println("Enter Name ");
        String name  = sc.nextLine();
        System.out.println("Enter Department ");
        String dept  = sc.nextLine();
        System.out.println("Enter Designation ");
        String desig  = sc.nextLine();        
        System.out.println("Enter Salary ");
        int basic = Integer.parseInt(sc.nextLine());
        Employee.insertEmp(empno, name, dept, desig, basic);
        System.out.println("Record Inserted...");
    }

}