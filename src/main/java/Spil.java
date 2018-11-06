import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * ------------------------------------------------------------/ Denne klasse er
 * hoveddelen der kører hele spillet og diverse klasser efter en bruger har
 * åbnet programmet
 * ------------------------------------------------------------/
 */

public class Spil {
    private Spiller[] spillere;
    private Spiller vinder;
    private Spiller aktivSpiller;

    private Terning terning;
    
    private List<Runde> runder;
    private Runde aktivRunde;
    private boolean afsluttet;

    // #----------Constructor----------#
    Spil(String spiller1navn, String spiller2navn){
        this.spillere = new Spiller[]{
            new Spiller(spiller1navn), 
            new Spiller(spiller2navn)
        };
        //Kodedelen med runder er taget fra vores forrige opgave: 42_del1    
        runder = new ArrayList<Runde>();
        runder.add(new Runde());
        terning = new Terning();

        aktivSpiller = spillere[0];
        aktivRunde = runder.get(runder.size()-1);

        afsluttet = false;
    }

    
    public String spilTur(){
        if (!afsluttet) {
            int nuIndex = java.util.Arrays.asList(spillere).indexOf(aktivSpiller);
            int nyIndex = nuIndex == 1 ? 0 : 1;
            int[] slag = terning.getResultat();
            int[] tempTur = {slag[0], slag[1], slag[2], nuIndex};

            Spiller _aktivSpiller = aktivSpiller;

            int feltFraSlag = slag[2] - 1;
            int pengeFraFelt = getFeltPenge(feltFraSlag);

            aktivSpiller.addPenge(pengeFraFelt);
            aktivSpiller.setFelt(feltFraSlag);

            aktivRunde.tilfoejTur(tempTur);
            //checkRunde(nuIndex); vinder skal have 3000 "penge"
            this.aktivSpiller = spillere[nyIndex];


            return String.format("%s rullede i alt %d.",
                    _aktivSpiller.getNavn(), slag[2]);
        }else{
            return "Det nuværende spil er afsluttet.";
        }
    }

    private int getFeltPenge(int felt){
        return Feltliste.getFeltPenge(felt);
    }

    // #-------------Other-------------#
    //private int tilfoejRunde(){
    //    return();
    //}
 
    // Get/setters pls fix comments, jeg magter det ikke >:) - ahmad
    public Spiller getAktivSpiller(){
        return aktivSpiller;
    }

    public boolean spilAktivt(){
        return !afsluttet;
    }
}
