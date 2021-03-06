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
        board = new ChessBoard("test");
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
     * 
     * Tests a scenario where all moves are valid
     */
    @Test
    public void testMovesPossibleValidMoves() {
        Position behindPosition = new Position(board, 0, 3);
        Position forwardPosition = new Position(board, 6, 3);
        Position rightPosition = new Position(board, 3, 0);
        Position leftPosition = new Position(board, 3, 7);
        assertTrue(possibleMoves.contains(board.getSquare(behindPosition)));
        assertTrue(possibleMoves.contains(board.getSquare(forwardPosition)));
        assertTrue(possibleMoves.contains(board.getSquare(rightPosition)));
        assertTrue(possibleMoves.contains(board.getSquare(leftPosition)));
    }
    
    /**
     * Test of movesPossible method, of class Rook.
     * 
     * Tests a scenario where a piece is blocking movement
     */
    @Test
    public void testMovesPossiblePieceBlocking() {
        Pawn pawn = new Pawn(Color.WHITE);
        Position blockPos = new Position(board, 5, 3);
        Position newPos = new Position(board, 6, 3);
        Position newPos1 = new Position(board, 7, 3);
        board.getSquare(blockPos).addPiece(pawn);
        pawn.setPosition(blockPos);
        possibleMoves = rook.movesPossible();
        assertFalse(possibleMoves.contains(board.getSquare(blockPos)));
        assertFalse(possibleMoves.contains(board.getSquare(newPos)));
        assertFalse(possibleMoves.contains(board.getSquare(newPos1)));
    }
    
    /**
     * Test of movesPossible method, of class Rook.
     * 
     * Tests a scenario where all moves are valid
     */
    @Test
    public void testMovesPossiblePiecesToTake() {
        Pawn pawn = new Pawn(Color.BLACK);
        
        Position behindPosition = new Position(board, 0, 3);
        Position forwardPosition = new Position(board, 6, 3);
        Position rightPosition = new Position(board, 3, 0);
        Position leftPosition = new Position(board, 3, 7);
        
        board.getSquare(behindPosition).addPiece(pawn);
        board.getSquare(forwardPosition).addPiece(pawn);
        board.getSquare(rightPosition).addPiece(pawn);
        board.getSquare(leftPosition).addPiece(pawn);

        possibleMoves = rook.movesPossible();
        
        assertTrue(possibleMoves.contains(board.getSquare(behindPosition)));
        assertTrue(possibleMoves.contains(board.getSquare(forwardPosition)));
        assertTrue(possibleMoves.contains(board.getSquare(rightPosition)));
        assertTrue(possibleMoves.contains(board.getSquare(leftPosition)));
    }
}
