package com.example.ekonos_logica.Main;

import java.util.ArrayList;

//CASELLES DEL MAPA D'EUROPA
public class Casella {
    /**
     * @param ID id de la casella per diferenciarles a totes.
     * @param veines Aquesta ArrayList serveix per dir quines caselles son veines a aqueta casella.
     * @param propietari Serveix per dir qui es el propietari d'aqueta casella.
     */
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


    public void afegirVeines(Tauler tauler, int... numCaselles) {

        /**
         * afegirVeines serveix per afegir caselles veines a la array de veines
         * @param tauler li pasem el tauler per agafar les caselles.
         * @param numCaselles li pasem quines caselles son les veines a partir del seu id.
         */
        ArrayList<Casella> casella = tauler.caselles;
        for (int i = 0; i < numCaselles.length; i++) {
            this.veines.add(casella.get(numCaselles[i] - 1));
        }
    }
}
