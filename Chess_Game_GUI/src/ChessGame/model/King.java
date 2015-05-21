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
public class King extends Piece {

    Color color;
    private HashSet<Square> possibleMoves;
    
    public King(Color color) {
        super();
        
        this.color = color;
        possibleMoves = new HashSet<>();
    }
    
    @Override
    public String getStringRepresentation() {
        return "K";
    }

    @Override
    public Set movesPossible() {
        possibleMoves.clear();
        Position pos = getPosition();
        ChessBoard currentBoard = pos.getBoard();
        int rowNo = pos.getRow();
        int colNo = pos.getColumn();
        
        Position northPosition = new Position(pos.getBoard(), (rowNo + 1), colNo);
        if(!currentBoard.getSquare(northPosition).isOccupied())
            possibleMoves.add(currentBoard.getSquare(northPosition));
        
        Position southPosition = new Position(pos.getBoard(), rowNo - 1, colNo);
        if(!currentBoard.getSquare(southPosition).isOccupied())
            possibleMoves.add(currentBoard.getSquare(southPosition));
        
        Position eastPosition = new Position(pos.getBoard(), rowNo, colNo + 1);
        if(!currentBoard.getSquare(eastPosition).isOccupied())
            possibleMoves.add(currentBoard.getSquare(eastPosition));
        
        Position westPosition = new Position(pos.getBoard(), rowNo, colNo - 1);
        if(!currentBoard.getSquare(westPosition).isOccupied())
            possibleMoves.add(currentBoard.getSquare(westPosition));
        
        
        
        
        
        return possibleMoves;
            
    }
}
