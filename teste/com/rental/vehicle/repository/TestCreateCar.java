package com.rental.vehicle.repository;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.rental.vehicle.Car;
import com.rental.vehicle.aggregates.CarType;
import com.rental.vehicle.aggregates.Traffic;
import com.rental.vehicle.maintenance.Maintenance;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:WebContent/WEB-INF/application-context.xml")
public class TestCreateCar {
	@Autowired
	private CarRepository carRepository;
	
	@Test
	public void createCarTest() {
		List<Maintenance> historicOfMaintenance = new ArrayList<>();

		Traffic traffic1 = new Traffic(137000.0, 1324.34);

		Car car = new Car();

		car.setYear("2009");
		car.setCarType(CarType.DELUXE);
		car.setIsRentable(true);
		car.setTraffic(traffic1);
		car.setMaintenances(historicOfMaintenance);

		carRepository.save(car);

		assertNotNull(car.getId());

		Long id = car.getId();

		Car storedCar = carRepository.findById(id);

		assertEquals(car, storedCar);
	}

}
