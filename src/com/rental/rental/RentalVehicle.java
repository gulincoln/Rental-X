package com.rental.rental;

import java.util.List;

import com.rental.personal.Customer;
import com.rental.vehicle.Car;
import com.rental.vehicle.aggregates.PriceList;
import com.rental.vehicle.Car;


public class RentalVehicle {
	private Customer customer;
	private List<Car> cars;
	private List<PriceList> pricesList;
}
