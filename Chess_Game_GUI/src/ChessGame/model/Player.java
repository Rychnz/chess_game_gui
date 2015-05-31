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
        try {
            Connection con = DriverManager.getConnection
                        ("jdbc:derby://localhost:1527/ChessGame");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT COUNT(*) AS total FROM PLAYER"
                    + "HAVING NAME = '" + name + "'");
            int count = rs.getInt("total");
            if(count > 0) {
                try {

                    ResultSet rs1 = stmt.executeQuery("SELECT * FROM PLAYER WHERE "
                            + "NAME = '" + name + "'");
            
                while(rs.next()) {
                    score = rs1.getInt("SCORE");
                    gamesWon = rs1.getInt("GAMESWON");
                    gamesLost = rs1.getInt("GAMESLOST");
                    gamesPlayed = rs1.getInt("GAMESPLAYED");
                }
            
                }
                catch(SQLException e) {
                    System.out.println("SQL exception occured" + e);
                    }   
            }
            else {
                playerName = name;
                gamesWon = 0;
                gamesLost = 0;
                gamesPlayed = 0;
                score = 0;
                try {

                    String insert = "INSERT INTO PLAYER VALUES ('" + playerName + "', " + score + ", " +
                        gamesPlayed + ", " + gamesWon + ", " + gamesLost + ")";
                    stmt.execute(insert);
            
                }
                catch(SQLException e) {
                    System.out.println("SQL exception occured" + e);
                }       
            }
            
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
    }
    
    /**
     *Gets players score 
     *
     * @return score
     */
    public int getScore() {
        try {
            Connection con = DriverManager.getConnection
                        ("jdbc:derby://localhost:1527/ChessGame");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT SCORE FROM PLAYER WHERE "
                    + "NAME = '" + playerName + "'");
            while(rs.next()) {
                score = rs.getInt("SCORE");
            }
            
        }
        catch(SQLException e) {
            System.out.println("SQL exception occured" + e);
        }
        return this.score;
    }
    
    /**
     * Gets games won
     * 
     * @return gamesWon
     */
    public int getGamesWon() {
        try {
            Connection con = DriverManager.getConnection
                        ("jdbc:derby://localhost:1527/ChessGame");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT GAMESWON FROM PLAYER WHERE "
                    + "NAME = '" + playerName + "'");
            while(rs.next()) {
                gamesWon = rs.getInt("GAMESWON");
            }
            
        }
        catch(SQLException e) {
            System.out.println("SQL exception occured" + e);
        }
        return this.gamesWon;
    }
    
    /**
     * Gets games lost
     * 
     * @return gamesLost
     */
    public int getGamesLost() {
        try {
            Connection con = DriverManager.getConnection
                        ("jdbc:derby://localhost:1527/ChessGame");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT GAMESLOST FROM PLAYER WHERE "
                    + "NAME = '" + playerName + "'");
            while(rs.next()) {
                gamesLost = rs.getInt("GAMESLOST");
            }
            
        }
        catch(SQLException e) {
            System.out.println("SQL exception occured" + e);
        }
        return this.gamesLost;
    }
    
    /**
     * Gets games played
     * 
     * @return 
     */
    public int getGamesPlayed() {
        try {
            Connection con = DriverManager.getConnection
                        ("jdbc:derby://localhost:1527/ChessGame");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT GAMESPLAYED FROM PLAYER WHERE "
                    + "NAME = '" + playerName + "'");
            while(rs.next()) {
                gamesPlayed = rs.getInt("GAMESPLAYED");
            }
            
        }
        catch(SQLException e) {
            System.out.println("SQL exception occured" + e);
        }
        return this.gamesPlayed;
    }
}

