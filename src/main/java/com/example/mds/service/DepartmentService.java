package com.example.mds.service;

import com.example.mds.dao.DepartmentMapper;
import com.example.mds.pojo.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentMapper departmentMapper;

    public List<Department> getAllDepartment()
    {
        return departmentMapper.getAllDepartment();
    }
}
