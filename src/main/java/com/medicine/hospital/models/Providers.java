package com.medicine.hospital.models;

import javax.persistence.*;
@Entity
public class Providers {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long providerId;

        private String lastName;

        private String firstName;

        public Long getProviderId() {
                return providerId;
        }

        public String getLastName() {
                return lastName;
        }

        public String getFirstName() {
                return firstName;
        }

        public void setLastName(String lastName) {
                this.lastName = lastName;
        }

        public void setFirstName(String firstName) {
                this.firstName = firstName;
        }

        @Override
        public String toString() {
                return "Providers{" +
                        "providerId=" + providerId +
                        ", lastName='" + lastName + '\'' +
                        ", firstName='" + firstName + '\'' +
                        '}';
        }
}
