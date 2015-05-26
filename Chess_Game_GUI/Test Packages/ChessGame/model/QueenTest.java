/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChessGame.model;

import java.awt.Color;
import java.util.Set;
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
public class QueenTest {
    
    private Queen queen;
    private ChessBoard board;
    private Position position;
    private Set<Square> possibleMoves;
    
    
    public QueenTest() {
    }
    
    @Before
    public void setUp() {
        board = new ChessBoard("test");
        position = new Position(board, 3, 3);
        queen = new Queen(Color.WHITE);
        queen.setPosition(position);
        possibleMoves = queen.movesPossible();
    }
    
    @After
    public void tearDown() {
        board = null;
        position = null;
        possibleMoves = null;
        queen = null;
    }

    /**
     * Test of getStringRepresentation method, of class Bishop.
     */
    @Test
    public void testGetStringRepresentation() {
        assertEquals("Q", queen.getStringRepresentation());
    }

    /**
     * Test of movesPossible method, of class Bishop.
     */
    @Test
    public void testMovesPossible() {
        Position pos1 = new Position(board, 7, 7);
        Position pos2 = new Position(board, 0, 6);
        Position pos3 = new Position(board, 6, 0);
        Position pos4 = new Position(board, 0, 0);
        assertTrue(possibleMoves.contains(board.getSquare(pos1)));
        assertTrue(possibleMoves.contains(board.getSquare(pos2)));
        assertTrue(possibleMoves.contains(board.getSquare(pos3)));
        assertTrue(possibleMoves.contains(board.getSquare(pos4)));
        Position behindPosition = new Position(board, 0, 3);
        Position forwardPosition = new Position(board, 7, 3);
        Position rightPosition = new Position(board, 3, 0);
        Position leftPosition = new Position(board, 3, 7);
        assertTrue(possibleMoves.contains(board.getSquare(behindPosition)));
        assertTrue(possibleMoves.contains(board.getSquare(forwardPosition)));
        assertTrue(possibleMoves.contains(board.getSquare(rightPosition)));
        assertTrue(possibleMoves.contains(board.getSquare(leftPosition)));
    }
    
}
