package com.example.ekonos_logica.Main;

import java.util.ArrayList;

//CASELLES DEL MAPA D'EUROPA
public class Casella {

    private int ID;
    ArrayList<Casella> veines = new ArrayList<Casella>();
    public Empresa propietari;


    public Casella(int ID, Empresa empresa) {
        super();
        this.ID = ID;
        this.propietari = empresa;
    }


    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    /**
     * afegirVeines serveix per afegir caselles veines a la array de veines
     * @param tauler li pasem el tauler per agafar les caselles.
     * @param numCaselles li pasem quines caselles son les veines a partir del seu id.
     */

    public void afegirVeines(Tauler tauler, int... numCaselles) {



        ArrayList<Casella> casella = tauler.caselles;
        for (int i = 0; i < numCaselles.length; i++) {
            this.veines.add(casella.get(numCaselles[i] - 1));
        }
    }
}
