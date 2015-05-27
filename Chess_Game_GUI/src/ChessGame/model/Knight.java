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
public class Knight extends Piece{
    private Color color;
    private Set<Square> possibleMoves;
    public Knight(Color color) {
        super(color);
        
        this.color = color;
        possibleMoves = new HashSet<>();
    }
    
    @Override
    public String getStringRepresentation() {
        return "KN";
    }

    @Override
    public Set movesPossible() {
        possibleMoves.clear();
        Position pos = getPosition();
        ChessBoard currentBoard = pos.getBoard();
        int rowNo = pos.getRow();
        int colNo = pos.getColumn();
        
        
        Position moveOne = new Position(currentBoard, rowNo + 2, colNo + 1);
        if(!currentBoard.getSquare(moveOne).isOccupied() || 
                currentBoard.getSquare(moveOne).getOccupyingPieceColor() != color)
            possibleMoves.add(currentBoard.getSquare(moveOne));
        
        
        Position moveTwo = new Position(currentBoard, rowNo + 2, colNo - 1);
        if(!currentBoard.getSquare(moveTwo).isOccupied() || 
                currentBoard.getSquare(moveTwo).getOccupyingPieceColor() != color)
            possibleMoves.add(currentBoard.getSquare(moveTwo));
        
        
        Position moveThree = new Position(currentBoard, rowNo + 1, colNo + 2);
        if(!currentBoard.getSquare(moveThree).isOccupied() || 
                currentBoard.getSquare(moveThree).getOccupyingPieceColor() != color)
            possibleMoves.add(currentBoard.getSquare(moveThree));
        
        
        Position moveFour = new Position(currentBoard, rowNo + 1, colNo - 2);
        if(!currentBoard.getSquare(moveFour).isOccupied() || 
                currentBoard.getSquare(moveFour).getOccupyingPieceColor() != color)
            possibleMoves.add(currentBoard.getSquare(moveFour));
        
        
        Position moveFive = new Position(currentBoard, rowNo - 1, colNo + 2);
        if(!currentBoard.getSquare(moveFive).isOccupied() || 
                currentBoard.getSquare(moveFive).getOccupyingPieceColor() != color)
            possibleMoves.add(currentBoard.getSquare(moveFive));
        
        
        Position moveSix = new Position(currentBoard, rowNo - 1, colNo - 2);
        if(!currentBoard.getSquare(moveSix).isOccupied() || 
                currentBoard.getSquare(moveSix).getOccupyingPieceColor() != color)
            possibleMoves.add(currentBoard.getSquare(moveSix));
        
        
        Position moveSeven = new Position(currentBoard, rowNo - 2, colNo + 1);
        if(!currentBoard.getSquare(moveSeven).isOccupied() || 
                currentBoard.getSquare(moveSeven).getOccupyingPieceColor() != color)
            possibleMoves.add(currentBoard.getSquare(moveSeven));
        
        
        Position moveEight = new Position(currentBoard, rowNo - 2, colNo - 1);
        if(!currentBoard.getSquare(moveEight).isOccupied() || 
                currentBoard.getSquare(moveEight).getOccupyingPieceColor() != color)
            possibleMoves.add(currentBoard.getSquare(moveEight));
        
        return possibleMoves;
    }
}
