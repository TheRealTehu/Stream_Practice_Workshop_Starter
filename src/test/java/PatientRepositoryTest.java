import org.example.model.Patient;
import org.example.model.enums.Gender;
import org.example.repository.PatientRepository;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PatientRepositoryTest {

    List<Patient> testList = new ArrayList<>(){{
        add(new Patient("John", "Doe", 28, Gender.MALE, "Budapest",
            LocalDate.of(1994, 1, 23),
            1, 1, 1));
        add(new Patient("Jane", "Doe", 15, Gender.FEMALE, "Budapest",
                LocalDate.of(2007, 3, 11),
                1, 1, 1));
        add(new Patient("John", "Doe", 15, Gender.MALE, "Eger",
                LocalDate.of(1994, 1, 23),
                1, 1, 1));
    }};

    private final PatientRepository repository = new PatientRepository(testList);

    @Test
    void listAllPatientsTest(){
        Assert.assertEquals(List.of(new Patient("John", "Doe", 28, Gender.MALE, "Budapest",
                LocalDate.of(1994, 1, 23),
                1, 1, 1), new Patient("Jane", "Doe", 15, Gender.FEMALE, "Budapest",
                LocalDate.of(2007, 3, 11),
                1, 1, 1), new Patient("John", "Doe", 15, Gender.MALE, "Eger",
                LocalDate.of(1994, 1, 23),
                1, 1, 1)), repository.listAllPatients());
    }
}
