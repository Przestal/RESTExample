package com.sda.soccer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlayerService {

    private static int counter = 0;

    public static List<Player> getPlayers() {
        return players;
    }

    public static void setPlayers(List<Player> players) {
        PlayerService.players = players;
    }

    public static List<Player> players = new ArrayList<Player>();
    //TODO
    static {

      /*  addAndIncrementId(new Player("Rober", "Lewandowski", "Attack", "AS Programer", "Poland", 500, 168, 53));
        addAndIncrementId(new Player("Bartek", "Filipiak", "Attack", "AS Programer", "Poland", 300, 188, 101));
        addAndIncrementId(new Player("Piotr", "Kowalski", "Defender", "FC Front-end", "Russia", 360, 118, 61));
        addAndIncrementId(new Player("Mariusz", "Ryboń", "Judge", "", "Korea", 1, 215, 158));
       */
        addAndIncrementId(Player.builder().fname("Mariusz").lname("Lewandowski").build());
    }

    public static void addAndIncrementId(Player player)
    {
        counter++;
        player.setId(counter);
        getPlayers().add(player);

    }


}
