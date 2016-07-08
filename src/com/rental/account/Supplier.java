package com.rental.account;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;

import com.rental.commonalities.Person;
import com.rental.vehicle.Car;
import com.rental.vehicle.CarType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@PrimaryKeyJoinColumn(name="id")
@Getter @Setter @AllArgsConstructor @NoArgsConstructor @EqualsAndHashCode(of="id")
public class Supplier extends Person{
	private String nameCompany;
	
}
