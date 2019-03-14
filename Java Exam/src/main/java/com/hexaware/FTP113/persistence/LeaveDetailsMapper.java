package com.hexaware.FTP113.persistence;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.skife.jdbi.v2.tweak.ResultSetMapper;
import org.skife.jdbi.v2.StatementContext;

import com.hexaware.FTP113.model.LeaveDetails;
import com.hexaware.FTP113.model.LeaveStatus;
import com.hexaware.FTP113.model.LeaveType;
import com.hexaware.FTP113.model.SslAppliedStatus;
/**
 * Mapper class to map from result set to LeaveDetails object.
 */
public class LeaveDetailsMapper implements ResultSetMapper<LeaveDetails> {
  /**
   * @param idx the index
   * @param rs the resultset
   * @param ctx the context
   * @return the mapped Leave_Details object
   * @throws SQLException in case there is an error in fetching data from the resultset
   */
  public final LeaveDetails map(final int idx, final ResultSet rs,
                                final      StatementContext ctx) throws SQLException {
    /**
     * @return LeaveDetails
     */
    String s1 = rs.getString("LEA_LEAVETYPE");
    LeaveType l1 = LeaveType.valueOf(s1);

    String s2 = rs.getString("LEA_STATUS");
    LeaveStatus l2 = LeaveStatus.valueOf(s2);

    String s3 = rs.getString("SSL_APPLIED_STATUS");
    SslAppliedStatus l3 = SslAppliedStatus.valueOf(s3);
    
    return new LeaveDetails(rs.getInt("LEA_ID"), rs.getInt("LEA_EMP_ID"), rs.getInt("LEA_NUMBEROFDAYS"),
    rs.getDate("LEA_STARTDATE"), rs.getDate("LEA_ENDDATE"),
    l1, l3, l2, rs.getString("LEA_REASON"),
    rs.getDate("LEA_APPLIEDON"), rs.getString("LEA_MANAGERCOMMENT"));
  }
}
