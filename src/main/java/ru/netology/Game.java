package ru.netology;

import java.util.ArrayList;
import java.util.List;

public class Game {
    List<Player1> player1s = new ArrayList<Player1>();


    public void register (Player1 player1){
        player1s.add(player1);
    }
    public int round (String playerName1, String playerName2){
        Player1 player1 = null;
        Player1 player11 = null;

        for (Player1 player : player1s){
            if (player.getName().equals(playerName1)){
                player1 = player;
            }
            if (player.getName().equals(playerName2)){
                player11 = player;
            }

        }
        if (player1 == null){
            throw new NotRegisteredException(playerName1);

        }
        if (player11 == null){
            throw new NotRegisteredException(playerName2);

        }
        if (player1.getStrength() > player11.getStrength()){
            return 1;
        }
        if (player11.getStrength() > player1.getStrength()){
            return 2;
        }
        return 0;
    }

}
