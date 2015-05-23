/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChessGame.model;

import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Laz Bratton
 */
public class Chess {
    //true for in play, false for out of play
    private boolean state;
    //player one and player two fields
    private Player playerOne;
    private Player playerTwo;
    private ChessBoard newBoard;
        
    /**
     * Single player GameBuilder constructor, use for practice
     * 
     * @param playerOne 
     */
    public Chess(Player playerOne) {
        this.playerOne = playerOne;
        
        newBoard = new ChessBoard();
    }
    
    /**
     * Two player GameBuilder constructor
     * 
     * @param playerOne
     * @param playerTwo 
     */
    public Chess(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        
        newBoard = new ChessBoard();
    }
      
    public ChessBoard getChessBoard() {
        return newBoard;
    }
    
    /**
     * Convenience method to get a square.
     * 
     * @param row the row to get
     * @param column the column to get
     * @return the square at that position,
     *         or null if the position is not valid
     */
    public Square getSquare(int row, int column)
    {
        return newBoard.getSquare(new Position(newBoard, row, column));
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
        return success;
    }
    
    /**
     *  Play the game of Chess.
     */
//    public void playGame(){
//        
//        int keepPlaying = 0;
//        
//        while(keepPlaying == 0){
//            Scanner lineRead = new Scanner(System.in);
//
//            System.out.println("Enter details of piece to move:");
//            System.out.println("Enter Row number of Piece to move:");
//            String col = lineRead.next();
//            System.out.println("Enter Column number of Piece to move:");
//            String row = lineRead.next();
//            System.out.println("Enter destination Row number:");
//            String newCol = lineRead.next();
//            System.out.println("Enter destination Column number:");
//            String newRow = lineRead.next();
//                
//            int colNo = Integer.parseInt(col);
//            int rowNo = Integer.parseInt(row);
//            int newColNo = Integer.parseInt(newCol);
//            int newRowNo = Integer.parseInt(newRow);
//          
//            Position pos = new Position(newBoard, rowNo, colNo);
//            Piece p;
//            //p = this.getSquare(pos).getPiece();
//            //movePiece(squares[rowNo][colNo], squares[newRowNo][newColNo], p);
//            newBoard.draw();
//            
//            System.out.println("Do you want to keep playing? Type Y or N");
//            String cp = lineRead.next();
//            
//            String playOn = "Y";
//                                    
//            if(cp.equals(playOn))keepPlaying = 0;
//            else keepPlaying = 1;
//        } 
//        System.out.println("You have chosen to quit, good bye!");
//        
//    }
    
}