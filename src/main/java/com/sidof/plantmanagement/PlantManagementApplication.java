package com.sidof.plantmanagement;

import com.sidof.plantmanagement.model.Species;
import com.sidof.plantmanagement.repo.SpecieRepository;
import lombok.Builder;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;

@SpringBootApplication
public class PlantManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlantManagementApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(SpecieRepository specieRepository){
		return args -> {
		specieRepository.save(new Species(null,"Rosa",new ArrayList<>()));
		specieRepository.save(new Species(null,"Arecaceae",new ArrayList<>()));
		};
	}
}
