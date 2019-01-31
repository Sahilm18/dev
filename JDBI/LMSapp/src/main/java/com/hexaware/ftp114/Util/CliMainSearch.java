package com.hexaware.ftp114.util;
import java.util.Scanner;

import com.hexaware.ftp114.model.Employee;
import java.text.SimpleDateFormat;
import java.text.ParseException;


public class CliMainSearch {

    public static void main(String[] args){
        int empno;
        System.out.println("Enter Employ no ");
        Scanner sc = new Scanner(System.in);
        empno = sc.nextInt();
        Employee e = Employee.findEmp(empno);
        if (e != null){
            System.out.println("Empno " + e.getEmpno());
            System.out.println("Name " + e.getName());
            System.out.println("Dept " + e.getDept());
            System.out.println("Desig " + e.getDesig());
            System.out.println("Basic " + e.getBasic());
        }
        else {
            System.out.println("Sorry! Record not found...");
        }
    }
}