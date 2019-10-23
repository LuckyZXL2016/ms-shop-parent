package com.zxl.weixin.service.impl;

import com.zxl.base.BaseApiService;
import com.zxl.base.BaseResponse;
import com.zxl.entity.AppEntity;
import com.zxl.weixin.service.WeiXinAppService;
import org.springframework.web.bind.annotation.RestController;

/**
 * 微信服务接口的实现
 * Created by ZXL on 2019/9/27.
 */
@RestController
public class WeiXinAppServiceImpl extends BaseApiService<AppEntity> implements WeiXinAppService {

    public BaseResponse<AppEntity> getApp() {
        return setResultSuccess(new AppEntity("1207346575", "zxl666"));
        // setResultSuccess(new AppEntity("1111", "22222"));
    }

}
