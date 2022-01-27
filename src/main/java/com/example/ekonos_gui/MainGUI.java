package com.example.ekonos_gui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainGUI extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader menuJugLoader = new FXMLLoader(MainGUI.class.getResource("MenuJugadors.fxml"));
        Scene sceneJugadors = new Scene(menuJugLoader.load(), 900, 510);
        stage.setTitle("EKONNOS");
        stage.setScene(sceneJugadors);
        stage.setResizable(false);
        stage.show();


    }

    public static void main(String[] args) {
        launch();
    }
}