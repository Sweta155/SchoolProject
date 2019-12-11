package com.school.message;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MessageApplication {

	public static void main(String[] args) {
		 SpringApplication app = new SpringApplication(MessageApplication.class);
	     app.setDefaultProperties(Collections.singletonMap("server.port", "8083"));
	     app.run(args);
		
		//SpringApplication.run(MessageApplication.class, args);
	}

}
