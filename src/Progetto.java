import java.time.LocalDate;

public class Progetto {
    private Integer IDProgetto;
    private String nomeProgetto;
    private LocalDate dataScadenza;
    private Double budgetProgetto;

    public Progetto(Integer IDProgetto, String nomeProgetto, LocalDate dataScadenza, Double budgetProgetto) {
        this.IDProgetto = IDProgetto;
        this.nomeProgetto = nomeProgetto;
        this.dataScadenza = dataScadenza;
        this.budgetProgetto = budgetProgetto;
    }

    public Integer getIDProgetto() {
        return IDProgetto;
    }

    public void setIDProgetto(Integer IDProgetto) {
        this.IDProgetto = IDProgetto;
    }

    public String getNomeProgetto() {
        return nomeProgetto;
    }

    public void setNomeProgetto(String nomeProgetto) {
        this.nomeProgetto = nomeProgetto;
    }

    public LocalDate getDataScadenza() {
        return dataScadenza;
    }

    public void setDataScadenza(LocalDate dataScadenza) {
        this.dataScadenza = dataScadenza;
    }

    public Double getBudgetProgetto() {
        return budgetProgetto;
    }

    public void setBudgetProgetto(Double budgetProgetto) {
        this.budgetProgetto = budgetProgetto;
    }

    @Override
    public String toString() {
        return "Progetto{" +
                "IDProgetto=" + IDProgetto +
                ", nomeProgetto='" + nomeProgetto + '\'' +
                ", dataScadenza=" + dataScadenza +
                ", budgetProgetto=" + budgetProgetto +
                '}';
    }

    public void stampaProgetto() {
        System.out.println("Dati progetto: ID = " + this.IDProgetto
                + ", nome = " + this.nomeProgetto
                + ", data di scadenza = " + this.dataScadenza
                + ", budget = " + this.budgetProgetto);
    }
}
