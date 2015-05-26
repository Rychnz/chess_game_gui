/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChessGame.model;

import java.awt.Color;

/**
 *
 * @author Richard Johnston ID 0795795 && Lazarus Bratton 
 * 
 * @version 1.0 - 2015.04: Created
 */
public class ChessBoard {
    
    //Set ChessBoard size to 8x8
    private final int         numRows = 8;
    private final int         numColumns = 8;
    private Square [][] squares;
    //private Piece piece;
    private Square square;
    
    /**
     * Default constructor for ChessBoard
     * Creates board and places pieces to starting position
     */
    public ChessBoard() {
        
        squares = new Square[numRows][numColumns];
        buildChessBoard();
        placePieces();
        
        //playGame();
    }
    
    /**
     * Test constructor for chessboard
     * Use only for testing as no pieces will be placed
     * 
     * @param test 
     */
    public ChessBoard(String test) {
        squares = new Square[numRows][numColumns];
        
    }
    

    /**
     * Gets the number of rows of ChessBoard.
     * 
     * @return the number of rows of this galaxy
     */
    public int getNumRows(){
        return numRows;
    }

    /**
     * Gets the number of columns of ChessBoard.
     * 
     * @return the number of columns
     */
    public int getNumColumns(){
        return numColumns;
    }
    
    /**
     * Gets a square at a particular ChessBoard position.
     * 
     * @param  pos the position of the square
     * @return the square at this position
     */
    public Square getSquare(Position pos)
    {
        Square result = null;
        if ( pos != null )
        {
            result = squares[pos.getRow()][pos.getColumn()];
        }
        return result;
    }
    
    
    /**
     * Creates a console text representation of the ChessBoard.
     */
    public void draw(){
        System.out.println(getStringRepresentation());
    }
    
    /**
     * Returns a string with the chessboard pieces for printing to console purposes.
     * 
     * @return a string that represents the ChessBoard
     */
    public String getStringRepresentation()
    {
        String output = "";
        final int CELL_SIZE = 3;
        
        // create the horizontal line as a string
        String horizontalLine = "-";
        for ( int col = 0; col < numColumns; col++ )
        {
            for ( int i = 0 ; i < CELL_SIZE ; i++ )
            {
                horizontalLine += "-";
            }            
            horizontalLine += "-";
        }
        
        // print the content
        for ( int row = 0; row < numRows; row++ ) 
        { 
            String rowOccupant = "|";
            for ( int col = 0; col < numColumns; col++ ) 
            {
                Square s = squares[row][col];
                // create string with piece
                String cellOccupant = " " + s.getPieceStringRepresentation();
                // pad the output with spaces to a specific size
                for ( int i = cellOccupant.length() ; i < CELL_SIZE ; i++ )
                {
                    cellOccupant += " ";
                }
                rowOccupant += cellOccupant + "|";
            }
            output += horizontalLine + "\n";
            output += rowOccupant + "\n";
        }
        output += horizontalLine;
        
        return output;
    }
    
    /**
     * Builds the ChesssBoard for game play.
     */
    private void buildChessBoard() 
    {
        squares = new Square[numRows][numColumns];
        for (int row = 0; row < this.numRows; row++) 
        {
            for (int column = 0; column < this.numColumns; column++) 
            {
                Square square = new Square(new Position(this, row, column)) {

                    @Override
                    public String getStringRepresentation() {
                        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }
                };
                squares[row][column] = square;
            }
        }
    }
    
    /**
     * Checks to ensure position is within boundaries of board
     *
     * @returns true if so
     */
    public boolean withinBoundaries(Position pos) {
        boolean success = false;
        if((pos.getRow()>=0 && pos.getRow()<=7) && 
                (pos.getColumn()>=0 && pos.getColumn()<=7))
            success=true;
        return success;
    }
    
    /**
     * This will add all the pieces to their starting positions
     * 
     * - Laz
     */
    private void placePieces() {
        for(int i = 0; i < 8; i++) {
            Piece pawn = new Pawn(Color.WHITE);
            Position pos = new Position(this, 1, i);
            getSquare(pos).addPiece(pawn);
            pawn.setPosition(pos);
        }
        for(int i = 0; i < 8; i++) {
            Piece pawn = new Pawn(Color.BLACK);
            Position pos = new Position(this, 6, i);
            getSquare(pos).addPiece(pawn);
            pawn.setPosition(pos);
        }
        
        Piece rook = new Rook(Color.WHITE);
        Position pos = new Position(this, 0, 0);
        getSquare(pos).addPiece(rook);
        
        Piece rook3 = new Rook(Color.WHITE);
        Position pos3 = new Position(this, 7, 0);
        getSquare(pos3).addPiece(rook);
        
        Piece rook4 = new Rook(Color.BLACK);
        Position pos4 = new Position(this, 0, 7);
        getSquare(pos4).addPiece(rook);
        
        Piece rook2 = new Rook(Color.BLACK);
        Position pos1 = new Position(this, 7, 7);
        getSquare(pos1).addPiece(rook2);
        
        Piece knight = new Knight(Color.WHITE);
        Position pos5 = new Position(this, 0, 1);
        getSquare(pos5).addPiece(knight);
        
        Piece knight2 = new Knight(Color.WHITE);
        Position pos6 = new Position(this, 0, 6);
        getSquare(pos6).addPiece(knight);
        
        Piece knight3 = new Knight(Color.BLACK);
        Position pos7 = new Position(this, 7, 1);
        getSquare(pos7).addPiece(knight);
        
        Piece knight4 = new Knight(Color.BLACK);
        Position pos8 = new Position(this, 7, 6);
        getSquare(pos8).addPiece(knight);
        
        Piece bishopWhite = new Bishop(Color.WHITE);
        Position pos9 = new Position(this, 0, 2);
        getSquare(pos9).addPiece(bishopWhite);

        Position pos10 = new Position(this, 0, 5);
        getSquare(pos10).addPiece(bishopWhite);
        
        Piece bishopBlack = new Bishop(Color.BLACK);
        Position pos11 = new Position(this, 7, 2);
        getSquare(pos11).addPiece(bishopBlack);

        Position pos12 = new Position(this, 7, 5);
        getSquare(pos12).addPiece(bishopBlack);
        
        Piece king = new King(Color.WHITE);
        Position pos13 = new Position(this, 0, 3);
        getSquare(pos13).addPiece(king);
        
        Piece queen = new Queen(Color.WHITE);
        Position pos14 = new Position(this, 0, 4);
        getSquare(pos14).addPiece(queen);
        
        Piece king2 = new King(Color.BLACK);
        Position pos15 = new Position(this, 7, 4);
        getSquare(pos15).addPiece(king2);
        
        Piece queen2 = new Queen(Color.BLACK);
        Position pos16 = new Position(this, 7, 3);
        getSquare(pos16).addPiece(queen2);
    }
}