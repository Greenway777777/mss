package com.example.mds.service;

import com.example.mds.dao.CategoryMapper;
import com.example.mds.pojo.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired(required = false)
    CategoryMapper categoryMapper;

    //查询所有记录
    public List<Category> list()
    {
        return categoryMapper.findAll();
    }

    public Category get(int id)
    {
        return categoryMapper.findById(id);
    }

}
