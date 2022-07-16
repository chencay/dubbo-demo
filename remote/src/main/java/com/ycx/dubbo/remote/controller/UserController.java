package com.ycx.dubbo.remote.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.ycx.dubbo.api.UserService;
import org.ycx.dubbo.dto.UserDTO;

import javax.annotation.Resource;

/**
 * @author ycx
 * @description 描述
 * @date 2022/7/10 上午10:40
 **/
@RestController
public class UserController {
    @Resource
    private UserService userService;

    @GetMapping("/userName/{id}")
    public  String getUserName(@PathVariable Long id) {
        UserDTO user = userService.getUser(id);
        System.out.println(user.getName());
        return user.getName();
    }
}
