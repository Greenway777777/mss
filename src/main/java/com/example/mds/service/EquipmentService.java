package com.example.mds.service;

import com.example.mds.dao.EquipmentDao;
import com.example.mds.pojo.Equipment;
import com.example.mds.pojo.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipmentService {
    @Autowired
    EquipmentDao equipmentDao;
    @Autowired
    CategoryService categoryService;

    //查询所有记录并根据equip_id从大到小排序
    public List<Equipment> list()
    {
        Sort sort=new Sort(Sort.Direction.DESC,"id");
        return equipmentDao.findAll(sort);
    }

    //更新记录
    public void addOrUpdate(Equipment equipment)
    {
        equipmentDao.save(equipment);//save操作，若主键存在则执行update，否则执行insert
    }

    //根据id删除记录
    public void deleteById(int id)
    {
        equipmentDao.deleteById(id);
    }

    //根据分类cid查询分类，再通过分类查询书籍
    public List<Equipment> listByCategory(int cid)
    {
        Category category=categoryService.get(cid);
        return equipmentDao.findAllByCategory(category);
    }

}
