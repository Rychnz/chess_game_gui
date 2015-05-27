/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChessGame.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Laz Bratton
 */
public class PlayerTest {
    
    Player player;
    Player updatedPlayer;
    Connection con;
    public PlayerTest() {
    }
    
    @Before
    public void setUp() throws SQLException {
        player = new Player("test");
        updatedPlayer = new Player("7test");
        con = DriverManager.getConnection
                        ("jdbc:derby://localhost:1527/ChessGame");
    }
    
    @After
    public void tearDown() {
        player = null;
        con = null;
    }

    /**
     * Test of getPlayerName method, of class Player.
     */
    @Test
    public void testGetPlayerName() {
        assertEquals("test", player.getPlayerName());
    }
    
    /**
     * Test of getScore method, of class Player.
     */
    @Test
    public void testGetScore() {
        assertEquals(0, player.getScore());
    }

    /**
     * Test of getGamesWon method, of class Player.
     */
    @Test
    public void testGetGamesWon() {
        assertEquals(0, player.getGamesWon());
    }

    /**
     * Test of getGamesLost method, of class Player.
     */
    @Test
    public void testGetGamesLost() {
        assertEquals(0, player.getGamesLost());
    }

    /**
     * Test of getGamesPlayed method, of class Player.
     */
    @Test
    public void testGetGamesPlayed() {
        assertEquals(0, player.getGamesPlayed());
    }

    /**
     * Test of setScore method, of class Player.
     */
    @Test
    public void testSetScore() {
        updatedPlayer.setScore(7);
        assertEquals(7, updatedPlayer.getScore());
    }

    /**
     * Test of setGamesWon method, of class Player.
     */
    @Test
    public void testSetGamesWon() {
        updatedPlayer.setGamesWon(7);
        assertEquals(7, updatedPlayer.getGamesWon());
    }

    /**
     * Test of setGamesLost method, of class Player.
     */
    @Test
    public void testSetGamesLost() {
        updatedPlayer.setGamesLost(7);
        assertEquals(7, updatedPlayer.getGamesLost());
    }

    /**
     * Test of setGamesPlayed method, of class Player.
     */
    @Test
    public void testSetGamesPlayed() {
        updatedPlayer.setGamesPlayed(7);
        assertEquals(7, updatedPlayer.getGamesPlayed());
    }

    
    
}
