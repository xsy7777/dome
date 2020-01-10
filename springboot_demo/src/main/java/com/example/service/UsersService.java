package com.example.service;

import com.example.entity.Users;

import java.util.List;

//业务层service接口


public interface UsersService {
    List<Users> findAll();
}
