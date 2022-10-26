package org.example.model.dto;

import org.example.model.Patient;
import org.example.model.enums.Gender;

import java.time.LocalDate;

public class PatientDTO {
    private String firstName;
    private String lastName;
    private int age;
    private Gender gender;
    private String birthPlace;
    private LocalDate dateOfBirth;
    private double priorityScore;

    public PatientDTO(Patient patient){
        this.firstName = patient.getFirstName();
        this.lastName = patient.getLastName();
        this.age = patient.getAge();
        this.gender = patient.getGender();
        this.birthPlace = patient.getBirthPlace();
        this.dateOfBirth = patient.getDateOfBirth();
        this.priorityScore = patient.getPatientScore();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public double getPriorityScore() {
        return priorityScore;
    }

    public void setPriorityScore(double priorityScore) {
        this.priorityScore = priorityScore;
    }

    @Override
    public String toString() {
        return "PatientDTO{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", birthPlace='" + birthPlace + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", priorityScore=" + priorityScore +
                '}';
    }
}
