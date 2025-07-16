package org.example.app.controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainController {
    public void abrirTelaCadastroPatrimonio() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/org/example/view/CadastroPatrimonio.fxml"));
            Scene scene = new Scene(loader.load());
            Stage stage = new Stage();
            stage.setTitle("Cadastro de Patrimônio");
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void handleCadastrar() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/org/example/app/view/CadastroPatrimonio.fxml"));
            Stage stage = new Stage();
            stage.setScene(new Scene(loader.load()));
            stage.setTitle("Cadastro de Patrimônio");
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void handleConsultar() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/org/example/view/ConsultaPatrimonio.fxml"));
            Scene scene = new Scene(loader.load());
            Stage stage = new Stage();
            stage.setTitle("Consulta de Patrimônio");
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}
