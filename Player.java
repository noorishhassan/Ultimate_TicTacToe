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
public class Player {
    int lastMove;
    String name;
    int score;
   
    static boolean winsGame(UltimateTicTacToe gameBoard)
    {
        boolean flag = false;
        for (int i = 0; i < 9; i+=3)
            if (gameBoard.boards[i].isWonByPlayer() && gameBoard.boards[i+1].isWonByPlayer() && gameBoard.boards[i+2].isWonByPlayer())
                flag = true;
        
        for (int i = 0; i < 3; i++)
            if (gameBoard.boards[i].isWonByPlayer() && gameBoard.boards[i+3].isWonByPlayer() && gameBoard.boards[i+6].isWonByPlayer())
                flag = true;
        
        if (gameBoard.boards[0].isWonByPlayer() && gameBoard.boards[4].isWonByPlayer() && gameBoard.boards[8].isWonByPlayer())
            flag = true;
        if (gameBoard.boards[2].isWonByPlayer() && gameBoard.boards[4].isWonByPlayer() && gameBoard.boards[6].isWonByPlayer())
            flag = true;
        if (flag == true)
            return true;
        return false;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String n){
        this.name = n;
    }
    
    public int getScore(){
        return this.score;
    }
    
    public void setScore(int s){
        this.score = s;
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
}
