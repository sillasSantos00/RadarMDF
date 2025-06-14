package org.example.dataBase;

import org.example.parametros.Parametros;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionFactory {
    private ConnectionFactory() {
    }
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(
                Parametros.DB_URL,
                Parametros.DB_USER,
                Parametros.DB_PASSWORD
        );
    }
}
