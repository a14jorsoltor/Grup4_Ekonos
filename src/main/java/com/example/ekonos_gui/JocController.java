package com.example.ekonos_gui;

import javafx.event.ActionEvent;

import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;


public class JocController {
    public Button btcomenccarParitda;
    public Label lblTurnActual;
    public Button btPassarTorn;
    Tauler tauler;
    String colorActual;

    ////BOTONES MAPA////
    public Button btME1;
    public Button btME2;
    public Button btME3;
    public Button btME4;
    public Button btME5;
    public Button btME6;
    public Button btME7;
    public Button btME8;
    public Button btME9;
    public Button btME10;
    public Button btME11;
    public Button btME12;
    public Button btME13;
    public Button btME14;
    public Button btME15;
    public Button btME16;
    public Button btME17;
    public Button btME31;
    public Button btME36;
    public Button btME24;
    public Button btME30;
    public Button btME23;
    public Button btME22;
    public Button btME21;
    public Button btME20;
    public Button btME19;
    public Button btME18;
    public Button btME32;
    public Button btME33;
    public Button btME25;
    public Button btME26;
    public Button btME27;
    public Button btME34;
    public Button btME28;
    public Button btME29;
    public Button btME35;
    ////////////////////////
    /////BOTONES CARTAS////
    public Button btCarta00;
    public Button btCarta01;
    public Button btCarta02;
    public Button btCarta10;
    public Button btCarta11;
    public Button btCarta12;
    public Button btCarta20;
    public Button btCarta21;
    public Button btCarta22;
    public Button btCarta30;
    public Button btCarta31;
    public Button btCarta32;
    public Button btCarta40;
    public Button btCarta41;
    public Button btCarta42;
    public Button btCarta50;
    public Button btCarta51;
    public Button btCarta52;

    ////OMPLIR LA MA///////
    public void omplirMa() {
        //CARTA1
        btCarta00.setStyle("-fx-background-color: " + tauler.jugadors.get(contTurn).ma.get(0).getF1());
        btCarta01.setStyle("-fx-background-color: " + tauler.jugadors.get(contTurn).ma.get(0).getF2());
        btCarta02.setStyle("-fx-background-color: " + tauler.jugadors.get(contTurn).ma.get(0).getF3());
        //CARTA2
        btCarta10.setStyle("-fx-background-color: " + tauler.jugadors.get(contTurn).ma.get(1).getF1());
        btCarta11.setStyle("-fx-background-color: " + tauler.jugadors.get(contTurn).ma.get(1).getF2());
        btCarta12.setStyle("-fx-background-color: " + tauler.jugadors.get(contTurn).ma.get(1).getF3());
        //CARTA3
        btCarta20.setStyle("-fx-background-color: " + tauler.jugadors.get(contTurn).ma.get(2).getF1());
        btCarta21.setStyle("-fx-background-color: " + tauler.jugadors.get(contTurn).ma.get(2).getF2());
        btCarta22.setStyle("-fx-background-color: " + tauler.jugadors.get(contTurn).ma.get(2).getF3());
        //CARTA4
        btCarta30.setStyle("-fx-background-color: " + tauler.jugadors.get(contTurn).ma.get(3).getF1());
        btCarta31.setStyle("-fx-background-color: " + tauler.jugadors.get(contTurn).ma.get(3).getF2());
        btCarta32.setStyle("-fx-background-color: " + tauler.jugadors.get(contTurn).ma.get(3).getF3());
        //CARTA5
        btCarta40.setStyle("-fx-background-color: " + tauler.jugadors.get(contTurn).ma.get(4).getF1());
        btCarta41.setStyle("-fx-background-color: " + tauler.jugadors.get(contTurn).ma.get(4).getF2());
        btCarta42.setStyle("-fx-background-color: " + tauler.jugadors.get(contTurn).ma.get(4).getF3());
        //CARTA6
        btCarta50.setStyle("-fx-background-color: " + tauler.jugadors.get(contTurn).ma.get(5).getF1());
        btCarta51.setStyle("-fx-background-color: " + tauler.jugadors.get(contTurn).ma.get(5).getF2());
        btCarta52.setStyle("-fx-background-color: " + tauler.jugadors.get(contTurn).ma.get(5).getF3());
    }
    ///////////////////////////////
    public void recivirData(ActionEvent event) throws Exception {
        Node node = (Node) event.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        Tauler tauler = (Tauler) stage.getUserData();
        this.tauler = tauler;
        btcomenccarParitda.setVisible(false);
        btPassarTorn.setVisible(true);
        lblTurnActual.setText("Torn de: " + this.tauler.jugadors.get(0).getNom());
        omplirMa();
    }

    ////////////////////////////////

    public void clickButo00(ActionEvent event) {
        colorActual = tauler.jugadors.get(contTurn).ma.get(0).getF1();
        ensenyarTotsBotons();
    }
    public void clickButo10(ActionEvent event) {
        colorActual = tauler.jugadors.get(contTurn).ma.get(1).getF1();
        ensenyarTotsBotons();
    }
    public void clickButo20(ActionEvent event) {
        colorActual = tauler.jugadors.get(contTurn).ma.get(2).getF1();
        ensenyarTotsBotons();
    }
    public void clickButo30(ActionEvent event) {
        colorActual = tauler.jugadors.get(contTurn).ma.get(3).getF1();
        ensenyarTotsBotons();
    }
    public void clickButo40(ActionEvent event) {
        colorActual = tauler.jugadors.get(contTurn).ma.get(4).getF1();
        ensenyarTotsBotons();
    }
    public void clickButo50(ActionEvent event) {
        colorActual = tauler.jugadors.get(contTurn).ma.get(5).getF1();
        ensenyarTotsBotons();
    }



    public void clickbtME1(ActionEvent actionEvent) {
        clickbt(btME1);
        amagarTotsBotons();
    }
    public void clickbtME2(ActionEvent actionEvent) {
        clickbt(btME2);
        amagarTotsBotons();
    }
    public void clickbtME3(ActionEvent actionEvent) {
        clickbt(btME3);
        amagarTotsBotons();
    }
    public void clickbtME4(ActionEvent actionEvent) {
        clickbt(btME4);
        amagarTotsBotons();
    }
    public void clickbtME5(ActionEvent actionEvent) {
        clickbt(btME5);
        amagarTotsBotons();
    }
    public void clickbtME6(ActionEvent actionEvent) {
        clickbt(btME6);
        amagarTotsBotons();
    }
    public void clickbtME7(ActionEvent actionEvent) {
        clickbt(btME7);
        amagarTotsBotons();
    }
    public void clickbtME8(ActionEvent actionEvent) {
        clickbt(btME8);
        amagarTotsBotons();
    }
    public void clickbtME9(ActionEvent actionEvent) {
        clickbt(btME9);
        amagarTotsBotons();
    }
    public void clickbtME10(ActionEvent actionEvent) {
        clickbt(btME10);
        amagarTotsBotons();
    }
    public void clickbtME11(ActionEvent actionEvent) {
        clickbt(btME11);
        amagarTotsBotons();
    }
    public void clickbtME12(ActionEvent actionEvent) {
        clickbt(btME12);
        amagarTotsBotons();
    }
    public void clickbtME13(ActionEvent actionEvent) {
        clickbt(btME13);
        amagarTotsBotons();
    }
    public void clickbtME14(ActionEvent actionEvent) {
        clickbt(btME14);
        amagarTotsBotons();
    }
    public void clickbtME15(ActionEvent actionEvent) {
        clickbt(btME15);
        amagarTotsBotons();
    }
    public void clickbtME16(ActionEvent actionEvent) {
        clickbt(btME16);
        amagarTotsBotons();
    }
    public void clickbtME17(ActionEvent actionEvent) {
        clickbt(btME17);
        amagarTotsBotons();
    }
    public void clickbtME18(ActionEvent actionEvent) {
        clickbt(btME18);
        amagarTotsBotons();
    }
    public void clickbtME19(ActionEvent actionEvent) {
        clickbt(btME19);
        amagarTotsBotons();
    }
    public void clickbtME20(ActionEvent actionEvent) {
        clickbt(btME20);
        amagarTotsBotons();
    }
    public void clickbtME21(ActionEvent actionEvent) {
        clickbt(btME21);
        amagarTotsBotons();
    }
    public void clickbtME22(ActionEvent actionEvent) {
        clickbt(btME22);
        amagarTotsBotons();
    }
    public void clickbtME23(ActionEvent actionEvent) {
        clickbt(btME23);
        amagarTotsBotons();
    }
    public void clickbtME24(ActionEvent actionEvent) {
        clickbt(btME24);
        amagarTotsBotons();
    }
    public void clickbtME25(ActionEvent actionEvent) {
        clickbt(btME25);
        amagarTotsBotons();
    }
    public void clickbtME26(ActionEvent actionEvent) {
        clickbt(btME26);
        amagarTotsBotons();
    }
    public void clickbtME27(ActionEvent actionEvent) {
        clickbt(btME27);
        amagarTotsBotons();
    }
    public void clickbtME28(ActionEvent actionEvent) {
        clickbt(btME28);
        amagarTotsBotons();
    }
    public void clickbtME29(ActionEvent actionEvent) {
        clickbt(btME29);
        amagarTotsBotons();
    }
    public void clickbtME30(ActionEvent actionEvent) {
        clickbt(btME30);
        amagarTotsBotons();
    }
    public void clickbtME31(ActionEvent actionEvent) {
        clickbt(btME31);
        amagarTotsBotons();
    }
    public void clickbtME32(ActionEvent actionEvent) {
        clickbt(btME32);
        amagarTotsBotons();
    }
    public void clickbtME33(ActionEvent actionEvent) {
        clickbt(btME33);
        amagarTotsBotons();
    }
    public void clickbtME34(ActionEvent actionEvent) {
        clickbt(btME34);
        amagarTotsBotons();
    }
    public void clickbtME35(ActionEvent actionEvent) {
        clickbt(btME35);
        amagarTotsBotons();
    }
    public void clickbtME36(ActionEvent actionEvent) {
        clickbt(btME36);
        amagarTotsBotons();
    }


   private  void clickbt(Button buto){
        buto.setStyle("-fx-background-color: " + colorActual);
        amagarTotsBotons();
    }


    private void amgarBotoEsp(Button buto) {
        if (buto.getStyle().equals("")) {
            buto.setVisible(false);
        }
    }

    private void ensenyarBotoEsp(Button buto) {
        if (!buto.getStyle().equals(null)) {
            buto.setVisible(true);
        }
    }


    int contTurn = 0;
    public void passarTorn(ActionEvent actionEvent) {
        contTurn=++contTurn%tauler.jugadors.size();
        omplirMa();
        lblTurnActual.setText("Torn de: " + this.tauler.jugadors.get(contTurn).getNom());
    }




    public void ensenyarTotsBotons() {
        ensenyarBotoEsp(btME1);
        ensenyarBotoEsp(btME2);
        ensenyarBotoEsp(btME3);
        ensenyarBotoEsp(btME4);
        ensenyarBotoEsp(btME5);
        ensenyarBotoEsp(btME6);
        ensenyarBotoEsp(btME7);
        ensenyarBotoEsp(btME8);
        ensenyarBotoEsp(btME9);
        ensenyarBotoEsp(btME10);
        ensenyarBotoEsp(btME11);
        ensenyarBotoEsp(btME12);
        ensenyarBotoEsp(btME13);
        ensenyarBotoEsp(btME14);
        ensenyarBotoEsp(btME15);
        ensenyarBotoEsp(btME16);
        ensenyarBotoEsp(btME17);
        ensenyarBotoEsp(btME18);
        ensenyarBotoEsp(btME19);
        ensenyarBotoEsp(btME20);
        ensenyarBotoEsp(btME21);
        ensenyarBotoEsp(btME22);
        ensenyarBotoEsp(btME23);
        ensenyarBotoEsp(btME24);
        ensenyarBotoEsp(btME25);
        ensenyarBotoEsp(btME26);
        ensenyarBotoEsp(btME27);
        ensenyarBotoEsp(btME28);
        ensenyarBotoEsp(btME29);
        ensenyarBotoEsp(btME30);
        ensenyarBotoEsp(btME31);
        ensenyarBotoEsp(btME32);
        ensenyarBotoEsp(btME33);
        ensenyarBotoEsp(btME34);
        ensenyarBotoEsp(btME35);
        ensenyarBotoEsp(btME36);


    }

    public void amagarTotsBotons() {
        amgarBotoEsp(btME1);
        amgarBotoEsp(btME2);
        amgarBotoEsp(btME3);
        amgarBotoEsp(btME4);
        amgarBotoEsp(btME5);
        amgarBotoEsp(btME6);
        amgarBotoEsp(btME7);
        amgarBotoEsp(btME8);
        amgarBotoEsp(btME9);
        amgarBotoEsp(btME10);
        amgarBotoEsp(btME11);
        amgarBotoEsp(btME12);
        amgarBotoEsp(btME13);
        amgarBotoEsp(btME14);
        amgarBotoEsp(btME15);
        amgarBotoEsp(btME16);
        amgarBotoEsp(btME17);
        amgarBotoEsp(btME18);
        amgarBotoEsp(btME19);
        amgarBotoEsp(btME20);
        amgarBotoEsp(btME21);
        amgarBotoEsp(btME22);
        amgarBotoEsp(btME23);
        amgarBotoEsp(btME24);
        amgarBotoEsp(btME25);
        amgarBotoEsp(btME26);
        amgarBotoEsp(btME27);
        amgarBotoEsp(btME28);
        amgarBotoEsp(btME29);
        amgarBotoEsp(btME30);
        amgarBotoEsp(btME31);
        amgarBotoEsp(btME32);
        amgarBotoEsp(btME33);
        amgarBotoEsp(btME34);
        amgarBotoEsp(btME35);
        amgarBotoEsp(btME36);


    }



}