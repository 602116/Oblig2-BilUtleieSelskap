package gui.view;

import entity.Bil;
import entity.Kunde;
import entity.Utleiekontor;
import system.Kategori;
import system.Kunder;
import system.Utleiekontorer;

import java.util.Scanner;

public class RegistrereBil {

    private static String merke;
    private static int seter;
    private static int dorer;
    private static Kategori kategori;
    private static String regNr;
    private static int km;

    /**
     * Metode for å legge til ny bil på et kontor
     */
    public static void registrerBil(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Skriv inn merke:");
        merke = scanner.next();

        System.out.println("Skriv inn antall seter: ");
        seter = scanner.nextInt();

        System.out.println("Skriv inn antall dører: ");
        dorer = scanner.nextInt();

        kategori = RegistrerKategori.velgKategori();

        System.out.println("Skriv inn regNr:");
        regNr = scanner.next();

        System.out.println("Skriv inn km:");
        km = scanner.nextInt();

        Utleiekontorer.leggTilBilPaaUtleiekontor(VelgKontor.velgKontorId().getKontornr(),new Bil(merke, seter, dorer, kategori, regNr, km));

        System.out.println("Bil registrert på kontor");

    }

}
