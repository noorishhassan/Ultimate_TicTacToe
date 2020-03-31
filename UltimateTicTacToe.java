/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultimatetictactoe;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.util.Scanner;
import javax.swing.JLabel;
import javax.swing.JTextArea;


/**
 *
 * @author noorishhassan
 */
public class UltimateTicTacToe {
    JFrame window = new JFrame("Ultimate Tic Tac Toe");
    
    JPanel gameBoard = new JPanel();

    TicTacToeBoard boards [] = new TicTacToeBoard[9];
    JTextArea winnerTextField = new JTextArea("Winner: ");

    
    public UltimateTicTacToe(){
        
        Player p = new Player();
        
        System.out.print("Enter your name: ");
        
        Scanner s = new Scanner(System.in);
        p.setName(s.nextLine());
                
        System.out.print("Please move to the game window and take ur turn");

        for (int i = 0; i < 9; i++){
            boards[i] = new TicTacToeBoard(this, i, p);
        }
        
        
        for (int i = 0; i < 9; i++){
            gameBoard.add(boards[i].getTicTacToeBoard());
        }
        
        
        gameBoard.setLayout(new GridLayout(3,3));
        
        window.add(this.gameBoard);
        window.setSize(900,900);  
        window.setVisible(true); 
    
    }
    
}
