/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChessGame.model;

/**
 *
 * @author Richard Johnston ID 0795795
 * @version 1.0 - 2015.04: Created
 */
public class Position {
    
    private int    row;
    private int    column;
    private ChessBoard chessboard;
    
    /**
     * Constructor for the objects of the position class.
     * 
     * @param chessboard the chessboard square which the position is referring to
     * @param row the row value of the chessboard
     * @param column the column value of the chessboard
     */
    Position(ChessBoard chessboard, int row, int column) {
        
        if ( chessboard == null )
        {
            throw new IllegalArgumentException(
                    "Galaxy parameter cannot be null");
        }
        if ( (row < 0) || (row >= chessboard.getNumRows()) )
        {
            throw new IllegalArgumentException(
                    "Invalid row for position (" + row + ")");
        }
        if ( (column < 0) || (column >= chessboard.getNumColumns()) )
        {
            throw new IllegalArgumentException(
                    "Invalid column for position (" + column + ")");
        }
        
        // Valid parameters are saved
        this.chessboard = chessboard;
        this.row    = row;
        this.column = column;
    };
    
    /**
     * Gets the row number of the square position.
     * 
     * @return the row number
     */
    public int getRow(){
       return this.row;
    }
    
    /**
     * Gets the column number of the square position.
     * 
     * @return the column number
     */
    public int getColumn(){
       return this.column;
    }
    
    /**
     * Gets the current ChessBoard object.
     * 
     * @return chessboard
     */
    public ChessBoard getBoard() {
        return this.chessboard;
    }
}