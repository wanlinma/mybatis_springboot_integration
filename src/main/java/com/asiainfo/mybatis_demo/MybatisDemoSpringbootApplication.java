package com.asiainfo.mybatis_demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.asiainfo.mybatis_demo.mapper")
public class MybatisDemoSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(MybatisDemoSpringbootApplication.class, args);
	}

}
