package com.example.ekonos_logica.Missatges;

import Main.Carta;
import Main.Jugador;

public class Preguntas {

    public static void preguntaCarta(Carta cartaATirar){
        System.out.println("Quina funcio vols fer: \nFuncio 1: " + cartaATirar.getF1() + "\nFuncio 2: " + cartaATirar.getF2() + "\nFuncio 3: " + cartaATirar.getF3());
    }

    public static void PreguntarCaselles() {
        System.out.println("Opcio 1) Casella vuida\nOpcio 2) Casella rival");//PREGUNTEM SI QUINA OPCIO VOL

    }

    public static void PreguntaCasellaEsp4() {
        System.out.println("Quina opcio vols ");
        System.out.println("1) Seguir\n2)Activar Casella 4");
    }

    public static void PreguntarCartaTirar(Jugador jugador) {
        System.out.println("Quina carta vols tirar " + jugador.getNom() + " (ID)");
    }
    public static void casellaAposar(){   System.out.println("Quina casella vols posar la filial  (0 - 35)"); }
    public static void quinaOpcioVols(){ System.out.println("Quina opcio vols\n1)Venta\n2)Compra\n3)Sortir");}

    public static void comprarAcions() {
        System.out.println("Vols comprar un altra Accio:" +
                "\n1)Si" +
                "\n2)No");
    }

    public static void empresaVendre() {
        System.out.println("Quina empresa vols vendre");
    }
    public static  void empresaAcomprarAccions(){System.out.println("Digam quina empressa vols comprar les accions(colors)");

    }
}
