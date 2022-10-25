import org.example.model.Patient;
import org.example.model.enums.Gender;
import org.example.repository.PatientRepository;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PatientRepositoryTest {
    private Patient patient1 = new Patient("John", "Doe", 28, Gender.MALE, "Budapest",
            LocalDate.of(1994, 1, 23),
            1, 0, 0);

    private Patient patient2 = new Patient("Jane", "Joe", 15, Gender.FEMALE, "Budapest",
            LocalDate.of(2007, 3, 11),
            0, 2, 0);

    private Patient patient3 = new Patient("John", "Doe", 45, Gender.MALE, "Eger",
            LocalDate.of(1994, 1, 23),
            0, 0, 3);

    private List<Patient> testList = new ArrayList<>() {{
        add(patient1);
        add(patient2);
        add(patient3);
    }};

    private final PatientRepository repository = new PatientRepository(testList);

    @Test
    void listAllPatientsTest() {
        Assert.assertEquals(testList, repository.listAllPatients());
    }

    @Test
    void listPatientsOlderThan30Test() {
        List<Patient> expectedList = List.of(patient3);

        Assert.assertEquals(expectedList, repository.listPatientsOlderThan30());
    }

    @Test
    void listPatientsOlderThanGivenAgeTest() {
        List<Patient> expectedList = List.of(
                patient1,
                patient3
        );

        Assert.assertEquals(expectedList, repository.listPatientsOlderThanGivenAge(20));
    }

    @Test
    void listPatientsFromGivenBirthPlaceTest() {
        List<Patient> expectedList = List.of(
                patient1,
                patient2
        );

        Assert.assertEquals(expectedList, repository.listPatientsFromGivenBirthPlace("Budapest"));
    }

    @Test
    void listPatientsWhoHasWrongAgeGivenTest() {
        List<Patient> expectedList = List.of(
                patient3
        );

        Assert.assertEquals(expectedList, repository.listPatientsWhoHasWrongAgeGiven());
    }

    @Test
    void listMalePatientsWithGivenBirthPlaceTest() {
        List<Patient> expectedList = List.of(
                patient3
        );

        Assert.assertEquals(expectedList, repository.listMalePatientsWithGivenBirthPlace("Eger"));
    }

    @Test
    void listFemalePatientsWhereFirstNameAndLastNameStartsWithSameLetterTest() {
        List<Patient> expectedList = List.of(
                patient2
        );

        Assert.assertEquals(expectedList, repository.listFemalePatientsWhereFirstNameAndLastNameStartsWithSameLetter());
    }

    @Test
    void listTopTenPatientsBasedOnPriorityScoreTest() {
        List<Patient> expectedList = List.of(
                patient3,
                patient2,
                patient1
        );

        Assert.assertEquals(expectedList, repository.listTopTenPatientsBasedOnPriorityScore());
    }
}
