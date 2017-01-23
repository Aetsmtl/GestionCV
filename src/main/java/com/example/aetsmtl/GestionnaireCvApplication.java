package com.example.aetsmtl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GestionnaireCvApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestionnaireCvApplication.class, args);
	}
	
	@Bean
	CommandLineRunner initData(CvRepository cvRepository)
	{		
		return args -> 
		{
			cvRepository.save(new Cv("ArnoldExampleCV", "Developer"));
			cvRepository.save(new Cv("GyovannyExampleCV", "Technical Lead"));
		};	
		
	}
	
}
