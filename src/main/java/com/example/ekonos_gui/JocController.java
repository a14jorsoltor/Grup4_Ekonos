package com.example.ekonos_gui;

import javafx.event.ActionEvent;

import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.util.Optional;


public class JocController {
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
    ////////////////////////////////
    public void clickButo00(ActionEvent event) {
        colorActual = tauler.jugadors.get(contTurn).ma.get(0).getF1();
        ensenyarTotsBotons();
    }

    public void clickButo01(ActionEvent event) {
        colorActual = tauler.jugadors.get(contTurn).ma.get(0).getF2();
        avancar(colorActual);
    }

    Alert alert = new Alert(Alert.AlertType.CONFIRMATION);

    int contAvanAlpha = 1;
    int contAvanDelta=1;
    int contAvanBeta = 1;
    int contAvanGamma = 1;
    int contAvanPink = 1;
    int contAvanYellow = 1;

    private void avancar(String colorActual) {
        switch (colorActual) {
            case "red": //CASO ALPHA
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
                }else if (contAvanAlpha == 7) {
                    System.out.println(contAvanAlpha);
                    lblAlpha07.setStyle("-fx-background-color: " + colorActual);
                    System.out.println("EMPRESA ALPHA JA ESTA EN EL MAX");


                }


                break;
            case "green": //CASO DELTA
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
                }else if (contAvanDelta == 7) {
                    System.out.println();
                    lblDelta07.setStyle("-fx-background-color: " + colorActual);
                    System.out.println("EMPRESA DELTA JA ESTA EN EL MAX");
                }
                break;
            case "blue":// CASO BETA
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
                }
                else if (contAvanBeta == 7) {
                    lblBetaA07.setStyle("-fx-background-color: " + colorActual);
                    System.out.println("EMPRESA BETA JA ESTA EN EL MAX");
                }
                break;
            case "cyan": //CASO GAMMA
                if (contAvanGamma == 1) {
                    lblAlpha01.setStyle("-fx-background-color: " + colorActual);
                    contAvanGamma++;
                } else if (contAvanGamma == 2) {
                    lblAlpha02.setStyle("-fx-background-color: " + colorActual);
                    contAvanGamma++;
                } else if (contAvanGamma == 3) {
                    lblAlpha03.setStyle("-fx-background-color: " + colorActual);
                    contAvanGamma++;
                } else if (contAvanGamma == 4) {
                    lblAlpha04.setStyle("-fx-background-color: " + colorActual);
                    contAvanGamma++;
                } else if (contAvanGamma == 5) {
                    lblAlpha05.setStyle("-fx-background-color: " + colorActual);
                    tauler.empresas.get(3).setPotAvancar(crearAlert("Gamma"));
                    contAvanGamma++;
                } else if (contAvanGamma == 6) {
                    lblAlpha06.setStyle("-fx-background-color: " + colorActual);
                    contAvanGamma++;
                } else if (contAvanGamma == 7) {
                    lblAlpha07.setStyle("-fx-background-color: " + colorActual);
                    System.out.println("EMPRESA GAMMA JA ESTA EN EL MAX");
                }
                break;
            case "pink": //CASO OMICRON
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
                }else if (contAvanPink == 7) {
                    lblOmicron07.setStyle("-fx-background-color: " + colorActual);
                    System.out.println("EMPRESA OMICRON JA ESTA EN EL MAX");
                }
                break;
            case "yellow": //CASO EPSILON
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
                }
                else if (contAvanYellow == 7) {
                    lblEpsilon07.setStyle("-fx-background-color: " + colorActual);
                    tauler.empresas.get(5).setPotAvancar(crearAlert("Epsilon"));
                    System.out.println("EMPRESA EPSILON JA ESTA EN EL MAX");
                }
                break;
        }
    }
    //CREAR UNA ALERT PER QUAN ARRIBI A LA CASELLA 4
    private boolean crearAlert(String nomEmpresa) {
        alert.setTitle(nomEmpresa);
        alert.setHeaderText("Quina opcio vols?");
        alert.setContentText("1)Continuar avançant\n2)Fer accio especial");
        ButtonType buttonType1 = new ButtonType("1");
        ButtonType buttonType2 = new ButtonType("2");
        alert.getButtonTypes().setAll(buttonType1, buttonType2);
        Optional<ButtonType> result = alert.showAndWait();
        if (result.get() == buttonType1) {
            System.out.println("Continuar avancant");
            return true;
        } else if (result.get() == buttonType2) {
            return false;
        }
        return true;
    }

    ////////////////////////////////////////////////////////////////
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
////////////////////////////////

    ////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////
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
    ////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////


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


    int contTurn = 0;

    public void passarTorn(ActionEvent actionEvent) {
        contTurn = ++contTurn % tauler.jugadors.size();
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