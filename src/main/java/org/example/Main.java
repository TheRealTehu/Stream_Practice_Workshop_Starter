package org.example;

import org.example.controller.PatientController;
import org.example.repository.PatientRepository;
import org.example.service.PatientService;
import org.example.util.Utils;

public class Main {
    public static void main(String[] args) {
        PatientRepository repository = new PatientRepository(Utils.init());
        PatientService service = new PatientService(repository);
        PatientController controller = new PatientController(service);

        System.out.println("ALL DETAILS");
        controller.printAllPatientDetails();
        System.out.println("----------------------------------");
        System.out.println("OLDER THAN 30");
        controller.printPatientsOlderThan30();
        System.out.println("----------------------------------");
        System.out.println("OLDER THAN GIVEN AGE (50)");
        controller.printPatientsOlderThanGivenAge(50);
        System.out.println("----------------------------------");
        System.out.println("MALE PATIENTS BORN IN GIVEN BIRTHPLACE (BUDAPEST)");
        controller.printMalePatientsWithGivenBirthPlace("Budapest");
        System.out.println("----------------------------------");
        System.out.println("ALL PATIENTS BORN IN GIVEN PLACE (DEBRECEN)");
        controller.printPatientsFromGivenBirthPlace("Debrecen");
        System.out.println("----------------------------------");
        System.out.println("PATIENTS WITH WRONG AGE");
        controller.printPatientsWhoHasWrongAgeGiven();
        System.out.println("----------------------------------");
        System.out.println("FEMALE PATIENTS WITH ALLITERATING NAMES");
        controller.printFemalePatientsWhereFirstNameAndLastNameStartsWithSameLetter();
        System.out.println("----------------------------------");
        System.out.println("TOP 10 PATIENTS BASED ON PRIORITY SCORE");
        controller.printTopTenPatientsBasedOnPriorityScore();

    }
}