/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChessGame.model;

import java.awt.Color;
import static java.awt.Color.WHITE;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Laz Bratton
 */
public class Pawn extends Piece {
    Color color;
    Set<Square> moves;

    
    public Pawn(Color color) {
        super(color);
        
        this.color = color;
        moves = new HashSet<>();
    }
     
    @Override
    public String getStringRepresentation() {
        return "P";
    }

    @Override
    public Set movesPossible() {
        moves.clear();
        Position pos = this.getPosition();
        int rowNo = pos.getRow();
        int colNo = pos.getColumn();
        Position forward;
        Position diagonalLeft;
        Position diagonalRight;
        
        if(color == Color.WHITE) {
            forward = new Position(pos.getBoard(), rowNo + 1, colNo);
            diagonalLeft = new Position(pos.getBoard(), rowNo + 1, colNo + 1);
            diagonalRight = new Position(pos.getBoard(), rowNo + 1, colNo - 1);
        }
        else {
            forward = new Position(pos.getBoard(), rowNo - 1, colNo);
            diagonalLeft = new Position(pos.getBoard(), rowNo - 1, colNo + 1);
            diagonalRight = new Position(pos.getBoard(), rowNo - 1, colNo - 1);
        }
        Square forwardSquare = forward.getBoard().getSquare(forward);
        Square diagonalLeftSquare = diagonalLeft.getBoard().getSquare(diagonalLeft);
        Square diagonalRightSquare = diagonalRight.getBoard().getSquare(diagonalRight);
        
        if(!forwardSquare.isOccupied())
            moves.add(forwardSquare);
        if(diagonalLeftSquare.isOccupied() && diagonalLeftSquare.getOccupyingPieceColor() != color)
            moves.add(diagonalLeftSquare);
        if(diagonalRightSquare.isOccupied() && diagonalLeftSquare.getOccupyingPieceColor() != color)
            moves.add(diagonalRightSquare);
        
        return moves;
    }
}
