package com.hexaware.FTP114.model;

import com.hexaware.FTP114.persistence.EmployeeDAO;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertNotNull;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import mockit.Expectations;
import mockit.MockUp;
import mockit.Mocked;
import mockit.Mock;
import mockit.integration.junit4.JMockit;

import java.util.ArrayList;

/**
* Test class for Employee.
*/
@RunWith(JMockit.class)
public class EmployeeTest {

   /**
    * setup method.
    */
  @Before
   public void initInput() {

  }

  /**
   * Tests the Parameterized Constructor and Get/Set employee class.
   * @throws ParseException in case there is an error in Constructor.
   */
  @Test
  public final void testParamCons() throws ParseException {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    String s1 = "2019-02-02";
    Date doj = sdf.parse(s1);
    Employee e200 = new Employee();
    Employee e100 = new Employee(1, "Anu", "anu@gmail.com", "8976574321", doj, 12, "FTP", 0);
    assertEquals(1, e100.getEmpId());
    assertEquals("Anu", e100.getEmpName());
    assertEquals("anu@gmail.com", e100.getEmpEmail());
    assertEquals("8976574321", e100.getEmpMob());
    assertEquals(doj, e100.getEmpJoinDate());
    assertEquals(12, e100.getEmpAvlLeaveBal());
    assertEquals("FTP", e100.getEmpDept());
    assertEquals(0, e100.getEmpMgrId());
    e200.setEmpId(3);
    e200.setEmpName("kalpana");
    e200.setEmpEmail("kalpana@gmail.com");
    e200.setEmpMob("7896543678");
    e200.setEmpJoinDate(doj);
    e200.setEmpAvlLeaveBal(10);
    e200.setEmpDept("FTP");
    e200.setEmpMgrId(0);
    assertEquals(3, e200.getEmpId());
    assertEquals("kalpana", e200.getEmpName());
    assertEquals("kalpana@gmail.com", e200.getEmpEmail());
    assertEquals("7896543678", e200.getEmpMob());
    assertEquals(doj, e200.getEmpJoinDate());
    assertEquals(10, e200.getEmpAvlLeaveBal());
    assertEquals("FTP", e200.getEmpDept());
    assertEquals(0, e200.getEmpMgrId());
    Employee e103 = new Employee(2, "Niru", "niru@gmail.com", "3657849021", doj, 20, "FTP", 0);
    Employee e104 = new Employee(2, "Niru", "niru@gmail.com", "3657849021", doj, 20, "FTP", 0);
    assertEquals(e103, e104);
    assertNotEquals(e200, e104);
    assertEquals(e103.hashCode(), e104.hashCode());
    String res = "EmpId 2 EmpName Niru EmpEmail niru@gmail.com EmpMob 3657849021 "
                 + "EmpJoinDate 2019-02-02 EmpAvlLeaveBal 20 EmpDept FTP EmpMgrId 0";
    Employee e1 = null;
    assertNotEquals(e103, e1);
    Employee e3 = new Employee();
    LeaveDetails l1 = new LeaveDetails();
    assertNotEquals(e3, l1);
    assertEquals(res, e103.toString());
    EmployeeDAO edao = Employee.dao();
    assertNotNull(edao);
  }

  /**
   * Tests the Default Constructor and employee class.
   */
  @Test
  public final void testDefaultCons() {
    Employee e100 = new Employee();
    assertNotNull(e100);
    Employee e200 = null;
    assertNull(e200);
  }
 /**
  * Tests the equals/hashcode methods of the employee class.
  */

/*  @Test
  public final void testEmployee() {
    Employee e100 = new Employee(2, "Niru", "niru@gmail.com", "3657849021", doj, 20, "FTP", 0);
    Employee e101 = new Employee();
    assertNotEquals(e100, null);
    //assertNotEquals(e100, new Integer(100));
    assertEquals(e100, new Employee(100));
    assertNotEquals(e101, new Employee(100));
    assertEquals(e100.hashCode(), new Employee(100).hashCode());
    assertEquals(e100.getEmpId(), new Employee(100).getEmpId());
    e101.setEmpId(100);
    assertEquals(e101, new Employee(100));
  }*/


 /**
  * tests that empty employee list is handled correctly.
  * @param dao mocking the dao class
  */
  @Test
  public final void testListAllEmpty(@Mocked final EmployeeDAO dao) {
    new Expectations() {
      {
        dao.list(); result = new ArrayList<Employee>();
      }
    };
    new MockUp<Employee>() {
      @Mock
    EmployeeDAO dao() {
        return dao;
      }
    };
    Employee[] es = Employee.listAll();
    assertEquals(0, es.length);
  }

 /**
  * Tests that a list with some employees is handled correctly.
  * @param dao mocking the dao class.
  * @throws ParseException when Exception occcurs.
  */
  @Test
 public final void testListAllSome(@Mocked final EmployeeDAO dao) throws ParseException {
    new Expectations() {
      {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String s1 = "2019-02-02";
        Date doj = sdf.parse(s1);
        ArrayList<Employee> es = new ArrayList<Employee>();
        es.add(new Employee(2, "Niru", "niru@gmail.com", "3657549021", doj, 20, "FTP", 01));
        es.add(new Employee(1, "Nireesha", "nireesha@gmail.com", "3697849021", doj, 20, "FTP", 0));
        es.add(new Employee(4, "Nisha", "nisha@gmail.com", "3653849021", doj, 20, "FTP", 0));
        dao.list();
        result = es;
      }
    };
    new MockUp<Employee>() {
      @Mock
      EmployeeDAO dao() {
        return dao;
      }
    };
    Employee[] es = Employee.listAll();
    assertEquals(3, es.length);
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    String s1 = "2019-02-02";
    Date doj = sdf.parse(s1);
    assertEquals(new Employee(2, "Niru", "niru@gmail.com", "3657549021", doj, 20, "FTP", 01), es[0]);
    assertEquals(new Employee(1, "Nireesha", "nireesha@gmail.com", "3697849021", doj, 20, "FTP", 0), es[1]);
    assertEquals(new Employee(4, "Nisha", "nisha@gmail.com", "3653849021", doj, 20, "FTP", 0), es[2]);
  }

   /**
  * Tests that a fetch of a specific employee works correctly.
  * @param dao mocking the dao class.
  * @throws ParseException when Exception occcurs.
  */
  @Test
 public final void testListById(@Mocked final EmployeeDAO dao) throws ParseException {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    String s1 = "2019-02-02";
    Date doj = sdf.parse(s1);
    final Employee e100 = new Employee(2, "Niru", "niru@gmail.com", "3657549021", doj, 20, "FTP", 01);
    new Expectations() {
      {
        dao.find(2); result = e100;
        dao.find(-1); result = null;
      }
    };
    new MockUp<Employee>() {
      @Mock
      EmployeeDAO dao() {
        return dao;
      }
    };
    Employee e = Employee.listById(2);
    assertEquals(e100, e);

    e = Employee.listById(-1);
    assertNull(e);
  }
}
