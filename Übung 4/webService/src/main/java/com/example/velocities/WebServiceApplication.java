package com.example.velocities;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
@EnableJpaAuditing
public class WebServiceApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(WebServiceApplication.class, args);
	}
	
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(WebServiceApplication.class);
    }
}
