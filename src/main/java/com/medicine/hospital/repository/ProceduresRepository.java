package com.medicine.hospital.repository;

import com.medicine.hospital.model.Procedures;
import org.springframework.data.repository.CrudRepository;

public interface ProceduresRepository extends CrudRepository<Procedures,Long> {
}
