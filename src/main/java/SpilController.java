public class SpilController{
    private Spil spil;
    
    SpilController(String spiller1, String spiller2){
        this.spil = new Spil(spiller1, spiller2);
    }

    void start() {
        System.out.println("Spillet er påbegyndt!");
    }

    void kastTerning(){
        System.out.println(spil.spilTur());
        Spiller aktivSpiller = spil.getAktivSpiller();

        String kastFeltTekst = Feltliste.getFeltTekst(aktivSpiller.getFelt()+1);

        System.out.println(kastFeltTekst + "\n");
    }

    String getAktivSpiller(){
        return this.spil.getAktivSpiller().getNavn();
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

    boolean spilAktivt(){
        return spil.spilAktivt();
    }
}