package org.example.app.controller;


import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.example.app.dao.PatrimonioDAO;
import org.example.app.model.Patrimonio;

public class PatrimonioController {

    @FXML
    private TextField txtNumeroPatrimonio, txtNomeItem, txtTipo, txtPreco, txtSetor;
    @FXML
    private TableView<Patrimonio> tabelaPatrimonios;
    @FXML
    private TableColumn<Patrimonio, String> colNumeroPatrimonio, colNomeItem, colTipo, colSetor;
    @FXML
    private TableColumn<Patrimonio, Double> colPreco;
    @FXML
    private TableColumn<Patrimonio, Integer> colId;

    private final PatrimonioDAO dao = new PatrimonioDAO();

    @FXML
    public void handleCadastrar() {
        Patrimonio p = new Patrimonio(0,
                txtNumeroPatrimonio.getText(),
                "SERIE",
                txtNomeItem.getText(),
                "COD",
                txtTipo.getText(),
                Double.parseDouble(txtPreco.getText()),
                "LOJA MDF",
                txtSetor.getText(),
                "2025-07-14",
                "Novo",
                "Sem observações"
        );
        dao.cadastrar(p);
        limparCampos();
        handleConsultar();
    }

    @FXML
    public void handleConsultar() {
        ObservableList<Patrimonio> dados = FXCollections.observableArrayList(dao.listar());
        tabelaPatrimonios.setItems(dados);
    }

    private void limparCampos() {
        txtNumeroPatrimonio.clear();
        txtNomeItem.clear();
        txtTipo.clear();
    }
}