package com.rental.account.repository;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.rental.account.Customer;

@Repository
public class CustomerRepository {
	
	@PersistenceContext
	private EntityManager em;
	
	public CustomerRepository() {
	}
	
	@PostConstruct
	public void init(){
	}
	
	@Transactional
	public Customer save(Customer customer) {
		if (customer.getId() == null) {
			em.persist(customer);
		} else {
			em.merge(customer);
		}
		return customer;
	}
	
	@Transactional(readOnly=true)
	public Customer findOne(Long id){
		return em.find(Customer.class, id);
	}
}
