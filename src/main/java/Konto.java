/**
 * ------------------------------------------------------------/
 * Denne klasse holder styr på pengebeholdningen for
 * den spiller der kaldte denne klasse.
 * ------------------------------------------------------------/
 */

public class Konto {
    int pengebeholdning;
    Konto(){
        // Default pengebeholdning: 1000.
        pengebeholdning = 1000;
    }
    Konto(int pengebeholdning){
        // Vælg pengebeholdning selv.
        this.pengebeholdning = pengebeholdning;
    }
    int indsaetpenge(int penge){
        // Tilføj et antal penge til pengebeholdningen.
        pengebeholdning += penge;
        return (pengebeholdning);
    }
    int getPenge(){
        // Returner pengebeholdning.
        return (pengebeholdning);
    }
}


