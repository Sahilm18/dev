package com.hexaware.ftp114.persistence;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.skife.jdbi.v2.tweak.ResultSetMapper;
import org.skife.jdbi.v2.StatementContext;

import com.hexaware.ftp114.model.Department;

public class DepartmentMapper implements ResultSetMapper<Department> {
  public final Department map(final int idx, final ResultSet rs,
   final StatementContext ctx) throws SQLException {
    return new Department(rs.getInt("deptno"), rs.getString("dname"), 
      rs.getString("loc"));
  }
}