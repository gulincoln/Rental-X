package com.rental.personal;

import java.io.Serializable;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import com.rental.personal.aggregates.Address;
import com.rental.personal.aggregates.ContactInfo;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
@Getter @Setter @NoArgsConstructor @EqualsAndHashCode(of="id")
public class Person implements Serializable{
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
