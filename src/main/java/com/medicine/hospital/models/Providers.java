package com.medicine.hospital.models;

import javax.persistence.*;
@Entity
public class Providers {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long provider_id;

        private String last_name;

        private String first_name;
}
