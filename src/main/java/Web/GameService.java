package Web;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.HashMap;

@Path("game")
public class GameService {

    public static HashMap<Integer, Game> games = new HashMap<>();

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Game createCustomer(final JsonGame input) {
        games.put(input.id, new Game(input.player1, input.player2));

        return games.get(input.id);
    }

    @Path("round")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Game getRound(final JsonGame input) {
        Game game = games.get(input.id);
        game.playRound();

        return games.get(input.id);
    }

    @Path("json")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Hello getHelloJson(){
        return new Hello();
    }
}
