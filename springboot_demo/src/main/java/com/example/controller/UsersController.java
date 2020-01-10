package com.example.controller;

import com.example.entity.Users;
import com.example.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//控制层 访问接口
@Controller
public class UsersController {

    //创建service对象
    @Autowired
    private UsersService usersService;


    //调用service方法 放回sql查寻语句的结果
    //层层传递 manage>entity>service>controller>前端界面
    @RequestMapping("/findAll")
    @ResponseBody
    public List<Users> findAll(){
        List<Users> users=usersService.findAll();
        return users;
    }
}
