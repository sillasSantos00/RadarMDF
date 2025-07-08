package org.example.app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;




import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage) {
        stage.setScene(new Scene(new Label("JavaFX funcionando!"), 400, 200));
        stage.setTitle("Teste");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
