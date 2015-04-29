/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChessGame.model;


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
    private Set<Position> possibleMoves;
    
    
    public KingTest() {
    }
    
    @Before
    public void setUp() {
        board = new ChessBoard(7,7);
        position = new Position(board, 1, 1);
        king = new King(board);
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
    public void testMovesPossible() {
        Position forward = new Position(board, 2, 1);
        Position[] test = possibleMoves.toArray(new Position[possibleMoves.size()]);
        assertEquals(test[0].getRow(), forward.getRow());
        assertEquals(test[0].getColumn(), forward.getColumn());
        assertEquals(test[0].getBoard(), forward.getBoard());
        
        //assertEquals(test[0], forward);
    }
    
}
