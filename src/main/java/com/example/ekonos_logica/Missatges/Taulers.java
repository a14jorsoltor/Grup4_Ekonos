package com.example.ekonos_logica.Missatges;


import com.example.ekonos_logica.Main.Casella;
import com.example.ekonos_logica.Main.Empresa;


import java.util.ArrayList;

public class Taulers {
    public static void taulerMarcador(Empresa empresa) {

        System.out.println("Empresa: " + empresa.getNom() + "(" + empresa.getColor() + ")");
        for (int i = 0; i < empresa.taulerEmpresa.length; i++) {
            System.out.print(" " + empresa.taulerEmpresa[i] + " " + "||");

        }
        System.out.print("\n");

    }

    public static void TaulerAvancamentEmpresa(Empresa empresa) {

        System.out.println("Empresa: " + empresa.getNom() + " (" + empresa.getColor() + ") " + " PRESIDENT: " + empresa.president.getNom());
        System.out.println("============");
        for (int i = 0; i < empresa.accions.size(); i++) {

            System.out.print(i + ": " + empresa.accions.get(i).getNom() + " ||");

        }
        System.out.println("\n============");
    }

    public static void ensenyarCaselles(int i, ArrayList<Casella> caselles) {
        System.out.println("Empresa " + caselles.get(i).getID() + ":");
        System.out.println("Propietari: " + caselles.get(i).propietari.getNom());
    }
}
