import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class ProgettoTest {

    private Progetto progetto1;

    @BeforeEach
    void setUp() {
        progetto1 = new Progetto(1, "project1", LocalDate.of(2021, 10, 27), 1500.0);
    }

    @Test
    void getIDProgettoTest() {
        Integer actual = 1;
        Integer expected = progetto1.getIDProgetto();
        assertEquals(actual, expected);
    }

    @Test
    void getNomeProgettoTest() {
        String actual = "project1";
        String expected = progetto1.getNomeProgetto();
        assertEquals(actual, expected);
    }

    @Test
    void getDataScadenzaTest() {
        LocalDate actual = LocalDate.of(2021, 10, 27);
        LocalDate expected = progetto1.getDataScadenza();
        assertEquals(actual, expected);
    }

    @Test
    void getBudgetProgettoTest() {
        Double actual = 1500.0;
        Double expected = progetto1.getBudgetProgetto();
        assertEquals(actual, expected);
    }
}
