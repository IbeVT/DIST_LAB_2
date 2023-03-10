package com.dist.group2.ibe.DIST_LAB_2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication()
// https://www.baeldung.com/spring-boot-failed-to-configure-data-source and https://github.com/spring-projects/spring-boot/issues/6987
public class BankApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankApplication.class, args);
	}

}
