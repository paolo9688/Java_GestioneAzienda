public class Utente {
    private String nome;
    private String cognome;
    private Integer IDUtente;

    public Utente(String nome, String cognome, Integer IDUtente) {
        this.nome = nome;
        this.cognome = cognome;
        this.IDUtente = IDUtente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public Integer getIDUtente() {
        return IDUtente;
    }

    public void setIDUtente(Integer IDUtente) {
        this.IDUtente = IDUtente;
    }

    @Override
    public String toString() {
        return "Utente{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", IDUtente=" + IDUtente +
                '}';
    }

    public void stampaUtente() {
        System.out.println("Dati utente: nome = " + this.nome
        + ", cognome = " + this.cognome
        + ", ID = " + this.IDUtente);
    }
}
