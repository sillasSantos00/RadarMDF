package org.example.controller;

import org.example.dao.ProdutoDAO;
import org.example.model.Produto;

import javax.swing.*;

public class ProdutoController {
    public void cadastrarProduto() {
            String nome = JOptionPane.showInputDialog(null, "digite o nome do produto");
            if (nome == null || nome.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "nome invalido ");
                return;
            }

            String descricao = JOptionPane.showInputDialog(null, "digite a descricao");
            if (descricao == null || descricao.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "descricao invalida");
                return;
            }

        Produto produto = new Produto(nome, descricao, descricao, quantidade);
        boolean sucesso = ProdutoDAO.salvar(produto);

        if (sucesso) {
            JOptionPane.showInputDialog(null, "produto cadastrado com sucesso");
        }else {
            JOptionPane.showInputDialog(null, "erro ao cadastrar o produto");
        }
    }
}
