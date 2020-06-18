package com.example.mds.service;

import com.example.mds.dao.RecordMapper;
import com.example.mds.pojo.Record;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecordService {

    @Autowired(required = false)
    private RecordMapper recordMapper;

    // 查找所有记录信息
    public List<Record> getAllRecord()
    {
        return recordMapper.getAllRecord();
    }
    // 添加新记录
    public void addRecord(Record record)
    {
        recordMapper.addRecord(record);
    }
    // 修改记录信息
    public void updateRecord(Record record)
    {
        recordMapper.updateRecord(record);
    }
    // 删除记录信息
    public void deleteRecord(Record record)
    {
        recordMapper.deleteRecord(record.getR_id());
    }
    // 通过记录r_id查询记录信息
    public Record findById(int r_id)
    {
        return recordMapper.findById(r_id);
    }
}
