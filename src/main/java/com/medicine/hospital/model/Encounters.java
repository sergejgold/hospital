package com.medicine.hospital.model;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Encounters {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long encounterId;

    @OneToMany(mappedBy = "providerId", fetch = FetchType.EAGER)
    @Fetch(value = FetchMode.SUBSELECT)
    private List<Providers> providers;

    @OneToMany(mappedBy = "patientId", fetch = FetchType.EAGER)
    @Fetch(value = FetchMode.SUBSELECT)
    private List<Patient> patient;

    private LocalDate encounterDt;

    @OneToMany(mappedBy = "procedureId", fetch = FetchType.EAGER)
    @Fetch(value = FetchMode.SUBSELECT)
    private List<Procedures> procedures;
    //
    //
    //
    //
    public Long getEncounterId() {
        return encounterId;
    }

    public List<Providers> getProviders() {
        return providers;
    }

    public List<Patient> getPatient() {
        return patient;
    }

    public LocalDate getEncounterDt() {
        return encounterDt;
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

    public void setEncounterDt(LocalDate encounterDt) {
        this.encounterDt = encounterDt;
    }

    public void setProcedures(List<Procedures> procedures) {
        this.procedures = procedures;
    }

    @Override
    public String toString() {
        return "Encounters{" +
                "encounterId=" + encounterId +
                ", providers=" + providers +
                ", patient=" + patient +
                ", encounter_dt=" + encounterDt +
                ", procedures=" + procedures +
                '}';
    }
}

