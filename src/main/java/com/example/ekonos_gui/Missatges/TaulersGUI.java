package com.example.ekonos_gui.Missatges;


import com.example.ekonos_gui.CasellaGUI;
import com.example.ekonos_gui.EmpresaGUI;

import java.util.ArrayList;

public class TaulersGUI {
    public static void taulerMarcador(EmpresaGUI empresa) {

        System.out.println("Empresa: " + empresa.getNom() + "(" + empresa.getColor() + ")");
        for (int i = 0; i < empresa.taulerEmpresa.length; i++) {
            System.out.print(" " + empresa.taulerEmpresa[i] + " " + "||");

        }
        System.out.print("\n");

    }

    public static void TaulerAvancamentEmpresa(EmpresaGUI empresa) {

        System.out.println("Empresa: " + empresa.getNom() + " (" + empresa.getColor() + ") " + " PRESIDENT: " + empresa.president.getNom());
        System.out.println("============");
        for (int i = 0; i < empresa.accions.size(); i++) {

            System.out.print(i + ": " + empresa.accions.get(i).getNom() + " ||");

        }
        System.out.println("\n============");
    }

    public static void ensenyarCaselles(int i, ArrayList<CasellaGUI> caselles) {
        System.out.println("Empresa " + caselles.get(i).getID() + ":");
        System.out.println("Propietari: " + caselles.get(i).propietari.getNom());
    }

    public static void taulerMarcador(com.example.ekonos_logica.Main.Empresa empresa) {
    }

    public static void TaulerAvancamentEmpresa(com.example.ekonos_logica.Main.Empresa empresa) {
    }
}
