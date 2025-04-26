package com.nacos.study.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author maple
 * @date 2025-04-26
 * @description 文件类型配置
 */
@Component
@Data
@RefreshScope
@ConfigurationProperties(prefix = "mynacos.config")
public class FileTypeConfig {
    private Map<String,Integer> mapping;
    
    /**
     * 自定义方法
     */
    public Integer getCode(String fileType) {
        return mapping.get(fileType);
    }

}
