package com.rental.vehicle.repository;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.rental.vehicle.maintenance.Maintenance;
import com.rental.vehicle.maintenance.StatusCarInMaintenance;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:WebContent/WEB-INF/application-context.xml")
public class TestCreateMaintenance {
	@Autowired
	private MaintenanceRepository maintenanceRepository;
	
	@Test
	public void createMaintenanceTest() {
		Maintenance maintenance = new Maintenance();

		maintenance.setDate(LocalDate.of(2016, 05, 20));
		maintenance.setDescription("ignition problem");
		maintenance.setStatusCarInMaintenance(StatusCarInMaintenance.OK);

		maintenanceRepository.save(maintenance);

		assertNotNull(maintenance.getId());

		Long id = maintenance.getId();

		Maintenance storedMaintenance = maintenanceRepository.findById(id);

		assertEquals(maintenance, storedMaintenance);

	}

}
