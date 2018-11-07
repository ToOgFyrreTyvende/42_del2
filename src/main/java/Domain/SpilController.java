package Domain;

public class SpilController{
    private Spil spil;
    
    // #----------Constructor----------#
    SpilController(String spiller1, String spiller2){
        this.spil = new Spil(spiller1, spiller2);
    }

    // #--------------Get--------------#
    String getAktivSpiller() {
        return this.spil.getAktivSpiller().getNavn();
    }

    // #-------------Other-------------#    
    void start() {
        System.out.println("Spillet er påbegyndt!");
    }

    String kastTerning(){
        if(!this.spil.spilAktivt()){
            System.out.println();
            Spiller vinder = this.spil.getVinder();
            if(vinder != null){
                return String.format("%s har vundet med %d guld!", 
                            vinder.getNavn(), vinder.getPenge());
            }else{
                return "Fejl i spillet!";
            }
        }else{
            Spiller aktivSpiller = spil.getAktivSpiller();
            String turTekst = (spil.spilTur());
    
            String kastFeltTekst = Feltliste.getFeltTekst(aktivSpiller.getFelt());
            String pengeMsg = String.format("%s har nu %d guld!\n", aktivSpiller.getNavn(), aktivSpiller.getPenge());
    
            return turTekst + "\n" + kastFeltTekst + "\n" + pengeMsg;
        }
    }

    String getSlutTekst(){
        if(!this.spil.spilAktivt()){
            Spiller vinder = this.spil.getVinder();
            return String.format("%s har vundet med %d guld!", 
                        vinder.getNavn(), vinder.getPenge());
        }else{
            return "";
        }
    }

    boolean spilAktivt(){
        return spil.spilAktivt();
    }
    
//    public static void checkVinderOgSlut(Spil spil){
//    if (spil.getVinder() != null){
//        spil.slut();
//            String slutTekst = String.format(
//                    "%s HAR VUNDET SPILLET MED %d POINT PÅ SIN %d. TUR!!!",
//                    spil.getVinder().getNavn(), spil.getVinder().getPoint(), spil.getRunder().size()
//                    );
//            System.out.println(slutTekst);
//        }
//    }
}