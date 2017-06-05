package com.amazon.kinesis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
@ComponentScan(basePackages = { "com.amazon.kinesis.*" })
public class Startup {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConfigurableApplicationContext context = SpringApplication.run(Startup.class, args);
	}
}
