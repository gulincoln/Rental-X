package com.rental.rental.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.rental.rental.Booking;

@Repository
public class BookingRepository {

		@PersistenceContext
		private EntityManager em;

		@Transactional
		public Booking save(Booking booking) {
			if (booking.getId() == null) {
				em.persist(booking);
			} else {
				em.merge(booking);
			}
			return booking;
		}
		
		@Transactional(readOnly=true)
		public Booking findOne(Long id){
			return em.find(Booking.class, id);
		}
	}
