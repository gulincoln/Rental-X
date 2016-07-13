package com.rental.vehicle.repository;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.rental.vehicle.Car;

@Repository
public class CarRepository {
	@PersistenceContext(type=PersistenceContextType.EXTENDED)
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
	@Transactional(readOnly=true)
	public Car findById(long id){
		return em.find(Car.class, id);
	}
}
