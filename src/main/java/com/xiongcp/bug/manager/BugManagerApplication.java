package com.xiongcp.bug.manager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication
public class BugManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BugManagerApplication.class, args);
	}


}
