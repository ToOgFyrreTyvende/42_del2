import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author andersm
 *
 * Tester Feltliste udfra den danske oversættelse
 */

public class FeltlisteTest {

    @Test
    void WelcomePlayerTest() {
        String testTekst = "Velkommen til IOOuteractive spillet!\nIndtast venligst 2 spiller navne for paabegynde et spil med 2 spillere.";
        assertEquals(testTekst, Feltliste.feltTekst.getString("WelcomePlayer"));
    }
}
