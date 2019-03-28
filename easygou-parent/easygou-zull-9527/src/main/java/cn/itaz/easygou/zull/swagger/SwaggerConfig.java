package cn.itaz.easygou.zull.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * swagger的配置 使用
 * 访问路劲 http://127.0.0.1:9527/swagger-ui.html
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo());
    }

    /**
     * new Contact 导入 import springfox.documentation.service.Contact; jar包
     * @return
     */
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("分布式购物系统")
                .description("购物系统接口文档说明")
                .contact(new Contact("xstest", "", "xszb@qq.com"))
                .version("1.0")
                .build();
    }
}
