package com.example.mds.dao;

import com.example.mds.pojo.Equipment;
import com.example.mds.pojo.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EquipmentDao extends JpaRepository<Equipment,Integer> {

    //根据分类查询所有记录
    List<Equipment> findAllByCategory(Category category);

}
