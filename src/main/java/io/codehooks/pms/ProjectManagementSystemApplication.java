package io.codehooks.pms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@SpringBootApplication
public class ProjectManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectManagementSystemApplication.class, args);
	}


}
