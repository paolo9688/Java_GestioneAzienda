import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate dataSpecifica1 = LocalDate.of(2021, 10, 27);
        LocalDate dataSpecifica2 = LocalDate.of(2024, 10, 27);
        LocalDate dataSpecifica3 = LocalDate.of(2022, 10, 27);

        Progetto progetto1 = new Progetto(1, "project1", dataSpecifica1, 1500.0);
        Progetto progetto2 = new Progetto(2, "project2", dataSpecifica2, 2000.0);
        Progetto progetto3 = new Progetto(3, "project3", dataSpecifica3, 3500.0);

        Azienda azienda = new Azienda();

        azienda.aggiungiProgetto(progetto1);
        azienda.aggiungiProgetto(progetto2);
        azienda.aggiungiProgetto(progetto3);

        System.out.println();

        azienda.stampaProgetti();

        System.out.println();

        System.out.println(azienda.calcoloBudget());

        System.out.println();

        azienda.gestioneScadenze();

        System.out.println();

        // creare una classe utente che deve avere la possibilità d'iscriversi a un progetto
        // creare i metodi e tutto quello che ci vuole per stampare una mappa in azienda che
        // ci dica su che progetti sono gli utenti

        Utente utente1 = new Utente("Mario", "Rossi", 1);
        Utente utente2 = new Utente("Gianni", "Agnelli", 2);
        Utente utente3 = new Utente("Marco", "Verdi", 3);

        azienda.assegnaUtenteAProgetto(progetto1, utente1);
        azienda.assegnaUtenteAProgetto(progetto1, utente2);
        azienda.assegnaUtenteAProgetto(progetto2, utente2);
        azienda.assegnaUtenteAProgetto(progetto3, utente1);
        azienda.assegnaUtenteAProgetto(progetto1, utente3);
        azienda.assegnaUtenteAProgetto(progetto2, utente3);
        azienda.assegnaUtenteAProgetto(progetto3, utente3);

        System.out.println();

        azienda.stampaMappaProgetti();

        System.out.println();

        azienda.stampaInfoProgettiEUtenti(2);
    }
}