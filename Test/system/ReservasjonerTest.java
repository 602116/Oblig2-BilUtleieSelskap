package system;

import entity.Bil;
import entity.Kunde;
import entity.Reservasjon;
import entity.Utleiekontor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ReservasjonerTest {

    private Reservasjon testReservasjon;
    private Bil testBil1;
    private Utleiekontor testKontor1;

    @BeforeEach
    void setUp() {

        Kunde testKunde = new Kunde(123456789, "Fornavn", "Etternavn","Adresse", 90706667);

        Utleiekontorer.registrerKontor(new Utleiekontor("Test1",1,new Biler(),"Adresse123",90666666));
        Utleiekontorer.registrerKontor(new Utleiekontor("Test2",2,new Biler(),"Adresse321",90666666));

        testBil1 = new Bil("BMW", 5, 5, Kategori.D, "AD12346", 3000);

        testKontor1 = Utleiekontorer.finnUtleiekontor(1);
        Utleiekontor testKontor2 = Utleiekontorer.finnUtleiekontor(2);

        testReservasjon = new Reservasjon(LocalDate.MIN,LocalDate.MAX,testKunde,testBil1,testKontor1,testKontor2);
        Reservasjoner.lagReservasjon(testReservasjon);

    }

    @Test
    void getReservasjoner() {

        assertEquals(testReservasjon, Reservasjoner.getReservasjoner().get(0));

    }

    @Test
    void finnReservasjonMedBil() {

        assertEquals(testBil1,Reservasjoner.finnReservasjonMedBil(testBil1).getBil());


    }

    @Test
    void lagReservasjon() {

        Reservasjoner.lagReservasjon(testReservasjon);
        assertEquals(testReservasjon,Reservasjoner.finnReservasjonMedBil(testBil1));

    }

    @Test
    void fjernReservasjon() {
        Reservasjoner.fjernReservasjon(testBil1);
        assertNull(Reservasjoner.finnReservasjonMedBil(testBil1));
    }

    @Test
    void kanReserveres() {
        assertFalse(Reservasjoner.kanReserveres(LocalDate.MIN,LocalDate.MAX,Kategori.D,testKontor1));
    }
}