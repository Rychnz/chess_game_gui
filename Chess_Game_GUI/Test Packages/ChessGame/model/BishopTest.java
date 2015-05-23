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
        board = new ChessBoard();
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
     */
    @Test
    public void testMovesPossible() {
        Position pos1 = new Position(board, 7, 7);
        Position pos2 = new Position(board, 2, 4);
        Position pos3 = new Position(board, 4, 2);
        Position pos4 = new Position(board, 1, 1);
        assertTrue(possibleMoves.contains(board.getSquare(pos1)));
        assertTrue(possibleMoves.contains(board.getSquare(pos2)));
        assertTrue(possibleMoves.contains(board.getSquare(pos3)));
        assertTrue(possibleMoves.contains(board.getSquare(pos4)));
    }
    
}
