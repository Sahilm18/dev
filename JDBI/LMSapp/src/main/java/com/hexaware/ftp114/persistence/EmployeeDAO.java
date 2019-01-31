package com.hexaware.ftp114.persistence;
import com.hexaware.ftp114.model.Employee;
import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.Mapper;
import java.util.List;

public interface EmployeeDAO  {

  @SqlQuery("SELECT * FROM EMP ")
  @Mapper(EmployeeMapper.class)
  List<Employee> list();

  @SqlQuery("SELECT * FROM EMP WHERE EMPNO = :empno")
  @Mapper(EmployeeMapper.class)
  Employee find(@Bind("empno") int empno);

  @SqlUpdate("INSERT INTO EMP(EMPNO, NAME, DEPT, DESIG, BASIC)" +
   "VALUES(:empno, :name, :dept, :desig, :basic) ")
  void insert(@Bind("empno") int empno,
        @Bind("name") String name,
        @Bind("dept") String dept,
        @Bind("desig") String desig,
        @Bind("basic") int basic);

}