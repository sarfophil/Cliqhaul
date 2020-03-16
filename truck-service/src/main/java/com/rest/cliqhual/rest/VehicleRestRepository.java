package com.rest.cliqhual.rest;

import com.rest.cliqhual.domain.Vehicle;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * VehicleRestRepository
 */
@RepositoryRestResource
public interface VehicleRestRepository extends JpaRepository<Vehicle,Long>{

  Vehicle findByVehicleName(@Param("name") String vehicleName);
    
}