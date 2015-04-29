/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChessGame.model;

import java.awt.Color;
import java.util.Scanner;
import java.util.Set;

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
    
    public ChessBoard() {
        
        //this.numRows    = numRows;
        //this.numColumns = numColumns;
        
        squares = new Square[numRows][numColumns];
        buildChessBoard();
        placePieces();
        draw();
        
        playGame();
        //draw();
    }
    
    /**
     *  Play the game of Chess.
     */
    public void playGame(){
        
        int keepPlaying = 0;
        
        while(keepPlaying == 0){
            Scanner lineRead = new Scanner(System.in);

            System.out.println("Enter details of piece to move:");
            System.out.println("Enter Row number of Piece to move:");
            String col = lineRead.next();
            System.out.println("Enter Column number of Piece to move:");
            String row = lineRead.next();
            System.out.println("Enter destination Row number:");
            String newCol = lineRead.next();
            System.out.println("Enter destination Column number:");
            String newRow = lineRead.next();
                
            int colNo = Integer.parseInt(col);
            int rowNo = Integer.parseInt(row);
            int newColNo = Integer.parseInt(newCol);
            int newRowNo = Integer.parseInt(newRow);
          
            Position pos = new Position(this, rowNo, colNo);
            Piece p;
            p = this.getSquare(pos).getPiece();
            movePiece(squares[rowNo][colNo], squares[newRowNo][newColNo], p);
            draw();
            
            System.out.println("Do you want to keep playing? Type Y or N");
            String cp = lineRead.next();
            
            String playOn = "Y";
                                    
            if(cp.equals(playOn))keepPlaying = 0;
            else keepPlaying = 1;
        } 
        System.out.println("You have chosen to quit, good bye!");
        
    }
    
    public boolean movePiece(Square fromSquare, Square toSquare, Piece piece) {
        boolean success = false;
        Set<Square> moves = piece.movesPossible();
        if(fromSquare.hasPiece(piece) && moves.contains(toSquare)) {
            piece.setPosition(toSquare.getPosition());
            fromSquare.removePiece();
            toSquare.addPiece(piece);
            success = true;
        }
        else {
            throw new IllegalArgumentException("Square does not contain this piece!");
        }
        //draw();
        return success;
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
    private void draw(){
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
        
        Piece rook = new Rook();
        Position pos = new Position(this, 0, 0);
        getSquare(pos).addPiece(rook);
        
        Piece rook3 = new Rook();
        Position pos3 = new Position(this, 7, 0);
        getSquare(pos3).addPiece(rook);
        
        Piece rook4 = new Rook();
        Position pos4 = new Position(this, 0, 7);
        getSquare(pos4).addPiece(rook);
        
        Piece rook2 = new Rook();
        Position pos1 = new Position(this, 7, 7);
        getSquare(pos1).addPiece(rook2);
        
        Piece knight = new Knight();
        Position pos5 = new Position(this, 0, 1);
        getSquare(pos5).addPiece(knight);
        
        Piece knight2 = new Knight();
        Position pos6 = new Position(this, 0, 6);
        getSquare(pos6).addPiece(knight);
        
        Piece knight3 = new Knight();
        Position pos7 = new Position(this, 7, 1);
        getSquare(pos7).addPiece(knight);
        
        Piece knight4 = new Knight();
        Position pos8 = new Position(this, 7, 6);
        getSquare(pos8).addPiece(knight);
        
        Piece bishop = new Bishop();
        Position pos9 = new Position(this, 0, 2);
        getSquare(pos9).addPiece(bishop);

        Position pos10 = new Position(this, 0, 5);
        getSquare(pos10).addPiece(bishop);

        Position pos11 = new Position(this, 7, 2);
        getSquare(pos11).addPiece(bishop);

        Position pos12 = new Position(this, 7, 5);
        getSquare(pos12).addPiece(bishop);
        
        Piece king = new King();
        Position pos13 = new Position(this, 0, 3);
        getSquare(pos13).addPiece(king);
        
        Piece queen = new Queen();
        Position pos14 = new Position(this, 0, 4);
        getSquare(pos14).addPiece(queen);
        
        Piece king2 = new King();
        Position pos15 = new Position(this, 7, 4);
        getSquare(pos15).addPiece(king2);
        
        Piece queen2 = new Queen();
        Position pos16 = new Position(this, 7, 3);
        getSquare(pos16).addPiece(queen2);
    }
}