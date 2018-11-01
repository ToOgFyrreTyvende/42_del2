/**
 * ------------------------------------------------------------/
 * Denne klasse bruges til at kaste 'x' antal terninger
 * med 'x' antal sider på hver
 * 
 * Klassen kaldes uden nogle parametre, eller med to parametre
 * fx. Terning() eller Terning(antalSider, antal)
 * hvor 'antalSider' er antallet af sider på terningen
 * og 'antal' er antallet af terninger der kastes.
 * ------------------------------------------------------------/
 */

public class Terning {
    int resultat;
    int antalSider, antal;

    Terning() {
        this.antalSider = 6;
        this.antal = 2;
    }
    Terning(int antalSider, int antal) {
        this.antalSider = antalSider;
        this.antal = antal;
    }
    // Returner en værdi af terningen.
    int[] getResultat(){
        int[] kast = new int[antal+1];
        int sum = 0;
        for (int i = 0 ; i < antal ; i++){
            float _random1 = (float) Math.random();     // 0-1 float
            float _random2 = _random1 * antalSider-1;   // 0-5 float
            int _random3 = Math.round(_random2);        // 0-5 integer
            int random = _random3 + 1;                  // 1-6 integer
            kast[i] = random;
            sum += random;
        }
        kast[kast.length-1] = sum;
        return kast;
    }

}
