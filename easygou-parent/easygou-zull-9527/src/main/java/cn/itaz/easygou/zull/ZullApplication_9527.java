package cn.itaz.easygou.zull;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * 网关的启动类
 */
@SpringBootApplication //springboot 管理
@EnableEurekaClient //eureka 的客户端
@EnableZuulProxy //网关的代理 启动路由
public class ZullApplication_9527 {
    public static void main(String[] args) {
        SpringApplication.run(ZullApplication_9527.class);
    }
}
