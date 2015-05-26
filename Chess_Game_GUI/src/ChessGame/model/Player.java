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
    
    int score;
    int gamesWon;
    int gamesLost;
    int gamesPlayed;
    
    String playerName;
    
    /**
     * Default constructor for class Player - requires a String!
     * 
     * @param Name for the player 
     */
    public Player(String name) {
        playerName = name;
        gamesWon = 0;
        gamesLost = 0;
        gamesPlayed = 0;
        score = 0;
    }
    
    /**
     * Get playerName method
     * 
     * @Returns name of respective player
    */
    public String getPlayerName() {
        if(playerName == null)
            return "Player does not have a name yet!";
        return playerName;
    }
    
    /**
     * Sets score of player
     * 
     * @param newScore
     */
    public void setScore(int newScore) {
        score = newScore;
    }
    
    /**
     * Sets games won
     * 
     * @param newGamesWon
     */
    public void setGamesWon(int newGamesWon) {
        gamesWon = newGamesWon;
    }
    
    /**
     * Sets games lost
     * 
     * @param newGamesLost
     */
    public void setGamesLost(int newGamesLost) {
        gamesLost = newGamesLost;
    }
    
    /**
     * Set games played
     * 
     * @param newGamesPlayed
     */
    public void setGamesPlayed(int newGamesPlayed) {
        gamesPlayed = newGamesPlayed;
    }
    
    /**
     *Gets players score 
     *
     * @return score
     */
    public int getScore() {
        return score;
    }
    
    /**
     * Gets games won
     * 
     * @return gamesWon
     */
    public int getGamesWon() {
        return gamesWon;
    }
    
    /**
     * Gets games lost
     * 
     * @return gamesLost
     */
    public int getGamesLost() {
        return gamesLost;
    }
    
    /**
     * Gets games played
     * 
     * @return 
     */
    public int getGamesPlayed() {
        return gamesPlayed;
    }
}

