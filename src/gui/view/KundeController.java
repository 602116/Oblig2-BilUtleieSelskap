package gui.view;

import java.util.Scanner;

public class KundeController {

    private static Scanner scanner;
    private static boolean flag = true;



    /**
     * Metode for å styre valgene til kunde
     */
    public static void kundeMeny() {


        scanner = new Scanner(System.in);

        while (flag) {
            Tekstgrensesnitt.kundeValg();
            int valg = scanner.nextInt();

            switch (valg) {

                case 1:

                    RegistrerReservasjon.registrerReservasjon();
                    break;

                case 2:
                    LevereBilTilKontor.levereBilTilKontor();
                    break;

                case 3:

                    Meny.start();
                    break;

                case 4:

                    flag = false;
                    break;

            }

        }
    }

}
