package cn.itaz.easygou.plat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 服务提供者的启动类
 */
@SpringBootApplication //标识springboot管理
@EnableEurekaClient //标识为客户端
public class ProviderApplication_8001 {
    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication_8001.class);
    }
}