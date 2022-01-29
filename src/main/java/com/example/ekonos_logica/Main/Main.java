package com.example.ekonos_logica.Main;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {


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


    }


}
