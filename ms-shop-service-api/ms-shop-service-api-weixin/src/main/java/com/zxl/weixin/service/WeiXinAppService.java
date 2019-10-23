package com.zxl.weixin.service;

import com.zxl.base.BaseResponse;
import com.zxl.entity.AppEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 微信服务接口
 * Created by ZXL on 2019/9/27.
 */
@Api(tags = "微信服务接口")
public interface WeiXinAppService {

    // 功能说明： 应用服务接口
    @ApiOperation(value = "微信应用服务接口")
    @GetMapping("/getApp")
    public BaseResponse<AppEntity> getApp();

}
