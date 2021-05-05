package com.medicine.hospital.repository;

import com.medicine.hospital.model.Patient;
import org.springframework.data.repository.CrudRepository;

public interface PatientRepository extends CrudRepository<Patient,Long> {
}
