/**
 * ------------------------------------------------------------/
 * Denne klasse kaldes for at oprette en ny spiller
 * Spiller kan have et brugervalgt navn som bruges under
 * kørsel af spillet
 * ------------------------------------------------------------/
 */

 // PLACEHOLDER! Skift Spiller til at initialisere ÉN spiller
 // af gangen.
public class Spiller {
    int felt;
    String spiller;
    String navn;

    // #----------Constructor----------#
    Spiller(String navn){
        // Vælg spiller navn selv
        spiller = navn;
    }

    // #------------Get/Set------------#
    int getFelt(){
        // Returnerer nuværende felt af spiller
        return felt;
    }
    int setFelt(int nyFelt){
        // Returnerer nye felt af spiller
        felt = nyFelt;
        return felt;
    }

    // #--------------Get--------------#
    String getNavn(){
        // Returnerer spiller navn
        return navn;
    }
}
