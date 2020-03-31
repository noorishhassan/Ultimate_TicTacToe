/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultimatetictactoe;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.*;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author noorishhassan
 */
public class TicTacToeBoard{
    JFrame window = new JFrame();
    
    JPanel panel = new JPanel();
    
    JButton square [] = new JButton[9];
    
    int boardNumber;
    private boolean isValid = true;
    private boolean wonByPlayer = false;
    private boolean wonByComputer = false;
    
    dbConnection db = new dbConnection();
    
    TicTacToeBoard(UltimateTicTacToe gameBoard, int boardNum, Player p){
        
        
        for (int i = 0; i < 9; i++)
            square[i] = new JButton("");
        
        this.boardNumber = boardNum;
        
        square[0].addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                
                Effects.changeFontToBlack(gameBoard.boards[Computer.lastBoard].square[Computer.lastMove]);
                
                if (Move.isMoveAllowed(0, Computer.lastMove, gameBoard.boards[boardNumber], gameBoard)){
                    square[0].setText("x");
                    if (square[0].getText().equals("x") && square[1].getText().equals("x") && square[2].getText().equals("x")){
                        square[0].setForeground(Color.red);
                        square[1].setForeground(Color.red);
                        square[2].setForeground(Color.red);
                        System.out.println("u win");
                        gameBoard.boards[boardNumber].setIsValid(false);
                        wonByPlayer = true;
                        if (Player.winsGame(gameBoard)){
                            p.setScore(100);
                            db.setScores(p);
                        }
                    }
                    else if (square[0].getText().equals("x") && square[4].getText().equals("x") && square[8].getText().equals("x")){
                        square[0].setForeground(Color.red);
                        square[4].setForeground(Color.red);
                        square[8].setForeground(Color.red);
                        System.out.println("u win");
                        gameBoard.boards[boardNumber].setIsValid(false);
                        wonByPlayer = true;
                        if (Player.winsGame(gameBoard)){
                            p.setScore(100);
                            db.setScores(p);
                        }
                    }
                    else if (square[0].getText().equals("x") && square[3].getText().equals("x") && square[6].getText().equals("x")){
                        square[0].setForeground(Color.red);
                        square[3].setForeground(Color.red);
                        square[6].setForeground(Color.red);
                        System.out.println("u win");
                        gameBoard.boards[boardNumber].setIsValid(false);
                        wonByPlayer = true;
                        if (Player.winsGame(gameBoard)){
                            p.setScore(100);
                            db.setScores(p);
                        }
                    }
                    
                    int board = 0;
                    int move = Computer.takeTurn(gameBoard.boards[board]);
                    if (move == -1 || !gameBoard.boards[board].getIsValid()){
                        if (move == -1)
                            gameBoard.boards[board].setIsValid(false);
                        board = Computer.selectNewBoard(gameBoard);
                        move = Computer.takeTurn(gameBoard.boards[board]);
                    }
                    
                    gameBoard.boards[board].square[move].setText("o");
                    Effects.changeFontToBlue(gameBoard.boards[board].square[move]);
                    
                    Computer.updateLastBoard(board);
                    Computer.updateLastMove(move);
                    Computer.checkWin(gameBoard.boards[board]);
                    
                }
            }  
        });
        
        
        square[1].addActionListener(new ActionListener(){  
            
            public void actionPerformed(ActionEvent e){
                
                Effects.changeFontToBlack(gameBoard.boards[Computer.lastBoard].square[Computer.lastMove]);

                if (Move.isMoveAllowed(1, Computer.lastMove, gameBoard.boards[boardNumber], gameBoard)){
                    square[1].setText("x");
                    if (square[1].getText().equals("x") && square[0].getText().equals("x") && square[2].getText().equals("x")){
                        square[1].setForeground(Color.red);
                        square[0].setForeground(Color.red);
                        square[2].setForeground(Color.red);
                        System.out.println("u win");
                        gameBoard.boards[boardNumber].setIsValid(false);
                        wonByPlayer = true;
                        if (Player.winsGame(gameBoard)){
                            p.setScore(100);
                            db.setScores(p);
                        }
                    }
                    else if (square[1].getText().equals("x") && square[4].getText().equals("x") && square[7].getText().equals("x")){
                        square[1].setForeground(Color.red);
                        square[4].setForeground(Color.red);
                        square[7].setForeground(Color.red);
                        System.out.println("u win");
                        gameBoard.boards[boardNumber].setIsValid(false);
                        wonByPlayer = true;
                        if (Player.winsGame(gameBoard)){
                            p.setScore(100);
                            db.setScores(p);
                        }
                    }
                    
                    
                    
                    int board = 1;
                    int move = Computer.takeTurn(gameBoard.boards[board]);
                    if (move == -1 || !gameBoard.boards[board].getIsValid()){
                        if (move == -1)
                            gameBoard.boards[board].setIsValid(false);
                        board = Computer.selectNewBoard(gameBoard);
                        move = Computer.takeTurn(gameBoard.boards[board]);
                    }
                                        
                    gameBoard.boards[board].square[move].setText("o");
                    Effects.changeFontToBlue(gameBoard.boards[board].square[move]);
                    
                    Computer.updateLastBoard(board);
                    Computer.updateLastMove(move);
                    Computer.checkWin(gameBoard.boards[board]);
                    
                }
            }  
        });
        
        square[2].addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                
                Effects.changeFontToBlack(gameBoard.boards[Computer.lastBoard].square[Computer.lastMove]);
                
                if (Move.isMoveAllowed(2, Computer.lastMove, gameBoard.boards[boardNumber], gameBoard)){
                    square[2].setText("x");
                    if (square[2].getText().equals("x") && square[0].getText().equals("x") && square[1].getText().equals("x")){
                        square[2].setForeground(Color.red);
                        square[0].setForeground(Color.red);
                        square[1].setForeground(Color.red);
                        System.out.println("u win");
                        gameBoard.boards[boardNumber].setIsValid(false);
                        wonByPlayer = true;
                        if (Player.winsGame(gameBoard)){
                            p.setScore(100);
                            db.setScores(p);
                        }
                    }
                    else if (square[2].getText().equals("x") && square[4].getText().equals("x") && square[6].getText().equals("x")){
                        square[2].setForeground(Color.red);
                        square[4].setForeground(Color.red);
                        square[6].setForeground(Color.red);
                        System.out.println("u win");
                        gameBoard.boards[boardNumber].setIsValid(false);
                        wonByPlayer = true;
                        if (Player.winsGame(gameBoard)){
                            p.setScore(100);
                            db.setScores(p);
                        }
                    }
                    else if (square[2].getText().equals("x") && square[5].getText().equals("x") && square[8].getText().equals("x")){
                        square[2].setForeground(Color.red);
                        square[5].setForeground(Color.red);
                        square[8].setForeground(Color.red);
                        System.out.println("u win");
                        gameBoard.boards[boardNumber].setIsValid(false);
                        wonByPlayer = true;
                        if (Player.winsGame(gameBoard)){
                            p.setScore(100);
                            db.setScores(p);
                        }
                    }
                    
                    
                    int board = 2;
                    int move = Computer.takeTurn(gameBoard.boards[board]);
                    if (move == -1 || !gameBoard.boards[board].getIsValid()){
                        if (move == -1)
                            gameBoard.boards[board].setIsValid(false);
                        board = Computer.selectNewBoard(gameBoard);
                        move = Computer.takeTurn(gameBoard.boards[board]);
                    }
                                        
                    gameBoard.boards[board].square[move].setText("o");
                    Effects.changeFontToBlue(gameBoard.boards[board].square[move]);
                    
                    Computer.updateLastBoard(board);
                    Computer.updateLastMove(move);
                    Computer.checkWin(gameBoard.boards[board]);
                    
                }
            }  
        });
        
        
        square[3].addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                
                Effects.changeFontToBlack(gameBoard.boards[Computer.lastBoard].square[Computer.lastMove]);
                
                if (Move.isMoveAllowed(3, Computer.lastMove, gameBoard.boards[boardNumber], gameBoard)){
                    square[3].setText("x");
                    if (square[3].getText().equals("x") && square[4].getText().equals("x") && square[5].getText().equals("x")){
                        square[3].setForeground(Color.red);
                        square[4].setForeground(Color.red);
                        square[5].setForeground(Color.red);
                        System.out.println("u win");
                        gameBoard.boards[boardNumber].setIsValid(false);
                        wonByPlayer = true;
                        if (Player.winsGame(gameBoard)){
                            p.setScore(100);
                            db.setScores(p);
                        }
                    }
                    else if (square[3].getText().equals("x") && square[0].getText().equals("x") && square[6].getText().equals("x")){
                        square[3].setForeground(Color.red);
                        square[0].setForeground(Color.red);
                        square[6].setForeground(Color.red);
                        System.out.println("u win");
                        gameBoard.boards[boardNumber].setIsValid(false);
                        wonByPlayer = true;
                        if (Player.winsGame(gameBoard)){
                            p.setScore(100);
                            db.setScores(p);
                        }
                    }

                    
                    int board = 3;
                    int move = Computer.takeTurn(gameBoard.boards[board]);
                    if (move == -1 || !gameBoard.boards[board].getIsValid()){
                        if (move == -1)
                            gameBoard.boards[board].setIsValid(false);
                        board = Computer.selectNewBoard(gameBoard);
                        move = Computer.takeTurn(gameBoard.boards[board]);
                    }
                    
                    gameBoard.boards[board].square[move].setText("o");
                    Effects.changeFontToBlue(gameBoard.boards[board].square[move]);
                    
                    Computer.updateLastBoard(board);
                    Computer.updateLastMove(move);
                    Computer.checkWin(gameBoard.boards[board]);
                    
                }
            }  
        });
        
        
        square[4].addActionListener(new ActionListener(){  
            
            public void actionPerformed(ActionEvent e){
                
                Effects.changeFontToBlack(gameBoard.boards[Computer.lastBoard].square[Computer.lastMove]);

                if (Move.isMoveAllowed(4, Computer.lastMove, gameBoard.boards[boardNumber], gameBoard)){
                    square[4].setText("x");
                    if (square[4].getText().equals("x") && square[3].getText().equals("x") && square[5].getText().equals("x")){
                        square[4].setForeground(Color.red);
                        square[3].setForeground(Color.red);
                        square[5].setForeground(Color.red);
                        System.out.println("u win");
                        gameBoard.boards[boardNumber].setIsValid(false);
                        wonByPlayer = true;
                        if (Player.winsGame(gameBoard)){
                            p.setScore(100);
                            db.setScores(p);
                        }
                    }
                    else if (square[4].getText().equals("x") && square[1].getText().equals("x") && square[7].getText().equals("x")){
                        square[4].setForeground(Color.red);
                        square[1].setForeground(Color.red);
                        square[7].setForeground(Color.red);
                        System.out.println("u win");
                        gameBoard.boards[boardNumber].setIsValid(false);
                        wonByPlayer = true;
                        if (Player.winsGame(gameBoard)){
                            p.setScore(100);
                            db.setScores(p);
                        }
                    }
                    else if (square[4].getText().equals("x") && square[0].getText().equals("x") && square[8].getText().equals("x")){
                        square[4].setForeground(Color.red);
                        square[0].setForeground(Color.red);
                        square[8].setForeground(Color.red);
                        System.out.println("u win");
                        gameBoard.boards[boardNumber].setIsValid(false);
                        wonByPlayer = true;
                        if (Player.winsGame(gameBoard)){
                            p.setScore(100);
                            db.setScores(p);
                        }
                    }
                    else if (square[4].getText().equals("x") && square[2].getText().equals("x") && square[6].getText().equals("x")){
                        square[4].setForeground(Color.red);
                        square[2].setForeground(Color.red);
                        square[6].setForeground(Color.red);
                        System.out.println("u win");
                        gameBoard.boards[boardNumber].setIsValid(false);
                        wonByPlayer = true;
                        if (Player.winsGame(gameBoard)){
                            p.setScore(100);
                            db.setScores(p);
                        }
                    }
                    
                    
                    
                    int board = 4;
                    int move = Computer.takeTurn(gameBoard.boards[board]);
                    if (move == -1 || !gameBoard.boards[board].getIsValid()){
                        if (move == -1)
                            gameBoard.boards[board].setIsValid(false);
                        board = Computer.selectNewBoard(gameBoard);
                        move = Computer.takeTurn(gameBoard.boards[board]);
                    }
                                        
                    gameBoard.boards[board].square[move].setText("o");
                    Effects.changeFontToBlue(gameBoard.boards[board].square[move]);
                    
                    Computer.updateLastBoard(board);
                    Computer.updateLastMove(move);
                    Computer.checkWin(gameBoard.boards[board]);
                    
                }
            }  
        });
        
        square[5].addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                
                Effects.changeFontToBlack(gameBoard.boards[Computer.lastBoard].square[Computer.lastMove]);
                
                if (Move.isMoveAllowed(5, Computer.lastMove, gameBoard.boards[boardNumber], gameBoard)){
                    square[5].setText("x");
                    if (square[5].getText().equals("x") && square[3].getText().equals("x") && square[4].getText().equals("x")){
                        square[5].setForeground(Color.red);
                        square[3].setForeground(Color.red);
                        square[4].setForeground(Color.red);
                        System.out.println("u win");
                        gameBoard.boards[boardNumber].setIsValid(false);
                        wonByPlayer = true;
                        if (Player.winsGame(gameBoard)){
                            p.setScore(100);
                            db.setScores(p);
                        }
                    }
                    else if (square[5].getText().equals("x") && square[2].getText().equals("x") && square[8].getText().equals("x")){
                        square[5].setForeground(Color.red);
                        square[2].setForeground(Color.red);
                        square[8].setForeground(Color.red);
                        System.out.println("u win");
                        gameBoard.boards[boardNumber].setIsValid(false);
                        wonByPlayer = true;
                        if (Player.winsGame(gameBoard)){
                            p.setScore(100);
                            db.setScores(p);
                        }
                    }
                    
                    
                    int board = 5;
                    int move = Computer.takeTurn(gameBoard.boards[board]);
                    if (move == -1 || !gameBoard.boards[board].getIsValid()){
                        if (move == -1)
                            gameBoard.boards[board].setIsValid(false);
                        board = Computer.selectNewBoard(gameBoard);
                        move = Computer.takeTurn(gameBoard.boards[board]);
                    }
                                        
                    gameBoard.boards[board].square[move].setText("o");
                    Effects.changeFontToBlue(gameBoard.boards[board].square[move]);
                    
                    Computer.updateLastBoard(board);
                    Computer.updateLastMove(move);
                    Computer.checkWin(gameBoard.boards[board]);
                    
                }
            }  
        });
        
        
        square[6].addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                
                Effects.changeFontToBlack(gameBoard.boards[Computer.lastBoard].square[Computer.lastMove]);
                
                if (Move.isMoveAllowed(6, Computer.lastMove, gameBoard.boards[boardNumber], gameBoard)){
                    square[6].setText("x");
                    if (square[6].getText().equals("x") && square[0].getText().equals("x") && square[3].getText().equals("x")){
                        square[6].setForeground(Color.red);
                        square[0].setForeground(Color.red);
                        square[3].setForeground(Color.red);
                        System.out.println("u win");
                        gameBoard.boards[boardNumber].setIsValid(false);
                        wonByPlayer = true;
                        if (Player.winsGame(gameBoard)){
                            p.setScore(100);
                            db.setScores(p);
                        }
                    }
                    else if (square[6].getText().equals("x") && square[7].getText().equals("x") && square[8].getText().equals("x")){
                        square[6].setForeground(Color.red);
                        square[7].setForeground(Color.red);
                        square[8].setForeground(Color.red);
                        System.out.println("u win");
                        gameBoard.boards[boardNumber].setIsValid(false);
                        wonByPlayer = true;
                        if (Player.winsGame(gameBoard)){
                            p.setScore(100);
                            db.setScores(p);
                        }
                    }
                    else if (square[6].getText().equals("x") && square[4].getText().equals("x") && square[2].getText().equals("x")){
                        square[6].setForeground(Color.red);
                        square[4].setForeground(Color.red);
                        square[2].setForeground(Color.red);
                        System.out.println("u win");
                        gameBoard.boards[boardNumber].setIsValid(false);
                        wonByPlayer = true;
                        if (Player.winsGame(gameBoard)){
                            p.setScore(100);
                            db.setScores(p);
                        }
                    }
                    
                    int board = 6;
                    int move = Computer.takeTurn(gameBoard.boards[board]);
                    if (move == -1 || !gameBoard.boards[board].getIsValid()){
                        if (move == -1)
                            gameBoard.boards[board].setIsValid(false);
                        board = Computer.selectNewBoard(gameBoard);
                        move = Computer.takeTurn(gameBoard.boards[board]);
                    }
                    
                    gameBoard.boards[board].square[move].setText("o");
                    Effects.changeFontToBlue(gameBoard.boards[board].square[move]);
                    
                    Computer.updateLastBoard(board);
                    Computer.updateLastMove(move);
                    Computer.checkWin(gameBoard.boards[board]);
                    
                }
            }  
        });
        
        
        square[7].addActionListener(new ActionListener(){  
            
            public void actionPerformed(ActionEvent e){
                
                Effects.changeFontToBlack(gameBoard.boards[Computer.lastBoard].square[Computer.lastMove]);

                if (Move.isMoveAllowed(7, Computer.lastMove, gameBoard.boards[boardNumber], gameBoard)){
                    square[7].setText("x");
                    if (square[7].getText().equals("x") && square[6].getText().equals("x") && square[8].getText().equals("x")){
                        square[7].setForeground(Color.red);
                        square[6].setForeground(Color.red);
                        square[8].setForeground(Color.red);
                        System.out.println("u win");
                        gameBoard.boards[boardNumber].setIsValid(false);
                        wonByPlayer = true;
                        if (Player.winsGame(gameBoard)){
                            p.setScore(100);
                            db.setScores(p);
                        }
                    }
                    else if (square[7].getText().equals("x") && square[1].getText().equals("x") && square[4].getText().equals("x")){
                        square[7].setForeground(Color.red);
                        square[1].setForeground(Color.red);
                        square[4].setForeground(Color.red);
                        System.out.println("u win");
                        gameBoard.boards[boardNumber].setIsValid(false);
                        wonByPlayer = true;
                        if (Player.winsGame(gameBoard)){
                            p.setScore(100);
                            db.setScores(p);
                        }
                    }
                    
                    
                    
                    int board = 7;
                    int move = Computer.takeTurn(gameBoard.boards[board]);
                    if (move == -1 || !gameBoard.boards[board].getIsValid()){
                        if (move == -1)
                            gameBoard.boards[board].setIsValid(false);
                        board = Computer.selectNewBoard(gameBoard);
                        move = Computer.takeTurn(gameBoard.boards[board]);
                    }
                                        
                    gameBoard.boards[board].square[move].setText("o");
                    Effects.changeFontToBlue(gameBoard.boards[board].square[move]);
                    
                    Computer.updateLastBoard(board);
                    Computer.updateLastMove(move);
                    Computer.checkWin(gameBoard.boards[board]);
                    
                }
            }  
        });
        
        square[8].addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                
                Effects.changeFontToBlack(gameBoard.boards[Computer.lastBoard].square[Computer.lastMove]);
                
                if (Move.isMoveAllowed(8, Computer.lastMove, gameBoard.boards[boardNumber], gameBoard)){
                    square[8].setText("x");
                    if (square[8].getText().equals("x") && square[6].getText().equals("x") && square[7].getText().equals("x")){
                        Effects.playerWinEffect(square[8], square[6], square[7]);

                        System.out.println("u win");
                        gameBoard.boards[boardNumber].setIsValid(false);
                        wonByPlayer = true;
                        if (Player.winsGame(gameBoard)){
                            p.setScore(100);
                            db.setScores(p);
                        }
                    }
                    else if (square[8].getText().equals("x") && square[2].getText().equals("x") && square[5].getText().equals("x")){
                        square[8].setForeground(Color.red);
                        square[2].setForeground(Color.red);
                        square[5].setForeground(Color.red);
                        System.out.println("u win");
                        gameBoard.boards[boardNumber].setIsValid(false);
                        wonByPlayer = true;
                        if (Player.winsGame(gameBoard)){
                            p.setScore(100);
                            db.setScores(p);
                        }
                    }
                    else if (square[8].getText().equals("x") && square[0].getText().equals("x") && square[4].getText().equals("x")){
                        square[8].setForeground(Color.red);
                        square[0].setForeground(Color.red);
                        square[4].setForeground(Color.red);
                        System.out.println("u win");
                        gameBoard.boards[boardNumber].setIsValid(false);
                        wonByPlayer = true;
                        if (Player.winsGame(gameBoard)){
                            p.setScore(100);
                            db.setScores(p);
                        }
                    }
                    
                    
                    int board = 8;
                    int move = Computer.takeTurn(gameBoard.boards[board]);
                    if (move == -1 || !gameBoard.boards[board].getIsValid()){
                        if (move == -1)
                            gameBoard.boards[board].setIsValid(false);
                        board = Computer.selectNewBoard(gameBoard);
                        move = Computer.takeTurn(gameBoard.boards[board]);
                    }
                                        
                    gameBoard.boards[board].square[move].setText("o");
                    Effects.changeFontToBlue(gameBoard.boards[board].square[move]);
                    
                    Computer.updateLastBoard(board);
                    Computer.updateLastMove(move);
                    Computer.checkWin(gameBoard.boards[board]);
                    
                }
            }  
        });
        
        //square[1].setForeground(Color.red);
        //square[1].setOpaque(true);
        
        /*square[1].setBackground(Color.red);
        square[1].setOpaque(true);
        square[1].setBorderPainted(false);*/
        
        for (int i = 0; i < 9; i++)
            panel.add(square[i]);
        
        
        panel.setLayout(new GridLayout(3,3));
        
        //window.add(this.board);

        //window.setSize(300,300);  
        //window.setVisible(true); 
        
        panel.setSize(300,300);  
        panel.setVisible(true); 
        panel.setBorder(BorderFactory.createLineBorder(Color.black));

        
    }
    
    JPanel getTicTacToeBoard(){
        return this.panel;
    }
    
    boolean isMoveValid(int move){
        if (this.square[move].getText().equals(""))
            return true;
        return false;
    }
    
    boolean getIsValid(){
        return isValid;
    }
    
    void setIsValid(boolean b){
        this.isValid = b;
    }
    
    boolean isWonByPlayer()
    {
        return this.wonByPlayer;
    }
    
    boolean isWonByComputer(){
        return this.wonByComputer;
    }
    
    void setWonByComputer(boolean b){
        this.wonByComputer = b;
    }
    
    void setWonByPlayer(boolean b){
        this.wonByPlayer = b;
    }
    
    void playerWinsBoard(){
        
        boolean flag = false;
        for (int i = 0; i < 9; i+=3)
            if (square[i].getText() == "x" && square[i+1].getText() == "x" && square[i+2].getText() == "x"){
                flag = true;
                Effects.playerWinEffect(square[i], square[i+1], square[i+2]);
            }
        for (int i = 0; i < 3; i++)
            if (square[i].getText() == "x" && square[i+3].getText() == "x" && square[i+6].getText() == "x")
                flag = true;
        
        if (square[0].getText() == "x" && square[4].getText() == "x" && square[8].getText() == "x")
            flag = true;
        if (square[2].getText() == "x" && square[4].getText() == "x" && square[6].getText() == "x")
            flag = true;
    }
    
}
