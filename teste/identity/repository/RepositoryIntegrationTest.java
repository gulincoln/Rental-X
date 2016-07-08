package identity.repository;

<<<<<<< HEAD
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

=======
>>>>>>> 829d9ce7f1ac0c147aa6f7f31980ac582420c556
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

<<<<<<< HEAD
import com.rental.personal.Customer;
import com.rental.personal.aggregates.Address;
import com.rental.personal.aggregates.ContactInfo;
import com.rental.personal.repository.CustomerRepository;
import com.rental.vehicle.Car;
import com.rental.vehicle.aggregates.CarType;
import com.rental.vehicle.aggregates.Traffic;
import com.rental.vehicle.maintenance.Maintenance;
import com.rental.vehicle.maintenance.StatusCarInMaintenance;
import com.rental.vehicle.repository.CarRepository;
import com.rental.vehicle.repository.MaintenanceRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:WebContent/WEB-INF/application-context.xml")
public class RepositoryIntegrationTest {
	@Autowired
	private CustomerRepository customerRepository;

	@Autowired
	private CarRepository carRepository;

	@Autowired
	private MaintenanceRepository maintenanceRepository;

	@Test
	public void createCustomerTest() {

		Address address = new Address("Rua Nova", "Jd Novo", "sjc");
		ContactInfo contact = new ContactInfo("39212121", "admin@admin.com");

		Customer customer = new Customer(address, contact);

		customer.setFirstName("Gustavo");
		customer.setLastName("Lincoln");

		customerRepository.save(customer);

		assertNotNull(customer.getId());

		Long id = customer.getId();

		Customer storedCustomer = customerRepository.findOne(id);

		assertEquals(customer, storedCustomer);
	}

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

		Car storedCar = carRepository.FindById(id);

		assertEquals(car, storedCar);
	}

	@Test
	public void createMaintenanceTest() {
		Maintenance maintenance = new Maintenance();

		maintenance.setDate(LocalDate.of(2016, 05, 20));
		maintenance.setDescription("ignition problem");
		maintenance.setStatusCarInMaintenance(StatusCarInMaintenance.OK);

		maintenanceRepository.save(maintenance);

		assertNotNull(maintenance.getId());

		Long id = maintenance.getId();

		Maintenance storedMaintenance = maintenanceRepository.FindById(id);

		assertEquals(maintenance, storedMaintenance);

	}
=======
import static org.junit.Assert.*;

import com.rental.account.Customer;
import com.rental.account.Person;
import com.rental.account.repository.CustomerRepository;
import com.rental.commonalities.Address;
import com.rental.commonalities.ContactInfo;
import com.rental.vehicle.Car;
import com.rental.vehicle.repository.CarRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
			locations="file:WebContent/WEB-INF/application-context.xml")
public class RepositoryIntegrationTest {
	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private CarRepository carRepository;
	
	@Test
	public void createCustomerTest(){		
		
		Address address = new Address("Rua Nova","Jd Novo", "sjc");
		ContactInfo contact = new ContactInfo("39212121","admin@admin.com");
		//Person person = new Person(address, contact);
		
		Customer customer = new Customer(address,contact);

		customer.setFirstName("Gustavo");
		customer.setLastName("Lincoln");
		
		customerRepository.save(customer);
		
		assertNotNull(customer.getId());
		
		Long id = customer.getId();
		
		Customer storedCustomer = customerRepository.findOne(id);
		
		assertEquals(customer, storedCustomer);
	}
>>>>>>> 829d9ce7f1ac0c147aa6f7f31980ac582420c556
	
}
