package de.mimacom.spring.sprinfoxswagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@Configuration
@EnableSwagger2
public class SpringfoxConfig {

    @Bean
    public Docket petApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("de.mimacom.spring.sprinfoxswagger"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        return new ApiInfo(
                "Sample Spring REST API",
                "This is a sample REST API based on Spring Boot.",
                "1.0",
                "Terms of service",
                new Contact("Andreas Hirsch", "https://www.mimacom.com", "andreas.hirsch@mimacom.com"),
                "License of API", "API license URL", Collections.emptyList());
    }
}
