package com.example.LogicaParaGUI;

import java.util.ArrayList;

//CASELLES DEL MAPA D'EUROPA
public class Casella {

    public Casella(int ID, Empresa empresa) {
        super();
        this.ID = ID;
        this.propietari = empresa;
    }

    private int ID;
    ArrayList<Casella> veines = new ArrayList<Casella>();
    public Empresa propietari;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    //
    public void afegirVeines(Tauler tauler, int... numCaselles) {
        ArrayList<Casella> casella = tauler.caselles;
        for (int i = 0; i < numCaselles.length; i++) {
            this.veines.add(casella.get(numCaselles[i] - 1));
        }
    }
}
