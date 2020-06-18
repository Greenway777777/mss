package com.example.mds.service;

import com.example.mds.dao.DepartmentMapper;
import com.example.mds.pojo.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DepartmentService {

    @Autowired(required = false)
    private DepartmentMapper departmentMapper;


    public List<Department> getAllDepartment()
    {
        return departmentMapper.getAllDepartment();
    }

    public void addDepartment(Department department)
    {
        departmentMapper.addDepartment(department);
    }

    public void updateDepartment(Department department)
    {
        departmentMapper.updateDepartment(department);
    }

    public void deleteDepartment(int dept_id)
    {
        departmentMapper.deleteDepartment(dept_id);
    }

    public Department findById(int id)
    {
        return departmentMapper.findById(id);
    }
}
