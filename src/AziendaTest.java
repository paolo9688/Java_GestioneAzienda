import org.junit.Before;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

class AziendaTest {

    private Azienda azienda;
    private Progetto progetto1;
    private Progetto progetto2;
    private Utente utente1;
    private Utente utente2;

    @Before
    public void setUpAzienda() {
        LocalDate dataSpecifica1 = LocalDate.of(2021, 10, 27);
        LocalDate dataSpecifica2 = LocalDate.of(2024, 10, 27);
        LocalDate dataSpecifica3 = LocalDate.of(2022, 10, 27);

        Progetto progetto1 = new Progetto(1, "project1", dataSpecifica1, 1500.0);
        Progetto progetto2 = new Progetto(2, "project2", dataSpecifica2, 2000.0);
        Progetto progetto3 = new Progetto(3, "project3", dataSpecifica3, 3500.0);

        List<Progetto> progetti = new ArrayList<>();

        azienda.aggiungiProgetto(progetto1);
        azienda.aggiungiProgetto(progetto2);
        azienda.aggiungiProgetto(progetto3);

        Utente utente1 = new Utente("Mario", "Rossi", 1);
        Utente utente2 = new Utente("Gianni", "Agnelli", 2);
        Utente utente3 = new Utente("Marco", "Verdi", 3);
    }

    @Test
    void aggiungiProgetto() {
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