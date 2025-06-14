package org.example.insertFactory;

import org.example.connectionFactory.ConnectionFactory;
import org.example.parametros.Parametros;
import org.example.produtos.Produtos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class insert1 implements Parametros {

    @Override
    public Produtos save (Produtos produtos) {
            String sql = "INSERT INTO produtos (nome, descricao, preco, quantidade) VALUES (?, ?, ?, ?)";

            try (Connection connection = ConnectionFactory.getConnection();
                 PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

                preparedStatement.setString(1, produtos.getNome());
                preparedStatement.setString(2, produtos.getDescricao());
                preparedStatement.setBigDecimal(3, produtos.getPreco());
                preparedStatement.setInt(4, produtos.getQuantidade());

                preparedStatement.executeUpdate();

            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
            return produtos;
        }

    }
