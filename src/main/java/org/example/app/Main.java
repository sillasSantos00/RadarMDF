package org.example.app;

import org.example.controller.ProdutoController;
import org.example.opcao.Opcao;
import org.example.view.MenuView;

import javax.swing.*;




public class Main {
    public static void main(String[] args) {
        ProdutoController controller = new ProdutoController();

        while (true) {
            Opcao Opcaoselecionada = MenuView.selecionarOpcao();

            if (Opcaoselecionada == Opcao.ENCERRAR_SISTEMA) {
                JOptionPane.showMessageDialog(null, "Sistema encerrado.");
                break;
            }else if (Opcaoselecionada == Opcao.CADASTRAR_PRODUTO) {
                controller.cadastrarProduto();
            }
        }
    }
}




