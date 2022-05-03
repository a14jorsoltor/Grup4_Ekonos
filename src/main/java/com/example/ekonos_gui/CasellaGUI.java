package com.example.ekonos_gui;

import java.util.ArrayList;

//CASELLES DEL MAPA D'EUROPA
public class CasellaGUI {
    /**
     *
     * @param ID ID de la casella
     * @param empresa casella qui la te ocupada
     */
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

    /**
     * @param tauler pasem el tauler
     * @param numCaselles i el numero de caselles
     */
    public void afegirVeines(TaulerGUI tauler, int... numCaselles) {
        ArrayList<CasellaGUI> casella = tauler.caselles;
        for (int i = 0; i < numCaselles.length; i++) {
            this.veines.add(casella.get(numCaselles[i] - 1));
        }
    }
}
