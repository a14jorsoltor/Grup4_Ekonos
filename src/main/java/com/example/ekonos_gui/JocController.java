package com.example.ekonos_gui;

import javafx.event.ActionEvent;

import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.util.Optional;


public class JocController {

    ///////////////////////////////////////
    //////////////VARIABLES////////////////
    ///////////////////////////////////////
    public Label lblTokens;
    public Button EpsilonP;
    public Button EpsilonM;
    public Button OmicronM;
    public Button OmicronP;
    public Button GamaP;
    public Button GamaM;
    public Button BetaM;
    public Button DeltaP;
    public Button DeltaM;
    public Button AlphaP;
    public Button AlphaM;
    public Button BetaP;
    public Label totalAlpha;
    public Label propiesAlpha;
    public Label totalDelta;
    public Label propiesDelta;
    public Label totalBeta;
    public Label propiesBeta;
    public Label totalGama;
    public Label propiesGama;
    public Label totalOmicron;
    public Label totalEpsilon;
    public Label propiesEpsilon;
    public Label propiesOmicron;

    int contTurn = 0;
    public Button btcomenccarParitda;
    public Label lblTurnActual;
    public Button btPassarTorn;
    //LABELS AVANZAMENT//
    //LABELS ALPHA//
    public Label lblAlpha01;
    public Label lblAlpha02;
    public Label lblAlpha03;
    public Label lblAlpha04;
    public Label lblAlpha05;
    public Label lblAlpha06;
    public Label lblAlpha07;
    //LABELS DELTA//
    public Label lblDelta01;
    public Label lblDelta02;
    public Label lblDelta03;
    public Label lblDelta04;
    public Label lblDelta05;
    public Label lblDelta06;
    public Label lblDelta07;
    //LABELS BETA//
    public Label lblBetaA01;
    public Label lblBetaA02;
    public Label lblBetaA03;
    public Label lblBetaA04;
    public Label lblBetaA05;
    public Label lblBetaA06;
    public Label lblBetaA07;
    //LABELS GAMMA//
    public Label lblGama01;
    public Label lblGama02;
    public Label lblGama03;
    public Label lblGama04;
    public Label lblGama05;
    public Label lblGama06;
    public Label lblGama07;
    //LABELS OMICRON//
    public Label lblOmicron01;
    public Label lblOmicron02;
    public Label lblOmicron03;
    public Label lblOmicron04;
    public Label lblOmicron05;
    public Label lblOmicron06;
    public Label lblOmicron07;
    //LABELS EPSILON//
    public Label lblEpsilon01;
    public Label lblEpsilon02;
    public Label lblEpsilon03;
    public Label lblEpsilon04;
    public Label lblEpsilon05;
    public Label lblEpsilon06;
    public Label lblEpsilon07;


    TaulerGUI tauler;
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
    ///CARTA 1///
    public Button btCarta00;
    public Button btCarta01;
    public Button btCarta02;
    ///CARTA 2///
    public Button btCarta10;
    public Button btCarta11;
    public Button btCarta12;
    ///CARTA 3///
    public Button btCarta20;
    public Button btCarta21;
    public Button btCarta22;
    ///CARTA 4///
    public Button btCarta30;
    public Button btCarta31;
    public Button btCarta32;
    ///CARTA 5///
    public Button btCarta40;
    public Button btCarta41;
    public Button btCarta42;
    ///CARTA 6///
    public Button btCarta50;
    public Button btCarta51;
    public Button btCarta52;

    Alert alertConfirmacio = new Alert(Alert.AlertType.CONFIRMATION);
    Alert alertError = new Alert(Alert.AlertType.ERROR);

    int contAvanAlpha = 1;
    int contAvanDelta = 1;
    int contAvanBeta = 1;
    int contAvanGamma = 1;
    int contAvanPink = 1;
    int contAvanYellow = 1;


    ///////////////////////////////////////
    //////////////VARIABLES////////////////
    ///////////////////////////////////////


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
        if (tauler.jugadors.size() != 5) {
            btCarta50.setStyle("-fx-background-color: " + tauler.jugadors.get(contTurn).ma.get(5).getF1());
            btCarta51.setStyle("-fx-background-color: " + tauler.jugadors.get(contTurn).ma.get(5).getF2());
            btCarta52.setStyle("-fx-background-color: " + tauler.jugadors.get(contTurn).ma.get(5).getF3());
        } else if (tauler.jugadors.size() == 5) {
            btCarta50.setVisible(false);
            btCarta51.setVisible(false);
            btCarta52.setVisible(false);
        }
        lblTokens.setText("Tokens: " + tauler.jugadors.get(contTurn).getTokens());
    }

    ///////////////////////////////
    public void recivirData(ActionEvent event) throws Exception {
        Node node = (Node) event.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        TaulerGUI tauler = (TaulerGUI) stage.getUserData();
        this.tauler = tauler;
        btcomenccarParitda.setVisible(false);
        btPassarTorn.setVisible(true);
        lblTurnActual.setText("Torn de: " + this.tauler.jugadors.get(0).getNom());
        omplirMa();
    }


    ///////////////////////////////////////
    ////////////CLICK CARTA F1/////////////
    ///////////////////////////////////////


    ////////////////////////////////
    ////////////////////////////////
    public void clickButo00(ActionEvent event) {
        colorActual = tauler.jugadors.get(contTurn).ma.get(0).getF1();
        ensenyarTotsBotons();
    }

    public void clickButo01(ActionEvent event) {
        colorActual = tauler.jugadors.get(contTurn).ma.get(0).getF2();
        avancar(colorActual);
    }

    public void clickButo02(ActionEvent event) {
        colorActual = tauler.jugadors.get(contTurn).ma.get(0).getF3();
        avancar(colorActual);
    }

    ////////////////////////////////
    ////////////////////////////////
    public void clickButo10(ActionEvent event) {
        colorActual = tauler.jugadors.get(contTurn).ma.get(1).getF1();
        ensenyarTotsBotons();
    }

    public void clickButo11(ActionEvent event) {
        colorActual = tauler.jugadors.get(contTurn).ma.get(1).getF2();
        avancar(colorActual);
    }

    public void clickButo12(ActionEvent event) {
        colorActual = tauler.jugadors.get(contTurn).ma.get(1).getF3();
        avancar(colorActual);
    }

    ////////////////////////////////
    ////////////////////////////////
    public void clickButo20(ActionEvent event) {
        colorActual = tauler.jugadors.get(contTurn).ma.get(2).getF1();
        ensenyarTotsBotons();
    }

    public void clickButo21(ActionEvent event) {
        colorActual = tauler.jugadors.get(contTurn).ma.get(2).getF2();
        avancar(colorActual);
    }

    public void clickButo22(ActionEvent event) {
        colorActual = tauler.jugadors.get(contTurn).ma.get(2).getF3();
        avancar(colorActual);
    }

    ////////////////////////////////
    ////////////////////////////////
    public void clickButo30(ActionEvent event) {
        colorActual = tauler.jugadors.get(contTurn).ma.get(3).getF1();
        ensenyarTotsBotons();
    }

    public void clickButo31(ActionEvent event) {
        colorActual = tauler.jugadors.get(contTurn).ma.get(3).getF2();
        avancar(colorActual);
    }

    public void clickButo32(ActionEvent event) {
        colorActual = tauler.jugadors.get(contTurn).ma.get(3).getF3();
        avancar(colorActual);
    }
    ////////////////////////////////
    ////////////////////////////////

    public void clickButo40(ActionEvent event) {
        colorActual = tauler.jugadors.get(contTurn).ma.get(4).getF1();
        ensenyarTotsBotons();
    }

    public void clickButo41(ActionEvent event) {
        colorActual = tauler.jugadors.get(contTurn).ma.get(4).getF2();
        avancar(colorActual);
    }

    public void clickButo42(ActionEvent event) {
        colorActual = tauler.jugadors.get(contTurn).ma.get(4).getF3();
        avancar(colorActual);
    }

    ////////////////////////////////
    ////////////////////////////////
    public void clickButo50(ActionEvent event) {
        colorActual = tauler.jugadors.get(contTurn).ma.get(5).getF1();
        ensenyarTotsBotons();
    }

    public void clickButo51(ActionEvent event) {
        colorActual = tauler.jugadors.get(contTurn).ma.get(5).getF2();
        avancar(colorActual);
    }

    public void clickButo52(ActionEvent event) {
        colorActual = tauler.jugadors.get(contTurn).ma.get(5).getF3();
        avancar(colorActual);
    }
    ////////////////////////////////
    ////////////////////////////////

    ///////////////////////////////////////
    ////////////CLICK CARTA F1/////////////
    ///////////////////////////////////////

    ///////////////////////////////////////
    ////////////CLICK CARTA F2/////////////
    ///////////////////////////////////////
    private void avancar(String colorActual) {
        switch (colorActual) {
            case "red": //CASO ALPHA
                if (tauler.empresas.get(0).isPotAvancar()) {
                    if (contAvanAlpha == 1) {
                        lblAlpha01.setStyle("-fx-background-color: " + colorActual);
                        contAvanAlpha++;
                    } else if (contAvanAlpha == 2) {
                        lblAlpha02.setStyle("-fx-background-color: " + colorActual);
                        contAvanAlpha++;
                    } else if (contAvanAlpha == 3) {
                        lblAlpha03.setStyle("-fx-background-color: " + colorActual);
                        contAvanAlpha++;
                    } else if (contAvanAlpha == 4) {
                        lblAlpha04.setStyle("-fx-background-color: " + colorActual);
                        contAvanAlpha++;
                    } else if (contAvanAlpha == 5) {
                        lblAlpha05.setStyle("-fx-background-color: " + colorActual);
                        tauler.empresas.get(0).setPotAvancar(crearAlert("Alpha"));
                        contAvanAlpha++;
                    } else if (contAvanAlpha == 6) {
                        lblAlpha06.setStyle("-fx-background-color: " + colorActual);
                        contAvanAlpha++;
                    } else if (contAvanAlpha == 7) {
                        System.out.println(contAvanAlpha);
                        lblAlpha07.setStyle("-fx-background-color: " + colorActual);
                        System.out.println("EMPRESA ALPHA JA ESTA EN EL MAX");
                    }
                } else {
                    alertError.setTitle("ALPHA: ERROR !!!");
                    alertError.setHeaderText("Aquesta empresa no pot avançar mes");
                    alertError.show();
                }
                break;
            case "green": //CASO DELTA

                if (tauler.empresas.get(1).isPotAvancar()) {
                    if (contAvanDelta == 1) {
                        lblDelta01.setStyle("-fx-background-color: " + colorActual);
                        contAvanDelta++;
                    } else if (contAvanDelta == 2) {
                        lblDelta02.setStyle("-fx-background-color: " + colorActual);
                        contAvanDelta++;
                    } else if (contAvanDelta == 3) {
                        lblDelta03.setStyle("-fx-background-color: " + colorActual);
                        contAvanDelta++;
                    } else if (contAvanDelta == 4) {
                        lblDelta04.setStyle("-fx-background-color: " + colorActual);
                        contAvanDelta++;
                    } else if (contAvanDelta == 5) {
                        lblDelta05.setStyle("-fx-background-color: " + colorActual);
                        tauler.empresas.get(1).setPotAvancar(crearAlert("Delta"));
                        contAvanDelta++;
                    } else if (contAvanDelta == 6) {
                        lblDelta06.setStyle("-fx-background-color: " + colorActual);
                        contAvanDelta++;
                    } else if (contAvanDelta == 7) {
                        lblDelta07.setStyle("-fx-background-color: " + colorActual);
                    }
                } else {
                    alertError.setTitle("DELTA: ERROR !!!");
                    alertError.setHeaderText("Aquesta empresa no pot avançar mes");
                    alertError.show();
                }
                break;
            case "blue":// CASO BETA
                if (tauler.empresas.get(2).isPotAvancar()) {
                    if (contAvanBeta == 1) {
                        lblBetaA01.setStyle("-fx-background-color: " + colorActual);
                        contAvanBeta++;
                    } else if (contAvanBeta == 2) {
                        lblBetaA02.setStyle("-fx-background-color: " + colorActual);
                        contAvanBeta++;
                    } else if (contAvanBeta == 3) {
                        lblBetaA03.setStyle("-fx-background-color: " + colorActual);
                        contAvanBeta++;
                    } else if (contAvanBeta == 4) {
                        lblBetaA04.setStyle("-fx-background-color: " + colorActual);
                        contAvanBeta++;
                    } else if (contAvanBeta == 5) {
                        lblBetaA05.setStyle("-fx-background-color: " + colorActual);
                        tauler.empresas.get(2).setPotAvancar(crearAlert("Beta"));
                        contAvanBeta++;
                    } else if (contAvanBeta == 6) {
                        lblBetaA06.setStyle("-fx-background-color: " + colorActual);
                        contAvanBeta++;
                    } else if (contAvanBeta == 7) {
                        lblBetaA07.setStyle("-fx-background-color: " + colorActual);
                    }
                } else {
                    alertError.setTitle("BETA: ERROR !!!");
                    alertError.setHeaderText("Aquesta empresa no pot avançar mes");
                    alertError.show();
                }
                break;
            case "cyan": //CASO GAMMA
                if (tauler.empresas.get(3).isPotAvancar()) {
                    if (contAvanGamma == 1) {
                        lblGama01.setStyle("-fx-background-color: " + colorActual);
                        contAvanGamma++;
                    } else if (contAvanGamma == 2) {
                        lblGama02.setStyle("-fx-background-color: " + colorActual);
                        contAvanGamma++;
                    } else if (contAvanGamma == 3) {
                        lblGama03.setStyle("-fx-background-color: " + colorActual);
                        contAvanGamma++;
                    } else if (contAvanGamma == 4) {
                        lblGama04.setStyle("-fx-background-color: " + colorActual);
                        contAvanGamma++;
                    } else if (contAvanGamma == 5) {
                        lblGama05.setStyle("-fx-background-color: " + colorActual);
                        tauler.empresas.get(3).setPotAvancar(crearAlert("Gamma"));
                        contAvanGamma++;
                    } else if (contAvanGamma == 6) {
                        lblGama06.setStyle("-fx-background-color: " + colorActual);
                        contAvanGamma++;
                    } else if (contAvanGamma == 7) {
                        lblGama07.setStyle("-fx-background-color: " + colorActual);
                    }
                } else {
                    alertError.setTitle("GAMMA: ERROR !!!");
                    alertError.setHeaderText("Aquesta empresa no pot avançar mes");
                    alertError.show();
                }
                break;
            case "pink": //CASO OMICRON
                if (tauler.empresas.get(4).isPotAvancar()) {
                    if (contAvanPink == 1) {
                        lblOmicron01.setStyle("-fx-background-color: " + colorActual);
                        contAvanPink++;
                    } else if (contAvanPink == 2) {
                        lblOmicron02.setStyle("-fx-background-color: " + colorActual);
                        contAvanPink++;
                    } else if (contAvanPink == 3) {
                        lblOmicron03.setStyle("-fx-background-color: " + colorActual);
                        contAvanPink++;
                    } else if (contAvanPink == 4) {
                        lblOmicron04.setStyle("-fx-background-color: " + colorActual);
                        contAvanPink++;
                    } else if (contAvanPink == 5) {
                        lblOmicron05.setStyle("-fx-background-color: " + colorActual);
                        tauler.empresas.get(4).setPotAvancar(crearAlert("Omicron"));
                        contAvanPink++;
                    } else if (contAvanPink == 6) {
                        lblOmicron06.setStyle("-fx-background-color: " + colorActual);
                        contAvanPink++;
                    } else if (contAvanPink == 7) {
                        lblOmicron07.setStyle("-fx-background-color: " + colorActual);
                    }
                } else {
                    alertError.setTitle("OMICRON: ERROR !!!");
                    alertError.setHeaderText("Aquesta empresa no pot avançar mes");
                    alertError.show();


                }
                break;
            case "yellow": //CASO EPSILON
                if (tauler.empresas.get(5).isPotAvancar()) {
                    if (contAvanYellow == 1) {
                        lblEpsilon01.setStyle("-fx-background-color: " + colorActual);
                        contAvanYellow++;
                    } else if (contAvanYellow == 2) {
                        lblEpsilon02.setStyle("-fx-background-color: " + colorActual);
                        contAvanYellow++;
                    } else if (contAvanYellow == 3) {
                        lblEpsilon03.setStyle("-fx-background-color: " + colorActual);
                        contAvanYellow++;
                    } else if (contAvanYellow == 4) {
                        lblEpsilon04.setStyle("-fx-background-color: " + colorActual);
                        contAvanYellow++;
                    } else if (contAvanYellow == 5) {
                        lblEpsilon05.setStyle("-fx-background-color: " + colorActual);
                        tauler.empresas.get(5).setPotAvancar(crearAlert("Epsilon"));
                        contAvanYellow++;
                    } else if (contAvanYellow == 6) {
                        lblEpsilon06.setStyle("-fx-background-color: " + colorActual);
                        contAvanYellow++;
                    } else if (contAvanYellow == 7) {
                        lblEpsilon07.setStyle("-fx-background-color: " + colorActual);
                        tauler.empresas.get(5).setPotAvancar(crearAlert("Epsilon"));
                    }
                } else {
                    alertError.setTitle("EPSILON: ERROR !!!");
                    alertError.setHeaderText("Aquesta empresa no pot avançar mes");
                    alertError.show();
                }
                break;
        }
    }

    ///////////////////////////////////////
    ////////////CLICK CARTA F1/////////////
    ///////////////////////////////////////

    //CREAR UNA ALERT PER QUAN ARRIBI A LA CASELLA 4
    private boolean crearAlert(String nomEmpresa) {
        alertConfirmacio.setTitle(nomEmpresa);
        alertConfirmacio.setHeaderText("Quina opcio vols?");
        alertConfirmacio.setContentText("1)Continuar avançant\n2)Fer accio especial");
        ButtonType buttonType1 = new ButtonType("1");
        ButtonType buttonType2 = new ButtonType("2");
        alertConfirmacio.getButtonTypes().setAll(buttonType1, buttonType2);
        Optional<ButtonType> result = alertConfirmacio.showAndWait();
        if (result.get() == buttonType1) {
            System.out.println("Continuar avancant");
            return true;
        } else if (result.get() == buttonType2) {
            return false;
        }
        return true;
    }

    ////////////////////////////////////////////////////////////////
    //////////////CLICK DE BOTONS DE MAPA D'EUROPA//////////////////
    ////////////////////////////////////////////////////////////////
    public void clickbtME(ActionEvent actionEvent) {
     Button buton = (Button) actionEvent.getSource();
     clickbt(buton);
     amagarTotsBotons();
    }

    ////////////////////////////////////////////////////////////////
    //////////////CLICK DE BOTONS DE MAPA D'EUROPA//////////////////
    ////////////////////////////////////////////////////////////////


    //////////////////////////////////
    ////////////ACCIONS///////////////
    //////////////////////////////////

    public void affAlpha(ActionEvent event) {
      int cont = 0;
        tauler.empresas.get(0).accions.add(tauler.jugadors.get(contTurn));
        totalAlpha.setText(Integer.toString(tauler.empresas.get(0).accions.size()));

        for (int i = 0; i < tauler.empresas.get(0).accions.size(); i++) {
            if (tauler.empresas.get(0).accions.get(i).getNom().equals(tauler.jugadors.get(contTurn).getNom()))
                cont++;
        }

        propiesAlpha.setText(Integer.toString(cont));

    }

    public void affDelta(ActionEvent event) {
        int cont = 0;
        tauler.empresas.get(1).accions.add(tauler.jugadors.get(contTurn));
        totalDelta.setText(Integer.toString(tauler.empresas.get(1).accions.size()));

        for (int i = 0; i < tauler.empresas.get(1).accions.size(); i++) {
            if (tauler.empresas.get(1).accions.get(i).getNom().equals(tauler.jugadors.get(contTurn).getNom()))
                cont++;
        }

        propiesDelta.setText(Integer.toString(cont));
    }

    public void affBeta(ActionEvent event) {
        int cont = 0;
        tauler.empresas.get(2).accions.add(tauler.jugadors.get(contTurn));
        totalBeta.setText(Integer.toString(tauler.empresas.get(2).accions.size()));

        for (int i = 0; i < tauler.empresas.get(2).accions.size(); i++) {
            if (tauler.empresas.get(2).accions.get(i).getNom().equals(tauler.jugadors.get(contTurn).getNom()))
                cont++;
        }

        propiesBeta.setText(Integer.toString(cont));
    }

    public void affGama(ActionEvent event) {
        int cont = 0;
        tauler.empresas.get(3).accions.add(tauler.jugadors.get(contTurn));
        totalGama.setText(Integer.toString(tauler.empresas.get(3).accions.size()));

        for (int i = 0; i < tauler.empresas.get(3).accions.size(); i++) {
            if (tauler.empresas.get(3).accions.get(i).getNom().equals(tauler.jugadors.get(contTurn).getNom()))
                cont++;
        }

        propiesGama.setText(Integer.toString(cont));
    }

    public void affOmicron(ActionEvent event) {
        int cont = 0;
        tauler.empresas.get(4).accions.add(tauler.jugadors.get(contTurn));
        totalOmicron.setText(Integer.toString(tauler.empresas.get(4).accions.size()));

        for (int i = 0; i < tauler.empresas.get(4).accions.size(); i++) {
            if (tauler.empresas.get(4).accions.get(i).getNom().equals(tauler.jugadors.get(contTurn).getNom()))
                cont++;
        }

        propiesOmicron.setText(Integer.toString(cont));

    }

    public void affEpsilon(ActionEvent event) {
        int cont = 0;
        tauler.empresas.get(5).accions.add(tauler.jugadors.get(contTurn));
        totalEpsilon.setText(Integer.toString(tauler.empresas.get(5).accions.size()));

        for (int i = 0; i < tauler.empresas.get(5).accions.size(); i++) {
            if (tauler.empresas.get(5).accions.get(i).getNom().equals(tauler.jugadors.get(contTurn).getNom()))
                cont++;
        }

        propiesEpsilon.setText(Integer.toString(cont));
    }

    //////////////////////////////////
    ////////////ACCIONS///////////////
    //////////////////////////////////
    private void clickbt(Button buto) {
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


    public void passarTorn(ActionEvent actionEvent) {
         int cont=0;
        contTurn = ++contTurn % tauler.jugadors.size();
        omplirMa();
        lblTurnActual.setText("Torn de: " + this.tauler.jugadors.get(contTurn).getNom());
        actualitzarAccions();

    }

    private void actualitzarAccions() {
        int cont = 0;
        for (int i = 0; i < tauler.empresas.get(contTurn).accions.size(); i++) {
            if (tauler.empresas.get(contTurn).accions.get(i).getNom().equals(tauler.jugadors.get(contTurn).getNom()))
                cont++;
        }
        propiesAlpha.setText(Integer.toString(cont));
        cont = 0;
        for (int i = 0; i < tauler.empresas.get(contTurn).accions.size(); i++) {
            if (tauler.empresas.get(contTurn).accions.get(i).getNom().equals(tauler.jugadors.get(contTurn).getNom()))
                cont++;
        }
        propiesBeta.setText(Integer.toString(cont));
        cont = 0;
        for (int i = 0; i < tauler.empresas.get(contTurn).accions.size(); i++) {
            if (tauler.empresas.get(contTurn).accions.get(i).getNom().equals(tauler.jugadors.get(contTurn).getNom()))
                cont++;
        }
        propiesDelta.setText(Integer.toString(cont));
        cont = 0;
        for (int i = 0; i < tauler.empresas.get(contTurn).accions.size(); i++) {
            if (tauler.empresas.get(contTurn).accions.get(i).getNom().equals(tauler.jugadors.get(contTurn).getNom()))
                cont++;
        }
        propiesGama.setText(Integer.toString(cont));
        cont = 0;
        for (int i = 0; i < tauler.empresas.get(contTurn).accions.size(); i++) {
            if (tauler.empresas.get(contTurn).accions.get(i).getNom().equals(tauler.jugadors.get(contTurn).getNom()))
                cont++;
        }
        propiesEpsilon.setText(Integer.toString(cont));
        cont = 0;
        for (int i = 0; i < tauler.empresas.get(contTurn).accions.size(); i++) {
            if (tauler.empresas.get(contTurn).accions.get(i).getNom().equals(tauler.jugadors.get(contTurn).getNom()))
                cont++;
        }
        propiesOmicron.setText(Integer.toString(cont));

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