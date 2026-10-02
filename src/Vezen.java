public class Vezen {
    private String jmenoPrijmeni;
    private String datumNarozeni;
    private String telefon;
    private String email;
    private String mesto;
    private String ulice;
    private String cisloPopisne;
    private String psc;

    public Vezen(String jmenoPrijmeni, String datumNarozeni, String telefon,
                 String email, String mesto, String ulice, String cisloPopisne, String psc) {
        this.jmenoPrijmeni = jmenoPrijmeni;
        this.datumNarozeni = datumNarozeni;
        this.telefon = telefon;
        this.email = email;
        this.mesto = mesto;
        this.ulice = ulice;
        this.cisloPopisne = cisloPopisne;
        this.psc = psc;
    }

    // Metoda pro získání pouze příjmení (poslední slovo z jména a příjmení)
    public String getPrijmeni() {
        String[] casti = jmenoPrijmeni.split(" ");
        return casti[casti.length - 1];
    }

    // Metoda pro získání pouze roku narození (poslední část za tečkou)
    public String getRokNarozeni() {
        String[] casti = datumNarozeni.split("\\.");
        return casti[2];
    }

    @Override
    public String toString() {
        return jmenoPrijmeni + " (" + datumNarozeni + ")";
    }
}