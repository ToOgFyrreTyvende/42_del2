import java.util.Locale;
import java.util.ResourceBundle;

public class Feltliste{
    
    static private String[][] feltliste = {    {"Tower","2-tower","250","0"},
                                        {"Crater","3-crater","-100","0"},
                                        {"Palace gates","4-palace gates","100","0"},
                                        {"Cold desert","5-cold dessert","-20","0"},
                                        {"Walled city","6-walled city","180","0"},
                                        {"Monastery","7-monastery","0","0"},
                                        {"Black cave","8-black cave","-70","0"},
                                        {"Huts in the mountain","9-huts in the mountain","60","0"},
                                        {"The Werewall","10-the werewall","-80","1"},
                                        {"The pit","11-the pit","-50","0"},
                                        {"Goldmine","12-goldmine","650","0"}};

    static int getFeltPenge(int felt){
        int penge = Integer.parseInt(feltliste[felt - 1][2]);
        return penge;
    }

    static String getFeltTekst(int felt){
        return feltliste[felt - 1][1]; 
    }


    static void getLocale() {
        Locale currentLocale = new Locale("da", "DK");
        ResourceBundle messages = ResourceBundle.getBundle("Translation", currentLocale);

        String msg1 = messages.getString("greetings");
        System.out.println(msg1);
        System.out.println("mems");
    }
}