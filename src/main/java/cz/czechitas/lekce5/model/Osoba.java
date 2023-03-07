package cz.czechitas.lekce5.model;

import java.util.Objects;

public class Osoba {
    private String jmeno;
    private String prijmeni;
    private String rodneCislo;
    private SocialniSite socialniSite;
    private Telefon telefon;
    private String soukoromyMail;
    private String pracovniMail;
    private Adresa adresa;

    public void setJmeno(String jmeno) {
        Objects.requireNonNull(jmeno);
        if (jmeno.isBlank()) {
            System.err.println("Jméno nemůže být prázdné.");
            return;
        }
        this.jmeno = jmeno;
    }

    public String getJmeno() {
        return jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    public void setPrijmeni(String prijmeni) {
        Objects.requireNonNull(prijmeni);
        if (prijmeni.isBlank()) {
            System.err.println("Příjmení nemůže být prázdné.");
            return;
        }
        this.prijmeni = prijmeni;
    }

    public String getRodneCislo() {
        return rodneCislo;
    }

    public void setRodneCislo(String rodneCislo) {
        Objects.requireNonNull(rodneCislo);
        if (rodneCislo.isBlank()) {
            System.err.println("Rodné číslo nemůže být prázdné.");
            return;
        }
        if (!rodneCislo.contains("/")) {
            System.err.println("Rodné číslo musí obsahovat lomítko.");
            return;
        }
        this.rodneCislo = rodneCislo;
    }

    public SocialniSite getSocialniSite() {
        return socialniSite;
    }

    public void setSocialniSite(SocialniSite socialniSite) {
        this.socialniSite = socialniSite;
    }

    public Telefon getTelefon() {
        return telefon;
    }

    public void setTelefon(Telefon telefon) {
        this.telefon = telefon;
    }

    public String getSoukoromyMail() {
        return soukoromyMail;
    }

    public void setSoukoromyMail(String soukoromyMail) {
        Objects.requireNonNull(soukoromyMail);
        if (soukoromyMail.isBlank()) {
            System.err.println("Soukromý email musí být vyplněn.");

            return;}

        if (!soukoromyMail.contains("@")) {
            System.err.println("Mail musí obsahovat @");
            return;}
            this.soukoromyMail = soukoromyMail;
        }

        public String getPracovniMail () {
            return pracovniMail;
        }

        public void setPracovniMail (String pracovniMail){
            this.pracovniMail = pracovniMail;
        }

        public Adresa getAdresa () {
            return adresa;
        }

        public void setAdresa (Adresa adresa){
            this.adresa = adresa;
                    }
public String getKontakty(){return soukoromyMail +" "+ pracovniMail +" "+telefon +" "+ adresa ;}
        public String toString () {
            return jmeno + " " + prijmeni + " "+"RČ: "+ " (" + rodneCislo + ")"
            /* + " " + adresa + " " + soukoromyMail + " " + "Telefon"+" "+telefon */
            + getKontakty();

        }
    }

