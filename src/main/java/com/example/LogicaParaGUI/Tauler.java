package com.example.LogicaParaGUI;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//TAULER PER REPRESENTAR EL MAPA D'EUROPA
public class Tauler {
    static Scanner input = new Scanner(System.in);
    ArrayList<Casella> caselles = new ArrayList<>();
    ArrayList<Empresa> empresas;
    ArrayList<Jugador> jugadors;
    Empresa empresaVuit;
    Baralla baralla;
    Empresa empresaAux;
    int ContinuarCOmprant;


    private int numCaselles;

    public int getNumCaselles() {
        return numCaselles;
    }

    public void setNumCaselles(int numCaselles) {
        this.numCaselles = numCaselles;
    }

    public Tauler(Baralla baralla, ArrayList<Jugador> jugador, ArrayList<Empresa> empresas, Empresa empresaVuit) {
        super();
        this.baralla = baralla;
        this.jugadors = jugador;
        this.empresas = empresas;
        this.empresaVuit = empresaVuit;
        setNumCaselles(36); //POSEM UN NUMERO MAXIM DE CASELLES
        omplirCaselles(getNumCaselles()); // CRIDEM OMPLIRCASELLES PER OMPLIR TOTES LES CASELLES AMB UNA ID (DE 0 A 35) I FICAR LA EMPRESA "FANTASMA"
        omplirVeins();// LA CRIDEM PER ACABAR DE FER LES CASELLES AMB ELS VEINS

    }

    //METODE PER COMENÇAR LES RONDES
    public void ronda(int numsRonda) throws Exception {
        remenarBaralla(baralla);


        for (int i = 0; i < numsRonda; i++) {
            afegirTokenIniciRonda();
            repartirCartes(baralla, jugadors);
            for (int j = 0; j < jugadors.size(); j++) {
                taulerEuropeu();
                torn(jugadors.get(j));
            }
        }

    }


    //////////////////////////////////////////////////////////////////////////////////
    ////////////////////////// METODE PER FER ELS TORNS//////////////////////////////
    private void torn(Jugador jugador) throws Exception {
        tirarCarta(jugador);
        compraVenta(jugador);
        taulerEmpresasAvançament();
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////////////////////////// AQUEST METODE ES EL QUE FARA QUE EL JUGADOR TIRI LA CARTA//////////////////////////////////////////////////
    private void tirarCarta(Jugador jugador) {
        boolean semaforIdExists = false, semaforFuncioExsists = false, semaforCasellaExists = false; // SEMAFORS PER CONTROLAR SI HA TRIAT BE LES OPCIONS
        Carta cartaATirar = null; //CARTA PER SABER QUINA CARTA TIARA EL JUGADOR
        Casella casellaAInteractuar = null; // PER SABER AMB QUINA CASELLA HEM D'INTERACTUAR
        String funcio = null; // VARIABLE PER GUARDAR QUINA FUNCIO TRIA EL USUARI
        int numFuncio = 0, numeroCasella = 0;// SABER QUIN NUMERO DE FUNCIO ES I QUIN NUMERO DE CASELLA ES
        Empresa empresaAfectada = null; // PER GUARDAR A QUINA EMPRESA ANIRA LA FUNCIO
         do {
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////SI LA FUNCIO ES LA 1 ES A DIR PER POSAR UNA FILIAL AL MAPA EUROPEU ANIREM AQUI////////////////////////////////////////////////////////
        if (numFuncio == 0) {
            do {
                taulerEuropeuDisponibles();
                com.example.ekonos_logica.Missatges.Preguntas.casellaAposar();
                //PREGUNTEM QUINA CASELLA VOL FICARLA
                numeroCasella = input.nextInt();//GUARDEM EL NUMERO DE CASELLA

                if (caselles.get(numeroCasella).propietari.getNom().equals("Vuit")) { //COMPROVEM SI LA CASELLA NO ESTA AGAFADA
                    semaforCasellaExists = true;
                    casellaAInteractuar = caselles.get(numeroCasella);
                } else
                    com.example.ekonos_logica.Missatges.Errors.casellaAgafada(caselles,numeroCasella);
            } while (!semaforCasellaExists);
        }

        cartaATirar.accioCarta(empresaAfectada, numFuncio, casellaAInteractuar, caselles);
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////// GENERAR TOTES LES CASELLES///////////////////////////////////////////////////////////////////////////
    private void omplirCaselles(int numCaselles) {
        for (int i = 0; i < numCaselles; i++) {
            Casella novaCasella = new Casella(i, empresaVuit);
            caselles.add(novaCasella);
        }

    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////AQUI DIEM QUINA MIDA TE LA MA EL JUAGDOR I REPARTIM LA MA///////////////////////////////////////////////////
    private static void repartirCartes(Baralla baralla, ArrayList<Jugador> jugador) {
        int midaMa = 0;
        if (jugador.size() == 3 || jugador.size() == 4 || jugador.size() == 6)
            midaMa = 6;
        else if (jugador.size() == 5)
            midaMa = 5;
        else
            com.example.ekonos_logica.Missatges.Errors.errorMidaMa();


        baralla.repartirMa(jugador, midaMa);
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////////FUNCIO PER REMENAR LA MA/////////////////////////////////////////////////////////////////////////////////////
    private static void remenarBaralla(Baralla baralla) throws Exception {
        // REMENA LA BARALLA AMB LA FUNCIO SHUFFLE
        Collections.shuffle(baralla.baralla);

    }

    ///////////////////////////////////////////////////////////////////////////////////
    ////////////////METODE PER PRINTAR LES TAULES D'AVNÇAMENT D'EMPRESES//////////////
    public void taulerEmpresasAvançament() {
        for (int i = 0; i < empresas.size(); i++) {
            empresas.get(i).taulerMarcador();
        }
    }

    ////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////METODE PER VERUE TOT EL MAPA EUROPEU////////////////////////
    public void taulerEuropeu() {
        for (int i = 0; i < caselles.size(); i++) {
            com.example.ekonos_logica.Missatges.Taulers.ensenyarCaselles(i,caselles);
        }
    }

    ////////////////////////////////////////////////////////////////////////////////////
    ////////////////METODE PER VERUE QUINES CASELLES NO ESTA AGAFADES//////////////////
    public void taulerEuropeuDisponibles() {
        for (int i = 0; i < caselles.size(); i++) {
            if (caselles.get(i).propietari.equals("vuit")) {
                com.example.ekonos_logica.Missatges.Taulers.ensenyarCaselles(i,caselles);
            }
        }
    }


    //COMPRA VENTA DE ACCIONS MITJANCANT TOKENS
    public void compraVenta(Jugador jugador) {
        int opcio;

        int tokensQueCostat;
        boolean semaforCompra = false;
        String colorCarta;//COLOR QUE FICARA L'USUARI
        Empresa empresaAfectada = empresaAux;//EMPRESA A QUI ES COMPRARA O VENDRA UNA ACCIO


        boolean semaforCompraVenta = false, semaforPotVenta = false;
        do {
            com.example.ekonos_logica.Missatges.Preguntas.quinaOpcioVols();
            opcio = input.nextInt();
            input.nextLine();
            //////OPCIO VENTA///////
            if (opcio == 1) {
                do {
                    //TREURE TOTES LES ACCIONS DE TOTES LES EMPRESES
                    for (int i = 0; i < empresas.size(); i++) {
                        for (int j = 0; j < empresas.get(i).accions.size(); j++) {
                            if (jugador.getNom().equals(empresas.get(i).accions.get(j).getNom())) {
                                semaforPotVenta = true;
                            }
                        }
                    }
                    if (semaforPotVenta) {
                        do {
                            com.example.ekonos_logica.Missatges.Normals.tensTantsTokens(jugador);
                            com.example.ekonos_logica.Missatges.Normals.accionsDeToteslesEmpreses();
                            for (int i = 0; i < empresas.size(); i++) {
                                empresas.get(i).taulerAccions();
                            }
                            empresaAfectada = vendre();
                            empresaAfectada.treureAccio(jugador, jugadors);

                        } while (!semaforPotVenta);
                    } else {
                        com.example.ekonos_logica.Missatges.Errors.noTensAccions();


                    }

                } while (!semaforPotVenta);


                /////OPCIO COMPRA///////
            } else if (opcio == 2) {

                empresaAfectada = comprar(jugador, empresaAfectada);
                if (ContinuarCOmprant == 1) {
                    semaforCompra = false;
                    empresaAfectada = comprar(jugador, empresaAfectada);

                } else {
                    semaforCompra = true;
                    compraVenta(jugador);
                }

                //////SORTIR////
            } else {
                com.example.ekonos_logica.Missatges.Errors.finalApartatAccio();

            }

        } while (opcio != 3);

    }

    public Empresa comprar(Jugador jugador, Empresa empresaAfectada) {
        String colorCarta;
        if (jugador.getTokens() == 0) {
            com.example.ekonos_logica.Missatges.Errors.noTensTokens();

        } else {
            for (int i = 0; i < empresas.size(); i++) {
                if (empresas.get(i).isExisteix()) {
                    com.example.ekonos_logica.Missatges.Normals.preuEmpresa(empresas,i);

                }
            }
            com.example.ekonos_logica.Missatges.Normals.tensTantsTokens(jugador);
            com.example.ekonos_logica.Missatges.Preguntas.empresaAcomprarAccions();

            colorCarta = input.nextLine();
            input.nextLine();
            for (int i = 0; i < empresas.size(); i++) {
                if (colorCarta.equals(empresas.get(i).getColor())) {
                    empresaAfectada = empresas.get(i);
                }
            }
            int tokensQueCostat = empresaAfectada.posarAccio(jugador, jugadors);
            jugador.setTokens(jugador.getTokens() - tokensQueCostat);
        }

        com.example.ekonos_logica.Missatges.Preguntas.comprarAcions();
        ContinuarCOmprant = input.nextInt();

        return empresaAfectada;
    }

    //AL PRINCIPI DEL TORN ES FARA AQUESTA FUNCIO PER DONAR EL TOKENS ALS JUGADORS
    public void afegirTokenIniciRonda() {
        int numJugadors = jugadors.size();
        if (numJugadors == 5) {
            for (int i = 0; i < numJugadors; i++) {
                jugadors.get(i).setTokens(jugadors.get(i).getTokens() + 10);
            }
        } else {
            for (int i = 0; i < numJugadors; i++) {
                jugadors.get(i).setTokens(jugadors.get(i).getTokens() + 12);
            }
        }
    }

    public Empresa vendre() {
        boolean semaforColorCorrecte = false;
        do {
            com.example.ekonos_logica.Missatges.Preguntas.empresaVendre();
            String color = input.nextLine();
            //COMPROVEM SI HI HA LA EMPRESA
            for (int i = 0; i < empresas.size(); i++) {
                if (color.equals(empresas.get(i).getColor())) {
                    return empresas.get(i);
                }
            }
        } while (!semaforColorCorrecte);
        return null;
    }


    private void omplirVeins() {
        this.caselles.get(0).afegirVeines(this, 2, 8);
        this.caselles.get(1).afegirVeines(this, 1, 3, 8);
        this.caselles.get(2).afegirVeines(this, 2, 4, 10);
        this.caselles.get(3).afegirVeines(this, 3, 5, 10);
        this.caselles.get(4).afegirVeines(this, 4, 6, 11);
        this.caselles.get(5).afegirVeines(this, 5, 7, 11);
        this.caselles.get(6).afegirVeines(this, 6, 11, 17);
        this.caselles.get(7).afegirVeines(this, 1, 2, 12);
        this.caselles.get(8).afegirVeines(this, 10, 12, 13, 14);
        this.caselles.get(9).afegirVeines(this, 3, 4, 9, 15);
        this.caselles.get(10).afegirVeines(this, 5, 6, 7, 16);
        this.caselles.get(11).afegirVeines(this, 8, 9, 18);
        this.caselles.get(12).afegirVeines(this, 9, 14, 18, 19);
        this.caselles.get(13).afegirVeines(this, 9, 13, 15, 20);
        this.caselles.get(14).afegirVeines(this, 10, 14, 16, 21);
        this.caselles.get(15).afegirVeines(this, 11, 15, 17, 21);
        this.caselles.get(16).afegirVeines(this, 7, 16, 24);
        this.caselles.get(17).afegirVeines(this, 12, 13, 26, 27);
        this.caselles.get(18).afegirVeines(this, 13, 20, 27, 28);
        this.caselles.get(19).afegirVeines(this, 14, 19, 21, 22);
        this.caselles.get(20).afegirVeines(this, 15, 16, 20, 22);
        this.caselles.get(21).afegirVeines(this, 20, 21, 23, 29);
        this.caselles.get(22).afegirVeines(this, 22, 24, 30);
        this.caselles.get(23).afegirVeines(this, 17, 23, 30, 31);
        this.caselles.get(24).afegirVeines(this, 26, 32, 33);
        this.caselles.get(25).afegirVeines(this, 18, 25, 27, 34);
        this.caselles.get(26).afegirVeines(this, 18, 19, 26, 28);
        this.caselles.get(27).afegirVeines(this, 19, 27, 29, 34, 35);
        this.caselles.get(28).afegirVeines(this, 22, 28, 35);
        this.caselles.get(29).afegirVeines(this, 23, 24, 35, 36);
        this.caselles.get(30).afegirVeines(this, 24, 36);
        this.caselles.get(31).afegirVeines(this, 25, 33);
        this.caselles.get(32).afegirVeines(this, 25, 32, 34);
        this.caselles.get(33).afegirVeines(this, 26, 28, 33);
        this.caselles.get(34).afegirVeines(this, 28, 29, 30, 36);
        this.caselles.get(35).afegirVeines(this, 30, 31, 35);
    }

}
