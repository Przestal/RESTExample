package com.sda.soccer;


import com.sun.xml.internal.bind.v2.TODO;

import javax.ws.rs.*;
import java.util.List;

@Path("/soccer")
public class SoccerPlayer {

    PlayerService service = new PlayerService();

    @GET
    @Produces("application/json")
    public List<Player> getPlayers() {

        return service.players;
    }

    @POST
    @Consumes("application/json")
    public void createPlayers(Player player) {

        service.addAndIncrementId(player);

    }
    //FIXME
   @PUT
    @Produces("application/json")
    public void updatePlayers(int index, Player player){

        service.addAndIncrementId(player);

    }




}


