package org.ycx.dubbo.api;

import org.ycx.dubbo.dto.UserDTO;

/**
 * @author ycx
 * @description 用户服务， 使用rmi协议实现远程dubbo通信
 * @date 2022/7/9 下午10:46
 **/
public interface UserService {

    /**
     * 根据id获取用户信息
     *
     * @param id 用户id
     * @return UserDTO
     */
    UserDTO getUser(Long id);
}
