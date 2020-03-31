/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultimatetictactoe;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

/**
 *
 * @author Noorish Hassan
 */
public class dbConnection {
    Connection con;
    Statement stmt; 
    
    public dbConnection(){
        try{
            String connection = "jdbc:sqlserver://localhost:1433;databaseName=ultimatetictactoe";
            this.con= (Connection) DriverManager.getConnection(connection,"new_user","123");
            this.stmt = (Statement) this.con.createStatement(); 
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
    public void setScores(Player p){
        try{
                String query="insert into scores values(?,?)";
                PreparedStatement preparedStmt = (PreparedStatement) this.con.prepareStatement(query);
                preparedStmt.setString(1,p.getName());
                preparedStmt.setInt(2,p.getScore());
               
                preparedStmt.executeUpdate();
                
                System.out.println("\nYour Score has been saved!");
            }
            catch(Exception e){
                System.out.println(e);
            }
    }
}
