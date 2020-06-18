package com.example.mds.dao;

import com.example.mds.pojo.Department;
import com.example.mds.pojo.Record;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RecordMapper {
    // 查找所有记录信息
    List<Record> getAllRecord();
    // 添加新记录
    void addRecord(Record record);
    // 修改记录信息
    void updateRecord(Record record);
    // 删除记录信息
    void deleteRecord(int r_id);
    // 通过记录r_id查询记录信息
    Record findById(int r_id);
}
