package system;

public enum Kategori {
    A("Stasjonsvogn",300),B("Liten",100),C("Middels",200),D("Stor",400);

    
    private final String a;
    private final int i;

    Kategori(String a, int i) {
        this.a = a;
        this.i = i;
    }


    public int getI() {
        return i;
    }
}
