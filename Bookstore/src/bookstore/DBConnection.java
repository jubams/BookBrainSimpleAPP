package bookstore;

import java.sql.*;

public class DBConnection {
    
    private static Connection connection;

    
    private DBConnection() {
    }

    
    public static Connection getInstance() {
        if (connection == null) {
            synchronized (DBConnection.class) {
                if (connection == null) {
                    connection = connectBookStore();
                }
            }
        }
        return connection;
    }

    
    private static Connection connectBookStore() {
        try {
            Class.forName("org.sqlite.JDBC");
            Connection con = DriverManager.getConnection("jdbc:sqlite:college.db");
            System.out.println("Connected");
            return con;
        } catch (Exception e) {
            System.out.println("Connection failed");
            e.printStackTrace();
            return null;
        }
    }
}
