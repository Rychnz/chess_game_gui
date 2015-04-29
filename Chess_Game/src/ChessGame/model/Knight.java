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
public class Knight extends Piece{
    
    private HashSet<Square> possibleMoves;
    public Knight() {
        possibleMoves = new HashSet<>();
    }
    
    @Override
    public String getStringRepresentation() {
        return "KN";
    }

    @Override
    public HashSet movesPossible() {
        possibleMoves.clear();
        Position pos = getPosition();
        ChessBoard currentBoard = pos.getBoard();
        int rowNo = pos.getRow();
        int colNo = pos.getColumn();
        Position moveOne = new Position(currentBoard, rowNo + 2, colNo + 1);
        possibleMoves.add(currentBoard.getSquare(moveOne));
        Position moveTwo = new Position(currentBoard, rowNo + 2, colNo - 1);
        possibleMoves.add(currentBoard.getSquare(moveTwo));
        Position moveThree = new Position(currentBoard, rowNo + 1, colNo + 2);
        possibleMoves.add(currentBoard.getSquare(moveThree));
        Position moveFour = new Position(currentBoard, rowNo + 1, colNo - 2);
        possibleMoves.add(currentBoard.getSquare(moveFour));
        Position moveFive = new Position(currentBoard, rowNo - 1, colNo + 2);
        possibleMoves.add(currentBoard.getSquare(moveFive));
        Position moveSix = new Position(currentBoard, rowNo - 1, colNo - 2);
        possibleMoves.add(currentBoard.getSquare(moveSix));
        Position moveSeven = new Position(currentBoard, rowNo - 2, colNo + 1);
        possibleMoves.add(currentBoard.getSquare(moveSeven));
        Position moveEight = new Position(currentBoard, rowNo - 2, colNo - 1);
        possibleMoves.add(currentBoard.getSquare(moveEight));
        
        return possibleMoves;
    }
}
