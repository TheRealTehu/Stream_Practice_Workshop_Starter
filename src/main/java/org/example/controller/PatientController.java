package org.example.controller;

import org.example.service.PatientService;
import org.example.util.Utils;


public class PatientController {
    private PatientService service;

    public PatientController(PatientService service) {
        this.service = service;
    }

    public void printAllPatientDetails() {
        Utils.printPatientData(service.listAllPatientDetails());
    }

    public void printPatientsOlderThan30() {
        Utils.printPatientData(service.listPatientsOlderThan30());
    }

    public void printPatientsOlderThanGivenAge(int age) {
        Utils.printPatientData(service.listPatientsOlderThanGivenAge(age));
    }

    public void printPatientsFromGivenBirthPlace(String birthPlace) {
        Utils.printPatientData(service.listPatientsFromGivenBirthPlace(birthPlace));
    }

    public void printPatientsWhoHasWrongAgeGiven() {
        Utils.printPatientData(service.listPatientsWhoHasWrongAgeGiven());
    }

    public void printMalePatientsWithGivenBirthPlace(String birthPlace) {
        Utils.printPatientData(service.listMalePatientsWithGivenBirthPlace(birthPlace));
    }

    public void printFemalePatientsWhereFirstNameAndLastNameStartsWithSameLetter() {
        Utils.printPatientData(service.listFemalePatientsWhereFirstNameAndLastNameStartsWithSameLetter());
    }

    public void printTopTenPatientsBasedOnPriorityScore() {
        Utils.printPatientDtoData(service.listTopTenPatientsBasedOnPriorityScore());
    }
}
