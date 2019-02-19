package com.hexaware.FTP114.persistence;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.skife.jdbi.v2.tweak.ResultSetMapper;
import org.skife.jdbi.v2.StatementContext;

import com.hexaware.FTP114.model.LeaveDetails;
import com.hexaware.FTP114.model.LeaveStatus;
import com.hexaware.FTP114.model.LeaveMaternityStatus;
import com.hexaware.FTP114.model.LeaveType;
/**
 * Mapper class to map from result set to employee object.
 */
public class LeaveDetailsMapper implements ResultSetMapper<LeaveDetails> {
  /**
   * @param idx the index
   * @param rs the resultset
   * @param ctx the context
   * @return the mapped employee object
   * @throws SQLException in case there is an error in fetching data from the resultset
   */
  public final LeaveDetails map(final int idx, final ResultSet rs, final StatementContext ctx) throws SQLException {
    /**
     * @return Employee
     */
    String s1 = rs.getString("LEV_TYPE");
    LeaveType l1 = LeaveType.valueOf(s1);

    String s2 = rs.getString("LEV_STATUS");
    LeaveStatus l2 = LeaveStatus.valueOf(s2);

    String s3 = rs.getString("LEV_MATERNITY_STATUS");
    LeaveMaternityStatus l3 = LeaveMaternityStatus.valueOf(s3);

    return new LeaveDetails(rs.getInt("LEV_ID"), rs.getInt("LEV_NO_OF_DAYS"),
                            rs.getDate("LEV_STARTDATE"), rs.getDate("LEV_ENDDATE"), l1, l2, l3,
                            rs.getString("LEV_REASON"), rs.getDate("LEV_APPLIED_ON"),
                            rs.getString("LEV_MGR_COMMENTS"), rs.getInt("EMP_ID"));
  }
}

