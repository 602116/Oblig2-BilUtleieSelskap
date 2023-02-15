package entity;

public class Kunde extends Person {

    private int kortnr;

    public Kunde(int personnr, String fornavn, String etternavn, String adresse, int telefonnr) {
        super(personnr, fornavn, etternavn, adresse, telefonnr);
        this.kortnr = kortnr;
    }

    @Override
    public String toString() {
        return "Kunde{" +
                "kortnr=" + kortnr +
                '}';
    }
}
