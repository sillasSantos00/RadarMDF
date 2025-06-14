package org.example.dao;

import org.example.dataBase.ConnectionFactory;
import org.example.model.Produto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProdutoDAO  {

    public static Produto save (Produto produto) {
            String sql = "INSERT INTO produtos (nome, descricao, quantidade) VALUES (?, ?, ?)";

            try (Connection connection = ConnectionFactory.getConnection();
                 PreparedStatement stmt = connection.prepareStatement(sql)) {

                stmt.setString(1, produto.getNome());
                stmt.setString(2, produto.getDescricao());
                stmt.setInt(3, produto.getQuantidade());

                int resultado = stmt.executeUpdate();

            } catch (SQLException ex) {
                throw new RuntimeException("ERRO AO SALVAR PRODUTO " + ex.getMessage(), ex);
            }
            return produto;
        }

    }
