package com.example.ekonos_gui.Missatges;


import com.example.ekonos_gui.CasellaGUI;
import com.example.ekonos_gui.EmpresaGUI;
import com.example.ekonos_gui.JugadorGUI;

import java.util.ArrayList;

public class NormalsGUI {
    public static void numeroCasella(int num) {
        System.out.println("Casella " + num);//DESPRES PREGUNTEM 2 CASELLES
    }

    public static void tensTantsTokens(JugadorGUI jugador) {
        System.out.println("Tens: " + jugador.getTokens() + " tokens");
    }
    public static void casellesPropietari(ArrayList<CasellaGUI> casellesPropietariEmpresa, int i){
        System.out.println(casellesPropietariEmpresa.get(i).getID());
    };
    public static void numCaselles(int num){
        System.out.println("Casella " + num);//DESPRES PREGUNTEM 2 CASELLES();//LA GUARDEM EN UNA VARIABLE
    }

    public static void EnenyarMa(JugadorGUI jugador, int i) {
        System.out.println(jugador.ma.get(i).toString());

    }
    public static void preuEmpresa(ArrayList<EmpresaGUI> empresas, int i){   System.out.println("Empresa " + empresas.get(i).getNom() + " Color: " + empresas.get(i).getColor() + " Cost: " + (empresas.get(i).accions.size() + 1));}


    public static void accionsDeToteslesEmpreses() {
        System.out.println("Accions de totes les empresas");
    }
}
