--liquibase formatted sql
--changeset TestUsers_sql:1
CREATE TABLE public."Encounters" (
    encounter_id integer NOT NULL,
    provider_id integer,
    patient_id integer,
    encounter_dt date,
    procedure_id integer
);
ALTER TABLE public."Encounters" OWNER TO postgres;
--changeset TestUsers_sql:2
CREATE TABLE public."Patient" (
    patient_id integer NOT NULL,
    last_name character(1),
    first_name character(1)
);
ALTER TABLE public."Patient" OWNER TO postgres;
--changeset TestUsers_sql:3
CREATE TABLE public."Procedures" (
    procedure_id integer NOT NULL,
    description character(1)
);
ALTER TABLE public."Procedures" OWNER TO postgres;
--changeset TestUsers_sql:4
CREATE TABLE public."Providers" (
    provider_id integer NOT NULL,
    last_name character(1),
    first_name character(1)
);

ALTER TABLE public."Providers" OWNER TO postgres;

COPY public."Encounters" (encounter_id, provider_id, patient_id, encounter_dt, procedure_id) FROM stdin;
\.

COPY public."Patient" (patient_id, last_name, first_name) FROM stdin;
\.

COPY public."Procedures" (procedure_id, description) FROM stdin;
\.

COPY public."Providers" (provider_id, last_name, first_name) FROM stdin;
\.

ALTER TABLE ONLY public."Encounters"
    ADD CONSTRAINT "Encounters_pkey" PRIMARY KEY (encounter_id);

ALTER TABLE ONLY public."Patient"
    ADD CONSTRAINT "Patient_pkey" PRIMARY KEY (patient_id);

ALTER TABLE ONLY public."Procedures"
    ADD CONSTRAINT "Procedures_pkey" PRIMARY KEY (procedure_id);

ALTER TABLE ONLY public."Providers"
    ADD CONSTRAINT "Providers_pkey" PRIMARY KEY (provider_id);

ALTER TABLE ONLY public."Encounters"
    ADD CONSTRAINT patient_id FOREIGN KEY (patient_id) REFERENCES public."Patient"(patient_id) NOT VALID;

ALTER TABLE ONLY public."Encounters"
    ADD CONSTRAINT procedure_id FOREIGN KEY (procedure_id) REFERENCES public."Procedures"(procedure_id) NOT VALID;

ALTER TABLE ONLY public."Encounters"
    ADD CONSTRAINT provider_id FOREIGN KEY (provider_id) REFERENCES public."Providers"(provider_id) NOT VALID;