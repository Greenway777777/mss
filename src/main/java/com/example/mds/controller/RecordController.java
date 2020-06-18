package com.example.mds.controller;

import com.example.mds.pojo.Record;
import com.example.mds.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/record")
public class RecordController {

    @Autowired
    private RecordService recordService;

    @GetMapping()
    public List<Record> list()
    {
        return recordService.getAllRecord();
    }

    @PostMapping()
    public Record add(@RequestBody Record record)
    {
        recordService.addRecord(record);
        return record;
    }

    @PutMapping()
    public Record update(@RequestBody Record record)
    {
        recordService.updateRecord(record);
        return record;
    }

    @DeleteMapping()
    public void delete(@RequestBody Record record)
    {
        recordService.deleteRecord(record);
    }

    @GetMapping(value = "/{r_id}")
    public Record findById(@PathVariable int r_id)
    {
        return recordService.findById(r_id);
    }
}
