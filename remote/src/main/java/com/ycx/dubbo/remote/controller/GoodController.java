package com.ycx.dubbo.remote.controller;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.ycx.dubbo.api.GoodService;
import org.ycx.dubbo.api.UserService;
import org.ycx.dubbo.dto.GoodDTO;
import org.ycx.dubbo.dto.UserDTO;

import javax.annotation.Resource;

/**
 * @author ycx
 * @description 描述
 * @date 2022/7/10 下午2:58
 **/
@RestController
public class GoodController {

    /**
     * 使用@Reference注解消费dubbo服务，设置参数{"unicast", "false"}可避免广播时找不到本机
     */
    @Reference(version = "1.0.0", parameters = {"unicast", "false"})
    private GoodService goodService;

    @GetMapping("/goodName/{id}")
    public  String getGood(@PathVariable Long id) {
        GoodDTO good = goodService.getGood(id);
        System.out.println(good.getName());
        return good.getName();
    }
}
