package com.medicine.hospital.repository;

import com.medicine.hospital.model.Doctor;
import org.springframework.data.repository.CrudRepository;

public interface ProvidersRepository extends CrudRepository<Doctor,Long> {
}
