package org.example.controller;

import org.example.service.PatientService;


public class PatientController {
    private PatientService service;

    public PatientController(PatientService service) {
        this.service = service;
    }

    public void WriteOutAllPatientDetails() {
        //TODO: Sout all patient details
    }

    public void listPatientsOlderThan30() {
        //TODO: Sout all patient details
    }

    public void listPatientsOlderThanGivenAge(int age) {
        //TODO: Sout all patient details
    }

    public void listPatientsFromGivenBirthPlace() {
        //TODO: Sout all patient details
    }

    public void listPatientsWhoHasWrongAgeGiven() {
        //TODO: Sout all patient details
    }

    public void listMalePatientsWithGivenBirthPlace(String birthPlace) {
        //TODO: Sout all patient details
    }

    public void listFemalePatientsWhereFirstNameAndLastNameStartsWithSameLetter() {
        //TODO: Sout all patient details
    }

    public void listTopTenPatientsBasedOnPriorityScore() {
        //TODO: Sout all patient details
    }
}
