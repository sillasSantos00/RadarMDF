package org.example.aMain;

import org.example.connectionFactory.ConnectionFactory;
import org.example.opcao.Opcao;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import static org.example.opcaovisu.MenuView.select;

public class Main {
    public static void main(String[] args) {
        while (true) {
            Opcao Opcaoselecionada = select();

            if (Opcaoselecionada == Opcao.ENCERRAR_SISTEMA) {
                JOptionPane.showMessageDialog(null, "Sistema encerrado.");
                break;
            }
            if (Opcaoselecionada == Opcao.CADASTRAR_PRODUTO) {
                cadastrarProduto();
            }
        }

    }

    public static Opcao select() {
        Opcao ret = (Opcao) JOptionPane.showInputDialog(
                null,
                "selecione uma opcao,",
                "menu,",
                JOptionPane.QUESTION_MESSAGE,
                null,
                Opcao.values(),
                Opcao.CADASTRAR_PRODUTO

        );
        return ret != null ? ret : Opcao.ENCERRAR_SISTEMA;
    }

    public static void cadastrarProduto() {
        String nome = JOptionPane.showInputDialog(null, "digite o nome do produto");
        if (nome == null || nome.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "nome invalido invalido");
            return;
        }

        String descricao = JOptionPane.showInputDialog(null, "digite a descricao");
        if (descricao == null || descricao.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "nome invalido");
            return;
        }
        try (Connection conn = ConnectionFactory.getConnection()) {
            String sql = "INSERT INTO produtos (nome, descricao) VALUES (?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, nome);
            stmt.setString(2, descricao);

            int resultado = stmt.executeUpdate();
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "produto cadastrado");
            } else {
                JOptionPane.showMessageDialog(null, "erro ao cadastrar");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "erro ao conectar ou inserir" + e.getMessage());
        }
    }
}




