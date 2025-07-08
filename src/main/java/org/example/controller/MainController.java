package org.example.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;




public class MainController {
    @FXML
    private void handleCadastrar(ActionEvent event) {
        System.out.println("Clicou em Cadastrar Produto");
    }

    @FXML
    private void handleConsultar(ActionEvent event) {
        System.out.println("Clicou em Consultar Produto");
    }

    @FXML
    private void handleExit(ActionEvent event) {
        System.out.println("Saindo...");
        System.exit(0);
    }
}
