package com.example.ekonos_logica.Main;

import java.sql.Array;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

import com.example.BaseDades.Inserts.Inserts;

public class Main {
    static Inserts inserts = new Inserts();
    static Scanner input = new Scanner(System.in);
    static Connection connexio = null;
    static int numFilialsAlpha = 0;
    static int numFilialsDelta = 0;
    static int numFilialBeta = 0;
    static int numFilialsGama = 0;
    static int numFilialsOmicron = 0;
    static int numFilialsEpsilon = 0;
    static int numFilialsnull = 0;
    static ArrayList<Jugador> jugadors = new ArrayList<>();

    public static void main(String[] args) throws SQLException {


        Baralla baralla = new Baralla();
        //CREAR JUGADORS
        //SOUT PER SAVER QUANTS JUGADORS HI HAURAN EN AQUEST CAS HI HAN 4
        crearJugadors();
        Jugador jugadorVuit = new Jugador("Ningu", 7);


        //CREAR EMPRESAS
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

        //OMPLIR BARALLA (VA BE)
        baralla.omplirBaralla();
        for (int i = 0; i < empresas.size(); i++) {
            empresas.get(i).president = jugadorVuit;
        }
        //CREAR TAULER
        Tauler tauler = new Tauler(baralla, jugadors, empresas, empresaVuit); //CREEM EL TAULER AQUI PASSANT-LI LA BARALLA CREADA ELS JUGADORS CREATS LAS EMPRESAS CREADES I LA EMPRESA "FANTASMA"
        try {
         //   tauler.ronda(2); //METODE PER FER LES RONDES

            tauler.ronda(1);


        } catch (Exception e) {
            e.printStackTrace();
        }
        for (int i = 0; i < jugadors.size(); i++) {
            jugadors.get(i).setPuntsTotals(calcularGuanyador(jugadors.get(i), numFilialsAlpha, numFilialsDelta, numFilialBeta, numFilialsGama, numFilialsOmicron, numFilialsEpsilon, numFilialsnull));
        }






        ordenarGuanyador(jugadors);

        finalPartida(jugadors, tauler);

    }

    private static ArrayList<Integer> ordenarGuanyador(ArrayList<Jugador> jugadors) {
        ArrayList<Jugador> podiJug;
        ArrayList<Integer> podi = new ArrayList<>();
        podiJug = jugadors;
        for (int i = 0; i < podiJug.size(); i++) {
            for (int j = 0; j < podiJug.size(); j++) {
                if (podiJug.get(i).getPuntsTotals() >= podiJug.get(j).getPuntsTotals() && i != j) {
                    Jugador jugAuxi = podiJug.get(i);
                    Jugador jugAuxj = podiJug.get(j);
                    podiJug.get(i).equals(jugAuxj);
                    podiJug.get(j).equals(jugAuxi);
                }
            }
        }
        for (int i = 0; i < podiJug.size(); i++) {
            for (int j = 0; j < jugadors.size(); j++) {
                if(podiJug.get(i).equals(jugadors.get(j))){
                    podi.add(i);
                }
            }
        }

        return podi;
    }
//hola

    private static int calcularGuanyador(Jugador jugador, int numFilialsAlpha, int numFilialsDelta, int numFilialBeta, int numFilialsGama, int numFilialsOmicron, int numFilialsEpsilon, int numFilialsnull) {
        int totalPunts = 0;
        totalPunts += jugador.getNumAccionsAlpha() * numFilialsAlpha;
        totalPunts += jugador.getNumAccionsDelta() * numFilialsDelta;
        totalPunts += jugador.getNumAccionsBeta() * numFilialBeta;
        totalPunts += jugador.getNumAccionsGamma() * numFilialsGama;
        totalPunts += jugador.getNumAccionsOmicron() * numFilialsOmicron;
        totalPunts += jugador.getNumAccionsEpsilon() * numFilialsEpsilon;
        totalPunts += jugador.getTokens();
        return totalPunts;
    }

    private static void crearJugadors() {
        /**
         * @param numJug nom dels jugador que ficara l'usuari
         */
        int numJug;
        do {
            com.example.ekonos_logica.Missatges.Preguntas.preguntarJugadors();
            numJug = input.nextInt();

            if (numJug > 6) {
                com.example.ekonos_logica.Missatges.Errors.moltsJugadors();
            } else if (numJug < 3) {
                com.example.ekonos_logica.Missatges.Errors.pocsJugadors();
            }

        } while (numJug < 3 || numJug > 6);
        input.nextLine();
        for (int i = 0; i < numJug; i++) {
            com.example.ekonos_logica.Missatges.Preguntas.preguntarNomJugadors(i);
            String nom = input.nextLine();
            Jugador nouJug = new Jugador(nom, i);
            jugadors.add(nouJug);

        }
    }

    /**
     * @param jugadors Pasem la arrayList de jugadors.
     * @param tauler   pasem el tauler sencer.
     */
    public static void finalPartida(ArrayList<Jugador> jugadors, Tauler tauler) throws SQLException {

    for(int i = 0; i < jugadors.size(); i++) {
        jugadors.get(i).intertJugador();
    }
    identificarSeus(tauler);
    inserts.insertPartida( jugadors.size(), numFilialsAlpha, numFilialsDelta, numFilialBeta, numFilialsGama, numFilialsOmicron, numFilialsEpsilon);
        for (int i = 0; i < jugadors.size(); i++) {
            inserts.insertTiene(jugadors.get(i).getNom(), ordenarGuanyador(jugadors).get(i), jugadors.size(), jugadors.get(i).getId(), jugadors.get(i).getNumAccionsAlpha(), jugadors.get(i).getNumAccionsDelta(), jugadors.get(i).getNumAccionsOmicron(), jugadors.get(i).getNumAccionsBeta(), jugadors.get(i).getNumAccionsGamma(), jugadors.get(i).getNumAccionsEpsilon(), jugadors.get(i).getTokens());
        }
    }

    /**
     * @param tauler Pasem el tauler per veura la taula d'europa
     */
    private static void identificarSeus(Tauler tauler) {
        String color;
        for (int i = 0; i < tauler.caselles.size(); i++) {
            color = tauler.caselles.get(i).propietari.getColor();
            switch (color) {
                case "red":
                    numFilialsAlpha++;
                    break;
                case "green":
                    numFilialsDelta++;
                    break;
                case "dBlue":
                    numFilialBeta++;
                    break;
                case "lBlue":
                    numFilialsGama++;
                    break;
                case "pink":
                    numFilialsOmicron++;
                    break;
                case "yellow":
                    numFilialsEpsilon++;
                    break;
                default:
                    numFilialsnull++;
                    break;
            }


        }
    }
}
