package com.yy.controller;

import com.yy.service.UserService;
import com.yy.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author 595703420@qq.com
 * @date 2018/1/18 0018 下午 4:19
 */
@RestController
@EnableAutoConfiguration
public class UserController {

    @Autowired
    private UserService userSeriver;

    @GetMapping("/index")
    public String index(){
        return "hello shabi";
    }

    @PostMapping("/user/add")
    public String addUser(User user){
        boolean flag=userSeriver.save(user);
        if(!flag){
            return  "success";
        }
        return  "success";
    }


}
