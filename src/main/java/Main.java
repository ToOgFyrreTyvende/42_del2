/**
 * ------------------------------------------------------------/
 * Dette er hovedklassen som starter spillet.
 * ------------------------------------------------------------/
 */

public class Main {
    public static void main(String[] args) {
        Konto konto = new Konto();
        Terning terning = new Terning();

        konto.indsaetpenge(20);
        konto.indsaetpenge(1);
        System.out.println(konto.getPenge());

        for (int i = 0 ; i < 10 ; i++) {
            System.out.println(java.util.Arrays.toString(terning.getResultat()));

        }

    }
}
