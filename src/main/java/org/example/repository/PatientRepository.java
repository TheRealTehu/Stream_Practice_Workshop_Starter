package org.example.repository;

import org.example.model.Patient;

import java.util.List;

public class PatientRepository {
    private List<Patient> patients;

    public PatientRepository(List<Patient> patients) {
        this.patients = patients;
    }

    public List<Patient> listAllPatients(){
        //TODO
        return null;
    }

    public List<Patient> listPatientsOlderThan30(){
        //TODO
        return null;
    }

    public List<Patient> listPatientsOlderThanGivenAge(int age){
        //TODO
        return null;
    }

    public List<Patient> listPatientsFromGivenBirthPlace(String birthPlace){
        //TODO
        return null;
    }

    public List<Patient> listPatientsWhoHasWrongAgeGiven(){
        //TODO
        return null;
    }

    public List<Patient> listMalePatientsWithGivenBirthPlace(String birthPlace){
        //TODO
        return null;
    }

    public List<Patient> listFemalePatientsWhereFirstNameAndLastNameStartsWithSameLetter(){
        //TODO
        return null;
    }

    public List<Patient> listTopTenPatientsBasedOnPriorityScore(){
        //TODO: Priority score is generated by the formula: 0.9 * lowPriorityProblems + 1.1 * mediumPriorityProblems + 1.5 * highPriorityProblems
        return null;
    }
}
