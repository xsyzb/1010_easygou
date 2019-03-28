package cn.itaz.easygou.plat.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 每一个服务提供者都需要写一个swagger 主要是为了扫描有哪些服务
 * 访问路径 http://127.0.0.1:8001/swagger-ui.html
 */
@Configuration
@EnableSwagger2
public class Swagger2 {
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("cn.itaz.easygou.plat.web.controller"))
                //包：就是自己接口的包路径
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("商品系统api")//名字
                .description("商品系统接口文档说明")//额外藐视
                .contact(new Contact("xszb", "", "xszb@qq.cn"))
                .version("1.0")// 版本
                .build();
    }
}