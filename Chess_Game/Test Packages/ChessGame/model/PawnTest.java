/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChessGame.model;

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
    private Set<Position> possibleMoves;
    private Set<Position> possibleMoves2;
    
    
    public PawnTest() {
    }
    
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp() {
        
        
        board = new ChessBoard(7,7);
        position = new Position(board, 1, 1);
        position2 = new Position(board, 6, 6);
        
        pawnWithPosition = new Pawn();
        pawn = new Pawn();
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
     */
    @Test
    public void testMovesPossible() {
        Position newPosition = new Position(board, 2, 1);
        Position[] test = possibleMoves2.toArray(new Position[possibleMoves2.size()]);
        assertEquals(test[0].getRow(), newPosition.getRow());
        assertEquals(test[0].getColumn(), newPosition.getColumn());
        assertEquals(test[0].getBoard(), newPosition.getBoard());
        //assertTrue(possibleMoves2.contains(newPosition));
        
    }
    
}
