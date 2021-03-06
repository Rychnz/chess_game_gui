/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChessGame.model;

import java.awt.Color;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Laz Bratton
 */
public class Rook extends Piece {
    
    private Set<Square> possibleMoves;
    private Color color;
    
    public Rook(Color color) {
        super(color);
        
        this.color = color;
        possibleMoves = new HashSet<>();
    
    }
    
    @Override
    public String getStringRepresentation() {
        return "R";
    }

    @Override
    public Set movesPossible() {
        possibleMoves.clear();
        Position pos = getPosition();
        ChessBoard board = pos.getBoard();
        int rowNo = pos.getRow();
        int colNo = pos.getColumn();
        
        outerloop:
        for(int i = rowNo + 1; i<=7; i++) {
            Position newPos = new Position(board, i, colNo);
            if(!board.getSquare(newPos).isOccupied())
                possibleMoves.add(board.getSquare(newPos));
            else {
                if(board.getSquare(newPos).getOccupyingPieceColor() != color)
                    possibleMoves.add(board.getSquare(newPos));
                break outerloop;
            }
        }
        
        outerloop:
        for(int i = colNo + 1; i<=7; i++) {
            Position newPos = new Position(board, rowNo, i);
            if(!board.getSquare(newPos).isOccupied())
                possibleMoves.add(board.getSquare(newPos));
            else {
                if(board.getSquare(newPos).getOccupyingPieceColor() != color)
                    possibleMoves.add(board.getSquare(newPos));
                break outerloop;
            }
        }
        
        outerloop:
        for(int i = rowNo - 1; i>=0; i--) {
            Position newPos = new Position(board, i, colNo);
            if(!board.getSquare(newPos).isOccupied())
                possibleMoves.add(board.getSquare(newPos));
            else {
                if(board.getSquare(newPos).getOccupyingPieceColor() != color)
                    possibleMoves.add(board.getSquare(newPos));
                break outerloop;
            }
        }
        
        outerloop:
        for(int i = colNo - 1; i>=0; i--) {
            Position newPos = new Position(board, rowNo, i);
            if(!board.getSquare(newPos).isOccupied())
                possibleMoves.add(board.getSquare(newPos));
            else {
                if(board.getSquare(newPos).getOccupyingPieceColor() != color)
                    possibleMoves.add(board.getSquare(newPos));
                break outerloop;
            }
        }
        
        
        return possibleMoves;
    }
    
}
