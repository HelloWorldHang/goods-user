package com.brady.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
@MapperScan("com.brady.user.mapper")

public class UserServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserServerApplication.class, args);
	}

}
