package com.rest.cliqhual.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

/**
 * Vehicle
 */
@Data
@Entity(name = "vehicle_tbl")
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long vehicleId;
    private String vehicleName,vehicleNumber,vehicleLocation,latitude,longitude; 

    public Vehicle(){

    }

    public Vehicle(String vehicleName,String vehicleNumber,String vehicleLocation,String latitude,String longitude) {
        this.vehicleName = vehicleName;
        this.vehicleNumber = vehicleNumber;
        this.vehicleLocation = vehicleLocation;
        this.latitude = latitude;
        this.longitude = longitude;
    }

   
    
}