package gui.view;

import entity.Bil;
import entity.Kunde;
import entity.Reservasjon;
import entity.Utleiekontor;
import gui.view.AdminController;
import gui.view.KundeController;
import system.Biler;
import system.Kategori;
import system.Reservasjoner;
import system.Utleiekontorer;

import java.time.LocalDate;
import java.util.Scanner;

public class Meny {

    private static boolean flag = true;

    public static void main(String[] args) {

        before();

        start();


    }

    /**
     * Metode for å starte systemet
     */
    public static void start() {
        Scanner scanner = new Scanner(System.in);

        while (flag) {

            System.out.println("Admin: 1");
            System.out.println("Kunde: 2");

            switch (scanner.nextInt()) {



                case 1:
                    AdminController.adminMeny();
                    break;

                case 2:

                    KundeController.kundeMeny();
                    break;
            }
        }

        scanner.close();


    }


    private static void before(){
        Utleiekontorer.registrerKontor(new Utleiekontor("Førde",0 , new Biler(), "Førde", 110));
        Utleiekontorer.registrerKontor(new Utleiekontor("Bergen", 1, new Biler(), "Bergen",111 ));
        Utleiekontorer.registrerKontor(new Utleiekontor("Oslo", 2, new Biler(), "Oslo", 112));
        Utleiekontorer.registrerKontor(new Utleiekontor("Trondheim", 3, new Biler(), "Trondheim", 113));

        Bil testBil1 = new Bil("BMW", 5, 5, Kategori.C, "1234", 3000);
        Bil testBil2 = new Bil("Porche", 5, 5, Kategori.A, "12345", 4000);

        Utleiekontorer.leggTilBilPaaUtleiekontor(0,testBil1);
        Utleiekontorer.leggTilBilPaaUtleiekontor(0,testBil2);

        Kunde testKunde1 = new Kunde(123456789,"Jonaes", "Mordi", "Adressevegen 123", 12345678);
        Kunde testKunde2 = new Kunde(123456789,"Jes", "Mdi", "Adressevegen 123", 12345678);

        Utleiekontorer.leggTilBilPaaUtleiekontor(1,new Bil("Mercedes", 5, 5, Kategori.A, "123456", 5000));
        Utleiekontorer.leggTilBilPaaUtleiekontor(1,new Bil("Toyota", 5, 5, Kategori.C, "1234567", 6000));

        Utleiekontorer.leggTilBilPaaUtleiekontor(2,new Bil("Audi", 5, 5, Kategori.C, "12345678", 8000));
        Utleiekontorer.leggTilBilPaaUtleiekontor(2,new Bil("Ferrari", 2, 3, Kategori.B, "5555", 10000));

        Utleiekontorer.leggTilBilPaaUtleiekontor(3,new Bil("Mclaren", 2, 3, Kategori.B, "888888", 11000));
        Utleiekontorer.leggTilBilPaaUtleiekontor(3,new Bil("Maseratti", 4, 3, Kategori.C, "8888", 21000));


        Reservasjoner.lagReservasjon(new Reservasjon(LocalDate.now().minusDays(10),LocalDate.now().plusDays(5),testKunde1,testBil1,Utleiekontorer.finnUtleiekontor(0),Utleiekontorer.finnUtleiekontor(0)));
        Reservasjoner.lagReservasjon(new Reservasjon(LocalDate.now().plusDays(5),LocalDate.now().plusDays(10),testKunde2,testBil2,Utleiekontorer.finnUtleiekontor(0),Utleiekontorer.finnUtleiekontor(0)));

    }
}
