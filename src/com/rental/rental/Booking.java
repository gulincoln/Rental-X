package com.rental.rental;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

import lombok.Data;

@Entity
@PrimaryKeyJoinColumn(name="id")
@Data
public class Booking extends RentalVehicle implements Serializable{
	
	private Date startDate;
	private int qtdDays;
}
