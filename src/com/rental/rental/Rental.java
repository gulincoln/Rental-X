package com.rental.rental;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.PrimaryKeyJoinColumn;

import lombok.Data;

@Entity
@PrimaryKeyJoinColumn(name="id")
@Data
public class Rental extends RentalVehicle implements Serializable{
	
	@Enumerated(EnumType.STRING)
	private statusRental StatusRental;
	private double penalty;
}
