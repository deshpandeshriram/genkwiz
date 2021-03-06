package com.genkwiz.starter;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMethod;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.builders.ResponseMessageBuilder;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class FetchApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SpringApplication.run(FetchApp.class, args);
	}

	
	@Bean
	public Docket swaggerConfiguration() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.paths(PathSelectors.any()).
				apis(RequestHandlerSelectors.basePackage("com.genkwiz.starter.Controller"))
				.build().apiInfo(apiDetails())
				.useDefaultResponseMessages(true);
		
	}
	private ApiInfo apiDetails() {
				return new ApiInfo(
						"GenKwiz API","Interactive quizzing API with questions of multiple engrossing genres. API allows to get questions and submit answers ","1.0","Simple to use",new springfox.documentation.service.Contact("Shriram Deshpande", "http://genkwiz.com", "deshpandeshriram@gmail.com"),
						"API License","http://genkwiz.com",Collections.emptyList()
						);
			}	
		
	
}
	