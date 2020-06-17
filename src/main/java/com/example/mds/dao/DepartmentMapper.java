package com.example.mds.dao;

import com.example.mds.pojo.Department;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DepartmentMapper {

    List<Department> getAllDepartment();

    Integer addDepartment(Department department);

    Integer updateDepartment(Department department);

    Integer deleteDepartment(Integer dept_id);
}
