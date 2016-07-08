package com.rental.account;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;

import com.rental.commonalities.Address;
import com.rental.commonalities.ContactInfo;
import com.rental.commonalities.Person;
import com.rental.vehicle.Car;
import com.rental.vehicle.CarType;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@PrimaryKeyJoinColumn(name="id")
@Getter @Setter @AllArgsConstructor @EqualsAndHashCode(of="id")
public class Customer extends Person implements Serializable{
	
	private String firstName; 
	private String lastName;
	
	public Customer(Address address, ContactInfo contactInfo) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	
}
