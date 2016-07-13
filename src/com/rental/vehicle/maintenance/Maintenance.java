package com.rental.vehicle.maintenance;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.rental.vehicle.Car;
import lombok.Data;

@Entity
@Data
public class Maintenance implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private LocalDate date;
	private String description;
	private StatusCarInMaintenance statusCarInMaintenance;
	
	@ManyToOne(fetch=FetchType.EAGER)
	private Car car;
	
	
}
