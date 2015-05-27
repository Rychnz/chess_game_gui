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
public class Bishop extends Piece{
    Color color;
    private Set<Square> possibleMoves;
    public Bishop(Color color) {
        super();
        
        color = this.color;
        possibleMoves = new HashSet<>();
        
    }
    
    @Override
    public String getStringRepresentation() {
        return "B";
    }

    @Override
    public Set movesPossible() {
        possibleMoves.clear();
        Position pos = getPosition();
        ChessBoard board = pos.getBoard();
        int rowNo = pos.getRow();
        int colNo = pos.getColumn();
        
        outerloop:
        for(int i = rowNo; i<=7; i++) {
            for(int k = colNo; k<=7; k++) {
                Position newPos = new Position(board, i, k);
            if(!board.getSquare(newPos).isOccupied())
                possibleMoves.add(board.getSquare(newPos));
            else break outerloop;
            }
        }
        outerloop:
        for(int i = rowNo; i<=7; i++) {
            for(int k = colNo; k>=0; k--) {
                Position newPos = new Position(board, i, k);
            if(!board.getSquare(newPos).isOccupied())
                possibleMoves.add(board.getSquare(newPos));
            else break outerloop;
            }
        }
        
        outerloop:
        for(int i = rowNo; i>=0; i--) {
            for(int k = colNo; k>=0; k--) {
                Position newPos = new Position(board, i, k);
            if(!board.getSquare(newPos).isOccupied())
                possibleMoves.add(board.getSquare(newPos));
            else break outerloop;
            }
        }
        
        outerloop:
        for(int i = rowNo; i>=0; i--) {
            for(int k = colNo; k<=7; k++) {
                Position newPos = new Position(board, i, k);
            if(!board.getSquare(newPos).isOccupied())
                possibleMoves.add(board.getSquare(newPos));
            else break outerloop;
            }
        }
    
        return possibleMoves;
    }
}
