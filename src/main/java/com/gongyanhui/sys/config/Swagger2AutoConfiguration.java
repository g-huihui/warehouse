package com.gongyanhui.sys.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Author: Taurus-
 * @Date: 2020/3/8 17:30
 */
@Configuration
@EnableSwagger2 //启用Swagger2
public class Swagger2AutoConfiguration {

    /**
     * 在IOC容器里面创建可以扫描Controller里面的是否有Swagger相关的注解
     * @return
     */
    @Bean
    public Docket swaggerSpringMvcPlugin(){
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).select()
                .apis(RequestHandlerSelectors.withClassAnnotation(RestController.class)).build();
    }

    private ApiInfo apiInfo(){
        return new ApiInfoBuilder().description("仓库后台管理系统SwaggerUI接口工具")
                //名片
                .contact(new Contact("Taurus-","http://gongyanhui.top","gongyanhui66@gmail.com"))
                //版本
                .version("1.0")
                //所有者
                .license("Taurus-工作室")
                //构造
                .build();
    }

}
