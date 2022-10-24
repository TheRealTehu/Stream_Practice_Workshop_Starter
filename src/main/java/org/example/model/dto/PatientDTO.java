package org.example.model.dto;

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
}
