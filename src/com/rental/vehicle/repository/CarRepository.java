package com.rental.vehicle.repository;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
<<<<<<< HEAD
import javax.persistence.PersistenceContextType;
=======
>>>>>>> 829d9ce7f1ac0c147aa6f7f31980ac582420c556

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

<<<<<<< HEAD
import com.rental.personal.Customer;
=======
import com.rental.account.Customer;
>>>>>>> 829d9ce7f1ac0c147aa6f7f31980ac582420c556
import com.rental.vehicle.Car;

@Repository
public class CarRepository {
<<<<<<< HEAD
	@PersistenceContext(type=PersistenceContextType.EXTENDED)
=======
	@PersistenceContext
>>>>>>> 829d9ce7f1ac0c147aa6f7f31980ac582420c556
	private EntityManager em;
	
	public CarRepository() {
	}
	
	@PostConstruct
	public void init(){}
	
	@Transactional
	public Car save(Car car) {
		if (car.getId() == null) {
			em.persist(car);
		} else {
			em.merge(car);
		}
		return car;
	}
<<<<<<< HEAD
	@Transactional(readOnly=true)
=======
	
>>>>>>> 829d9ce7f1ac0c147aa6f7f31980ac582420c556
	public Car FindById(long id){
		return em.find(Car.class, id);
	}
}
