package com.zxl.entity;

import lombok.Data;

/**
 * 微信应用实体类
 * Created by ZXL on 2019/9/27.
 */
@Data
public class AppEntity {
    private String appId;
    private String appName;

    public AppEntity() {

    }

    public AppEntity(String appId, String appName) {
        super();
        this.appId = appId;
        this.appName = appName;
    }
}
