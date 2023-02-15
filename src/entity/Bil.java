package entity;

import system.Kategori;

import java.util.Objects;

public class Bil {

    private String merke;
    private int seter;
    private int dorer;
    private Kategori kategori;
    private String regNr;
    private int km;

    public Bil(String merke, int seter, int dorer, Kategori kategori, String regNr, int km){
        this.merke = merke;
        this.seter = seter;
        this.dorer = dorer;
        this.kategori = kategori;
        this.regNr = regNr;
        this.km = km;
    }

    public int getDorer() {
        return dorer;
    }


    public Kategori getKatergori() {
        return kategori;
    }


    public String getRegNr() {
        return regNr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bil bil = (Bil) o;
        return seter == bil.seter && dorer == bil.dorer && km == bil.km && Objects.equals(merke, bil.merke) && kategori == bil.kategori && Objects.equals(regNr, bil.regNr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(merke, seter, dorer, kategori, regNr, km);
    }

    @Override
    public String toString() {
        return "Bil{" +
                "merke='" + merke + '\'' +
                ", seter=" + seter +
                ", dorer=" + dorer +
                ", kategori=" + kategori +
                ", regNr='" + regNr + '\'' +
                ", km=" + km +
                '}';
    }
}
