package com.example.mds.dao;

import com.example.mds.pojo.Equipment;
import com.example.mds.pojo.Category;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@Mapper
public interface EquipmentMapper {

    //根据分类查询所有记录
    List<Equipment> findAllByCategory(Category category);

    List<Equipment> findAll();

    Equipment findById(int id);

    void deleteById(int id);

    void add(Equipment equipment);

    void update(Equipment equipment);

    List<Equipment> searchLike(String key);

}
