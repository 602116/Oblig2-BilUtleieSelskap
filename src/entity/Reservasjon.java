package entity;

import entity.Bil;
import entity.Kunde;
import entity.Utleiekontor;
import system.Kategori;

import java.time.LocalDate;

public class Reservasjon {
    private LocalDate start;
    private LocalDate slutt;
    private Kunde kunde;
    private Bil bil;
    private Kategori kategori;
    private Utleiekontor henteSted;
    private Utleiekontor leveringsSted;

    public Reservasjon(LocalDate start, LocalDate slutt, Kunde kunde, Bil bil, Utleiekontor henteSted, Utleiekontor leveringsSted) {
        this.start = start;
        this.slutt = slutt;
        this.kunde = kunde;
        this.bil = bil;
        this.henteSted = henteSted;
        this.leveringsSted = leveringsSted;
    }



    public LocalDate getSlutt() {
        return slutt;
    }


    public Kunde getKunde() {
        return kunde;
    }


    public Bil getBil() {
        return bil;
    }

    public void setBil(Bil bil) {
        this.bil = bil;
    }

    public Utleiekontor getLeveringsSted() {
        return leveringsSted;
    }

    public Kategori getKategori() {
        return kategori;
    }

    public void setKategori(Kategori kategori) {
        this.kategori = kategori;
    }

    @Override
    public String toString() {
        return "\nReservasjon{" +
                "\nstart = " + start +
                "\nslutt = " + slutt +
                "\nkunde = " + kunde +
                "\nbil = " + bil +
                "\nhenteSted = " + henteSted +
                "\nleveringsSted = " + leveringsSted +
                '}';
    }
}
