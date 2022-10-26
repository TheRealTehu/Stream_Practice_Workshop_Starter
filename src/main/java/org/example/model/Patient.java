package org.example.model;

import org.example.model.enums.Gender;

import java.time.LocalDate;
import java.util.Objects;

public class Patient {
    private String firstName;
    private String lastName;
    private int age;
    private Gender gender;
    private String birthPlace;
    private LocalDate dateOfBirth;

    private int numberOfLowPriorityProblems;

    private int numberOfMediumPriorityProblems;

    private int numberOfHighPriorityProblems;

    public Patient(String firstName, String lastName, int age, Gender gender, String birthPlace, LocalDate dateOfBirth, int numberOfLowPriorityProblems, int numberOfMediumPriorityProblems, int numberOfHighPriorityProblems) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.birthPlace = birthPlace;
        this.dateOfBirth = dateOfBirth;
        this.numberOfLowPriorityProblems = numberOfLowPriorityProblems;
        this.numberOfMediumPriorityProblems = numberOfMediumPriorityProblems;
        this.numberOfHighPriorityProblems = numberOfHighPriorityProblems;
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

    public int getNumberOfLowPriorityProblems() {
        return numberOfLowPriorityProblems;
    }

    public void setNumberOfLowPriorityProblems(int numberOfLowPriorityProblems) {
        this.numberOfLowPriorityProblems = numberOfLowPriorityProblems;
    }

    public int getNumberOfMediumPriorityProblems() {
        return numberOfMediumPriorityProblems;
    }

    public void setNumberOfMediumPriorityProblems(int numberOfMediumPriorityProblems) {
        this.numberOfMediumPriorityProblems = numberOfMediumPriorityProblems;
    }

    public int getNumberOfHighPriorityProblems() {
        return numberOfHighPriorityProblems;
    }

    public void setNumberOfHighPriorityProblems(int numberOfHighPriorityProblems) {
        this.numberOfHighPriorityProblems = numberOfHighPriorityProblems;
    }

    public double getPatientScore(){
        return numberOfLowPriorityProblems* 0.9 + numberOfMediumPriorityProblems * 1.1 + numberOfHighPriorityProblems * 1.5;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Patient patient = (Patient) o;
        return age == patient.age && numberOfLowPriorityProblems == patient.numberOfLowPriorityProblems
                && numberOfMediumPriorityProblems == patient.numberOfMediumPriorityProblems
                && numberOfHighPriorityProblems == patient.numberOfHighPriorityProblems
                && Objects.equals(firstName, patient.firstName) && Objects.equals(lastName, patient.lastName)
                && gender == patient.gender && Objects.equals(birthPlace, patient.birthPlace)
                && Objects.equals(dateOfBirth, patient.dateOfBirth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age, gender, birthPlace, dateOfBirth, numberOfLowPriorityProblems, numberOfMediumPriorityProblems, numberOfHighPriorityProblems);
    }

    @Override
    public String toString() {
        return "Patient{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", birthPlace='" + birthPlace + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", numberOfLowPriorityProblems=" + numberOfLowPriorityProblems +
                ", numberOfMediumPriorityProblems=" + numberOfMediumPriorityProblems +
                ", numberOfHighPriorityProblems=" + numberOfHighPriorityProblems +
                '}';
    }
}
