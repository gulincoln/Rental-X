package com.rental.vehicle;

<<<<<<< HEAD
import java.io.Serializable;
import java.util.List;

import javax.persistence.Embedded;
=======
>>>>>>> 829d9ce7f1ac0c147aa6f7f31980ac582420c556
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
<<<<<<< HEAD
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.rental.vehicle.aggregates.CarType;
import com.rental.vehicle.aggregates.Traffic;
import com.rental.vehicle.maintenance.Maintenance;
=======
>>>>>>> 829d9ce7f1ac0c147aa6f7f31980ac582420c556

import lombok.*;

@Entity
<<<<<<< HEAD
@Data
public class Car implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String year;
	private boolean IsRentable;
	
	@Enumerated(EnumType.STRING)
	private CarType carType;
	
	@OneToMany(mappedBy="car")
	private List<Maintenance> maintenances;
	
	@Embedded
	private Traffic traffic;
=======
@Getter @Setter @AllArgsConstructor @EqualsAndHashCode(of="id")
public class Car {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String model;
	private String year;
	
	@Enumerated(EnumType.STRING)
	private CarType carType;
>>>>>>> 829d9ce7f1ac0c147aa6f7f31980ac582420c556
}
