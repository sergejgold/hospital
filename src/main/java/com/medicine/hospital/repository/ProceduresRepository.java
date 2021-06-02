package com.medicine.hospital.repository;

import com.medicine.hospital.model.Procedure;
import org.springframework.data.repository.CrudRepository;

public interface ProceduresRepository extends CrudRepository<Procedure,Long> {
}
