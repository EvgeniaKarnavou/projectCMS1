package com.example.demo;

import java.util.Optional;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication

@RestController
public class DemoApplication {
	@Autowired
	ProjectRepository projectsRepo;

	@Autowired
	StudentRepository studentsRepo;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
