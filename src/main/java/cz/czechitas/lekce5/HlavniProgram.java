package cz.czechitas.lekce5;

import cz.czechitas.lekce5.model.Adresa;
import cz.czechitas.lekce5.model.Osoba;
import cz.czechitas.lekce5.model.Telefon;

/**
 * Hlaví třída pro lekci 5.
 */
public class HlavniProgram {

    /**
     * Spouštěcí metoda celé aplikace.
     *
     * @param args
     */
    public static void main(String... args) {

        Telefon betyTelefon = new Telefon();
        betyTelefon.setPredcisli("+420");
        betyTelefon.setTelefonniCislo("777777777");

        Adresa betyAdresa = new Adresa();
        betyAdresa.setObec("Barchov");
        betyAdresa.setPsc("50401");
        betyAdresa.setCastObce("");
        betyAdresa.setUlice("Barchov");

        Osoba bety = new Osoba();
        bety.setJmeno("Alžběta");
        bety.setPrijmeni("Hladíková");
        bety.setPracovniMail("myskajehlicka@gmail.com");
        bety.setSoukoromyMail ("b@seznam.cz");
        bety.setRodneCislo("000000/0000");
        bety.setTelefon(betyTelefon);
        bety.setAdresa(betyAdresa);


        System.out.println(bety);




        //System.out.println("Slavnostně přísahám, že jsem připraven ke každé špatnosti.");
    }

}
