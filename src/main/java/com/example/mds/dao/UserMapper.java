package com.example.mds.dao;

import com.example.mds.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

// jpa<>中的参数为实体类以及实体类的id的类型
@Mapper
public interface UserMapper {

    //根据用户名查询
    User findByUsername(String username);
    //根据用户名和密码查询
    User getByUsernameAndPassword(String username,String password);

    List<User> findAll();

    User findById(int id);

    void deleteById(int id);

    void add(User user);

    void update(User user);
}
