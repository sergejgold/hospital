<?xml version="1.0" encoding="UTF-8"?>

<databaseChangeLog
        xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
        xmlns="http://www.liquibase.org/xml/ns/dbchangelog"
        xsi:schemaLocation="http://www.liquibase.org/xml/ns/dbchangelog http://www.liquibase.org/xml/ns/dbchangelog/dbchangelog-3.6.xsd">

    <changeSet id="Create table test_xml_table" author="TestUsers_xml">

        <createTable tableName="test_xml_table">
            <column name="name" type="character varying">
                <constraints primaryKey="true" nullable="false"/>
            </column>
            <column name="description" type="character varying"/>
        </createTable>

    </changeSet>

    <changeSet id="Create table test_xml_table_2" author="TestUsers_xml">

        <createTable tableName="test_xml_table_2">
            <column name="name" type="character varying">
                <constraints primaryKey="true" nullable="false"/>
            </column>
            <column name="description" type="character varying"/>
        </createTable>

    </changeSet>
</databaseChangeLog>
