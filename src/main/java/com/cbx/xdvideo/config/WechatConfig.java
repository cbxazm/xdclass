package com.cbx.xdvideo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * 微信配置
 */
@Configuration
@PropertySource(value = "classpath:application.properties")
public class WechatConfig {
    /**
     * 公众号信息
     */
    @Value("${wxpay.appid}")
           private String appId;
    @Value("${wxpay.appsecret}")
    private String appsecret;

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getAppsecret() {
        return appsecret;
    }

    public void setAppsecret(String appsecret) {
        this.appsecret = appsecret;
    }
}
