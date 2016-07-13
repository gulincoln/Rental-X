package com.rental.rental.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.rental.rental.Rental;

@Repository
public class RentalRepository {
	@PersistenceContext
	private EntityManager em;

	@Transactional
	public Rental save(Rental rental) {
		if (rental.getId() == null) {
			em.persist(rental);
		} else {
			em.merge(rental);
		}
		return rental;
	}
	
	@Transactional(readOnly=true)
	public Rental findById(Long id){
		return em.find(Rental.class, id);
	}
}
