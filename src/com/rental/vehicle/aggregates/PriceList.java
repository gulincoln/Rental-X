package com.rental.vehicle.aggregates;

import javax.persistence.Embeddable;

import com.rental.vehicle.Car;

import lombok.AllArgsConstructor;
import lombok.Data;

@Embeddable
@Data @AllArgsConstructor
public class PriceList {
	private Car car;
	private long price;
}
