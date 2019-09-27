package com.zxl.weixin.service.impl;

import com.zxl.entity.AppEntity;
import com.zxl.weixin.service.WeiXinAppService;
import org.springframework.web.bind.annotation.RestController;

/**
 * 微信服务接口的实现
 * Created by ZXL on 2019/9/27.
 */
@RestController
public class WeiXinAppServiceImpl implements WeiXinAppService {

    public AppEntity getApp() {
        return new AppEntity("644064779", "yushengjun644");
    }

}
