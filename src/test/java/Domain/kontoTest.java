package Domain;

import Domain.Konto;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class kontoTest {
    @Test
    void kontroTest(){
        Konto konto = new Konto();
        assertTrue(konto.getPenge() == 1000);

        konto.indsaetpenge(20);
        assertTrue(konto.getPenge() == 1020);

        konto.indsaetpenge(1);
        assertTrue(konto.getPenge() == 1021);

        konto.indsaetpenge(-21);
        assertTrue(konto.getPenge() == 1000);

    }

}
