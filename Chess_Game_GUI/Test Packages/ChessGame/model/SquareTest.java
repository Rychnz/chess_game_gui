/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChessGame.model;

import java.awt.Color;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.not;
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
public class SquareTest {
    
    Square square;
    ChessBoard board;
    Position pos;
    public SquareTest() {
    }
    
    @Before
    public void setUp() {
        board = new ChessBoard("test");
        pos = new Position(board, 3, 3);
        square = new SquareImpl(pos);
    }
    
    @After
    public void tearDown() {
        board = null;
        pos = null;
        square = null;
    }

    /**
     * Test of getPosition method, of class Square.
     */
    @Test
    public void testGetPositionValidPos() {
        assertEquals(square.getPosition(), pos);
    }
    
    @Test
    public void testGetPositionInvalidPos() {
        Position testPos = new Position(board, 4, 5);
        assertThat(square.getPosition(), not(equalTo(testPos)));
    }

    /**
     * Test of addPiece method, of class Square.
     */
    @Test
    public void testAddPieceEmptySquare() {
        Pawn pawn = new Pawn(Color.WHITE);
        assertTrue(square.addPiece(pawn));
    }
    
    @Test
    public void testAddPieceFullSquare() {
        Pawn pawn = new Pawn(Color.WHITE);
        square.addPiece(pawn);
        assertFalse(square.addPiece(pawn));
    }

    /**
     * Test of removePiece method, of class Square.
     */
    @Test
    public void testRemovePiecePiecePresent() {
        Pawn pawn = new Pawn(Color.WHITE);
        square.addPiece(pawn);
        assertTrue(square.removePiece());
    }
    
    /**
     * Test of removePiece method, of class Square.
     */
    @Test
    public void testRemovePieceNoPiece() {
        assertFalse(square.removePiece());
    }

    /**
     * Test of isOccupied method, of class Square.
     */
    @Test
    public void testIsOccupiedSquareOccupied() {
        Pawn pawn = new Pawn(Color.WHITE);
        square.addPiece(pawn);
        assertTrue(square.isOccupied());
    }
    
    /**
     * Test of isOccupied method, of class Square.
     */
    @Test
    public void testIsOccupiedNoOccupants() {
        assertFalse(square.isOccupied());
    }

    /**
     * Test of hasPiece method, of class Square.
     */
    @Test
    public void testHasPiecePiecePresent() {
        Pawn pawn = new Pawn(Color.WHITE);
        square.addPiece(pawn);
        assertTrue(square.hasPiece(pawn));
    }
    
    @Test
    public void testHasPieceWrongPiece() {
        Pawn pawn = new Pawn(Color.WHITE);
        square.addPiece(pawn);
        Rook rook = new Rook(Color.WHITE);
        assertFalse(square.hasPiece(rook));
    }

    /**
     * Test of getPieceStringRepresentation method, of class Square.
     */
    @Test
    public void testGetPieceStringRepresentation() {
        Pawn pawn = new Pawn(Color.WHITE);
        square.addPiece(pawn);
        assertEquals("P", square.getPieceStringRepresentation());
    }

    /**
     * Test of getStringRepresentation method, of class Square.
     */
    @Test
    public void testGetStringRepresentation() {
        
    }

    public class SquareImpl extends Square {

        public SquareImpl(Position position) {
            super(position);
        }

        public String getStringRepresentation() {
            return "";
        }
    }
    
}
