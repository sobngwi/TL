package org.axonframework.examples.addressbook.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;


@EnableAutoConfiguration
@SpringBootApplication
public class RestUI {

	public static void main(String[] args) {
		//SpringApplication.run(RestUI.class, args);
		  ApplicationContext ctx = SpringApplication.run(RestUI.class, args);

	        System.out.println("Let's inspect the beans provided by Spring Boot:");

	        String[] beanNames = ctx.getBeanDefinitionNames();
	        Arrays.sort(beanNames);
	        for (String beanName : beanNames) {
	            System.out.println(beanName);
	        }
	    }


}
