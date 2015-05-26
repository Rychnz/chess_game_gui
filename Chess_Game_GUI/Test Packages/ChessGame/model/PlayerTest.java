/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChessGame.model;

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
    public PlayerTest() {
    }
    
    @Before
    public void setUp() {
        player = new Player("test");
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getPlayerName method, of class Player.
     */
    @Test
    public void testGetPlayerName() {
        assertEquals("test", player.getPlayerName());
    }

    /**
     * Test of setScore method, of class Player.
     */
    @Test
    public void testSetScore() {
        player.setScore(7);
        assertEquals(7, player.getScore());
    }

    /**
     * Test of setGamesWon method, of class Player.
     */
    @Test
    public void testSetGamesWon() {
        player.setGamesWon(7);
        assertEquals(7, player.getGamesWon());
    }

    /**
     * Test of setGamesLost method, of class Player.
     */
    @Test
    public void testSetGamesLost() {
        player.setGamesLost(7);
        assertEquals(7, player.getGamesLost());
    }

    /**
     * Test of setGamesPlayed method, of class Player.
     */
    @Test
    public void testSetGamesPlayed() {
        player.setGamesPlayed(7);
        assertEquals(7, player.getGamesPlayed());
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
    
}
