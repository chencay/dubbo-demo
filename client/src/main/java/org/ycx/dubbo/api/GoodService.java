package org.ycx.dubbo.api;

import org.ycx.dubbo.dto.GoodDTO;

/**
 * @author ycx
 * @description 描述
 * @date 2022/7/10 下午1:43
 **/
public interface GoodService {

    /**
     * 获取商品信息
     *
     * @param id 商品id
     * @return 商品信息
     */
    GoodDTO getGood(Long id);
}
