package com.example.ekonos_logica.Main;
/**
 * @author Jordi Solé i Adria Lopez
 *  */


import java.util.ArrayList;
import java.util.Scanner;


public class Carta {

    /**
     * @param f1 Funcio 1 de la carta.
     * @param f2 Funcio 2 de la carta.
     * @param f3 Funcio 3 de la carta.
     * @param id La id de la carta per diferenciarles de les altres.
     * */
    static Scanner input = new Scanner(System.in);
    private String f1, f2, f3;
    private int id;

    public int getId() {
        return id;
    }

    public String getF1() {
        return f1;
    }

    public String getF2() {
        return f2;
    }

    public String getF3() {
        return f3;
    }
    private void funcioMesID(String f1, String f2, String f3, int id) {
        this.f1 = f1;
        this.f2 = f2;
        this.f3 = f3;
        this.id = id;
    }

    public String toString() {
        return "Funcio 1: " + f1 + " Funcio 2: " + f2 + " Funcio 3: " + f3 + " ID: " + id;
    }




    public boolean accioEspecial1(int num, Empresa empresa, ArrayList<Casella> casellesPropietariEmpresa, ArrayList<Casella> casellesVeinesVuides, ArrayList<Casella> caselles) {
        /**
         * Aquesta funcio la fara el president de la empresa quan alguna empresa cau a la casella 4.
         * @param numCasella diem quina casella del mapa europa voldra interactuar.
         * @param semaforAgafarCasella amb aquest semafor diem si pot continuar despres d'agafar la casella
         * @return retornem un boolean: True si s'ha pogut ha arribat al final. False si no ha pogut fer tota la funcio.
         */

        int numCasella;
        boolean semaforAgafarCasella = false;
        /////////////////////////////////////////////////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
        ////////////// //////////////AIXO TREUS TOTES LES CASELLES VEINES DE LA EMPRESA QUE SIGUIN VUIDES\\\\\\\\\\\\\\\\\\\\\\\\\\\
        for (int i = 0; i < casellesPropietariEmpresa.size(); i++) {
            for (int j = 0; j < casellesPropietariEmpresa.get(i).veines.size(); j++) {
                if (casellesPropietariEmpresa.get(i).veines.get(j).equals("vuit")) {
                   // com.example.ekonos_logica.Missatges.Normals.casellesPropietari(casellesPropietariEmpresa,i);

                    casellesVeinesVuides.add(casellesPropietariEmpresa.get(i).veines.get(j));
                }
            }
        }
        do {

            numCasella = input.nextInt();
            com.example.ekonos_logica.Missatges.Normals.numCaselles(num);
            for (int i = 0; i < casellesPropietariEmpresa.size(); i++) {//RECORREM TOTES ELS CASELLES
                if (numCasella == casellesPropietariEmpresa.get(i).getID()) {// COMPROVEM SI LA CASELLA EXISTEIX
                    if (casellesVeinesVuides.get(i).propietari.getNom().equals("vuit")) {// COOMPROVEM SI LA CASELLA ES VUIDA
                        caselles.get(casellesVeinesVuides.get(i).getID()).propietari = empresa;// SI HO ES FEM QUE LA CASELLA  SIGUI DE LA EMPRESA
                        semaforAgafarCasella = true;
                        return true;

                    } else {
                        com.example.ekonos_logica.Missatges.Errors.casellaIncorrecta();

                        semaforAgafarCasella = false;
                        return false;
                    }
                }
            }
        } while (!semaforAgafarCasella);

        return false;
    }


    private boolean accioEspecial2(int num, Empresa empresa, ArrayList<Casella> casellesPropietariEmpresa, ArrayList<Casella> casellesVeinesVuides, ArrayList<Casella> caselles) {
        /**
         * Aquesta funcio la fara el president de la empresa quan alguna empresa cau a la casella 6.
         * @param numCasella diem quina casella del mapa europa voldra interactuar.
         * @param semaforAgafarCasella amb aquest semafor diem si pot continuar despres d'agafar la casella.
         * @return retornem un boolean: True si s'ha pogut ha arribat al final. False si no ha pogut fer tota la funcio.
         */
        int numCasella;
        boolean semaforAgafarCasella = false;
        do {
            com.example.ekonos_logica.Missatges.Normals.numeroCasella(num);
            numCasella = input.nextInt();//LA GUARDEM EN UNA VARIABLE
            for (int i = 0; i < casellesPropietariEmpresa.size(); i++) {//RECORREM TOTES ELS CASELLES
                if (numCasella == casellesPropietariEmpresa.get(i).getID()) {// COMPROVEM SI LA CASELLA EXISTEIX
                    if (!casellesVeinesVuides.get(i).propietari.getNom().equals("vuit")) {// COOMPROVEM SI LA CASELLA ES VUIDA
                        caselles.get(casellesVeinesVuides.get(i).getID()).propietari = empresa;// SI HO ES FEM QUE LA CASELLA  SIGUI DE LA EMPRESA
                        semaforAgafarCasella = true;
                        return true;

                    } else {
                        com.example.ekonos_logica.Missatges.Errors.casellaIncorreecta();
                        semaforAgafarCasella = false;
                        return false;
                    }
                }
            }
        } while (!semaforAgafarCasella);

        return false;
    }


    public void accioCarta(Empresa empresa, int funcio, Casella casellaAfectada, ArrayList<Casella> caselles) {
/**
 * @param empresa diem la empresa a qui es fara la accio.
 * @param funcio quina funcio de la carta fara.
 * @param casellaAfectada es la casella en la qual interactuarem.
 * @param casellas pasem totes les caselles.
 *
 *
 * @param semaforAgafarCasella1 Aquesta variable serveix per si la primera casella que posa l'usuari es pot utilitzar.
 * @param casellesPropietariEmpresa Aquesta ArrayList es per agafar quines caselles pertanyen a la empresa afectada.
 * @param casellesVeinesVuides Aquesta ArrayList es per distingir quines caselles veines amb les quals pots interactuar esta vuides, es a dir pot agafar.
 * @param opcioC4 Dir quina opcio vols agafar Si continuar avançant o o fer la accio especial de la casella 4.
 * @param opcioC6 El mateix pero per a la opcio especial de la casella 6.
 * @param opcio Dir quina opcio vol, o agafar la casella rival o una casella vuida.
 *
 *
 */
        boolean semaforAgafarCasella1 = false, semaforAgafarCaselles = false;
        ArrayList<Casella> casellesPropietariEmpresa = new ArrayList<>();//ARRAYLIST PER SABER QUINES CASELLES CONTROLA LA EMPRESA
        ArrayList<Casella> casellesVeinesVuides = new ArrayList<>();
        int opcioC4, opcio, opcioC6;

        ///////////////////FUNCIO DE LA CARTA NUMERO 1\\\\\\\\\\\\\\\\\\\\\\\\\
        if (funcio == 0) {
            casellaAfectada.propietari = empresa;
            if(!empresa.isExisteix()){
                empresa.setExisteix(true);
            }
        }

        /////////////////FUNCIO DE LA CARTA NUMERO 2 I 3\\\\\\\\\\\\\\\\\\\\\\\\\
        else {
            empresa.avancarMarcador();//AVANCEM EL MARCADOR DE LA EMPRESA
            if (empresa.getMarcador() == 3) {
                //ACCIO DE CASELLA 4
                do {
                    //PREGUNTEM QUE VOL FER SI SEGUIR O QUEDAR-SE I FER L'ACCIO DE LA CASELLA 4
                    com.example.ekonos_logica.Missatges.Preguntas.PreguntaCasellaEsp4();

                    opcioC4 = input.nextInt();// GUARDEM LA OPCIO EN LA VARIABLE
                    if (opcioC4 == 2) {// SI ES LA OPCIO 2
                        empresa.setPotAvancar(false);// FEM QUE LA EMPRESA NO PUGUI AVANCAR MES


                        for (int i = 0; i < caselles.size(); i++) {// RECORREM TOTES LES CASELLES
                            if (caselles.get(i).propietari == empresa) {// I NOMES FEM CAS A LES QUE SIGUIN DE LA EMPRESA CORRESPONENT
                                casellesPropietariEmpresa.add(caselles.get(i));//I LAS AFEGIM A UNA ARRAY LIST
                            }
                        }
                        com.example.ekonos_logica.Missatges.Preguntas.PreguntarCaselles();
                        opcio = input.nextInt();// LA GUARDEM EN UNA VARABLE
                        if (opcio == 1) {//SI ES OPCIO 1 HAUREM DE TREURE TOTES LES CASELLES VUIDES QUE SIGUI VEINES DE LA EMPRESA SELECIONADA

                            do {
                                for (int i = 0; i < 2; i++) {
                                    semaforAgafarCaselles = accioEspecial1(i, empresa, casellesPropietariEmpresa, casellesVeinesVuides, caselles);
                                }
                            } while (!semaforAgafarCaselles);

                        } else if (opcio == 2) {
                            for (int i = 0; i < 2; i++) {
                                semaforAgafarCaselles = accioEspecial2(i, empresa, casellesPropietariEmpresa, casellesVeinesVuides, caselles);
                            }
                        }
                    } else if (opcioC4 == 2) {
                        com.example.ekonos_logica.Missatges.Confimacio.SeguirAvancant();
                    }
                } while (opcioC4 != 1 && opcioC4 != 2);


            } else if (empresa.getMarcador() == 5) {
                ///////////////////////////////ACCIO DE CASELLA 6\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
                empresa.setPotAvancar(false);// FEM QUE LA EMPRESA NO PUGUI AVANCAR MES

                do {

                    for (int i = 0; i < caselles.size(); i++) {// RECORREM TOTES LES CASELLES
                        if (caselles.get(i).propietari == empresa) {// I NOMES FEM CAS A LES QUE SIGUIN DE LA EMPRESA CORRESPONENT
                            casellesPropietariEmpresa.add(caselles.get(i));//I LAS AFEGIM A UNA ARRAY LIST
                        }
                    }

                    com.example.ekonos_logica.Missatges.Preguntas.PreguntarCaselles();
                    opcioC6 = input.nextInt();// LA GUARDEM EN UNA VARABLE

                    if (opcioC6 == 1) {//SI ES OPCIO 1 HAUREM DE TREURE TOTES LES CASELLES VUIDES QUE SIGUI VEINES DE LA EMPRESA SELECIONADA
                        for (int i = 0; i < 3; i++) {
                            semaforAgafarCaselles = accioEspecial1(i, empresa, casellesPropietariEmpresa, casellesVeinesVuides, caselles);
                        }
                    } else if (opcioC6 == 2) {
                        for (int i = 0; i < 3; i++) {
                            semaforAgafarCaselles = accioEspecial2(i, empresa, casellesPropietariEmpresa, casellesVeinesVuides, caselles);
                        }
                    }

                }while (!semaforAgafarCasella1) ;
            }
        }
    }



    public void crearCarta(int opcio) {
        /**
         * Aquesta funcio crea les cartes, TOTES les cartes estan predefinides */
        switch (opcio) {
//---------------------------------------------------------------------\\
            case 1:
                funcioMesID("red", "dBlue", "yellow", 0);
                break;
            case 2:
                funcioMesID("red", "dBlue", "lBlue", 1);
                break;
            case 3:
                funcioMesID("red", "dBlue", "green", 2);
                break;
            case 4:
                funcioMesID("red", "green", "yellow", 3);
                break;
            case 5:
                funcioMesID("red", "lBlue", "yellow", 4);
                break;
            case 6:
                funcioMesID("red", "green", "lBlue", 5);
                break;
//---------------------------------------------------------------------\\
            case 7:
                funcioMesID("green", "lBlue", "pink", 6);
                break;
            case 8:
                funcioMesID("green", "lBlue", "red", 7);
                break;
            case 9:
                funcioMesID("green", "yellow", "pink", 8);
                break;
            case 10:
                funcioMesID("green", "pink", "red", 9);
                break;
            case 11:
                funcioMesID("green", "yellow", "red", 10);
                break;
            case 12:
                funcioMesID("green", "yellow", "lBlue", 11);
                break;
//---------------------------------------------------------------------\\
            case 13:
                funcioMesID("dBlue", "yellow", "pink", 12);
                break;
            case 14:
                funcioMesID("dBlue", "green", "lBlue", 13);
                break;
            case 15:
                funcioMesID("dBlue", "yellow", "lBlue", 14);
                break;
            case 16:
                funcioMesID("dBlue", "lBlue", "pink", 15);
                break;
            case 17:
                funcioMesID("dBlue", "green", "pink", 16);
                break;
            case 18:
                funcioMesID("dBlue", "green", "yellow", 17);
                break;
//---------------------------------------------------------------------\\
            case 19:
                funcioMesID("lBlue", "dBlue", "green", 18);
                break;
            case 20:
                funcioMesID("lBlue", "pink", "green", 19);
                break;
            case 21:
                funcioMesID("lBlue", "red", "dBlue", 20);
                break;
            case 22:
                funcioMesID("lBlue", "pink", "red", 21);
                break;
            case 23:
                funcioMesID("lBlue", "red", "green", 22);
                break;
            case 24:
                funcioMesID("lBlue", "dBlue", "pink", 23);
                break;
//---------------------------------------------------------------------\\
            case 25:
                funcioMesID("pink", "dBlue", "green", 24);
                break;
            case 26:
                funcioMesID("pink", "green", "yellow", 25);
                break;
            case 27:
                funcioMesID("pink", "red", "green", 26);
                break;
            case 28:
                funcioMesID("pink", "red", "yellow", 27);
                break;
            case 29:
                funcioMesID("pink", "red", "dBlue", 28);
                break;
            case 30:
                funcioMesID("pink", "dBlue", "yellow", 29);
                break;
//---------------------------------------------------------------------\\
            case 31:
                funcioMesID("yellow", "lBlue", "pink", 30);
                break;
            case 32:
                funcioMesID("yellow", "lBlue", "red", 31);
                break;
            case 33:
                funcioMesID("yellow", "pink", "red", 32);
                break;
            case 34:
                funcioMesID("yellow", "pink", "dBlue", 33);
                break;
            case 35:
                funcioMesID("yellow", "red", "dBlue", 34);
                break;
            case 36:
                funcioMesID("yellow", "lBlue", "dBlue", 35);
                break;
            default:
                com.example.ekonos_logica.Missatges.Errors.errorAcrearCarta();

                break;
        }

    }
}