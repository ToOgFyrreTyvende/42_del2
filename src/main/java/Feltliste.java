import java.util.Locale;
import java.util.ResourceBundle;

public class Feltliste{
    public static String locale_l = "da";
    public static String locale_s = "DK";

    public static Locale locale = new Locale(locale_l, locale_s);

    // Dette er en resource bundle, hvilket er en måde at hente tekst
    // ud fra et udgangpsunkt i forskellige sprog. Sproget er defineret ved
    // et "locale" der eksempelvis er da-DK (danmark, dansk)
    public static ResourceBundle feltTekst =
            ResourceBundle.getBundle("Translation", locale);


    /*
    * feltListen er defineret således, at:
    * 1. element: resource bundlens udgangspunkt så oversættelser kan findes.
    * 2. element: forskellen der tilføjes på pengebeholdningen.
    * 3. element: hvor vidt der gives en ekstra tur eller ej.
    * */
    static private String[][] feltliste = {
        {"Tower", "250","0"},
        {"Crater", "-100","0"},
        {"PalaceGates","100","0"},
        {"ColdDesert","-20","0"},
        {"WalledCity","180","0"},
        {"Monastery","0","0"},
        {"Blackcave","-70","0"},
        {"HutsMountain","60","0"},
        {"Werewall","-80","1"},
        {"Pit","-50","0"},
        {"Goldmine","650","0"}
    };

    static int getFeltPenge(int felt){
        int penge = Integer.parseInt(feltliste[felt - 1][2]);
        return penge;
    }

    static String getFeltTekst(int felt){
        return feltTekst.getString(feltliste[felt - 1][0]);
    }

}