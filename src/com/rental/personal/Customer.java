package com.rental.personal;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

import com.rental.personal.Person;
import com.rental.personal.aggregates.Address;
import com.rental.personal.aggregates.ContactInfo;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@PrimaryKeyJoinColumn(name="id")
@Getter @Setter @AllArgsConstructor @NoArgsConstructor @EqualsAndHashCode(of="id")
public class Customer extends Person implements Serializable{
	
	private String firstName; 
	private String lastName;
	
	public Customer(Address address, ContactInfo contactInfo, String firstName, String lastName) {
		super(address,contactInfo);
		this.firstName=firstName;
		this.lastName=lastName;
	}
}
