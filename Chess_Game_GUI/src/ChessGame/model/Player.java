/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChessGame.model;
import java.sql.*;
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
        try {
            Connection con = DriverManager.getConnection
                        ("jdbc:derby://localhost:1527/ChessGame");
            Statement stmt = con.createStatement();
            String insert = "INSERT INTO PLAYER VALUES ('" + playerName + "', " + score + ", " +
                gamesPlayed + ", " + gamesWon + ", " + gamesLost + ")";
            stmt.execute(insert);
            
        }
        catch(SQLException e) {
            System.out.println("SQL exception occured" + e);
        }
        
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
        try {
            Connection con = DriverManager.getConnection
                        ("jdbc:derby://localhost:1527/ChessGame");
            Statement stmt = con.createStatement();
            String updateScore = "UPDATE PLAYER SET SCORE=" + newScore + 
                    " WHERE NAME = '" + playerName + "'";
            stmt.execute(updateScore);
            
        }
        catch(SQLException e) {
            System.out.println("SQL exception occured" + e);
        }
        score = newScore;
    }
    
    /**
     * Sets games won
     * 
     * @param newGamesWon
     */
    public void setGamesWon(int newGamesWon) {
        try {
            Connection con = DriverManager.getConnection
                        ("jdbc:derby://localhost:1527/ChessGame");
            Statement stmt = con.createStatement();
            String updateScore = "UPDATE PLAYER SET GAMESWON=" + newGamesWon + 
                    " WHERE NAME = '" + playerName + "'";
            stmt.execute(updateScore);
            
        }
        catch(SQLException e) {
            System.out.println("SQL exception occured" + e);
        }
        gamesWon = newGamesWon;
    }
    
    /**
     * Sets games lost
     * 
     * @param newGamesLost
     */
    public void setGamesLost(int newGamesLost) {
        try {
            Connection con = DriverManager.getConnection
                        ("jdbc:derby://localhost:1527/ChessGame");
            Statement stmt = con.createStatement();
            String updateScore = "UPDATE PLAYER SET GAMESLOST=" + newGamesLost + 
                    " WHERE NAME = '" + playerName + "'";
            stmt.execute(updateScore);
            
        }
        catch(SQLException e) {
            System.out.println("SQL exception occured" + e);
        }
        gamesLost = newGamesLost;
    }
    
    /**
     * Set games played
     * 
     * @param newGamesPlayed
     */
    public void setGamesPlayed(int newGamesPlayed) {
        try {
            Connection con = DriverManager.getConnection
                        ("jdbc:derby://localhost:1527/ChessGame");
            Statement stmt = con.createStatement();
            String updateScore = "UPDATE PLAYER SET GAMESPLAYED=" + newGamesPlayed + 
                    " WHERE NAME = '" + playerName + "'";
            stmt.execute(updateScore);
            
        }
        catch(SQLException e) {
            System.out.println("SQL exception occured" + e);
        }
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

