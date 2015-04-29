/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChessGame.model;

import java.util.Set;

/**
 *
 * @author Richard Johnston ID 0795795
 * @version 1.0 - 2015.04: Created
 */
public abstract class Square {
    
    public static final int MAX_PIECES = 1;
    
    private Position position;
    private Piece piece;
    
    public Square(Position position) {
        
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
            piece = newPiece;
            success  = true;
        }
        return success;
    }
    
    /**
     * Removes a piece.
     * 
     * @return the old piece
     */
    public Piece removePiece()
    {
        Piece temp = piece;
        piece = null;
        return temp;
    }
    
    /**
     * Gets the current piece in square.
     * 
     * @return the current piece
     */
    public Piece getPiece()
    {
        return piece;
    }

    /**
     * Returns whether or not there is currently a piece on a square
     * 
     * @return true if square is occupied
     */ 
    public boolean isOccupied() {
        return piece != null;
    }
  
    /**
     * Checks if this square contains a specific piece.
     * 
     * @param p the piece to check for 
     * @return true if the square contains the specific piece, else false
     */
    public boolean hasPiece(Piece p) 
    {
        return piece == p;
    }
    
    /**
     * Gets the string representation of the pieces in this square for printing.
     * 
     * @return the string representation of the piece
     */
    public String getPieceStringRepresentation()
    {
        String result = "";
        if ( isOccupied() )
        {
            result = piece.getStringRepresentation();
        } 
        return result;
    }
    
    /**
     * Returns the string representation of this square.
     * 
     * @return the string representation of this square
     */
    public abstract String getStringRepresentation();
}