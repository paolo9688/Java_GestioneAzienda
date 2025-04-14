import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class UtenteTest {

    private Utente utente1;

    @BeforeEach
    void setUp() {
        utente1 = new Utente("Mario", "Rossi", 1);
    }

    @Test
    void getNome () {
        String actual = "Mario";
        String expected = utente1.getNome();
        assertEquals(actual, expected);
    }

    @Test
    void getCognome () {
        String actual = "Rossi";
        String expected = utente1.getCognome();
        assertEquals(actual, expected);
    }

    @Test
    void getIDUtente () {
        Integer actual = 1;
        Integer expected = utente1.getIDUtente();
        assertEquals(actual, expected);
    }
}