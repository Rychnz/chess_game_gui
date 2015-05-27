/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChessGame.model;

import java.awt.Color;
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
public class ChessTest {
    
    ChessBoard board;
    Chess chess;
    Player player;
    String name;
    public ChessTest() {
    }
    
    
    @Before
    public void setUp() {
        board = new ChessBoard("test");
        name = "King";
        player = new Player(name);
        chess =  new Chess(player, board);
    }
    
    @After
    public void tearDown() {
        board = null;
        name = null;
        player = null;
        chess = null;        
    }

    /**
     * Test of getChessBoard method, of class Chess.
     */
    @Test
    public void testGetChessBoard() {
        assertEquals(chess.getChessBoard(), board);
    }

    /**
     * Test of getSquare method, of class Chess.
     */
    @Test
    public void testGetSquare() {
        
    }

    /**
     * Test of movePiece method, of class Chess.
     */
    @Test
    public void testMovePieceValidMove() {
        Position pos = new Position(board, 3, 3);
        Pawn pawn = new Pawn(Color.WHITE);
        board.getSquare(pos).addPiece(pawn);
        pawn.setPosition(pos);
        Position pos1 = new Position(board, 4, 3);
        assertTrue(chess.movePiece(board.getSquare(pos), board.getSquare(pos1), pawn));
    }
    
    /**
     * Test of movePiece method, of class Chess.
     */
    @Test
    public void testMovePieceInvalidMove() {
        Position pos = new Position(board, 3, 3);
        Pawn pawnOne = new Pawn(Color.WHITE);
        board.getSquare(pos).addPiece(pawnOne);
        pawnOne.setPosition(pos);
        Position pos1 = new Position(board, 5, 3);
        assertFalse(chess.movePiece(board.getSquare(pos), board.getSquare(pos1), pawnOne));
    }
    
}
