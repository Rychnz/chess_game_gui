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
public class Queen extends Piece{

    private HashSet<Square> possibleMoves;
    public Queen() {
        possibleMoves = new HashSet<>();
    }
    
    @Override
    public String getStringRepresentation() {
        
        return "Q";
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
        for(int i = rowNo + 1; i<currentBoard.getNumRows(); i++) {
            Position newPos = new Position(currentBoard, i, colNo);
            if(!currentBoard.getSquare(newPos).isOccupied()) {
                possibleMoves.add(currentBoard.getSquare(newPos));
            }
            else
                break;
        }
        for(int i = colNo + 1; i<currentBoard.getNumRows(); i++) {
            Position newPos = new Position(currentBoard, rowNo, i);
            if(!currentBoard.getSquare(newPos).isOccupied()) {
                possibleMoves.add(currentBoard.getSquare(newPos));
            }
            else
                break;
        }
        for(int i = rowNo - 1; i>currentBoard.getNumRows(); i--) {
            Position newPos = new Position(currentBoard, i, colNo);
            if(!currentBoard.getSquare(newPos).isOccupied()) {
                possibleMoves.add(currentBoard.getSquare(newPos));
            }
            else
                break;
        }
        for(int i = colNo - 1; i>currentBoard.getNumRows(); i--) {
            Position newPos = new Position(currentBoard, rowNo, i);
            if(!currentBoard.getSquare(newPos).isOccupied()) {
                possibleMoves.add(currentBoard.getSquare(newPos));
            }
            else
                break;
        }
        return possibleMoves;
    }
    
}
