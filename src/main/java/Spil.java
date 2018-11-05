/**
 * ------------------------------------------------------------/
 * Denne klasse er hoveddelen der kører hele spillet og
 * diverse klasser efter en bruger har åbnet programmet
 * ------------------------------------------------------------/
 */

public class Spil {
    int runde;
    String[][] feltliste = {    {"Tower","2-tower","250","0"},
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
    
    // #----------Constructor----------#
    Spil(){
    }

    // #-------------Other-------------#
    int tilfoejRunde(){
        runde++;
        return(runde);
    }
}
