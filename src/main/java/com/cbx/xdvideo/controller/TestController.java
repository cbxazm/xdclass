package com.cbx.xdvideo.controller;

import com.cbx.xdvideo.config.WechatConfig;
import com.cbx.xdvideo.mapper.VideoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
    @Autowired
    private WechatConfig wechatConfig;
    @RequestMapping("/testConfig")
    @ResponseBody
     public String testConfig(){
        return wechatConfig.getAppId()+wechatConfig.getAppsecret();

     }
     @Autowired
     private VideoMapper videoMapper;
    @ResponseBody
    @RequestMapping("/testdb")
    public Object testDb(){
        return videoMapper.findAll();
    }
}
