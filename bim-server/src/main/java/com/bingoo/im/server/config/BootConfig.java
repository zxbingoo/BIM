package com.bingoo.im.server.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties
public class BootConfig {

    @Value("${server.port:8888}")
    private int port;

    public int getPort() {
        return port;
    }
}
