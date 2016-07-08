package com.rental.vehicle.aggregates;

import javax.persistence.Embeddable;

@Embeddable
public class Traffic {
	private double totalKilometers;
	private double currentKilometers;
	
	public Traffic() {
		// TODO Auto-generated constructor stub
	}
	public Traffic(double totalKilometers, double currentKilometers) {
		this.totalKilometers = totalKilometers;
		this.currentKilometers = currentKilometers;
	}
}
