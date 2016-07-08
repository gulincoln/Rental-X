package com.rental.account;

import java.io.Serializable;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.MappedSuperclass;

import com.rental.commonalities.Address;
import com.rental.commonalities.ContactInfo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@MappedSuperclass
@Data @AllArgsConstructor
public class Person{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Embedded
	private Address address;
	
	@Embedded
	private ContactInfo contactInfo;
	
	public Person(Address address, ContactInfo contactInfo) {
		this.address=address;
		this.contactInfo=contactInfo;
	}
}
