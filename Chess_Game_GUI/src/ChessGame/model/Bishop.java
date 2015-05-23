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
        int rowNo, newRow; 
        rowNo = newRow = pos.getRow();
        int colNo, newCol;
        colNo = newCol = pos.getColumn();
        while((newRow>=0 && newRow<=7)&&(newCol>=0 && newCol<=7)) {
            newRow = rowNo+1;
            newCol = colNo+1;
            Position newPos = new Position(currentBoard, newRow, newCol);
            newRow++;
            newCol++;
            if(!currentBoard.getSquare(newPos).isOccupied()) {
                possibleMoves.add(currentBoard.getSquare(newPos));
            }
        }
        while((newRow>=0 && newRow<=7)&&(newCol>=0 && newCol<=7)) {
            newRow = rowNo + 1;
            newCol = colNo - 1;
            Position newPos = new Position(currentBoard, newRow, newCol);
            newRow++;
            newCol--;
            if(!currentBoard.getSquare(newPos).isOccupied()) {
                possibleMoves.add(currentBoard.getSquare(newPos));
            }
        }
            
        while((newRow>=0 && newRow<=7)&&(newCol>=0 && newCol<=7)) {
            newRow = (rowNo - 1);
            newCol = (colNo - 1);
            Position newPos = new Position(currentBoard, newRow, newCol);
            newRow--;
            newCol--;
            if(!currentBoard.getSquare(newPos).isOccupied()) {
                possibleMoves.add(currentBoard.getSquare(newPos));
            }
    }
        while((newRow>=0 && newRow<=7)&&(newCol>=0 && newCol<=7)) {
            newRow = rowNo - 1;
            newCol = colNo + 1;
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
