package com.airline.docker_airline1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DockerAirline1Application {

	public static void main(String[] args) {
		SpringApplication.run(DockerAirline1Application.class, args);
	}
	
	@Autowired
    private Airlinerepository airlineRepository;

	@GetMapping("/message")
	public String getMessage() {
		return "hello welcome on board";
	}
	@PostMapping("/airlines")
    public Airline createAirline(@RequestBody Airline airline) {
        return airlineRepository.save(airline);
    }
}

