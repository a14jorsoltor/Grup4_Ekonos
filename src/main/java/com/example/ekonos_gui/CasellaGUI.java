package com.example.ekonos_gui;

import java.util.ArrayList;

//CASELLES DEL MAPA D'EUROPA
public class CasellaGUI {

    public CasellaGUI(int ID, EmpresaGUI empresa) {
        super();
        this.ID = ID;
        this.propietari = empresa;
    }

    private int ID;
    ArrayList<CasellaGUI> veines = new ArrayList<CasellaGUI>();
    public EmpresaGUI propietari;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    //
    public void afegirVeines(TaulerGUI tauler, int... numCaselles) {
        ArrayList<CasellaGUI> casella = tauler.caselles;
        for (int i = 0; i < numCaselles.length; i++) {
            this.veines.add(casella.get(numCaselles[i] - 1));
        }
    }
}
