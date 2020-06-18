package com.example.mds.controller;

import com.example.mds.pojo.Department;
import com.example.mds.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/department")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @GetMapping()
    public List<Department> list()
    {
        return departmentService.getAllDepartment();
    }

    @PostMapping()
    public Department add(@RequestBody Department department)
    {
        departmentService.addDepartment(department);
        return department;
    }

    @PutMapping()
    public Department update(@RequestBody Department department)
    {
        departmentService.updateDepartment(department);
        return department;
    }

    @DeleteMapping()
    public void delete(@RequestBody Department department)
    {
        departmentService.deleteDepartment(department.getDept_id());
    }

    @GetMapping(value = "/{dept_id}")
    public Department findUserOne(@PathVariable("dept_id") int dept_id)
    {
        return departmentService.findById(dept_id);
    }

}
