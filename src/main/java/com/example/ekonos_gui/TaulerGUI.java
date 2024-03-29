package com.example.ekonos_gui;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//TAULER PER REPRESENTAR EL MAPA D'EUROPA
public class TaulerGUI {
    static Scanner input = new Scanner(System.in);
    ArrayList<CasellaGUI> caselles = new ArrayList<>();
    ArrayList<EmpresaGUI> empresas;
    ArrayList<JugadorGUI> jugadors;
    EmpresaGUI empresaVuit;
    BarallaGUI baralla;
    EmpresaGUI empresaAux;
    int ContinuarCOmprant;


    private int numCaselles;

    public int getNumCaselles() {
        return numCaselles;
    }

    public void setNumCaselles(int numCaselles) {
        this.numCaselles = numCaselles;
    }


    /**
     *
     * @param baralla baralla de la partida
     * @param jugador tots els jugadors
     * @param empresas totes les empreses
     * @param empresaVuit empresa vuida
     */

    public TaulerGUI(BarallaGUI baralla, ArrayList<JugadorGUI> jugador, ArrayList<EmpresaGUI> empresas, EmpresaGUI empresaVuit) {
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

    /**
     *
     * @param numsRonda Numero de rones
     */
    public void ronda(int numsRonda) throws Exception {
        remenarBaralla(baralla);


        for (int i = 0; i < numsRonda; i++) {
            afegirTokenIniciRonda();
            repartirCartes(baralla, jugadors);
            for (int j = 0; j < jugadors.size(); j++) {
                torn(jugadors.get(j));
            }
        }

    }

    /**
     *
     * @param jugador jugador de qui es la ronda
     */
    //////////////////////////////////////////////////////////////////////////////////
    ////////////////////////// METODE PER FER ELS TORNS//////////////////////////////
    private void torn(JugadorGUI jugador) throws Exception {
        tirarCarta(jugador);
        compraVenta(jugador);
    }

    /**
     * @param jugador jugador qui tira la carta
     */
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////////////////////////// AQUEST METODE ES EL QUE FARA QUE EL JUGADOR TIRI LA CARTA//////////////////////////////////////////////////
    private void tirarCarta(JugadorGUI jugador) {
        boolean semaforIdExists = false, semaforFuncioExsists = false, semaforCasellaExists = false; // SEMAFORS PER CONTROLAR SI HA TRIAT BE LES OPCIONS
        CartaGUI cartaATirar = null; //CARTA PER SABER QUINA CARTA TIARA EL JUGADOR
        CasellaGUI casellaAInteractuar = null; // PER SABER AMB QUINA CASELLA HEM D'INTERACTUAR
        String funcio = null; // VARIABLE PER GUARDAR QUINA FUNCIO TRIA EL USUARI
        int numFuncio = 0, numeroCasella = 0;// SABER QUIN NUMERO DE FUNCIO ES I QUIN NUMERO DE CASELLA ES
        EmpresaGUI empresaAfectada = null; // PER GUARDAR A QUINA EMPRESA ANIRA LA FUNCIO
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////// IMPRIMIR LA MA///////////////////////////////////////////////////////////////////////////////


        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        do {
            int idCarta = input.nextInt();
            //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            ////////////////////////////////////////////////////COMPROBEM SI LA CARTA EXISTEIX////////////////////////////////////////////////////////////////
            for (int i = 0; i < jugador.ma.size(); i++) {
                if (idCarta == jugador.ma.get(i).getId()) {
                    // QUAN SABEM QUE ES CORRECTE LA GUARDEM A LA VARIABLE CARTAATIRAR CAMBIEM EL SEMAFOR A TRUE I BORREM LA CARTA DE LA MA
                    cartaATirar = jugador.ma.get(i);
                    semaforIdExists = true;
                    jugador.ma.remove(i);
                }
            }
            if (!semaforIdExists) {
                //luego try catch
            }
        } while (!semaforIdExists);
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        input.nextLine();
        do {
            //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            ////////////////////////////////////MOSTREM LES FUINCIONS QUE TINDRA LA CARTA A TIRAR I DEMANEM A L'USARI QUINA FUNCIO TRIA//////////////////////////////////////////////////////////////////////////
            funcio = input.nextLine();
            if (cartaATirar.getF1().equals(funcio)) {
                semaforFuncioExsists = true;
                numFuncio = 0;
            } else if (cartaATirar.getF2().equals(funcio)) {
                semaforFuncioExsists = true;
                numFuncio = 1;
            } else if (cartaATirar.getF3().equals(funcio)) {
                semaforFuncioExsists = true;
                numFuncio = 2;
            }
                //luego try Catch
        } while (!semaforFuncioExsists);
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        for (int i = 0; i < empresas.size(); i++) {
            if (empresas.get(i).getColor().equals(funcio)) {
                empresaAfectada = empresas.get(i);
            }
        }
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////SI LA FUNCIO ES LA 1 ES A DIR PER POSAR UNA FILIAL AL MAPA EUROPEU ANIREM AQUI////////////////////////////////////////////////////////
        if (numFuncio == 0) {
            do {
                //PREGUNTEM QUINA CASELLA VOL FICARLA
                numeroCasella = input.nextInt();//GUARDEM EL NUMERO DE CASELLA

                if (caselles.get(numeroCasella).propietari.getNom().equals("Vuit")) { //COMPROVEM SI LA CASELLA NO ESTA AGAFADA
                    semaforCasellaExists = true;
                    casellaAInteractuar = caselles.get(numeroCasella);
                }
            } while (!semaforCasellaExists);
        }

        cartaATirar.accioCarta(empresaAfectada, numFuncio, casellaAInteractuar, caselles);
    }

    /**
     * @param numCaselles Numero de caselles
     */
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////// GENERAR TOTES LES CASELLES///////////////////////////////////////////////////////////////////////////
    private void omplirCaselles(int numCaselles) {
        for (int i = 0; i < numCaselles; i++) {
            CasellaGUI novaCasella = new CasellaGUI(i, empresaVuit);
            caselles.add(novaCasella);
        }

    }

    /**
     * @param baralla baralla de la partida
     * @param jugador tots els jugadors
     */
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////AQUI DIEM QUINA MIDA TE LA MA EL JUAGDOR I REPARTIM LA MA///////////////////////////////////////////////////
    private static void repartirCartes(BarallaGUI baralla, ArrayList<JugadorGUI> jugador) {
        int midaMa = 0;
        if (jugador.size() == 3 || jugador.size() == 4 || jugador.size() == 6)
            midaMa = 6;
        else if (jugador.size() == 5)
            midaMa = 5;
        else
            com.example.ekonos_logica.Missatges.Errors.errorMidaMa();


        baralla.repartirMa(jugador, midaMa);
    }

    /**
     *
     * @param baralla Barlla de la partida
     * @throws Exception
     */
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////////FUNCIO PER REMENAR LA MA/////////////////////////////////////////////////////////////////////////////////////
    public static void remenarBaralla(BarallaGUI baralla) throws Exception {
        // REMENA LA BARALLA AMB LA FUNCIO SHUFFLE
        Collections.shuffle(baralla.baralla);

    }


    /**
     *
     * @param jugador jugador que fa la accio
     */
    //COMPRA VENTA DE ACCIONS MITJANCANT TOKENS
    public void compraVenta(JugadorGUI jugador) {
        int opcio;

        int tokensQueCostat;
        boolean semaforCompra = false;
        String colorCarta;//COLOR QUE FICARA L'USUARI
        EmpresaGUI empresaAfectada = empresaAux;//EMPRESA A QUI ES COMPRARA O VENDRA UNA ACCIO


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
                           empresaAfectada = vendre();
                            empresaAfectada.treureAccio(jugador, jugadors);

                        } while (!semaforPotVenta);
                    } else {



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

            }

        } while (opcio != 3);

    }

    /**
     *
      * @param jugador jugador qui la comprara
     * @param empresaAfectada empresa a que comprara la accio
     * @return retprma la empresa afectada
     */
    public EmpresaGUI comprar(JugadorGUI jugador, EmpresaGUI empresaAfectada) {
        String colorCarta;
        if (jugador.getTokens() == 0) {


        } else {
            for (int i = 0; i < empresas.size(); i++) {
                if (empresas.get(i).isExisteix()) {


                }
            }


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

    public EmpresaGUI vendre() {
        boolean semaforColorCorrecte = false;
        do {

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