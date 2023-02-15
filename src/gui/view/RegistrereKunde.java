package gui.view;

import entity.Kunde;
import system.Kunder;

import java.util.Scanner;

public class RegistrereKunde {

    private static int personnr;
    private static String fornavn;
    private static String etternavn;
    private static String adresse;
    private static int telefonnr;


    /**
     * Metode for å registrere ny kunde
     * @return - Ny kunde som ble registrert
     */
    public static Kunde registrerKunde(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Skriv inn personnr.:");
        personnr= scanner.nextInt();

        System.out.println("Skriv inn navn på fornavn ");
        fornavn = scanner.next();

        System.out.println("Skriv inn navn på etternavn: ");
        etternavn = scanner.next();

        System.out.println("Skriv inn adresse:");
        adresse = scanner.next();

        System.out.println("Skriv inn telefonnr.:");
        telefonnr = scanner.nextInt();

        Kunde kunde = new Kunde(personnr,fornavn,etternavn,adresse,telefonnr);

        Kunder.registrerKunde(kunde);

        System.out.println("Kunde registrert");

        return kunde;
    }

}
