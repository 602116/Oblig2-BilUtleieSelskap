package system;

import entity.Bil;
import entity.Utleiekontor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtleiekontorerTest {

    private Utleiekontor testKontor1;
    private Bil testBil1;

    @BeforeEach
    void setUp() {
        testBil1 = new Bil("BMW", 5, 5, Kategori.D, "AD12346", 3000);
        testKontor1 = new Utleiekontor("Test1",1,new Biler(),"Adresse123",90666666);
       Utleiekontorer.registrerKontor(testKontor1);
    }

    @Test
    void getUtleiekontorList() {

        assertTrue(Utleiekontorer.getUtleiekontorList().contains(testKontor1));

    }

    @Test
    void finnUtleiekontor() {
        assertEquals(Utleiekontorer.finnUtleiekontor(testKontor1.getKontornr()),testKontor1);
    }

    @Test
    void registrerKontor() {
        Utleiekontor testKontor = new Utleiekontor("Kontor", 123, new Biler(), "Adressevegen 123", 12345678);
        Utleiekontorer.registrerKontor(testKontor);
        assertEquals(testKontor,Utleiekontorer.getUtleiekontorList().get(1));
    }

    @Test
    void leggTilBilPaaUtleiekontor() {
        

        Utleiekontorer.leggTilBilPaaUtleiekontor(1,testBil1);
        assertEquals(testBil1,Utleiekontorer.finnUtleiekontor(1).getBiler().finnBil("AD12346"));
        
        
    }

}