/**
 * ------------------------------------------------------------/
 * Denne klasse bruges til evt. at kunne se enhver runde
 * fra spil-start til spil-slut og indeholder antallet af
 * ture for den givne runde og hvad der skete i den specifikke
 * tur
 * ------------------------------------------------------------/
 */

public class Runde {
    int aktivSpiller;
    int tur;

    // #----------Constructor----------#
    Runde(){

    }

    // #-------------Other-------------#
    void tilfoejTur(){
        tur++;
    }
}
