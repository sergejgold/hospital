--liquibase formatted sql
--changeset TestUsers_sql:1

SET search_path TO public;

CREATE TABLE encounters (
    encounter_id serial,
    provider_id integer,
    patient_id integer,
    encounter_dt timestamp,
    procedure_id integer
);
ALTER TABLE encounters OWNER TO postgres;
--changeset TestUsers_sql:2
CREATE TABLE patient (
    patient_id serial,
    last_name VARCHAR(25),
    first_name VARCHAR(25)
);
ALTER TABLE patient OWNER TO postgres;
--changeset TestUsers_sql:3
CREATE TABLE procedures (
    procedure_id serial,
    description VARCHAR(25)
);
ALTER TABLE procedures OWNER TO postgres;
--changeset TestUsers_sql:4
CREATE TABLE providers (
    provider_id serial,
    last_name VARCHAR(25),
    first_name VARCHAR(25)
);

ALTER TABLE providers OWNER TO postgres;

COPY encounters (encounter_id, provider_id, patient_id, encounter_dt, procedure_id) FROM stdin;
\.
COPY patient (patient_id, last_name, first_name) FROM stdin;
\.
COPY procedures (procedure_id, description) FROM stdin;
\.
COPY providers (provider_id, last_name, first_name) FROM stdin;
\.

ALTER TABLE ONLY encounters
    ADD CONSTRAINT "encounters_pkey" PRIMARY KEY (encounter_id);
ALTER TABLE ONLY patient
    ADD CONSTRAINT "patient_pkey" PRIMARY KEY (patient_id);
ALTER TABLE ONLY procedures
    ADD CONSTRAINT "procedures_pkey" PRIMARY KEY (procedure_id);
ALTER TABLE ONLY providers
    ADD CONSTRAINT "providers_pkey" PRIMARY KEY (provider_id);
ALTER TABLE ONLY encounters
    ADD CONSTRAINT patient_id FOREIGN KEY (patient_id) REFERENCES patient(patient_id);
ALTER TABLE ONLY encounters
    ADD CONSTRAINT procedure_id FOREIGN KEY (procedure_id) REFERENCES procedures(procedure_id);
ALTER TABLE ONLY encounters
    ADD CONSTRAINT provider_id FOREIGN KEY (provider_id) REFERENCES providers(provider_id);