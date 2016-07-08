package com.rental.vehicle.repository;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.rental.vehicle.maintenance.Maintenance;

@Repository
public class MaintenanceRepository {

	@PersistenceContext
	private EntityManager em;
	
	@PostConstruct
	public void init(){
	}
	
	@Transactional
	public Maintenance save(Maintenance maintenance) {
		if (maintenance.getId() == null) {
			em.persist(maintenance);
		} else {
			em.merge(maintenance);
		}
		return maintenance;
	}
	@Transactional(readOnly=true)
	public Maintenance FindById(long id){
		return em.find(Maintenance.class, id);
	}
}
