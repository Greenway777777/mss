package com.example.mds.controller;

import com.example.mds.pojo.Equipment;
import com.example.mds.service.EquipmentService;
import com.example.mds.utils.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;

//@Controller
public class MedicalController {
    @Autowired
    EquipmentService equipmentService;

    @CrossOrigin
    //@GetMapping(value = "/api/equipments")
    @ResponseBody
    public List<Equipment> listEquipment()
    {
        return equipmentService.list();
    }

    @CrossOrigin
    //@PostMapping(value = "/api/equipments")
    @ResponseBody
    public Equipment addOrUpdate(@RequestBody Equipment equipment) throws Exception
    {
        //equipmentService.addOrUpdate(equipment);
        return equipment;
    }

    @CrossOrigin
    //@PostMapping(value = "/api/delete")
    @ResponseBody
    public void delete(@RequestBody Equipment equipment) throws Exception
    {
        equipmentService.deleteById(equipment.getId());
    }

    @CrossOrigin
    //@GetMapping(value = "/api/category/{cate_id}/equipments")
    @ResponseBody
    public List<Equipment> listByCategory(@PathVariable("cate_id") int cate_id) throws Exception
    {
        if(0!=cate_id)
        {
            return equipmentService.listByCategory(cate_id);
        }
        else
        {
            return listEquipment();
        }
    }

    @CrossOrigin
    //@GetMapping("/api/search")
    @ResponseBody
    public List<Equipment> searchResult(@RequestParam("keywords") String keywords) {
        // 关键词为空时查询出所有器械
        if ("".equals(keywords)) {
            return equipmentService.list();
        } else {
            return equipmentService.listByCategory(1);
        }
    }

    @CrossOrigin
    //@PostMapping("api/covers")
    @ResponseBody
    public String coversUpload(MultipartFile file) throws Exception {
        String folder = "D:/Medicalcreditsystem/mds/src/main/resources/static/static/img";
        File imageFolder = new File(folder);
        File f = new File(imageFolder, StringUtils.getRandomString(16) + file.getOriginalFilename()
                .substring(file.getOriginalFilename().length() - 4));
        if (!f.getParentFile().exists())
            f.getParentFile().mkdirs();
        try {
            file.transferTo(f);
            String imgURL = "http://localhost:8443/api/file/" + f.getName();
            return imgURL;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
