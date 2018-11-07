package Web;
import Domain.Feltliste;
import Domain.Spil;
import Domain.Spiller;

public class Game {
    private String text = "";
    private Spil game;

    private int p1Cash;
    private int p1Field;

    private int p2Cash;
    private int p2Field;



    public Game(String p1, String p2) {
        this.game = new Spil(p1, p2);
    }

    public void playRound(){
        Spiller aktivSpiller = this.game.getAktivSpiller();
        game.spilTur();
        text = Feltliste.getFeltTekst(aktivSpiller.getFelt());
    }


    //Names MUST match property name for serialization to work!
    public String getText() {
        return this.text;
    }

    //Names MUST match property name for serialization to work!
    public void setText(String text) {
        this.text = text;
    }

    public int getP1Cash() {
        return this.game.getPenge(1);
    }

    public void setP1Cash(int p1Cash) {
        this.p1Cash = p1Cash;
    }

    public int getP1Field() {
        return this.game.getFelt(1);
    }

    public void setP1Field(int p1Field) {
        this.p1Field = p1Field;
    }

    public int getP2Cash() {
        return this.game.getPenge(2);
    }

    public void setP2Cash(int p2Cash) {
        this.p2Cash = p2Cash;
    }

    public int getP2Field() {
        return this.game.getFelt(2);
    }

    public void setP2Field(int p2Field) {
        this.p2Field = p2Field;
    }

    private Spil getGame() {
        return game;
    }

    private void setGame(Spil game) {
        this.game = game;
    }

}
