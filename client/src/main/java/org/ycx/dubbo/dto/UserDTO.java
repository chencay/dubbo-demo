package org.ycx.dubbo.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @author ycx
 * @description 描述
 * @date 2022/7/9 下午10:46
 **/
@Data
public class UserDTO implements Serializable {

    private static final long serialVersionUID = -3748400411251137046L;

    private Long id;
    private String name;
}
