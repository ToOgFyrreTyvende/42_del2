import java.util.Arrays;
import java.util.Scanner;

/**
 * ------------------------------------------------------------/ Dette er
 * hovedklassen som starter spillet.
 * ------------------------------------------------------------/
 */

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        SpilController spilCont;
        
        String spiller1;
        spiller1 = scanner.next();

        String spiller2;
        spiller2 = scanner.next();

        spilCont = new SpilController(spiller1, spiller2);
    }
}
