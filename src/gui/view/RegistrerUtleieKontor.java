package gui.view;

import entity.Utleiekontor;
import system.Biler;
import system.Utleiekontorer;

import java.util.Scanner;


public class RegistrerUtleieKontor {

    private static String kontorNavn;
    private static int kontornr;
    private static String adresse;
    private static int telefonnr;

    /**
     * Metode for å registrere nytt kontor
     */

    public static void registrerKontor() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Skriv inn kontornr.:");
        kontornr = scanner.nextInt();

        System.out.println("Skriv inn navn på kontor: ");
        kontorNavn = scanner.next();

        System.out.println("Skriv inn adresse:");
        adresse = scanner.next();

        System.out.println("Skriv inn telefonnr.:");
        telefonnr = scanner.nextInt();

        Utleiekontorer.registrerKontor(new Utleiekontor(kontorNavn, kontornr, new Biler(), adresse, telefonnr));

        System.out.println("Nytt kontor i " + kontorNavn + " er registrert.");
    }

}
