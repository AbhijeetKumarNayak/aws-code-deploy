package com.example.awscodedeploy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AwsCodedeployApplication {
	
	@GetMapping("/")
	public String welCome() {
		return "welCome to container world.";
	}

	public static void main(String[] args) {
		SpringApplication.run(AwsCodedeployApplication.class, args);
	}

}
