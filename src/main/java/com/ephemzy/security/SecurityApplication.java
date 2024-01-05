package com.ephemzy.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SecurityApplication {

	/**
	 * To see the list of apps the runs on a particular port
	 * sudo lsof -i tcp;8080
	 *
	 *To kill a particular server
	 * sudo kill -9 53099
	 * */

	public static void main(String[] args) {
		SpringApplication.run(SecurityApplication.class, args);
	}

}
