package org.example.app.view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApp extends Application{
    public void start (Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/org/example/view/MainView.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Radar MDF");
        stage.getIcons().add(new Image("/org/example/imagens/logo.png"));
        scene.getStylesheets().add(getClass().getResource("/org/example/css/estilo.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
    }
    public static void main (String [] args) {

    }
}
