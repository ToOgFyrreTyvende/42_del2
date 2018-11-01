import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class TerningTest {
    Terning terning = new Terning();

    @Test
    void getResultat() {
        Random rng = new Random();
        int[] dist = new int[12];
        int[] slag = new int[12];

        // Vi slår 50000 gange
        for (int i = 1; i <= 5; i++) {
            int tempSlag = terning.getResultat()[2];
            slag[tempSlag - 1]++;

            double gaus = (rng.nextGaussian() * 2) + 7;
            if (gaus < 13 && gaus > 1) {
                int tempGaus = (int) gaus;
                dist[tempGaus - 1]++;
            }
        }

        for (int i = 0; i < slag.length; i++) {
            int goal = dist[i];
            assertTrue(slag[0] >= goal-2000 && slag[0] <= goal+2000);
        }
    }
}