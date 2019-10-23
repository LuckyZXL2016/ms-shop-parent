package com.zxl.weixin.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.ctrip.framework.apollo.core.utils.StringUtils;
import com.zxl.base.BaseApiService;
import com.zxl.base.BaseResponse;
import com.zxl.constants.Constants;
import com.zxl.core.utils.RedisUtil;
import com.zxl.weixin.service.VerificaCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ZXL on 2019/10/23.
 */
@RestController
public class VerificaCodeServiceImpl extends BaseApiService<JSONObject> implements VerificaCodeService {
    @Autowired
    private RedisUtil redisUtil;

    @Override
    public BaseResponse<JSONObject> verificaWeixinCode(String phone, String weixinCode) {
        // 1.验证码参数是否为空
        if (StringUtils.isEmpty(phone)) {
            return setResultError("手机号码不能为空!");
        }
        if (StringUtils.isEmpty(weixinCode)) {
            return setResultError("注册码不能为空!");
        }
        // 2.根据手机号码查询redis返回对应的注册码
        String weixinCodeKey = Constants.WEIXINCODE_KEY + phone;
        String redisCode = redisUtil.getString(weixinCodeKey);
        if (StringUtils.isEmpty(redisCode)) {
            return setResultError("注册码可能已经过期!!");
        }
        // 3.redis中的注册码与传递参数的weixinCode进行比对
        if (!redisCode.equals(weixinCode)) {
            return setResultError("注册码不正确");
        }
        // 移除对应验证码
        redisUtil.delKey(weixinCodeKey);
        return setResultSuccess("验证码比对正确");
    }
}
