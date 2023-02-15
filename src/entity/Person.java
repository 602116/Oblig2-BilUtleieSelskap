package entity;

abstract class Person {
    private int personnr;
    private String fornavn;
    private String etternavn;
    private String adresse;
    private int telefonnr;

    public Person(int personnr, String fornavn, String etternavn, String adresse, int telefonnr) {
        this.personnr = personnr;
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.adresse = adresse;
        this.telefonnr = telefonnr;
    }

}
