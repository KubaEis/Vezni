import java.text.Normalizer;
import java.util.Date;
import java.util.regex.Pattern;

public class Vezen {
    private String jmenoPrijmeni;
    private String datumNarozeni;
    private String telefon;
    private String email;
    private String mesto;
    private String ulice;
    private String cisloPopisne;
    private String psc;
    /*Pattern JMENO_PRIJMENI = Pattern.compile("(\\b[A-Z]\\w*) (\\b[A-Z]\\w*)");
    Pattern DATUM_PATTERN = Pattern.compile("^((3[0-1]|2[0-9]|1[0-9]|[1-9])\\. )" + "((1)[0-2]|[1-9]\\. )" + "[0-9]{1,4}$");
    Pattern TELEFON_PATTERN = Pattern.compile("^[1-9]\\d{2} \\d{3} \\d{3}$");
    Pattern EMAIL_PATTERN = Pattern.compile("^[a-zA-Z0-9._%+\\-]+@[a-zA-Z0-9.\\-]+\\.[a-zA-Z]{2,}$");*/
    public Vezen(String jmenoPrijmeni, String datumNarozeni, String telefon, String email, String mesto, String ulice, String cisloPopisne, String psc) {
        this.jmenoPrijmeni = jmenoPrijmeni;
        this.datumNarozeni = datumNarozeni;
        this.telefon = telefon;
        this.email = email;
        this.mesto = mesto;
        this.ulice = ulice;
        this.cisloPopisne = cisloPopisne;
        this.psc = psc;
    }

    public String getJmenoPrijmeni() {
        return jmenoPrijmeni;
    }

    public void setJmenoPrijmeni(String jmenoPrijmeni) {
        this.jmenoPrijmeni = jmenoPrijmeni;
    }

    public String getDatumNarozeni() {
        return datumNarozeni;
    }

    public void setDatumNarozeni(String datumNarozeni) {
        this.datumNarozeni = datumNarozeni;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMesto() {
        return mesto;
    }

    public void setMesto(String mesto) {
        this.mesto = mesto;
    }

    public String getUlice() {
        return ulice;
    }

    public void setUlice(String ulice) {
        this.ulice = ulice;
    }

    public String getCisloPopisne() {
        return cisloPopisne;
    }

    public void setCisloPopisne(String cisloPopisne) {
        this.cisloPopisne = cisloPopisne;
    }

    public String getPsc() {
        return psc;
    }

    public void setPsc(String psc) {
        this.psc = psc;
    }

    @Override
    public String toString() {
        return "Vezen{" +
                "jmenoPrijmeni='" + jmenoPrijmeni + '\'' +
                ", datumNarozeni='" + datumNarozeni + '\'' +
                ", telefon='" + telefon + '\'' +
                ", email='" + email + '\'' +
                ", mesto='" + mesto + '\'' +
                ", ulice='" + ulice + '\'' +
                ", cisloPopisne='" + cisloPopisne + '\'' +
                ", psc='" + psc + '\'' +
                '}';
    }
}
