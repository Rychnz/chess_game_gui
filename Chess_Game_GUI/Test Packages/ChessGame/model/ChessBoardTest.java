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
public class ChessBoardTest {
    
    public ChessBoardTest() {
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
     * Test of getNumRows method, of class ChessBoard.
     */
    @Test
    public void testGetNumRows() {
        System.out.println("getNumRows");
        ChessBoard instance = new ChessBoard();
        int expResult = 0;
        int result = instance.getNumRows();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumColumns method, of class ChessBoard.
     */
    @Test
    public void testGetNumColumns() {
        System.out.println("getNumColumns");
        ChessBoard instance = new ChessBoard();
        int expResult = 0;
        int result = instance.getNumColumns();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSquare method, of class ChessBoard.
     */
    @Test
    public void testGetSquare() {
        System.out.println("getSquare");
        Position pos = null;
        ChessBoard instance = new ChessBoard();
        Square expResult = null;
        Square result = instance.getSquare(pos);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of draw method, of class ChessBoard.
     */
    @Test
    public void testDraw() {
        System.out.println("draw");
        ChessBoard instance = new ChessBoard();
        instance.draw();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStringRepresentation method, of class ChessBoard.
     */
    @Test
    public void testGetStringRepresentation() {
        System.out.println("getStringRepresentation");
        ChessBoard instance = new ChessBoard();
        String expResult = "";
        String result = instance.getStringRepresentation();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of withinBoundaries method, of class ChessBoard.
     */
    @Test
    public void testWithinBoundaries() {
        System.out.println("withinBoundaries");
        Position pos = null;
        ChessBoard instance = new ChessBoard();
        boolean expResult = false;
        boolean result = instance.withinBoundaries(pos);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
