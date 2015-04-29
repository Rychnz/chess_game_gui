/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChessGame.model;

import java.util.HashSet;

/**
 *
 * @author Laz Bratton
 */
public class Bishop extends Piece{
    
    private HashSet<Square> possibleMoves;
    public Bishop() {
        possibleMoves = new HashSet<>();
        
    }
    
    @Override
    public String getStringRepresentation() {
        return "B";
    }

    @Override
    public HashSet movesPossible() {
        possibleMoves.clear();
        Position pos = getPosition();
        ChessBoard currentBoard = pos.getBoard();
        int rowNo = pos.getRow();
        int colNo = pos.getColumn();
        for(int i = rowNo + 1; i<currentBoard.getNumRows(); i++) {
            int rowAddition = 1;
            int colAddition = 1;
            Position newPos = new Position(currentBoard, rowAddition, colAddition);
            rowAddition++;
            colAddition++;
            if(!currentBoard.getSquare(newPos).isOccupied()) {
                possibleMoves.add(currentBoard.getSquare(newPos));
            }
        }
        for(int i = rowNo + 1; i<currentBoard.getNumRows(); i++) {
            int rowAddition = 1;
            int colAddition = -1;
            Position newPos = new Position(currentBoard, rowAddition, colAddition);
            rowAddition++;
            colAddition--;
            if(!currentBoard.getSquare(newPos).isOccupied()) {
                possibleMoves.add(currentBoard.getSquare(newPos));
            }
        }
            
        for(int i = rowNo + 1; i<currentBoard.getNumRows(); i++) {
            int rowAddition = -1;
            int colAddition = -1;
            Position newPos = new Position(currentBoard, rowAddition, colAddition);
            rowAddition--;
            colAddition--;
            if(!currentBoard.getSquare(newPos).isOccupied()) {
                possibleMoves.add(currentBoard.getSquare(newPos));
            }
    }
        for(int i = rowNo + 1; i<currentBoard.getNumRows(); i++) {
            int rowAddition = -1;
            int colAddition = 1;
            Position newPos = new Position(currentBoard, rowAddition, colAddition);
            rowAddition--;
            colAddition++;
            if(!currentBoard.getSquare(newPos).isOccupied()) {
                possibleMoves.add(currentBoard.getSquare(newPos));
            }
    }
        return possibleMoves;
    }
}
