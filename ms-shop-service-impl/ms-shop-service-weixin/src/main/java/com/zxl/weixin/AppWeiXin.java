package com.zxl.weixin;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 微服务服务实现
 * Created by ZXL on 2019/9/27.
 */
@SpringBootApplication
@EnableEurekaClient
@EnableSwagger2Doc
@EnableApolloConfig
public class AppWeiXin {

    public static void main(String[] args) {
        SpringApplication.run(AppWeiXin.class, args);
    }
}
