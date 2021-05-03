package com.medicine.hospital.models;

import javax.persistence.*;

@Entity
public class Procedures {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long procedure_id;

    private String description;
    public Procedures() {}

    public Long getProcedure_id() {
        return procedure_id;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Procedures{" +
                "procedure_id=" + procedure_id +
                ", description='" + description + '\'' +
                '}';
    }
}
