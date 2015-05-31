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
        Pawn pawn = new Pawn(Color.BLACK);
        Position blockPos = new Position(board, 5, 5);
        Position newPos = new Position(board, 6, 6);
        Position newPos1 = new Position(board, 7, 7);
        board.getSquare(blockPos).addPiece(pawn);
        //pawn.setPosition(blockPos);
        
        possibleMoves = bishop.movesPossible();
        
        assertTrue(possibleMoves.contains(board.getSquare(blockPos)));
        assertFalse(possibleMoves.contains(board.getSquare(newPos)));
        assertFalse(possibleMoves.contains(board.getSquare(newPos1)));
    }
    
    /**
     * Test of movesPossible method, of class Bishop.
     * 
     * Tests a range of valid movements from bishop
     */
    @Test
    public void testMovesPossiblePiecesToTake() {
        Position pos1 = new Position(board, 7, 7);
        Position pos2 = new Position(board, 0, 6);
        Position pos3 = new Position(board, 6, 0);
        Position pos4 = new Position(board, 0, 0);
        
        Pawn pawn = new Pawn(Color.BLACK);
        
        board.getSquare(pos1).addPiece(pawn);
        board.getSquare(pos2).addPiece(pawn);
        board.getSquare(pos3).addPiece(pawn);
        board.getSquare(pos4).addPiece(pawn);
        
        possibleMoves = bishop.movesPossible();
        
        assertTrue(possibleMoves.contains(board.getSquare(pos1)));
        assertTrue(possibleMoves.contains(board.getSquare(pos2)));
        assertTrue(possibleMoves.contains(board.getSquare(pos3)));
        assertTrue(possibleMoves.contains(board.getSquare(pos4)));
    }
}
