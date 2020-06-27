package com.example.mds.controller;

import com.example.mds.pojo.Equipment;
import com.example.mds.service.EquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value = "/api/equipment")
public class EquipmentController {

    @Autowired
    EquipmentService equipmentService;

    @GetMapping
    public List<Equipment> getAllEquipment()
    {
        return equipmentService.list();
    }

    @PostMapping()
    public Equipment add(@RequestBody Equipment equipment)
    {
        equipmentService.addE(equipment);
        return equipment;
    }

    @PutMapping()
    public Equipment update(@RequestBody Equipment equipment)
    {
        equipmentService.updateE(equipment);
        return equipment;
    }

    @DeleteMapping()
    public void delete(@RequestBody Equipment equipment)
    {
        equipmentService.deleteById(equipment.getId());
    }

    @GetMapping(value = "/{cate_id}")
    public List<Equipment> findByCate(@PathVariable("cate_id") int id)
    {
        if(0!=id)
        {
            return equipmentService.listByCategory(id);
        }
        else
        {
            return getAllEquipment();
        }
    }

    @GetMapping("/search")
    @ResponseBody
    public List<Equipment> searchResult(@RequestParam("keywords") String keywords) {
        // 关键词为空时查询出所有器械
        if ("".equals(keywords)) {
            return equipmentService.list();
        } else {
            return equipmentService.search(keywords);
        }
    }

}
