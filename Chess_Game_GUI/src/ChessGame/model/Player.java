/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChessGame.model;

/**
 *
 * @author Laz Bratton
 */
public class Player {
    
    String playerName;
    /**
     * Default constructor for class Player - requires a String!
     * 
     * @param Name for the player 
     */
    public Player(String name) {
        playerName = name;
    }
    
    /**
     * Get playerName method
     * 
     * Returns name of respective player
    */
    public String getPlayerName() {
        if(playerName == null)
            return "Player does not have a name yet!";
        return playerName;
    }
}

