package com.wxy.ics.member.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author: QingLin.Deng
 * @date: 2019/01/31 14/14
*/

@Profile({"dev","test"})
@Configuration
@EnableSwagger2
public class Swagger2Config {

    @Bean
    public Docket createRestfulApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.wxy.ics.member.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("ics member 开放服务接口规范")
                .description("ics-member 接口描述")
                .termsOfServiceUrl("termsOfServiceUrl")
                .contact(new Contact("wxy", "http://localhost:8001/swagger-ui.html", "814752288@qq.com"))
                .version("1.0")
                .build();
    }
}
