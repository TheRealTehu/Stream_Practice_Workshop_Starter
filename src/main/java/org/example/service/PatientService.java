package org.example.service;

import org.example.model.Patient;
import org.example.model.dto.PatientDTO;
import org.example.repository.PatientRepository;

import java.util.List;
import java.util.stream.Collectors;

public class PatientService {
    private PatientRepository repository;

    public PatientService(PatientRepository repository) {
        this.repository = repository;
    }

    public List<Patient> listAllPatientDetails() {
        return repository.listAllPatients();
    }

    public List<Patient> listPatientsOlderThan30() {
        return repository.listPatientsOlderThan30();
    }

    public List<Patient> listPatientsOlderThanGivenAge(int age) {
        return repository.listPatientsOlderThanGivenAge(age);
    }

    public List<Patient> listPatientsFromGivenBirthPlace(String birthPlace) {
        return repository.listPatientsFromGivenBirthPlace(birthPlace);
    }

    public List<Patient> listPatientsWhoHasWrongAgeGiven() {
        return repository.listPatientsWhoHasWrongAgeGiven();
    }

    public List<Patient> listMalePatientsWithGivenBirthPlace(String birthPlace) {
        return repository.listMalePatientsWithGivenBirthPlace(birthPlace);
    }

    public List<Patient> listFemalePatientsWhereFirstNameAndLastNameStartsWithSameLetter() {
        return repository.listFemalePatientsWhereFirstNameAndLastNameStartsWithSameLetter();
    }

    public List<PatientDTO> listTopTenPatientsBasedOnPriorityScore() {
        //TODO: Create PatientDTO list from Patient list
        return repository.listTopTenPatientsBasedOnPriorityScore().stream().map(PatientDTO::new).collect(Collectors.toList());
    }
}
