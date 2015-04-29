/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChessGame.model;

/**
 *
 * @author Laz Bratton
 */
public class GameBuilder {
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
    public GameBuilder(Player playerOne) {
        this.playerOne = playerOne;
        
        newBoard = new ChessBoard();
    }
    
    /**
     * Two player GameBuilder constructor
     * 
     * @param playerOne
     * @param playerTwo 
     */
    public GameBuilder(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        
        newBoard = new ChessBoard();
    }
      
    public ChessBoard getChessBoard() {
        return newBoard;
    }
    
}
