package com.example.manage;

import com.example.entity.Users;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
//持久层 dao/manage
//用来书写SQL语写
//根据SQL注解返回结果集

@Mapper
public interface UsersManage {

    //在未被调用得情况下无意义
    @Select("select * from users")
    List<Users> findAll();

}
