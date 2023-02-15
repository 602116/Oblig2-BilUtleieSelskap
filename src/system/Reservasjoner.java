package system;

import entity.Bil;
import entity.Kunde;
import entity.Reservasjon;
import entity.Utleiekontor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Reservasjoner {

    private static ArrayList<Reservasjon> reservasjoner = new ArrayList<>();

    public static ArrayList<Reservasjon> getReservasjoner() {
        return reservasjoner;
    }

    /**
     * - Metoden sjekker om en bil allerede er reservert
     * @param bil - Sammenligner det som blir sendt inn med reservasjonene
     * @return - returnerer reservasjonen hvis en bil allerede er reservert og null hvis ikke
     */
    public static Reservasjon finnReservasjonMedBil(Bil bil) {

        for (Reservasjon res : reservasjoner) {


            if (res.getBil().equals(bil)) {
                return res;
            }

        }
        return null;

    }

    /**
     *  - Metoden legger inn en gitt reservasjon i listen med reservasjoner
     * @param reservasjon - sender inn en bestemt reservasjon
     */
    public static void lagReservasjon(Reservasjon reservasjon) {

        reservasjoner.add(reservasjon);

    }


    /**
     * - Metoden fjerner en bestemt reservasjon
     * @param bil - Sender inn et bilobjekt og finner reservasjonen
     */
    public static void fjernReservasjon(Bil bil) {

        reservasjoner.remove(finnReservasjonMedBil(bil));


    }

    /**
     * - Metoden sjekker om en bil kan reserveres
     * @param start - sender inn en start verdi hvor bookingen begynner
     * @param slutt - sender inn en verdi hvor bookingen slutter
     * @param kategori - sender inn en verdi med en bestemt kategori
     * @param hentested - sender inn et bestemt hentested
     * @return - returnerer true hvis bilen kan reserveres og false hvis den ikke kan reserveres
     */
    public static boolean kanReserveres(LocalDate start, LocalDate slutt, Kategori kategori, Utleiekontor hentested) {

        if(hentested.getBiler().containsKategori(kategori)){
            return true;
        }else{
            for (Reservasjon reservasjonen : reservasjoner){
                if(reservasjonen.getLeveringsSted() == hentested){
                    if (reservasjonen.getBil().getKatergori()==kategori) {
                        if (reservasjonen.getSlutt().isBefore(start)){

                            return true;

                        }
                    }
                }
            }
        }

        return false;
    }

}
