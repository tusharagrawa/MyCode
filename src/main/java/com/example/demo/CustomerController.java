package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CustomerController {

	@Autowired
	RestTemplate restTemplate;

	public String getAccountService() {
		return restTemplate.getForObject("http://localhost:8080/", String.class);
	}

	@GetMapping
	public String getOutput() {
		return "Customer service is calling : " + getAccountService();
	}

}
