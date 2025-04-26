package com.nacos.study.controller;

import com.nacos.study.config.FileTypeConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author maple
 * @date 2025-04-26
 * @description 测试nacos配置中心
 */
@RestController
@RefreshScope
public class Controller {
    @Value ("${study.name:local}")
    private String name;
    
    @Autowired
    private FileTypeConfig fileTypeConfig;
    
    @GetMapping("/name")
    public void getName (){
        System.out.println (name);
        System.out.println (fileTypeConfig.getMapping ());
    }
}
