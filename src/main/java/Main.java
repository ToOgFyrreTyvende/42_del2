import java.util.Arrays;
import java.util.Scanner;

/**
 * ------------------------------------------------------------/ 
 * Dette er hovedklassen som starter spillet.
 * ------------------------------------------------------------/
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SpilController spilCont;
        String spiller1;
        String spiller2;

        System.out.println(
                "Velkommen til IOOuteractive spillet!\n" +
                "Indtast venligst 2 spiller navne for påbegynde et spil med 2 spillere.");

        System.out.print("Spiller 1s navn: ");
        spiller1 = scanner.nextLine();

        System.out.print("Spiller 2s navn: ");
        spiller2 = scanner.nextLine();

        spilCont = new SpilController(spiller1, spiller2);
        inputLoop(scanner, spilCont);
    }

    public static void inputLoop(Scanner scanner, SpilController spil){
        boolean aktivt = spil.spilAktivt();
        boolean afsluttet = false;
        System.out.println("\nSpillet er påbegyndt!");

        do {
            String aktivSpillerNavn = spil.getAktivSpiller();
            
            if(aktivt){
                System.out.println(aktivSpillerNavn + "s tur, tryk enter for at kaste dine 2 terninger ↵");
            }

            if(scanner.hasNextLine()){
                if(!aktivt){
                    System.out.println(spil.getSlutTekst());
                    afsluttet = true;
                }else{
                    String spilTekst = spil.kastTerning();
                    System.out.println(spilTekst);
                }

                aktivt = spil.spilAktivt();
                scanner.nextLine();
            }else{
                scanner.nextLine();
                // Vi bruger \r, eller carriage return, for at overskrive
                // samme linje hvis funktionskaldet bliver kaldt flere gange uden brugerinput
                System.out.print("\rIndtast venligst et korrekt tal: ");
            }
        }while (aktivt || !afsluttet);
    }

}
