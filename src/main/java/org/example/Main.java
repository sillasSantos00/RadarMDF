package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage) { //janela principa
        Button botao = new Button("clique aqui");  //new Button("Clique aqui!"): cria o botão com esse texto..setOnAction(...): define o que acontece quando clicam — aqui, imprime no console.
        botao.setOnAction(e -> System.out.println("voce clicou"));

        StackPane root = new StackPane(botao);  //centraliza elementos; o botão fica no meio.
        Scene scene = new Scene(root, 300, 200); //define o que aparece na janela e o tamanho (300x200 pixels).

        stage.setTitle("teste java"); //titulo da janela
        stage.setScene(scene); // aplica o laiut a janela
        stage.show(); //mostra a janela na tela
    }
    public static void main (String [] args) {
        launch(args);
        //launch(args) inicia a aplicação JavaFX — e chama o método start(...) automaticamente.
    }
}
