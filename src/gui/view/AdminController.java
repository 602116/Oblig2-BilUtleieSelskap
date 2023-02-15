package gui.view;


import system.Reservasjoner;

import java.util.Scanner;

public class AdminController {

    private static Scanner scanner;
    private static boolean flag = true;

    /**
     * Metode for å styre valgene til adminbruker
     */
    public static void adminMeny(){

        scanner = new Scanner(System.in);

        while (flag) {
            Tekstgrensesnitt.adminValg();

        int valg = scanner.nextInt();
        switch (valg) {

            case 1:

                System.out.println(Reservasjoner.getReservasjoner().toString());
                break;

            case 2:

                RegistrerUtleieKontor.registrerKontor();
                break;

            case 3:

                LevereBilTilKontor.levereBilTilKontor();
                break;

            case 4:

                RegistrereBil.registrerBil();
                break;

            case 5:

                VelgKontor.printKontorer();

                break;

            case 6:

                Meny.start();

                break;

            case 7:

                flag = false;

                break;
        }

        }

    }


}
