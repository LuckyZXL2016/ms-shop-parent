package com.zxl.member.feign;

import com.zxl.weixin.service.WeiXinAppService;
import org.springframework.cloud.openfeign.FeignClient;

/**
 *
 * Created by ZXL on 2019/9/27.
 */
@FeignClient("com-zxl-weixin")
public interface WeiXinAppServiceFeign extends WeiXinAppService {
}
