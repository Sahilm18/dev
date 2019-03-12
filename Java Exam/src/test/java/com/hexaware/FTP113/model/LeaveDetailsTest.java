package com.hexaware.FTP113.model;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.Date;

import com.hexaware.FTP113.persistence.EmployeeDAO;
import com.hexaware.FTP113.persistence.LeaveDetailsDAO;
import java.text.SimpleDateFormat;
import java.text.ParseException;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import java.util.ArrayList;

import mockit.Expectations;
import mockit.MockUp;
import mockit.Mocked;
import mockit.Mock;
import mockit.integration.junit4.JMockit;
/**
 * Unit test for Leavedetails.
 */
@RunWith(JMockit.class)
public class LeaveDetailsTest {
  /**
  * setup method.
  */
  @Before
  public void initInput() {

  }
/**
  * tests that empty LeaveDetailsTest is handled correctly.
  * @param dao mocking the dao class
  * @throws ParseException in case there is an error in converting date.
  */
  @Test
  public final void testListAllSome(@Mocked final LeaveDetailsDAO dao) throws ParseException {
    final ArrayList<LeaveDetails> lh1 = new ArrayList<LeaveDetails>();
    final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    final String s1 = "1998-12-12";
    final Date s = sdf.parse(s1);
    final String s2 = "1998-12-12";
    final Date e = sdf.parse(s2);
    final String s3 = "1998-12-10";
    final Date l = sdf.parse(s3);
    lh1.add(new LeaveDetails(1, 1, 4, s, e, LeaveType.EL, LeaveStatus.APPROVED, "sick", l, "Enjoy"));
    lh1.add(new LeaveDetails(2, 1, 4, s, e, LeaveType.EL, LeaveStatus.APPROVED, "sick", l, "Enjoy"));
    lh1.add(new LeaveDetails(3, 1, 4, s, e, LeaveType.EL, LeaveStatus.APPROVED, "sick", l, "Enjoy"));
    final ArrayList<LeaveDetails> lh2 = new ArrayList<LeaveDetails>();
    lh2.add(new LeaveDetails(4, 2, 4, s, e, LeaveType.EL, LeaveStatus.APPROVED, "sick", l, "Enjoy"));
    lh1.add(new LeaveDetails(5, 2, 4, s, e, LeaveType.EL, LeaveStatus.APPROVED, "sick", l, "Enjoy"));
    new Expectations() {
      {
        dao.leaveHistory(1);
        result = lh1;
        dao.leaveHistory(2);
        result = lh2;
      }
    };
    new MockUp<LeaveDetails>() {
      @Mock
      LeaveDetailsDAO dao() {
        return dao;
      }
    };
    LeaveDetails[] es1 = LeaveDetails.listAll(1);
    assertEquals(4, es1.length);
    LeaveDetails[] es2 = LeaveDetails.listAll(2);
    assertEquals(1, es2.length);
  }
  /**
  * Tests the default constructors methods of the LeaveDetials class.
  */
  @Test
  public final void testDefaultConstructor() {
    LeaveDetails l200 = new LeaveDetails();
    assertNotNull(l200);
    LeaveDetails l201 = null;
    assertNull(l201);
  }
  /**
  * Tests the Parameterized Constructors and Get/Set methods of the leavedetail class.
  * @throws ParseException in case there is an error in converting data.
  */
  @Test
  public final void testParamConstructor() throws ParseException {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    String s1 = "2019-02-12";
    Date sd = sdf.parse(s1);
    String s2 = "2019-02-13";
    Date ed  = sdf.parse(s2);
    String s3 = "2019-02-06";
    Date ad = sdf.parse(s3);
    LeaveType l1 = LeaveType.valueOf("PL");
    LeaveStatus l2 = LeaveStatus.valueOf("APPROVED");
    LeaveDetails l200 = new LeaveDetails(100, 2000, 2, sd, ed, l1, l2, "sick", ad, "cool");
    assertEquals(100, l200.getLeaId());
    assertEquals(2000, l200.getLeaEmpId());
    assertEquals(2, l200.getLeaNumberOfDays());
    assertEquals(sd, l200.getLeaStartDate());
    assertEquals(ed, l200.getLeaEndDate());
    assertEquals(l1, l200.getLeaLeaveType());
    assertEquals(l2, l200.getLeaStatus());
    assertEquals("sick", l200.getLeaReason());
    assertEquals(ad, l200.getLeaAppliedOn());
    assertEquals("cool", l200.getLeaManagerComment());
    LeaveDetails l201 = new LeaveDetails();
    l201.setLeaId(100);
    assertEquals(100, l201.getLeaId());
    l201.setLeaEmpId(2000);
    assertEquals(2000, l201.getLeaEmpId());
    l201.setLeaNumberOfDays(2);
    assertEquals(2, l201.getLeaNumberOfDays());
    l201.setLeaStartDate(sd);
    assertEquals(sd, l201.getLeaStartDate());
    l201.setLeaEndDate(ed);
    assertEquals(ed, l201.getLeaEndDate());
    l201.setLeaLeaveType(l1);
    assertEquals(l1, l201.getLeaLeaveType());
    l201.setLeaStatus(l2);
    assertEquals(l2, l201.getLeaStatus());
    l201.setLeaReason("sick");
    assertEquals("sick", l201.getLeaReason());
    l201.setLeaAppliedOn(ad);
    assertEquals(ad, l201.getLeaAppliedOn());
    l201.setLeaManagerComment("cool");
    assertEquals("cool", l201.getLeaManagerComment());
    LeaveDetails l202 = new LeaveDetails(101, 2001, 3, sd, ed, l1, l2, "sick", ad, "meetme");
    LeaveDetails l203 = new LeaveDetails(101, 2001, 3, sd, ed, l1, l2, "sick", ad, "meetme");
    LeaveDetails l204 = new LeaveDetails(102, 2001, 3, sd, ed, l1, l2, "sick", ad, "meetme");
    assertEquals(l202.hashCode(), l203.hashCode());
    assertEquals(l202, l203);
    LeaveDetails l205 = null;
    assertNotEquals(l202, l205);
    assertNotEquals(l202, l204);
    Employee e101 = new Employee();
    assertNotEquals(l202, e101);
    String res = "LeaveId: 101 Employee id: 2001 No of leave days: "
        + "3 Start Day of Leave: 2019-02-12 Leave End Date: "
        + "2019-02-13 Leave Type: PL Leave Status "
        + "APPROVED Reason for leave: sick Leave Applied On: "
        + "2019-02-06 Manager Comment: meetme";
    assertEquals(res, l202.toString());
    LeaveDetailsDAO dao = LeaveDetails.dao();
    assertNotNull(dao);
    EmployeeDAO dao1 = LeaveDetails.edao();
    assertNotNull(dao1);
  }
  /**
  * @param edao for mocking EmployeeDAO class.
  * @param ldao for mocking LeaveDetailsDAO class.
  * @throws ParseException for handling Date conversion issues.
  */
  @Test
  public final void testApplyLeave(@Mocked final EmployeeDAO edao, @Mocked final LeaveDetailsDAO ldao)
    throws ParseException {
    final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    final String sd1 = "1998-12-12";
    final Date doj = sdf.parse(sd1);
    final Employee e18 = new Employee(18, "Bhaskar", "gurana.bhaskar@gmail.com", "9989547605",
        doj, "Programmer", 0, 34);
    final Employee e19 = new Employee(19, "Bhaskar", "gurana.bhaskar@gmail.com", "9989547605",
        doj, "Programmer", 18, 34);

    new Expectations() {
      {
        edao.find(18); result = e18;
        edao.find(500); result = null;
        edao.find(19); result = e19;
      }
    };
    new Expectations() {
      {
        ldao.count(18, "2019-04-16", "2019-04-17"); result = 1;
        ldao.count(18, "2019-04-30", "2019-04-30"); result = 0;
      }
    };
    new Expectations() {
      {
        ldao.insert(18, 1, "2019-04-30", "2019-04-30", LeaveType.EL, LeaveStatus.APPROVED, "Sick", "2019-02-07");
        ldao.insert(19, 1, "2019-04-30", "2019-04-30", LeaveType.EL, LeaveStatus.PENDING, "Sick", "2019-02-07");
      }
    };
    new MockUp<LeaveDetails>() {
      @Mock
      LeaveDetailsDAO dao() {
        return ldao;
      }
    };
    new MockUp<Employee>() {
      @Mock
      EmployeeDAO dao() {
        return edao;
      }
    };
    String res1 = LeaveDetails.applyLeave(18, "2019-04-30", "2019-04-30", 1, LeaveType.EL, "Sick");
    assertEquals(res1, "Leave Auto Approved...");
    String res2 = LeaveDetails.applyLeave(18, "2019-04-16", "2019-04-17", 2, LeaveType.EL, "Sick");
    assertEquals(res2, "Already applied on given date....");
    String res3 = LeaveDetails.applyLeave(18, "2019-04-28", "2019-04-30", 1, LeaveType.EL, "Sick");
    assertEquals(res3, "Enter Correct No. of Days As.... 3");
    String res4 = LeaveDetails.applyLeave(18, "2019-04-30", "2019-04-28", 1, LeaveType.EL, "Sick");
    assertEquals(res4, "End date must be greater than Start date... ");
    String res5 = LeaveDetails.applyLeave(17, "2019-04-28", "2019-04-30", 3, LeaveType.EL, "Sick");
    assertEquals(res5, "Insufficient leave balance.. ");
    String res6 = LeaveDetails.applyLeave(500, "2019-04-28", "2019-04-30", 3, LeaveType.EL, "Sick");
    assertEquals(res6, "EmployId Not Found...");
    String res7 = LeaveDetails.applyLeave(18, "2019-02-06", "2019-02-08", 3, LeaveType.EL, "Sick");
    assertEquals(res7, "Start date is less than current date");
    String res8 = LeaveDetails.applyLeave(19, "2019-04-30", "2019-04-30", 1, LeaveType.EL, "Sick");
    assertEquals(res8, "Leave Applied Successfully...");
  }
}
