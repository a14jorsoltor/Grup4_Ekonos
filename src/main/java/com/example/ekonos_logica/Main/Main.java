package com.example.ekonos_logica.Main;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import com.example.BaseDades.Inserts.Inserts;

public class Main {
    static Inserts inserts = new Inserts();
    Scanner input = new Scanner(System.in);
    static Connection connexio = null;
    static int numFilialsAlpha = 0;
    static int numFilialsDelta = 0;
    static int numFilialBeta = 0;
    static int numFilialsGama = 0;
    static int numFilialsOmicron = 0;
    static int numFilialsEpsilon = 0;
static int numFilialsnull = 0;

    public static void main(String[] args) throws SQLException {




        /*

        Baralla baralla = new Baralla();
        ArrayList<Jugador> jugadors = new ArrayList<>();
        //CREAR JUGADORS
        //SOUT PER SAVER QUANTS JUGADORS HI HAURAN EN AQUEST CAS HI HAN 4
        Jugador nouJugador1 = new Jugador("Jordi", 0);
        jugadors.add(nouJugador1);
        Jugador nouJugador2 = new Jugador("Adria", 1);
        jugadors.add(nouJugador2);
        Jugador nouJugador3 = new Jugador("Pau", 2);
        jugadors.add(nouJugador3);
        Jugador nouJugador4 = new Jugador("Abel", 3);
        jugadors.add(nouJugador4);
        Jugador jugadorVuit = new Jugador("Ningu", 4);


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
        for(int i = 0; i < empresas.size(); i++) {
            empresas.get(i).president = jugadorVuit;
        }
        //CREAR TAULER
        Tauler tauler = new Tauler(baralla, jugadors, empresas, empresaVuit); //CREEM EL TAULER AQUI PASSANT-LI LA BARALLA CREADA ELS JUGADORS CREATS LAS EMPRESAS CREADES I LA EMPRESA "FANTASMA"
        try {
            tauler.ronda(2); //METODE PER FER LES RONDES
        } catch (Exception e) {
            e.printStackTrace();
        }
        finalPartida(jugadors, tauler);
*/
    }

    public static void finalPartida(ArrayList<Jugador> jugadors, Tauler tauler) throws SQLException {
        for (int i = 0; i < jugadors.size(); i ++) {
            inserts.insertJugador( jugadors.get(i).getNom());
        }

        identificarSeus(tauler);
        inserts.insertPartida(1, numFilialsAlpha, numFilialsDelta,numFilialBeta,numFilialsGama,numFilialsOmicron,numFilialsEpsilon);

        System.out.println("S'ha afegit un jugador a la bd");


    }

    private static void identificarSeus(Tauler tauler) {
        String color;
        for(int i = 0; i<tauler.caselles.size(); i++){
            color = tauler.caselles.get(i).propietari.getColor();
            switch (color){
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
