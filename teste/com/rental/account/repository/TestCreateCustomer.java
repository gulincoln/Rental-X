package com.rental.account.repository;

import static org.junit.Assert.*;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.rental.personal.Customer;
import com.rental.personal.aggregates.Address;
import com.rental.personal.aggregates.ContactInfo;
import com.rental.personal.repository.CustomerRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:WebContent/WEB-INF/application-context.xml")
public class TestCreateCustomer {
	@Autowired
	private CustomerRepository customerRepository;
	
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

}
