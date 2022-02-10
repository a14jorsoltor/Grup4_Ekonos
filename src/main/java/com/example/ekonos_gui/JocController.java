package com.example.ekonos_gui;

import javafx.event.ActionEvent;

import javafx.scene.control.Button;


public class JocController {


    public Button btCarta00;
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
    ///////////////////////////////
    

    public void clickButo00(ActionEvent event){
        ensenyarTotsBotons();
    }

    public void clickbtME1(ActionEvent actionEvent) {
        btME1.setStyle("-fx-background-color: red");
        amagarTotsBotons();
    }
    public void clickbtME2(ActionEvent actionEvent) {
        btME2.setStyle("-fx-background-color: blue");
        amagarTotsBotons();
    }
    private void amgarBotoEsp(Button buto){
        if (buto.getStyle().equals("")){
            buto.setVisible(false);
        }
    }
    private void ensenyarBotoEsp(Button buto){
        if (!buto.getStyle().equals(null)){
            buto.setVisible(true);
        }
    }

    public void ensenyarTotsBotons(){
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

    public void amagarTotsBotons(){
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
