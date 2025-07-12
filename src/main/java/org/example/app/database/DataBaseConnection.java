package org.example.app.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection {
    public static Connection connection() {
        String url = "jdbc:mysql://localhost:3306/radarmdf";
        String user = "root";
        String password = "";
        try {
            return DriverManager.getConnection(url,user,password);
        }catch (SQLException e) {
            System.out.println("erro na comneccao" + e.getMessage());

            return null;
        }
    }
}
