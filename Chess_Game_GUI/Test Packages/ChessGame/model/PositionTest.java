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
public class PositionTest {
    
    Position pos;
    ChessBoard board;
    public PositionTest() {
    }
    
    
    @Before
    public void setUp() {
        board = new ChessBoard("test");
        pos = new Position(board, 1, 7);
    }
    
    @After
    public void tearDown() {
        board = null;
        pos = null;
    }
    
    @Test (expected=IllegalArgumentException.class)
    public void testInvalidPosition() {
        Position newPos = new Position(board, 0, 8);
    }
    /**
     * Test of getRow method, of class Position.
     */
    @Test
    public void testGetRow() {
        assertEquals(pos.getRow(), 1);
    }

    /**
     * Test of getColumn method, of class Position.
     */
    @Test
    public void testGetColumn() {
        assertEquals(pos.getColumn(), 7);
    }

    /**
     * Test of getBoard method, of class Position.
     */
    @Test
    public void testGetBoard() {
        assertEquals(pos.getBoard(), board);
    }
    
}
