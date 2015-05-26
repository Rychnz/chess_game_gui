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
    
    public PlayerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getPlayerName method, of class Player.
     */
    @Test
    public void testGetPlayerName() {
        System.out.println("getPlayerName");
        Player instance = null;
        String expResult = "";
        String result = instance.getPlayerName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setScore method, of class Player.
     */
    @Test
    public void testSetScore() {
        System.out.println("setScore");
        int newScore = 0;
        Player instance = null;
        instance.setScore(newScore);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGamesWon method, of class Player.
     */
    @Test
    public void testSetGamesWon() {
        System.out.println("setGamesWon");
        int newGamesWon = 0;
        Player instance = null;
        instance.setGamesWon(newGamesWon);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGamesLost method, of class Player.
     */
    @Test
    public void testSetGamesLost() {
        System.out.println("setGamesLost");
        int newGamesLost = 0;
        Player instance = null;
        instance.setGamesLost(newGamesLost);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGamesPlayed method, of class Player.
     */
    @Test
    public void testSetGamesPlayed() {
        System.out.println("setGamesPlayed");
        int newGamesPlayed = 0;
        Player instance = null;
        instance.setGamesPlayed(newGamesPlayed);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
