package gui.view;

import entity.Bil;
import entity.Reservasjon;
import entity.Utleiekontor;
import system.Reservasjoner;
import system.Utleiekontorer;

import java.util.Scanner;

public class LevereBilTilKontor {

    /**
     * Metode for å levere inn bil til et spesifikt kontor
     */
    public static void levereBilTilKontor() {

        Scanner scanner = new Scanner(System.in);

        Utleiekontor kontor = VelgKontor.velgKontorId();
        System.out.println("Skriv regnummer");
        String regnr = scanner.nextLine();

        Reservasjon res = Reservasjoner.getReservasjoner().stream().filter(a -> a.getBil().getRegNr().equals(regnr)).findFirst().get();

        Reservasjoner.fjernReservasjon(res.getBil());

        Utleiekontorer.leggTilBilPaaUtleiekontor(kontor.getKontornr(), res.getBil());

        System.out.println("Bil innlevert til:" + kontor.getKontorNavn());

    }


}
