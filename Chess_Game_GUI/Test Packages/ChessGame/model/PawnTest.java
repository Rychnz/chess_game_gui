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
public class PawnTest {
    
    private Pawn pawn;
    private Pawn pawnWithPosition;
    private ChessBoard board;
    private Position position, position2;
    private Set<Square> possibleMoves;
    private Set<Square> possibleMoves2;
    
    
    public PawnTest() {
    }
    
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp() {
        
        
        board = new ChessBoard();
        position = new Position(board, 1, 1);
        position2 = new Position(board, 6, 6);
        
        pawnWithPosition = new Pawn(Color.WHITE);
        pawn = new Pawn(Color.WHITE);
        pawnWithPosition.setPosition(position);
        
        
        possibleMoves2 = pawnWithPosition.movesPossible();
    }
    
    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown() {
        pawn = null;
        board = null;
        position = null;
        position2 = null;
        pawnWithPosition = null;
        possibleMoves = null;
        possibleMoves2 = null;
                
    }

    /**
     * Test of getStringRepresentation method, of class Pawn.
     */
    @Test
    public void testGetStringRepresentation() {
        assertEquals("P", pawn.getStringRepresentation());
    }

    /**
     * Test of movesPossible method, of class Pawn.
     * 
     * Tests a scenario with a valid move
     */
    @Test
    public void testMovesPossibleTrueMove() {
        Position newPosition = new Position(board, 2, 1);
        assertTrue(possibleMoves2.contains(board.getSquare(newPosition)));   
    }
    
    /**
     * Test of movesPossible method, of class Pawn.
     * 
     * Tests a scenario without an invalid move
     */
    @Test
    public void testMovesPossibleInvalidMove() {
        Position newPosition = new Position(board, 4, 5);
        assertFalse(possibleMoves2.contains(board.getSquare(newPosition)));
    }
    
    /**
     * Test of movesPossible method, of class Pawn.
     * 
     * Tests a scenario with a piece blocking movement
     */
    @Test
    public void testMovesPossiblePiecePresent() {
        Position newPosition = new Position(board, 2, 1);
        Pawn newPawn = new Pawn(Color.WHITE);
        board.getSquare(newPosition).addPiece(newPawn);
        //rerun possible moves as the board has been changed
        possibleMoves2 = pawnWithPosition.movesPossible();
        assertFalse(possibleMoves2.contains(board.getSquare(newPosition)));
    }
    
    /**
     * Test of movesPossible method, of class Pawn.
     * 
     * Tests a scenario with a piece in taking position
     */
    @Test
    public void testMovesPossiblePieceToTake() {
        Position newPosition = new Position(board, 2, 2);
        Position newPos1 = new Position(board, 2, 0);
        Pawn newPawn = new Pawn(Color.WHITE);
        
        board.getSquare(newPosition).addPiece(newPawn);
        board.getSquare(newPos1).addPiece(newPawn);
        //rerun possible moves as the board has been changed
        possibleMoves2 = pawnWithPosition.movesPossible();
        assertTrue(possibleMoves2.contains(board.getSquare(newPosition)));
        assertTrue(possibleMoves2.contains(board.getSquare(newPos1)));
    }
    
    /**
     * Tests a scenario where the piece does not have a position
     */
    @Test(expected=NullPointerException.class)
    public void testMovesPossibleNoPosition() {
        possibleMoves = pawn.movesPossible();   
    }
}
