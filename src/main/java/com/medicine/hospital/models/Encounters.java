package com.medicine.hospital.models;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Encounters {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long encounter_id;

    @OneToMany(mappedBy = "provider_id", fetch = FetchType.EAGER)
    private List<Providers> providers;

    @OneToMany(mappedBy = "patient_id", fetch = FetchType.EAGER)
    private List<Patient> patient;

    private LocalDate encounter_dt;

    @OneToMany(mappedBy = "procedure_id", fetch = FetchType.EAGER)
    private List<Procedures> procedures;

    public Encounters() { }

    public Long getEncounter_id() {
        return encounter_id;
    }

    public List<Providers> getProviders() {
        return providers;
    }

    public List<Patient> getPatient() {
        return patient;
    }

    public LocalDate getEncounter_dt() {
        return encounter_dt;
    }

    public List<Procedures> getProcedures() {
        return procedures;
    }

    public void setProviders(List<Providers> providers) {
        this.providers = providers;
    }

    public void setPatient(List<Patient> patient) {
        this.patient = patient;
    }

    public void setEncounter_dt(LocalDate encounter_dt) {
        this.encounter_dt = encounter_dt;
    }

    public void setProcedures(List<Procedures> procedures) {
        this.procedures = procedures;
    }

    @Override
    public String toString() {
        return "Encounters{" +
                "encounter_id=" + encounter_id +
                ", providers=" + providers +
                ", patient=" + patient +
                ", encounter_dt=" + encounter_dt +
                ", procedures=" + procedures +
                '}';
    }
}

