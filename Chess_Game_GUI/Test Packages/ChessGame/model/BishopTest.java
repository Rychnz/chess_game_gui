/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChessGame.model;

import ChessGame.model.Bishop;
import java.awt.Color;
import java.util.HashSet;
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
public class BishopTest {
    
    private Bishop bishop;
    private ChessBoard board;
    private Position position;
    private Set<Square> possibleMoves;
    
    
    public BishopTest() {
    }
    
    @Before
    public void setUp() {
        board = new ChessBoard("test");
        position = new Position(board, 3, 3);
        bishop = new Bishop(Color.WHITE);
        bishop.setPosition(position);
        possibleMoves = bishop.movesPossible();
    }
    
    @After
    public void tearDown() {
        board = null;
        position = null;
        possibleMoves = null;
        bishop = null;
    }

    /**
     * Test of getStringRepresentation method, of class Bishop.
     */
    @Test
    public void testGetStringRepresentation() {
        assertEquals("B", bishop.getStringRepresentation());
    }

    /**
     * Test of movesPossible method, of class Bishop.
     * 
     * Tests a range of valid movements from bishop
     */
    @Test
    public void testMovesPossibleValidMoves() {
        Position pos1 = new Position(board, 7, 7);
        Position pos2 = new Position(board, 0, 6);
        Position pos3 = new Position(board, 6, 0);
        Position pos4 = new Position(board, 0, 0);
        assertTrue(possibleMoves.contains(board.getSquare(pos1)));
        assertTrue(possibleMoves.contains(board.getSquare(pos2)));
        assertTrue(possibleMoves.contains(board.getSquare(pos3)));
        assertTrue(possibleMoves.contains(board.getSquare(pos4)));
    }
    
    /**
     * Test of movesPossible method, of class Bishop.
     * 
     * Tests invalid moves that cannot be reached
     * As there is a piece blocking
     */
    @Test
    public void testMovesPossibleInvalidMove() {
        Bishop newB = new Bishop(Color.WHITE);
        Position pos1 = new Position(board, 5, 5);
        Position pos2 = new Position(board, 6, 6);
        Position pos3 = new Position(board, 7, 7);
        board.getSquare(pos1).addPiece(newB);
        possibleMoves = bishop.movesPossible();
        assertFalse(possibleMoves.contains(board.getSquare(pos1)));
        assertFalse(possibleMoves.contains(board.getSquare(pos2)));
        assertFalse(possibleMoves.contains(board.getSquare(pos3)));
    }
    
    
}
