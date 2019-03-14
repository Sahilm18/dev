package com.hexaware.FTP113.model;

//import com.hexaware.FTP113.persistence.EmployeeDAO;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import java.util.Date;

import com.hexaware.FTP113.persistence.EmployeeDAO;

import java.text.SimpleDateFormat;
import java.text.ParseException;

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
 * Unit test for Employee.
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
  * tests that empty employee list is handled correctly.
  * @param dao mocking the dao class
  */
  @Test
  public final void testListAllEmpty(@Mocked final EmployeeDAO dao) {
    new Expectations() {
      {
        dao.list();
        result = new ArrayList<Employee>();
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
   * Tests that a fetch of a specific employee works correctly.
   * @param dao mocking the dao class
   * @throws ParseException in case there is an error in converting date.
   */
  @Test
  public final void testListById(@Mocked final EmployeeDAO dao) throws ParseException {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    String d1 = "2015-05-15";
    Date sd1 = sdf.parse(d1);
    final Employee e18 = new Employee(18, "Bhaskar", "gurana.bhaskar@gmail.com",
                                      "9989547605", sd1, "Programmer", 663, 34);
    new Expectations() {
      {
        dao.find(18);
        result = e18;
        dao.find(-1);
        result = null;
      }
    };
    new MockUp<Employee>() {
      @Mock
      EmployeeDAO dao() {
        return dao;
      }
    };
    Employee e = Employee.listById(18);
    assertEquals(e18, e);
    e = Employee.listById(-1);
    assertNull(e);
  }
  /**
   * Tests the equals/hashcode methods of the employee class.
   */
  @Test
  public final void testDefaultConstructor() {
    Employee e100 = new Employee();
    assertNotNull(e100);
    Employee e101 = null;
    assertNull(e101);
  }
  /**
   * Tests the Parameterized Constructors and Get/Set methods of the employee class.
   * @throws ParseException in case there is an error in converting the code.
   */

  @Test
  public final void testParamConstructor() throws ParseException {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    String s1 = "1998-04-03";
    Date doj = sdf.parse(s1);
    String s2 = "1996-09-15";
    Date doj1 = sdf.parse(s2);
    Employee e100 = new Employee(1, "pavan", "uppada@gmail.com", "8978235639",
        doj, "Hexaversity", 10, 40);
    assertEquals(1, e100.getEmpId());
    assertEquals("pavan", e100.getEmpFullName());
    assertEquals("uppada@gmail.com", e100.getEmpEmail());
    assertEquals("8978235639", e100.getEmpMobileNo());
    assertEquals(doj, e100.getEmpDateOfJoining());
    assertEquals("Hexaversity", e100.getEmpDepartment());
    assertEquals(10, e100.getEmpMgrId());
    assertEquals(40, e100.getEmpAvailLeavBal());
    Employee e101 = new Employee();
    e101.setEmpId(2);
    assertEquals(2, e101.getEmpId());
    e101.setEmpFullName("Sanjana");
    assertEquals("Sanjana", e101.getEmpFullName());
    e101.setEmpEmail("sanjana@gmail.com");
    assertEquals("sanjana@gmail.com", e101.getEmpEmail());
    e101.setEmpMobileNo("77688588666");
    assertEquals("77688588666", e101.getEmpMobileNo());
    e101.setEmpDateOfJoining(doj1);
    assertEquals(doj1, e101.getEmpDateOfJoining());
    e101.setEmpDepartment("Hexaversity");
    assertEquals("Hexaversity", e101.getEmpDepartment());
    e101.setEmpMgrId(2000);
    assertEquals(2000, e101.getEmpMgrId());
    e101.setEmpAvailLeavBal(20);
    assertEquals(20, e101.getEmpAvailLeavBal());
    Employee e102 = new Employee(1, "pavan", "uppada@gmail.com", "8978235639", doj, "Hexaversity", 10, 40);
    Employee e103 = new Employee(1, "pavan", "uppada@gmail.com", "8978235639", doj, "Hexaversity", 10, 40);
    assertEquals(e102.hashCode(), e103.hashCode());
    Employee e104 = null;
    assertNotEquals(e102, e104);
    LeaveDetails ld = new LeaveDetails();
    assertNotEquals(e102, ld);
    assertEquals(e102, e103);
    String res1 = " EmpId is: 2 EmpFullName: Sanjana EmpEmail: "
        + "sanjana@gmail.com EmpMobileNo is: 77688588666 EmpDateOfJoining: "
        + "1996-09-15 EmpDepartment is: Hexaversity EmpMgrId: "
        + "2000 EmpAvailLeaveBal: 20";
    assertEquals(res1, e101.toString());
    EmployeeDAO edao = Employee.dao();
    assertNotNull(edao);
  }
}
 /**
   * tests that empty employee list is handled correctly.
   * @param dao mocking the dao class
   */
  /*@Test
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
   * @param dao mocking the dao class
   */
  /*@Test
  public final void testListAllSome(@Mocked final EmployeeDAO dao) {
    new Expectations() {
      {
        ArrayList<Employee> es = new ArrayList<Employee>();
        es.add(new Employee(1));
        es.add(new Employee(10));
        es.add(new Employee(100));
        dao.list(); result = es;
      }
  //  };
  //  new MockUp<Employee>() {
     // @Mock
    //  EmployeeDAO dao() {
     //   return dao;
   //   }
  //  };
  //  Employee[] es = Employee.listAll();
  //  assertEquals(3, es.length);
  //  assertEquals(new Employee(1), es[0]);
  //  assertEquals(new Employee(10), es[1]);
  //  assertEquals(new Employee(100), es[2]);
 // }

    /**
   * Tests that a fetch of a specific employee works correctly.
   * @param dao mocking the dao class
   */
 // @Test
 // public final void testListById(@Mocked final EmployeeDAO dao) {
 //   final Employee e100 = new Employee(100);
 //   new Expectations() {
     // {
      //  dao.find(100); result = e100;
    //    dao.find(-1); result = null;
  //    }
 //   };
  //  new MockUp<Employee>() {
  //    @Mock
 //     EmployeeDAO dao() {
 //       return dao;
  //    }
//    };
    //Employee e = Employee.listById(100);
    //assertEquals(e100, e);

    //e = Employee.listById(-1);
   // assertNull(e);
