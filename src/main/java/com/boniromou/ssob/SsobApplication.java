package com.boniromou.ssob;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com/boniromou/ssob/mapper")

public class SsobApplication {

	public static void main(String[] args) {
		SpringApplication.run(SsobApplication.class, args);
	}

}

