/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChessGame.model;

import java.awt.Color;
import java.util.Set;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Laz Bratton
 */
public class KnightTest {
    private Knight knight;
    private ChessBoard board;
    private Position position;
    private Set<Square> possibleMoves;
    
    
    public KnightTest() {
    }
    
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp() {
        board = new ChessBoard("test");
        position = new Position(board, 3, 3);
        knight = new Knight(Color.WHITE);
        knight.setPosition(position);
        possibleMoves = knight.movesPossible();
    }
    
    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown() {
        board = null;
        position = null;
        possibleMoves = null;
        knight = null;
    }

    /**
     * Test of getStringRepresentation method, of class Knight.
     */
    @Test
    public void testGetStringRepresentation() {
        assertEquals(knight.getStringRepresentation(), "KN");
    }

    /**
     * Test of movesPossible method, of class Knight.
     * 
     * All moves valid
     */
    @Test
    public void testMovesPossibleValidMoves() {
        Position moveOne = new Position(board, 5, 4);
        Position moveTwo = new Position(board, 5, 2);
        Position moveThree = new Position(board, 4, 5);
        Position moveFour = new Position(board, 4, 1);
        Position moveFive = new Position(board, 2, 5);
        Position moveSix = new Position(board, 2, 1);
        Position moveSeven = new Position(board, 1, 4);
        Position moveEight = new Position(board, 1, 2);
        assertTrue(possibleMoves.contains(board.getSquare(moveOne)));
        assertTrue(possibleMoves.contains(board.getSquare(moveTwo)));
        assertTrue(possibleMoves.contains(board.getSquare(moveThree)));
        assertTrue(possibleMoves.contains(board.getSquare(moveFour)));
        assertTrue(possibleMoves.contains(board.getSquare(moveFive)));
        assertTrue(possibleMoves.contains(board.getSquare(moveSix)));
        assertTrue(possibleMoves.contains(board.getSquare(moveSeven)));
        assertTrue(possibleMoves.contains(board.getSquare(moveEight)));        
    }
    
    /**
     * Test of movesPossible method, of class Knight.
     * 
     * All moves valid
     */
    @Test
    public void testMovesPossiblePiecesInPlace() {
        Position moveOne = new Position(board, 5, 4);
        Position moveTwo = new Position(board, 5, 2);
        Position moveThree = new Position(board, 4, 5);
        Position moveFour = new Position(board, 4, 1);
        Position moveFive = new Position(board, 2, 5);
        Position moveSix = new Position(board, 2, 1);
        Position moveSeven = new Position(board, 1, 4);
        Position moveEight = new Position(board, 1, 2);
        
        Pawn pawn = new Pawn(Color.WHITE);
        
        board.getSquare(moveOne).addPiece(pawn);
        board.getSquare(moveTwo).addPiece(pawn);
        board.getSquare(moveThree).addPiece(pawn);
        board.getSquare(moveFour).addPiece(pawn);
        board.getSquare(moveFive).addPiece(pawn);
        board.getSquare(moveSix).addPiece(pawn);
        board.getSquare(moveSeven).addPiece(pawn);
        board.getSquare(moveEight).addPiece(pawn);
        
        //Board has changed since initiation, rerun movesPossible
        possibleMoves = knight.movesPossible();
        
        assertFalse(possibleMoves.contains(board.getSquare(moveOne)));
        assertFalse(possibleMoves.contains(board.getSquare(moveTwo)));
        assertFalse(possibleMoves.contains(board.getSquare(moveThree)));
        assertFalse(possibleMoves.contains(board.getSquare(moveFour)));
        assertFalse(possibleMoves.contains(board.getSquare(moveFive)));
        assertFalse(possibleMoves.contains(board.getSquare(moveSix)));
        assertFalse(possibleMoves.contains(board.getSquare(moveSeven)));
        assertFalse(possibleMoves.contains(board.getSquare(moveEight))); 
      
    }
    
    /**
     * Test of movesPossible method, of class Knight.
     * 
     * All moves valid
     */
    @Test
    public void testMovesPossiblePiecesToTake() {
        Position moveOne = new Position(board, 5, 4);
        Position moveTwo = new Position(board, 5, 2);
        Position moveThree = new Position(board, 4, 5);
        Position moveFour = new Position(board, 4, 1);
        Position moveFive = new Position(board, 2, 5);
        Position moveSix = new Position(board, 2, 1);
        Position moveSeven = new Position(board, 1, 4);
        Position moveEight = new Position(board, 1, 2);
        
        Pawn pawn = new Pawn(Color.BLACK);
        
        board.getSquare(moveOne).addPiece(pawn);
        board.getSquare(moveTwo).addPiece(pawn);
        board.getSquare(moveThree).addPiece(pawn);
        board.getSquare(moveFour).addPiece(pawn);
        board.getSquare(moveFive).addPiece(pawn);
        board.getSquare(moveSix).addPiece(pawn);
        board.getSquare(moveSeven).addPiece(pawn);
        board.getSquare(moveEight).addPiece(pawn);
        
        possibleMoves = knight.movesPossible();
        
        assertTrue(possibleMoves.contains(board.getSquare(moveOne)));
        assertTrue(possibleMoves.contains(board.getSquare(moveTwo)));
        assertTrue(possibleMoves.contains(board.getSquare(moveThree)));
        assertTrue(possibleMoves.contains(board.getSquare(moveFour)));
        assertTrue(possibleMoves.contains(board.getSquare(moveFive)));
        assertTrue(possibleMoves.contains(board.getSquare(moveSix)));
        assertTrue(possibleMoves.contains(board.getSquare(moveSeven)));
        assertTrue(possibleMoves.contains(board.getSquare(moveEight)));        
    }
    
}
