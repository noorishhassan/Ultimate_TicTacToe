/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultimatetictactoe;

import java.awt.Color;
import java.util.Random;

/**
 *
 * @author noorishhassan
 */
public class Computer {
    
    static int lastMove;
    static int lastBoard;
    
    static int takeTurn(TicTacToeBoard b){
        
        int flag = 0;
        Random rand = new Random();
        int move = rand.nextInt(8);
        while (!b.isMoveValid(move)){
            if (move < 8)
                move++;
            else if (flag == 0){    
                move = 0;
                flag = 1;
            }
            else
                return -1;
        }
        return move;
        
    }
    
    static int selectNewBoard(UltimateTicTacToe u){
        
        int flag = 0;
        Random rand = new Random();
        int board = rand.nextInt(8);
        while (!u.boards[board].getIsValid()){
            if (board < 8)
                board++;
            else if (flag == 0){    
                board = 0;
                flag = 1;
            }
            else
                return -1;
        }
        return board;
        
    }
    
    static void checkWin(TicTacToeBoard board){
        
        boolean flag = false;
        
        if (board.square[0].getText().equals("o") && board.square[1].getText().equals("o") && board.square[2].getText().equals("o")){
            Effects.computerWinEffect(board.square[0], board.square[1], board.square[2]);
            System.out.println("computer wins");
            board.setIsValid(false);
            board.setWonByComputer(true);
        }
        else if (board.square[3].getText().equals("o") && board.square[4].getText().equals("o") && board.square[5].getText().equals("o")){
            Effects.computerWinEffect(board.square[3], board.square[4], board.square[5]);
            System.out.println("computer wins");
            board.setIsValid(false);
            board.setWonByComputer(true);
        }
        else if (board.square[6].getText().equals("o") && board.square[7].getText().equals("o") && board.square[8].getText().equals("o")){
            Effects.computerWinEffect(board.square[6], board.square[7], board.square[8]);
            System.out.println("computer wins");
            board.setIsValid(false);
            board.setWonByComputer(true);
        }
        
        else if (board.square[0].getText().equals("o") && board.square[3].getText().equals("o") && board.square[6].getText().equals("o")){
            Effects.computerWinEffect(board.square[0], board.square[3], board.square[6]);
            System.out.println("computer wins");
            board.setIsValid(false);
            board.setWonByComputer(true);
        }
        else if (board.square[1].getText().equals("o") && board.square[4].getText().equals("o") && board.square[7].getText().equals("o")){
            Effects.computerWinEffect(board.square[1], board.square[4], board.square[7]);
            System.out.println("computer wins");
            board.setIsValid(false);
            board.setWonByComputer(true);
        }
        else if (board.square[2].getText().equals("o") && board.square[5].getText().equals("o") && board.square[8].getText().equals("o")){
            Effects.computerWinEffect(board.square[2], board.square[5], board.square[8]);
            System.out.println("computer wins");
            board.setIsValid(false);
            board.setWonByComputer(true);
        }
        
        else if (board.square[0].getText().equals("o") && board.square[4].getText().equals("o") && board.square[8].getText().equals("o")){
            Effects.computerWinEffect(board.square[0], board.square[4], board.square[8]);
            System.out.println("computer wins");
            board.setIsValid(false);
            board.setWonByComputer(true);
        }
        else if (board.square[2].getText().equals("o") && board.square[4].getText().equals("o") && board.square[6].getText().equals("o")){
            Effects.computerWinEffect(board.square[2], board.square[4], board.square[6]);
            System.out.println("computer wins");
            board.setIsValid(false);
            board.setWonByComputer(true);
        }


        
    }
    
    static void updateLastMove(int move)
    {
        lastMove = move;
    }
    
    static void updateLastBoard(int board)
    {
        lastBoard = board;
    }
}
