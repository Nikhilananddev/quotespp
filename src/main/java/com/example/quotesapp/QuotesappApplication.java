package com.example.quotesapp;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
@SpringBootApplication
public class QuotesappApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuotesappApplication.class, args);
	}

	/**
	 * Fetches a ModelMapper instance.
	 *
	 * @return ModelMapper
	 */
	@Bean // Want a new obj every time
	@Scope("prototype")
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
}
