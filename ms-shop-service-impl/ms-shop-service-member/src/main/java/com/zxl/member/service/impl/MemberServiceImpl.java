package com.zxl.member.service.impl;

import com.zxl.entity.AppEntity;
import com.zxl.member.feign.WeiXinAppServiceFeign;
import com.zxl.member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * Created by ZXL on 2019/9/27.
 */
@RestController
public class MemberServiceImpl implements MemberService {

    @Autowired
    private WeiXinAppServiceFeign weiXinAppServiceFeign;

    // SpringCloud 通信 rest feign
    @GetMapping("/memberInvokeWeiXin")
    public AppEntity memberInvokeWeiXin() {
        return weiXinAppServiceFeign.getApp();
    }
}
