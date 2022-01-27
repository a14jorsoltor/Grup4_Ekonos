package com.example.ekonos_gui;

import com.example.ekonos_logica.Missatges.GUI;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class TutorialController {
    public Button infoJoc;
    public Button infoCartes;
    public Button infoTorn;
    public Button infoPresidencia;
    public Label infoText;
    public Label titolnfo;



    private Stage stage;
    private Scene scene;




    @FXML
    protected void switchToJugadorScene(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("MenuJugadors.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    protected void onCLickInformacioJoc(ActionEvent event){

        titolnfo.setText("Informacio Joc");
        infoText.setStyle("-fx-font: 20 system");
        infoText.setText(GUI.TutorialJoc());
    }


    public void onCLickInformacioCartes(ActionEvent actionEvent) {
        titolnfo.setText("Informacio Cartes");
        infoText.setStyle("-fx-font: 17 system");
        infoText.setText(GUI.TutorialCarta());

    }

    public void onCLickInformacioTorn(ActionEvent actionEvent) {
        titolnfo.setText("Informacio Torn");
        infoText.setStyle("-fx-font: 14 system");
        infoText.setText(GUI.turnJoc());
    }

    public void onCLickInformacioPresicencia(ActionEvent actionEvent) {
        titolnfo.setText("Informacio Presidencia");
        infoText.setStyle("-fx-font: 15 system");
        infoText.setText(GUI.infoPresidencia());
    }

    public void onCLickInformacioPuntuacio(ActionEvent actionEvent) {
        titolnfo.setText("Informacio Puntuacio");
        infoText.setStyle("-fx-font: 14 system");
        infoText.setText(GUI.infoPuntuacio());
    }
}
