package com.example.mds.controller;

import com.example.mds.pojo.Category;
import com.example.mds.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/api/category")
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    @GetMapping
    public List<Category> find(@RequestBody Category category) {
        return categoryService.list();
    }

    @GetMapping(value = "/{id}")
    public Category findById(@PathVariable("id") int id)
    {
        return categoryService.get(id);
    }


}
