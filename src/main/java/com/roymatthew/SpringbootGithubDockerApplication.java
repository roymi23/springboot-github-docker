package com.roymatthew;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootGithubDockerApplication {

	@GetMapping("/handshake")
	public String welcomeMethod() {
		return "Welcome to github actions world!";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootGithubDockerApplication.class, args);
	}

}
