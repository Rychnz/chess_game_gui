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
        ChessBoard currentBoard = pos.getBoard();
        int rowNo = pos.getRow();
        int colNo = pos.getColumn();
        for(int i = rowNo; i<=7; i++) {
            int newRow = rowNo+1;
            int newCol = colNo+1;
            Position newPos = new Position(currentBoard, newRow, newCol);
            newRow++;
            newCol++;
            if(!currentBoard.getSquare(newPos).isOccupied()) {
                possibleMoves.add(currentBoard.getSquare(newPos));
            }
        }
        for(int i = rowNo; i<=7; i++) {
            int newRow = rowNo + 1;
            int newCol = colNo - 1;
            Position newPos = new Position(currentBoard, newRow, newCol);
            newRow++;
            newCol--;
            if(!currentBoard.getSquare(newPos).isOccupied()) {
                possibleMoves.add(currentBoard.getSquare(newPos));
            }
        }
            
        for(int i = rowNo; i<=7; i++) {
            int newRow = rowNo - 1;
            int newCol = colNo - 1;
            Position newPos = new Position(currentBoard, newRow, newCol);
            newRow--;
            newCol--;
            if(!currentBoard.getSquare(newPos).isOccupied()) {
                possibleMoves.add(currentBoard.getSquare(newPos));
            }
    }
        for(int i = rowNo; i<=7; i++) {
            int newRow = rowNo - 1;
            int newCol = colNo + 1;
            Position newPos = new Position(currentBoard, newRow, newCol);
            newRow--;
            newCol++;
            if(!currentBoard.getSquare(newPos).isOccupied()) {
                possibleMoves.add(currentBoard.getSquare(newPos));
            }
    }
        return possibleMoves;
    }
}
