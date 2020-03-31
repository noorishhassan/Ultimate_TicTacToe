/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultimatetictactoe;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JPanel;


/**
 *
 * @author noorishhassan
 */
public class Effects {
    static void changeFontToBlue(JButton button)
    {
        button.setForeground(Color.GREEN);
    }
    static void changeFontToBlack(JButton button)
    {
        if (button.getForeground() == Color.GREEN)
        button.setForeground(Color.BLACK);
    }
    
    static void playerWinEffect(JButton button1, JButton button2, JButton button3){
        changeToColor(button1, Color.green);
        changeToColor(button2, Color.green);
        changeToColor(button3, Color.green);
    }
    
    static void playerWinEffect(TicTacToeBoard board){
        board.panel.setBackground(Color.red);
        
        for (int i = 0; i < 9; i++)
        {
            board.square[i].setBackground(Color.red);
            board.square[i].setOpaque(true);
            board.square[i].setBorderPainted(false);
        }
        board.panel.setOpaque(true);
        //board.panel.setBorderPainted(false);
    }

    static void computerWinEffect(JButton button1, JButton button2, JButton button3){
        changeToColor(button1, Color.MAGENTA);
        changeToColor(button2, Color.MAGENTA);
        changeToColor(button3, Color.MAGENTA);
    }
    
    static void changeToColor(JButton button, Color color){
        button.setForeground(color);
    }
}
