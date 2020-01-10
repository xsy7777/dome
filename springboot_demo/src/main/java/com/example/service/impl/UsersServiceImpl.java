package com.example.service.impl;

import com.example.entity.Users;
import com.example.manage.UsersManage;
import com.example.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


//实现service接口


@Service
public class UsersServiceImpl implements UsersService {

    //创建持久层manage对象
    @Autowired
    private UsersManage usersManage;

    //调用持久层方法并返回结果集
    @Override
    public List<Users> findAll() {
        return usersManage.findAll();
    }
}
