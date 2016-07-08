package com.rental.personal;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;


import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@PrimaryKeyJoinColumn(name="id")
@Getter @Setter @AllArgsConstructor @EqualsAndHashCode(of="id")
public class Supplier extends Person{
	private String nameCompany;
	
}
