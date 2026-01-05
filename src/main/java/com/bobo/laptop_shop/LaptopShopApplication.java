package com.bobo.laptop_shop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

//@SpringBootApplication
@SpringBootApplication(exclude = org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class)
public class LaptopShopApplication {

	public static void main(String[] args) {
		SpringApplication.run(LaptopShopApplication.class, args);

		ApplicationContext bobo = SpringApplication.run(LaptopShopApplication.class, args);
		for (String s : bobo.getBeanDefinitionNames()) {
			System.out.println(s);
		}
	}

}
