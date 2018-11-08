import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertTrue;

class TerningTest {
    Terning terning = new Terning();

    @Test
    void getResultat() {
        Random rng = new Random();
        int[] dist = new int[11];
        int[] slag = new int[11];

        // Vi slår 50000 gange
        for (int i = 1; i <= 50000; i++) {
            int tempSlag = terning.getResultat()[2];
            slag[tempSlag - 2]++;

            // Samtidig med de to terningekast, opretter
            // bi et normalfordelt tilfældigt tal i tempGaus arrayer med samme størrelse
            double gaus = (rng.nextGaussian() * 3) + 7;
            if (gaus < 12 && gaus > 1) {
                int tempGaus = (int) gaus;
                dist[tempGaus - 1]++;
            }
        }

        // Ud fra vores normalfordeling tjekkes hvert resultat
        for (int i = 0; i < slag.length; i++) {
            int goal = dist[i];
            assertTrue(slag[i] >= goal-2000 && slag[i] <= goal+2000);
        }
    }
}
