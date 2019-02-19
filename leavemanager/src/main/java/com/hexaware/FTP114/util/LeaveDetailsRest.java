package com.hexaware.FTP114.util;
import javax.ws.rs.POST;
import javax.ws.rs.GET;

// import javax.ws.rs.NotFoundException;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import com.hexaware.FTP114.model.LeaveDetails;

/**
 * This class provides a REST interface for the LeaveDetails entity.
 */
@Path("/leavedetails")
public class LeaveDetailsRest {

  /**
   * Returns a specific employee's details.
   * @param empMgrId the id of the manager.
   * @param status gives the status of leave.
   * @param l the object of the LeaveDetails.
   * @return the approve details.
   * @throws ParseException for handling exception.
   */

  @POST
  @Path("/approveDeny/{empMgrId}/{status}")
  @Consumes(MediaType.APPLICATION_JSON)
  @Produces(MediaType.APPLICATION_JSON)
  public final String approveDeny(@PathParam("empMgrId") final int empMgrId,
      @PathParam("status") final String status, final LeaveDetails l) throws ParseException {
    // LeaveStatus lt = l.getLevStatus() toStr;
    String s = LeaveDetails.approveDeny(l.getLevId(), empMgrId, status, l.getLevMgrComments());
    return s;
  }

/**
 * applying leave.
 * @param empId the id of the employee.
 * @param l the id of the employee.
 * @throws ParseException for date issue.
 * @return applied leave status.
 */

  @POST
  @Path("/appLeave/{empId}")
  @Consumes(MediaType.APPLICATION_JSON)
  @Produces(MediaType.APPLICATION_JSON)
  public final String appLeave(@PathParam("empId") final int empId, final LeaveDetails l) throws ParseException {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    String sdate = sdf.format(l.getLevStartDate());
    String edate = sdf.format(l.getLevEndDate());
    String s = LeaveDetails.applyLeave(empId, sdate, edate, l.getLevNoOfDays(), l.getLevType(), l.getLevReason());
    return s;
  }

  /**
   * Returns a list of all the pending leaves.
   * @param id for passing mgr id.
   * @return a list of all the pending leaves.
   */
  @GET
  @Path("/pending/{id}")
  @Produces(MediaType.APPLICATION_JSON)
  public final LeaveDetails[] pendingList(@PathParam("id") final int id) {
    System.out.println("Pending leaves List");
    final LeaveDetails[] pending = LeaveDetails.listPending(id);
    return pending;
  }
  /**
   * Returns a list of all the leave history.
   * @param id for passing emp id.
   * @return a list of all the leave history.
   */
  @GET
  @Path("/history/{id}")
  @Produces(MediaType.APPLICATION_JSON)
  public final LeaveDetails[] historyList(@PathParam("id") final int id) {
    System.out.println("Leave History List");
    final LeaveDetails[] history = LeaveDetails.listAll(id);
    return history;
  }
}
