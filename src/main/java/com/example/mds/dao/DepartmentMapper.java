package com.example.mds.dao;

import com.example.mds.pojo.Department;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DepartmentMapper {

    // 查找所有部门信息
    List<Department> getAllDepartment();
    // 添加新部门
    void addDepartment(Department department);
    // 修改部门信息
    void updateDepartment(Department department);
    // 删除部门信息
    void deleteDepartment(int dept_id);
    // 通过部门id查询部门信息
    Department findById(int id);
}
