package com.mss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringDockerJenkinsPocApplication {

	@GetMapping("/hello")
	public String hello()
	{
		return "hello";
	}
	@GetMapping("/hi")
	public String hi()
	{
		return "Hi";
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringDockerJenkinsPocApplication.class, args);
	}

}
