package cn.itaz.easygou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 注册中心的启动类
 */
@SpringBootApplication //标识为springboot的管理下
@EnableEurekaServer //标识为eureka的服务端
public class EurekaApplication_7001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication_7001.class);
    }
}