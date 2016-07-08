package com.rental.vehicle;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.rental.vehicle.aggregates.CarType;
import com.rental.vehicle.aggregates.Traffic;
import com.rental.vehicle.maintenance.Maintenance;

import lombok.*;

@Entity
@Data
public class Car implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String year;
	private boolean IsRentable;
	
	@Enumerated(EnumType.STRING)
	private CarType carType;
	
	@OneToMany(mappedBy="car")
	private List<Maintenance> maintenances;
	
	@Embedded
	private Traffic traffic;
}
