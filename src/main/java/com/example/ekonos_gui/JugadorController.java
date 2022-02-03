package com.example.ekonos_gui;

import com.example.ekonos_logica.Main.Baralla;
import com.example.ekonos_logica.Main.Empresa;
import com.example.ekonos_logica.Main.Jugador;
import com.example.ekonos_logica.Main.Tauler;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import com.example.ekonos_logica.Missatges.Errors;

import java.io.IOException;
import java.util.ArrayList;

public class JugadorController {

    public Button butoComencaJoc;
    @FXML
    public TextField nomJug0;
    @FXML
    public TextField nomJug1;
    @FXML
    public TextField nomJug2;
    @FXML
    public TextField nomJug3;
    @FXML
    public TextField nomJug4;
    @FXML
    public TextField nomJug5;
    @FXML
    public Label numJug0;
    @FXML
    public Label numJug1;
    @FXML
    public Label numJug2;
    @FXML
    public Label numJug3;
    @FXML
    public Label numJug4;
    @FXML
    public Label numJug5;
    public Label errorLabel;
    @FXML

    private Stage stage;
    private Scene scene;
    static int numJugadorActuals = 3;

    private boolean compJugadors(TextField nomJug, Label numJug) {
        if (!nomJug.getText().equals("") && !numJug.getText().equals("")) {
            return true;
        } else {
            return false;
        }
    }

    private Jugador crearJug(TextField nomJug, Label numJug) {
        Jugador nouJugador = new Jugador(nomJug.getText(), Integer.parseInt(numJug.getText()));
        return nouJugador;

    }

    @FXML
    protected void startGame(ActionEvent event) throws IOException {

        int contador = 0;
        boolean semaforsjugadors = false;
        if (compJugadors(nomJug0, numJug0)) {
            semaforsjugadors = true;
            contador++;

        } else semaforsjugadors = false;

        if (compJugadors(nomJug1, numJug1)) {
            semaforsjugadors = true;
            contador++;
        } else semaforsjugadors = false;

        if (compJugadors(nomJug2, numJug2)) {
            semaforsjugadors = true;
            contador++;
        } else semaforsjugadors = false;

        if (nomJug3.isVisible() && numJug3.isVisible()) {
            if (compJugadors(nomJug3, numJug3)) {
                semaforsjugadors = true;
                contador++;
            } else semaforsjugadors = false;
        }


        if (nomJug4.isVisible() && numJug4.isVisible()) {
            if (compJugadors(nomJug4, numJug4)) {
                semaforsjugadors = true;
                contador++;
            } else semaforsjugadors = false;
        }


        if (nomJug5.isVisible() && numJug5.isVisible()) {
            if (compJugadors(nomJug5, numJug5)) {
                semaforsjugadors = true;
                contador++;
            } else semaforsjugadors = false;
        }
        ArrayList<Jugador> jugadors = new ArrayList<>();
        if (semaforsjugadors) {
            //CREEM EL JUGAORS I ELS FIQUEM EN LA ARRAYLIST DE JUGADORS
            switch (contador) {
                case 3:
                    jugadors.add(crearJug(nomJug0, numJug0));
                    jugadors.add(crearJug(nomJug1, numJug1));
                    jugadors.add(crearJug(nomJug2, numJug2));
                    break;
                case 4:
                    jugadors.add(crearJug(nomJug0, numJug0));
                    jugadors.add(crearJug(nomJug1, numJug1));
                    jugadors.add(crearJug(nomJug2, numJug2));
                    jugadors.add(crearJug(nomJug3, numJug3));
                    break;
                case 5:
                    jugadors.add(crearJug(nomJug0, numJug0));
                    jugadors.add(crearJug(nomJug1, numJug1));
                    jugadors.add(crearJug(nomJug2, numJug2));
                    jugadors.add(crearJug(nomJug3, numJug3));
                    jugadors.add(crearJug(nomJug4, numJug4));
                    break;
                case 6:
                    jugadors.add(crearJug(nomJug0, numJug0));
                    jugadors.add(crearJug(nomJug1, numJug1));
                    jugadors.add(crearJug(nomJug2, numJug2));
                    jugadors.add(crearJug(nomJug3, numJug3));
                    jugadors.add(crearJug(nomJug4, numJug4));
                    jugadors.add(crearJug(nomJug5, numJug5));
                    break;

                default:
                    errorLabel.setText(com.example.ekonos_logica.Missatges.Errors.errorsCreaJugadors());
                    break;
            }
            Jugador jugadorVuit = new Jugador("Ningu", 4);
            //CRREM TOTES LES EMPRESES I LES FIQUEM A LA ARRAY DE EMPRESES
            ArrayList<Empresa> empresas = new ArrayList();
            Empresa novaEmpresa1 = new Empresa("Alpha", "red");
            empresas.add(novaEmpresa1);
            Empresa novaEmpresa2 = new Empresa("Delta", "green");
            empresas.add(novaEmpresa2);
            Empresa novaEmpresa3 = new Empresa("Beta", "dBlue");
            empresas.add(novaEmpresa3);
            Empresa novaEmpresa4 = new Empresa("Gamma", "lBlue");
            empresas.add(novaEmpresa4);
            Empresa novaEmpresa5 = new Empresa("Omicron", "pink");
            empresas.add(novaEmpresa5);
            Empresa novaEmpresa6 = new Empresa("Epsilon", "yellow");
            empresas.add(novaEmpresa6);
            Empresa empresaVuit = new Empresa("Vuit", "black"); //AQUEST EMPRESA ES PER DIR SI LA CASELLA ESTA DISPONIBLE O NO
            //OMPLIM LA BARALLA
            Baralla baralla = new Baralla();
            baralla.omplirBaralla();
            //POSEM QUE EL PRESIDENT DE LES EMPRESES SIGUI EL JUADOR FANTASMA PER NO TINDRE QUE COMPARA AMB NULLS
            for(int i = 0; i < empresas.size(); i++) {
                empresas.get(i).president = jugadorVuit;
            }
            //CREEM LA TAULA I LI PASEM TOTS EL PARAMETRES QUE FAGI FALTA

            Tauler tauler = new Tauler(baralla, jugadors, empresas, empresaVuit);
            Parent root = FXMLLoader.load(getClass().getResource("Joc.fxml"));


            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

        } else
            errorLabel.setText(com.example.ekonos_logica.Missatges.Errors.errorsCreaJugadors());
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
        if (numJugadorActuals < 6) {
            numJugadorActuals++;
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
            numJugadorActuals--;
        }
    }
}