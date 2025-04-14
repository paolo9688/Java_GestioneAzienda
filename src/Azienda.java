import java.time.LocalDate;
import java.util.*;

public class Azienda {
    private final List<Progetto> progetti;
    private final Map<Progetto, Set<Utente>> mappaProgetti;

    public Azienda() {
        this.progetti = new ArrayList<>();
        this.mappaProgetti = new HashMap<>();
    }

    public void aggiungiProgetto(Progetto nuovoProgetto) {
        progetti.add(nuovoProgetto);
        System.out.println("Il progetto " + nuovoProgetto.getNomeProgetto()
                + " è stato aggiunto alla lista di progetti aziendali");
    }

    public void rimuoviProgetto(Progetto progettoDaRimuovere) {
        progetti.remove(progettoDaRimuovere);
    }

    public void stampaProgetti() {
        for (Progetto progetto : progetti) {
            System.out.println(progetto);
        }
    }

    public Integer getNumeroProgetti() {
        return progetti.size();
    }

    public List<Progetto> getProgetti() {
        return progetti;
    }

    public Double calcoloBudget() {
        Double budgetTotale = 0.0;
        for (Progetto progetto : progetti) {
            budgetTotale += progetto.getBudgetProgetto();
        }

        return budgetTotale;
    }

    public void gestioneScadenze() {
        progetti.sort(Comparator.comparing(Progetto::getDataScadenza));
        System.out.println("Lista ordinata di progetti in base alla data di scadenza:");
        stampaProgetti();
    }

    // Assegnazione dei progetti e stampa della mappa nel caso 1 a N:
    public void assegnaUtenteAProgetto(Progetto progetto, Utente utente) {
        if (!mappaProgetti.containsKey(progetto)) {
            Set<Utente> listaUtenti = new HashSet<>();
            listaUtenti.add(utente);
            mappaProgetti.put(progetto, listaUtenti);
        } else {
            mappaProgetti.get(progetto).add(utente);
        }

        System.out.println("L'utente " + utente.getNome() + " " + utente.getCognome()
                + " è stato assegnato al progetto " + progetto.getNomeProgetto());
    }

    // Ritorna la lista di utenti assegnati ad un certo progetto:
    public Set<Utente> getUtentiPerProgetto(Progetto progetto) {
        return mappaProgetti.get(progetto);
    }

    // Ritorna il numero di utenti assegnati ad un particolare progetto:
    public Integer getNumeroUtentiPerProgetto(Progetto progetto) {
        return getUtentiPerProgetto(progetto).size();
    }

    public void stampaMappaProgetti() {
        for (Progetto progetto : mappaProgetti.keySet()) {
            progetto.stampaProgetto();
            Set<Utente> listaUtenti = getUtentiPerProgetto(progetto);
            for (Utente utente : listaUtenti) {
                utente.stampaUtente();
            }
        }
    }

    // Metodo per stampare tutte le info di un progetto dato l'id del progetto
    // e tutti gli utenti che stanno lavorando al progetto:
    public void stampaInfoProgettiEUtenti(Integer IDProgetto) {
        Integer counter = 0;

        for (Progetto progetto : mappaProgetti.keySet()) {
            if (progetto.getIDProgetto().equals(IDProgetto)) {
                counter++;
                System.out.println("Queste sono tutte le info relative al progetto " + progetto.getNomeProgetto() + ":");
                progetto.stampaProgetto();
                System.out.println("Questa è la lista degli utenti che stanno lavorando al progetto " + progetto.getNomeProgetto() + ":");
                for (Utente utente : mappaProgetti.get(progetto)) {
                    utente.stampaUtente();
                }
            }
        }

        if (counter == 0) {
            System.out.println("Non è stato trovato alcun progetto con ID uguale a " + IDProgetto + ".");
        }
    }

    // Assegnazione dei progetti e stampa della mappa nel caso 1 a 1:

    /*
    public void assegnaUtenteAProgetto(Utente utente, Progetto progetto) {
        mappaProgetti.put(utente, progetto);
    }

    public void stampaMappaProgetti() {
        for (Utente utente : mappaProgetti.keySet()) {
            utente.stampaUtente();
            mappaProgetti.get(utente).stampaProgetto();
            //System.out.println("Utente: " + utente + ". Progetto: " + mappaProgetti.get(utente));
        }
    }*/
}
