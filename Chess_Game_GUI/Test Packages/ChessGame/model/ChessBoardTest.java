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
    
    ChessBoard board;
    public ChessBoardTest() {
    }
    
    @Before
    public void setUp() {
        board = new ChessBoard();
    }
    
    @After
    public void tearDown() {
        board = null;
    }

    /**
     * Test of getNumRows method, of class ChessBoard.
     */
    @Test
    public void testGetNumRows() {
        assertEquals(9, board.getNumRows());
    }

    /**
     * Test of getNumColumns method, of class ChessBoard.
     */
    @Test
    public void testGetNumColumns() {
        assertEquals(9, board.getNumColumns());
    }

    /**
     * Test of getSquare method, of class ChessBoard.
     */
    @Test
    public void testGetSquare() {
        
    }

    /**
     * Test of draw method, of class ChessBoard.
     */
    @Test
    public void testDraw() {
        
    }

    /**
     * Test of getStringRepresentation method, of class ChessBoard.
     */
    @Test
    public void testGetStringRepresentation() {
        
    }

    /**
     * Test of withinBoundaries method, of class ChessBoard.
     */
    @Test
    public void testWithinBoundaries() {
        
    }
    
}
