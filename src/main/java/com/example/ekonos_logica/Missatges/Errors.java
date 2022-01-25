package com.example.ekonos_logica.Missatges;

import com.example.ekonos_logica.Main.Casella;
import com.example.ekonos_logica.Main.Empresa;

import java.util.ArrayList;

public class Errors {
    public static void casellaIncorreecta() {
        System.out.println("Casella incorrecta");
    }
    public static void cartaErronea(){
        System.out.println("Carta erronea ");
    }

    public static void ErrorCrearCarta() {
        // posible try Catch
        System.out.println("Error al crear carta");

    }
    public static void colorIncorrecte(){
        System.out.println("Color incorrecta");
    }

    public static void errorCrearMa() {
        System.out.println("ERROR EN LA CREACIO DE LA MA");

    }
    public static void casellaAgafada(ArrayList<Casella>caselles, int numeroCasella){
        System.out.println("Casella " + caselles.get(numeroCasella).getID() + " esta agafada");
    }

    public static void noPotAvançar(Empresa empresa) {
        System.out.println("Empresa " + empresa.getNom() + " no pot avancar");

    }
    public static void noTensAccions(){System.out.println("No tens accions");}
    public static void finalApartatAccio(){System.out.println("FINAL D'APARTAT ACCIO");}
    public static void noTensTokens(){  System.out.println("No tens token");}

    public static void errorNoPotsAvancar(Empresa empresa) {
        System.out.println("Empresa " + empresa.getNom() + " no pot avancar");
    }
    public static void errorAcrearCarta(){System.out.println("Error al crear carta");};

    public static void casellaIncorrecta() {
        System.out.println("Cassella incorrecta");
    }

    public static void errorMidaMa() {
        System.out.println("ERROR EN LA CREACIO DE LA MA");
    }
}