package org.ycx.dubbo.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @author ycx
 * @description 描述
 * @date 2022/7/10 下午1:43
 **/
@Data
public class GoodDTO implements Serializable {
    private static final long serialVersionUID = 2674657448902729253L;

    private Long id;
    private String name;
}
