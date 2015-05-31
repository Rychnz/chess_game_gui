package ChessGame.main;

import ChessGame.gui.ChessBoardUI;
import ChessGame.gui.GreetingMenu;
import ChessGame.model.ChessBoard;
import ChessGame.model.Chess;
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
//        Player player = new Player("name");
//        Chess game = new Chess(player);
//        ChessBoard board        = new ChessBoard();
        final GreetingMenu ui   = new GreetingMenu();
        
        // make the GUI visible
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            @Override
            public void run() 
            {
                // centre window on screen 
                ui.setLocationRelativeTo(null);
                ui.setVisible(true);
                
            }
        });
        /*        
        Scanner lineRead = new Scanner(System.in);
        
        System.out.println("Welcome to Chess! Please enter your name:");
        String name = lineRead.next();
        
        
        */
    }
                
}
