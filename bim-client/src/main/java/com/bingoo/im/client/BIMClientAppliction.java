package com.bingoo.im.client;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author jianbin
 * @date 2019/11/27
 */
@SpringBootApplication
@EnableDubboConfiguration
public class BIMClientAppliction {

    public static void main(String[] args) {
        ConfigurableApplicationContext context =
                SpringApplication.run(BIMClientAppliction.class, args);
    }
}
