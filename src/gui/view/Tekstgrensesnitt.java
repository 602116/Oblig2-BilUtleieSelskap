package gui.view;

import java.util.Scanner;

public class Tekstgrensesnitt {

    /**
     * Printouts for valg kunde kan gjøre
     */
    public static void kundeValg() {
        System.out.println("1: Registrer reservasjon");
        System.out.println("2: Lever bil til kontor");
        System.out.println("3: Gå tilbake til meny");
        System.out.println("4: Avslutt");
    }

    /**
     * Printouts for valg admin kan gjøre
     */
    public static void adminValg() {
        System.out.println("1: Vis reservasjoner");
        System.out.println("2: Registrer kontor");
        System.out.println("3: Lever inn bil til kontor");
        System.out.println("4: Registrer bil");
        System.out.println("5: Print alle kontorer");
        System.out.println("6: Gå tilbake til meny");
        System.out.println("7: Avslutt");


    }
}
