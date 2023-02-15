package system;

import entity.Bil;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BilerTest {
    private Biler biler;

    @BeforeEach
    void setUp() {
        biler = new Biler();
        biler.leggTilBil(new Bil("BMW", 5, 5, Kategori.C, "AD12346", 3000));
        biler.leggTilBil(new Bil("Porche", 5, 4, Kategori.A, "CV12345", 4000));
        
    }

    @Test
    void finnBilKategori() {

        assertEquals(Kategori.C, biler.finnBilKategori(Kategori.C).getKatergori());
        assertEquals(Kategori.A, biler.finnBilKategori(Kategori.A).getKatergori());

    }

    @Test
    void leggTilBil() {

       Bil bil1 = new Bil("BMW", 5, 5, Kategori.D, "AD12346", 3000);
       Bil bil2 = new Bil("Porsche", 5, 4, Kategori.A, "CV12345", 4000);

       biler.leggTilBil(bil1);
       biler.leggTilBil(bil2);

       assertEquals(bil1, biler.finnBil("AD12346"));
       assertEquals(bil2, biler.finnBil("CV12345"));

    }

    @Test
    void finnBil() {

        assertEquals(5,biler.finnBil("AD12346").getDorer());
        assertEquals(4,biler.finnBil("CV12345").getDorer());



    }

    @Test
    void utleverBil() {

        biler.utleverBil(biler.finnBil("CV12345"));
        assertNull(biler.finnBil("CV12345"));

    }

    @Test
    void containsKategori() {

        assertFalse(biler.containsKategori(Kategori.B));
        assertTrue(biler.containsKategori(Kategori.C));

    }
}