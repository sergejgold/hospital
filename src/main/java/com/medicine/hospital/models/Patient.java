package com.medicine.hospital.models;

import javax.persistence.*;

@Entity
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long patientId;

    private String lastName;
    private String firstName;

    public Patient() {}

    public Long getPatientId() {
        return patientId;
    }
    public String getLastName() {
        return lastName;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String last_name) {
        this.lastName = last_name;
    }
    public void setFirstName(String first_name) {
        this.firstName = first_name;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "patientId=" + patientId +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                '}';
    }
}
