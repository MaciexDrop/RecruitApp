package com.example.BusinessApp;

import com.example.BusinessApp.client.PolishBusinessNewsClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BusinessAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(BusinessAppApplication.class, args);

		PolishBusinessNewsClient api = new PolishBusinessNewsClient();
		api.getNews();
	}



}
