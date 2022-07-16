package org.ycx.dubbo.core.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiServiceExporter;
import org.ycx.dubbo.api.UserService;

import javax.annotation.Resource;

/**
 * @author ycx
 * @description 基于Rmi通信将服务提供出去，用于远程调用
 * @date 2022/7/10 上午10:49
 **/
@Configuration
public class RmiServer {

    @Resource
    private UserService userService;

    @Bean
    public RmiServiceExporter getRmiServiceExporter() {
        RmiServiceExporter exporter = new RmiServiceExporter();
        //设置服务名称
        exporter.setServiceName("userService");
        //自定义端口号，只要未被占用都可
        exporter.setRegistryPort(2002);
        //设置服务实现
        exporter.setService(userService);
        //设置服务实现接口
        exporter.setServiceInterface(UserService.class);

        return exporter;
    }
}
