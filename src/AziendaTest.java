import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

class AziendaTest {

    private Azienda azienda;
    private Progetto progetto1;
    private Progetto progetto2;
    private Progetto progetto3;
    private Utente utente1;
    private Utente utente2;
    private Utente utente3;

    @Before
    public void setUpAzienda() {
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
    }

    @Test
    void aggiungiProgettoTest() {
        azienda.aggiungiProgetto(progetto1);
        azienda.aggiungiProgetto(progetto2);
        assertEquals(2, azienda.getNumeroProgetti());
        assertEquals(2, azienda.getProgetti().size());
        assertTrue(azienda.getProgetti().contains(progetto1));
        assertTrue(azienda.getProgetti().contains(progetto2));
    }

    @Test
    void rimuoviProgetto() {
    }

    @Test
    void stampaProgetti() {
    }

    @Test
    void calcoloBudget() {
    }

    @Test
    void gestioneScadenze() {
    }

    @Test
    void assegnaUtenteAProgetto() {
    }

    @Test
    void stampaMappaProgetti() {
    }

    @Test
    void stampaInfoProgettiEUtenti() {
    }
}