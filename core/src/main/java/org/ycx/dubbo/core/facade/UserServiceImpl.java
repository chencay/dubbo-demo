package org.ycx.dubbo.core.facade;

import org.springframework.stereotype.Service;
import org.ycx.dubbo.api.UserService;
import org.ycx.dubbo.dto.UserDTO;

/**
 * @author ycx
 * @description 描述
 * @date 2022/7/10 上午10:15
 **/
@Service
public class UserServiceImpl implements UserService {
    @Override
    public UserDTO getUser(Long id) {
        UserDTO user = new UserDTO();
        user.setId(id);
        user.setName("admin");
        System.out.println("success to getUser, id:" + id);
        return user;
    }
}
