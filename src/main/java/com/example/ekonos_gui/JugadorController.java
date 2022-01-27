package com.example.ekonos_gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import com.example.ekonos_logica.Missatges.Errors;

import java.io.IOException;

public class JugadorController {

    @FXML
    public TextField nomJug3;
    @FXML
    public TextField nomJug4;
    @FXML
    public TextField nomJug5;
    @FXML
    public Label numJug3;
    @FXML
    public Label numJug4;
    @FXML
    public Label numJug5;
    private Stage stage;
    private Scene scene;
    private Parent root;
    static int numJugadorActuals = 2;

    @FXML
    protected void switchToMainScene(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Joc.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void switchToTutorialScene(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Tutorial.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void afegirJugador(ActionEvent event) {
        switch (numJugadorActuals) {
            case 3:
                numJug3.setVisible(true);
                numJug3.setText("3");
                nomJug3.setVisible(true);

                break;
            case 4:
                numJug4.setVisible(true);
                numJug4.setText("4");
                nomJug4.setVisible(true);

                break;
            case 5:
                numJug5.setVisible(true);
                numJug5.setText("5");
                nomJug5.setVisible(true);

                break;
            default:

                com.example.ekonos_logica.Missatges.Errors.errorCrearJugadors6();
                break;

        }
        if (numJugadorActuals < 5) {
            System.out.println("ANTES AÑADIR "+numJugadorActuals);
            numJugadorActuals++;
            System.out.println("DESPUES AÑADIR "+numJugadorActuals);

        }
    }

    @FXML
    protected void borrarJugador(ActionEvent event) {
        switch (numJugadorActuals) {
            case 3:
                numJug3.setVisible(false);
                numJug3.setText("");
                nomJug3.setVisible(false);
                nomJug3.setText("");

                break;
            case 4:
                numJug4.setVisible(false);
                numJug4.setText("");
                nomJug4.setVisible(false);
                nomJug4.setText("");
                break;
            case 5:
                numJug5.setVisible(false);
                numJug5.setText("");
                nomJug5.setVisible(false);
                nomJug5.setText("");
                break;
            default:
                com.example.ekonos_logica.Missatges.Errors.errorCrearJugadors3();
                break;
        }
        if (numJugadorActuals > 2) {
            System.out.println("ANTES DIMINUIR" + numJugadorActuals);
            numJugadorActuals--;
            System.out.println("DESPUES DIMINUIR" + numJugadorActuals);

        }
    }
}