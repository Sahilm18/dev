package com.hexaware.ftp114.util;
import com.hexaware.ftp114.model.Department;

public class DeptMain {
  public static void main(final String[] ar) {
    Department[] department = Department.listAll();
    for (Department d : department) {
      System.out.println(d.getDeptno() + " " +
             d.getDname() + " " + d.getLoc());
    }
  }
}