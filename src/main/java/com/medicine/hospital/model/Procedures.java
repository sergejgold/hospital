package com.medicine.hospital.model;

import javax.persistence.*;

@Entity
public class Procedures {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long procedureId;

    private String description;

    public Procedures() {}

    public Long getProcedureId() {
        return procedureId;
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
                "procedureId=" + procedureId +
                ", description='" + description + '\'' +
                '}';
    }
}
