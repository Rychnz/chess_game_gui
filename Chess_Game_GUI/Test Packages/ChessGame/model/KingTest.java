/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChessGame.model;


import ChessGame.model.ChessBoard;
import ChessGame.model.King;
import ChessGame.model.Position;
import ChessGame.model.Square;
import java.awt.Color;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Laz Bratton
 */
public class KingTest {
    
    private King king;
    private ChessBoard board;
    private Position position;
    private Set<Square> possibleMoves;
    
    
    public KingTest() {
    }
    
    @Before
    public void setUp() {
        board = new ChessBoard();
        position = new Position(board, 3, 3);
        king = new King(Color.WHITE);
        king.setPosition(position);
        possibleMoves = king.movesPossible();
    }
    
    @After
    public void tearDown() {
        board = null;
        position = null;
        possibleMoves = null;
        king = null;
    }

    /**
     * Test of getStringRepresentation method, of class King.
     */
    @Test
    public void testGetStringRepresentation() {
        assertEquals("K", king.getStringRepresentation());
    }

    /**
     * Test of movesPossible method, of class King.
     */
    @Test
    public void testMovesPossibleAllPossibleMoves() {
        Position forward = new Position(board, 4, 3);
        Position right = new Position(board, 3, 2);
        Position left = new Position(board, 3, 4);
        Position backwards = new Position(board, 2, 3);
        assertTrue(possibleMoves.contains(board.getSquare(forward)));
        assertTrue(possibleMoves.contains(board.getSquare(right)));
        assertTrue(possibleMoves.contains(board.getSquare(left)));
        assertTrue(possibleMoves.contains(board.getSquare(backwards)));
    }
    
    /**
     * Test of movesPossible, invalid moves
     */
    @Test
    public void testMovesPossibleInvalidMoves() {
        Position randomOne = new Position(board, 6, 6);
        assertFalse(possibleMoves.contains(board.getSquare(randomOne)));
    }
    
    /**
     * Test of movesPossible method, of class King.
     */
    @Test
    public void testMovesPossiblePiecesBlocking() {
        Position forward = new Position(board, 4, 3);
        Position right = new Position(board, 3, 2);
        Position left = new Position(board, 3, 4);
        Position backwards = new Position(board, 2, 3);
        Pawn pawn = new Pawn(Color.WHITE);
        board.getSquare(forward).addPiece(pawn);
        board.getSquare(right).addPiece(pawn);
        board.getSquare(left).addPiece(pawn);
        board.getSquare(backwards).addPiece(pawn);
        possibleMoves = king.movesPossible();
        assertFalse(possibleMoves.contains(board.getSquare(forward)));
        assertFalse(possibleMoves.contains(board.getSquare(right)));
        assertFalse(possibleMoves.contains(board.getSquare(left)));
        assertFalse(possibleMoves.contains(board.getSquare(backwards)));
    }
}
