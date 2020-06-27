package com.example.mds.service;

import com.example.mds.dao.EquipmentMapper;
import com.example.mds.pojo.Equipment;
import com.example.mds.pojo.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipmentService {

    @Autowired(required = false)
    EquipmentMapper equipmentMapper;
    @Autowired
    CategoryService categoryService;

    //查询所有记录并根据equip_id从大到小排序
    public List<Equipment> list()
    {
        return equipmentMapper.findAll();
    }

    //添加记录
    public void addE(Equipment equipment)
    {
        equipmentMapper.add(equipment);
    }

    public void updateE(Equipment equipment)
    {
        equipmentMapper.update(equipment);
    }

    //根据id删除记录
    public void deleteById(int id)
    {
        equipmentMapper.deleteById(id);
    }

    //根据分类cid查询分类，再通过分类查询书籍
    public List<Equipment> listByCategory(int cid)
    {
        Category category=categoryService.get(cid);
        return equipmentMapper.findAllByCategory(category);
    }

    public List<Equipment> search(String key)
    {
        return equipmentMapper.searchLike(key);
    }

}
