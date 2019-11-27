package com.bingoo.im.provider;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.CountDownLatch;

/**
 * @author jianbin
 * @date 2019/11/27
 */
@SpringBootApplication
@EnableDubboConfiguration
public class BIMProviderApplication {

    private static CountDownLatch countDownLatch = new CountDownLatch(1);

    public static void main(String[] args) throws Exception {
        SpringApplication.run(BIMProviderApplication.class, args).registerShutdownHook();
        countDownLatch.await();
    }
}
