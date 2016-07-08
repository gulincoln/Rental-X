package com.rental.account;

import javax.persistence.Entity;

import com.rental.commonalities.Address;
import com.rental.commonalities.ContactInfo;
import com.rental.commonalities.Person;

import lombok.Data;

@Entity
@Data
public class Customer extends Person {
	
	private String firstName; 
	private String lastName;
	
	public Customer(Address address, ContactInfo contactInfo) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	
}
