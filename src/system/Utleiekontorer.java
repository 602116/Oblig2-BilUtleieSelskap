package system;

import entity.Bil;
import entity.Utleiekontor;

import java.util.ArrayList;
import java.util.Scanner;

public class Utleiekontorer {

    private static ArrayList<Utleiekontor> utleiekontorList = new ArrayList<>();

    public static ArrayList<Utleiekontor> getUtleiekontorList() {
        return utleiekontorList;
    }


    /**
     * Metode for å finne utleiekontor
     * @param kontornr - id til kontoret
     * @return - returnerer funnet utleiekontor
     */
    public static Utleiekontor finnUtleiekontor(int kontornr){

        Utleiekontor utleiekontor = utleiekontorList.stream().filter(a -> a.getKontornr() == kontornr).toList().get(0);
        return utleiekontor;
    }

    /**
     *Legger til et kontor i listen over utleiekontorer
     * @param kontor - Kontor som skal legges til
     */
    public static void registrerKontor(Utleiekontor kontor) {

        utleiekontorList.add(kontor);
    }

    /**
     * - legger til en bil til utleiekontor
     * @param kontornr - sender inn et gitt kontornummer
     * @param bil - sender inn et bilobjekt
     */
    public static void  leggTilBilPaaUtleiekontor(int kontornr, Bil bil) {
        finnUtleiekontor(kontornr).getBiler().leggTilBil(bil);

    }
    
}
