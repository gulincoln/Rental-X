package com.rental.rental.repository;

import static org.junit.Assert.*;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.rental.personal.Customer;
import com.rental.personal.aggregates.Address;
import com.rental.personal.aggregates.ContactInfo;
import com.rental.rental.Booking;
import com.rental.rental.Rental;
import com.rental.rental.statusRental;
import com.rental.vehicle.Car;
import com.rental.vehicle.aggregates.CarType;
import com.rental.vehicle.aggregates.PriceList;
import com.rental.vehicle.aggregates.Traffic;
import com.rental.vehicle.maintenance.Maintenance;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:WebContent/WEB-INF/application-context.xml")
public class TesteCreateRental {

	@Autowired
	private RentalRepository rentalRepository;
	
	@Test
	public void createRentalTest() {
		
		// criando customer
		Address address = new Address("Rua 2", "Jd 3", "sjc");
		ContactInfo contact = new ContactInfo("39212121", "admin@admin.com");
		Customer customer = new Customer(address, contact, "joao", "silva");

		// criando car
		List<Car> carros = new ArrayList<>();
		List<Maintenance> historicOfMaintenance = new ArrayList<>();
		Traffic traffic1 = new Traffic(137000.0, 1324.34);

		Car car1 = new Car();
		car1.setYear("2009");
		car1.setCarType(CarType.DELUXE);
		car1.setIsRentable(true);
		car1.setTraffic(traffic1);
		car1.setMaintenances(historicOfMaintenance);

		carros.add(car1);

		// criando pricelist
		List<PriceList> prices = new ArrayList<>();
		prices.add(new PriceList(car1, 200));

		// criando o rental
		Rental rental = new Rental();
		rental.setCustomer(customer);
		rental.setCars(carros);
		rental.setPricesList(prices);
		rental.setStatusRental(statusRental.OPEN);
		rental.setPenalty(0);

		rentalRepository.save(rental);

		assertNotNull(rental.getId());

		Long id = rental.getId();

		Rental storedRental = rentalRepository.findById(id);

		assertEquals(storedRental, rental);

	}

}
