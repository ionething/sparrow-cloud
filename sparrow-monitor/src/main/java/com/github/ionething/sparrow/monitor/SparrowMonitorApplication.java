package com.github.ionething.sparrow.monitor;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author wangxin
 */
@EnableDiscoveryClient
@EnableAdminServer
@SpringBootApplication
public class SparrowMonitorApplication {

    public static void main(String[] args) {
        SpringApplication.run(SparrowMonitorApplication.class, args);
    }
}
