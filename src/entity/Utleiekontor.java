package entity;

import system.Biler;

public class Utleiekontor {
    private String kontorNavn;
    private int kontornr;
    private Biler biler;
    private String adresse;
    private int telefonnr;

    public Utleiekontor(String kontorNavn, int kontornr, Biler biler, String adresse, int telefonnr) {
        this.kontorNavn = kontorNavn;
        this.kontornr = kontornr;
        this.biler = biler;
        this.adresse = adresse;
        this.telefonnr = telefonnr;
    }

    public String getKontorNavn() {
        return kontorNavn;
    }


    public int getKontornr() {
        return kontornr;
    }


    public Biler getBiler() {
        return biler;
    }

    @Override
    public String toString() {
        return "Utleiekontor{" +
                "kontorNavn='" + kontorNavn + '\'' +
                ", kontornr=" + kontornr  +
                '}';
    }
}
