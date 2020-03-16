package com.rest.cliqhual;

import javax.annotation.PostConstruct;

import com.rest.cliqhual.domain.Vehicle;
import com.rest.cliqhual.rest.VehicleRestRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class CliqhualApplication {

	@Autowired
	private VehicleRestRepository vehicleRestRepository;

	public static void main(String[] args) {
		SpringApplication.run(CliqhualApplication.class, args);
	}


	@PostConstruct
	public void vehicleProcessingInitializer() {
		Vehicle vehicle = new Vehicle("Long Haul truck","GS4454","Accra","1233","344");
		vehicleRestRepository.save(vehicle);
	}
}
