package com.hexaware.ftp114.persistence;
import com.hexaware.ftp114.model.Department;
import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.Mapper;
import java.util.List;

public interface DepartmentDAO  {

  @SqlQuery("SELECT * FROM DEPT")
  @Mapper(DepartmentMapper.class)
  List<Department> list();
}