import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

class AziendaTest {

    private Azienda azienda;
    private Progetto progetto1;
    private Progetto progetto2;
    private Progetto progetto3;
    private Utente utente1;
    private Utente utente2;
    private Utente utente3;

    @BeforeEach
    void setUp() {
        azienda = new Azienda();

        LocalDate dataSpecifica1 = LocalDate.of(2021, 10, 27);
        LocalDate dataSpecifica2 = LocalDate.of(2024, 11, 27);
        LocalDate dataSpecifica3 = LocalDate.of(2022, 12, 27);

        progetto1 = new Progetto(1, "project1", dataSpecifica1, 1500.0);
        progetto2 = new Progetto(2, "project2", dataSpecifica2, 2000.0);
        progetto3 = new Progetto(3, "project3", dataSpecifica3, 3500.0);

        azienda.aggiungiProgetto(progetto1);
        azienda.aggiungiProgetto(progetto2);
        azienda.aggiungiProgetto(progetto3);

        utente1 = new Utente("Mario", "Rossi", 1);
        utente2 = new Utente("Gianni", "Agnelli", 2);
        utente3 = new Utente("Marco", "Verdi", 3);

        azienda.assegnaUtenteAProgetto(progetto1, utente1);
        azienda.assegnaUtenteAProgetto(progetto2, utente1);
        azienda.assegnaUtenteAProgetto(progetto3, utente3);
    }

    @Test
    void aggiungiProgettoTest() {
        Integer actual = 3;
        Integer expected = azienda.getProgetti().size();
        assertEquals(actual, expected);
        assertTrue(azienda.getProgetti().contains(progetto1));
        assertTrue(azienda.getProgetti().contains(progetto2));
        assertTrue(azienda.getProgetti().contains(progetto3));
    }

    @Test
    void rimuoviProgettoTest() {
        azienda.rimuoviProgetto(progetto3);
        Integer actual = 2;
        Integer expected = azienda.getProgetti().size();
        assertEquals(actual, expected);
        assertTrue(azienda.getProgetti().contains(progetto1));
        assertTrue(azienda.getProgetti().contains(progetto2));
    }

    @Test
    void calcoloBudgetTest() {
        Double actual = 7000.0;
        Double expected = progetto1.getBudgetProgetto() + progetto2.getBudgetProgetto() + progetto3.getBudgetProgetto();
        assertEquals(actual, expected);
    }

    @Test
    void assegnaUtenteAProgettoTest() {
        Integer actual = 1;
        Integer expected = azienda.getNumeroUtentiPerProgetto(progetto1);
        assertEquals(actual, expected);
    }
}