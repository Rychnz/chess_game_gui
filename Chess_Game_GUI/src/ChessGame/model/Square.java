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
 * @author Richard Johnston ID 0795795
 * @version 1.0 - 2015.04: Created
 */
public class Square {
    
    public static final int MAX_PIECES = 1;
    
    private Position position;
    private Set<Piece> pieces;
    
    /**
     * Creates a new square on the chessboard
     * 
     * @param position  position on the board
     * @author Laz
     */
    public Square(Position position) {
        
        if(position == null) {
            throw new IllegalArgumentException("Position cannot be null!");
        }
        
        this.position = position;
        this.pieces = new HashSet<>();
    }

    /**
     * Gets the position of the square.
     * 
     * @return the position of the square
     */
    public Position getPosition()
    {
        return position;
    }
    
    /**
     * Adds a piece to a square.
     * 
     * @param newPiece the new piece
     * @return true if piece was added, false if not
     */
    public boolean addPiece(Piece newPiece)
    {
        boolean success = false;
        if ( (newPiece != null) && !isOccupied() ) 
        {
            pieces.add(newPiece);
            success  = true;
        }
        return success;
    }
    
    /**
     * Removes a piece.
     * 
     * @return the old piece
     */
    public boolean removePiece()
    {
        boolean success = false;
        if(!pieces.isEmpty()) {
            pieces.clear();
            success = true;
        }
        return success;
    }
    
    /**
     * Gets the current piece in square.
     * 
     * @return the current piece
     */
    public Color getOccupyingPieceColor() {
        Piece[] pieceArray = pieces.toArray(new Piece[pieces.size()]);
        Piece thisPiece = pieceArray[0];
        return thisPiece.getPieceColor();
    }
    
    public Piece getOccupyingPiece() {
        Piece[] pieceArray = pieces.toArray(new Piece[pieces.size()]);
        Piece thisPiece = pieceArray[0];
        return thisPiece;
    }

    /**
     * Returns whether or not there is currently a piece on a square
     * 
     * @return true if square is occupied
     */ 
    public boolean isOccupied() {
        return !pieces.isEmpty();
    }
  
    /**
     * Checks if this square contains a specific piece.
     * 
     * @param p the piece to check for 
     * @return true if the square contains the specific piece, else false
     */
    public boolean hasPiece(Piece p) 
    {
        return pieces.contains(p);
    }
    
    /**
     * Gets the string representation of the pieces in this square for printing.
     * 
     * @return the string representation of the piece
     */
    public String getPieceStringRepresentation()
    {
        String result = "";
        
        for ( Piece thisPiece : pieces )
        {
            result += thisPiece.getStringRepresentation();
        }
        return result;
    }
    
}