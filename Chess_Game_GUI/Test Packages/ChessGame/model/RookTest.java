/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChessGame.model;

import ChessGame.model.ChessBoard;
import ChessGame.model.Position;
import ChessGame.model.Rook;
import ChessGame.model.Square;
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
public class RookTest {
    
    private Rook rook;
    private ChessBoard board;
    private Position position;
    private Set<Square> possibleMoves;
    
    
    public RookTest() {
    }
    
    @Before
    public void setUp() {
        board = new ChessBoard();
        position = new Position(board, 3, 3);
        rook = new Rook(Color.WHITE);
        rook.setPosition(position);
        possibleMoves = rook.movesPossible();
    }
    
    @After
    public void tearDown() {
        board = null;
        position = null;
        possibleMoves = null;
        rook = null;
    }
    /**
     * Test of getStringRepresentation method, of class Rook.
     */
    @Test
    public void testGetStringRepresentation() {
        assertEquals("R", rook.getStringRepresentation());
    }

    /**
     * Test of movesPossible method, of class Rook.
     */
    @Test
    public void testMovesPossibleValidMoves() {
        Position behindPosition = new Position(board, 2, 3);
        Position forwardPosition = new Position(board, 6, 3);
        Position rightPosition = new Position(board, 3, 2);
        Position leftPosition = new Position(board, 3, 5);
        assertTrue(possibleMoves.contains(board.getSquare(behindPosition)));
        assertTrue(possibleMoves.contains(board.getSquare(forwardPosition)));
        assertTrue(possibleMoves.contains(board.getSquare(rightPosition)));
        assertTrue(possibleMoves.contains(board.getSquare(leftPosition)));
    }
    
}
