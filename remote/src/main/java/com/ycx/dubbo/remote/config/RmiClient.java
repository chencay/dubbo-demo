package com.ycx.dubbo.remote.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiProxyFactoryBean;
import org.ycx.dubbo.api.UserService;

/**
 * @author ycx
 * @description 基于Rmi通信订阅服务，用于远程调用
 * @date 2022/7/10 上午11:04
 **/
@Configuration
public class RmiClient {

    @Bean(value = "userService")
    public RmiProxyFactoryBean getUserService() {
        RmiProxyFactoryBean factory = new RmiProxyFactoryBean();
        factory.setServiceUrl("rmi://127.0.0.1:2002/userService");
        factory.setServiceInterface(UserService.class);

        return factory;
    }
}
