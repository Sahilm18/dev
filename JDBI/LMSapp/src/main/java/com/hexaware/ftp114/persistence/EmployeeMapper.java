package com.hexaware.ftp114.persistence;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.skife.jdbi.v2.tweak.ResultSetMapper;
import org.skife.jdbi.v2.StatementContext;

import com.hexaware.ftp114.model.Employee;

public class EmployeeMapper implements ResultSetMapper<Employee> {
  public final Employee map(final int idx, final ResultSet rs,
   final StatementContext ctx) throws SQLException {
    return new Employee(rs.getInt("empno"), rs.getString("name"), 
      rs.getString("dept"),
        rs.getString("desig"), rs.getInt("basic"));

  }
}