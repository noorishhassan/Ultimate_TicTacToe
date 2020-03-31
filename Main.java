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
public class Main {

    /**
     * @param args the command line arguments
     */
    
    public static void wait(int ms){
        try
        {
            Thread.sleep(ms);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        UltimateTicTacToe t = new UltimateTicTacToe();
        //TicTacToeBoard b = new TicTacToeBoard();
        

    }
    
}
