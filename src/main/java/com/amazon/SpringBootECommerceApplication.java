package com.amazon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:amazon.properties")
public class SpringBootECommerceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootECommerceApplication.class, args);
	}

}
