package com.rental.rental;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;

import com.rental.personal.Customer;
import com.rental.vehicle.Car;
import com.rental.vehicle.aggregates.PriceList;

import lombok.Data;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
@Data
public class RentalVehicle implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Embedded
	private Customer customer;
	
	@OneToMany(mappedBy="rentalVehicle")
	private List<Car> cars;
	
	@Embedded
	private List<PriceList> pricesList;
}
