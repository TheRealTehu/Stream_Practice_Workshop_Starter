package org.example.util;

import org.example.model.Patient;
import org.example.model.enums.Gender;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Utils {
    public static List<Patient> init(){
        List<Patient> patients = new ArrayList<>();
        patients.add(new Patient("John", "Doe", 15, Gender.MALE, "Budapest", LocalDate.of(1994, 01, 23), 1, 1, 1));

        return patients;
    }
}
