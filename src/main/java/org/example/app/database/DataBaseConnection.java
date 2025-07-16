package org.example.app.database;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataBaseConnection {
    public static Connection connect() {
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/patrimonio_mdf", "root", "123321");
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
