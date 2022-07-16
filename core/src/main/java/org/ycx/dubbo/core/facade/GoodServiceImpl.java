package org.ycx.dubbo.core.facade;

import org.apache.dubbo.config.annotation.Service;
import org.ycx.dubbo.api.GoodService;
import org.ycx.dubbo.dto.GoodDTO;

/**
 * @author ycx
 * @description @Service是dubbo的service注解
 * @date 2022/7/10 下午1:49
 **/
@Service(version = "1.0.0")
public class GoodServiceImpl implements GoodService {
    @Override
    public GoodDTO getGood(Long id) {
        GoodDTO good = new GoodDTO();
        good.setId(id);
        good.setName("admin good");
        return good;
    }
}
