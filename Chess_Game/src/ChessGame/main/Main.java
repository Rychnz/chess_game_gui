package ChessGame.main;

import ChessGame.model.ChessBoard;
import ChessGame.model.GameBuilder;
import ChessGame.model.Player;
import ChessGame.model.Position;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rich
 */
public class Main {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lineRead = new Scanner(System.in);
        
        System.out.println("Welcome to Chess! Please enter your name:");
        String name = lineRead.next();
        Player player = new Player("name");
        GameBuilder game = new GameBuilder(player);
        
    }
}
