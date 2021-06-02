package com.medicine.hospital.repository;

import com.medicine.hospital.model.Appointment;
import org.springframework.data.repository.CrudRepository;


public interface EncountersRepository extends CrudRepository<Appointment,Long> {

}
