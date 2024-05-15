/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bookstore;
import java.sql.*;

/**
 *
 * @author dell2
 */
public class Bookstore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Connection connection = DBConnection.getInstance();
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true);
            }
        });
    }
    
}
