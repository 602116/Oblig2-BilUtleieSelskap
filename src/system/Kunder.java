package system;

import entity.Kunde;

import java.util.ArrayList;

public class Kunder {

    private static ArrayList<Kunde> kundeListe = new ArrayList<Kunde>();

    /**
     * - Metoden legger til en kunde i kundelisten
     * @param kunde - Sender inn den bestemte kunden som skal blli lagt til
     */
    public static void registrerKunde(Kunde kunde){

        kundeListe.add(kunde);

    }

}
