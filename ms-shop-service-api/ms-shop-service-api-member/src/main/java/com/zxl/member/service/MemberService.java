package com.zxl.member.service;

import com.zxl.entity.AppEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * 会员服务接口
 * Created by ZXL on 2019/9/27.
 */
@Api(tags = "会员服务实现接口")
public interface MemberService {

    // 会员服务接口调用微信接口
    @ApiOperation(value = "会员服务调用微信服务")
    public AppEntity memberInvokeWeiXin();
}
