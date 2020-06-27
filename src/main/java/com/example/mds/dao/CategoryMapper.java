package com.example.mds.dao;

import com.example.mds.pojo.Category;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


@Mapper
public interface CategoryMapper {

    List<Category> findAll();
    Category findById(int id);

}
