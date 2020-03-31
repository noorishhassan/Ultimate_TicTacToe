/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultimatetictactoe;

/**
 *
 * @author noorishhassan
 */
public class Move {
    
    static boolean isMoveAllowed(int move, int computersLastMove, TicTacToeBoard board, UltimateTicTacToe game){
        
        if (board.isMoveValid(move)){
            
            if (game.boards[computersLastMove].getIsValid()){
                if (board.boardNumber == game.boards[computersLastMove].boardNumber)
                    return true;
                else
                    return false;
            }
            else
            {
                if (board.getIsValid())
                    return true;
                else 
                    return false;
            }
                
        }
        
        else
            return false;
        
    }
}
