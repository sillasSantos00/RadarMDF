package org.example.connectionFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionFactory {
    private ConnectionFactory() {
    }

    public static Connection getConnection() {
        try {
            // Carrega o driver MySQL explicitamente
            Class.forName("com.mysql.cj.jdbc.Driver");

            return DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/RadarMDF?useTimezone=true&serverTimezone=UTC",
                    "root",
                    "123321"
            );

        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Driver MySQL não encontrado", e);
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao tentar se conectar ao banco de dados", ex);
        }
    }
}
