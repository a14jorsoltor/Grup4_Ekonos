package com.example.ekonos_gui;

import java.util.ArrayList;


public class EmpresaGUI {
    final int[] casellesEspecial = new int[]{3, 5};
    final int numMarcador = 6;
    public ArrayList<JugadorGUI> accions = new ArrayList<>();
    public char[] taulerEmpresa = new char[numMarcador];


    public EmpresaGUI(String nom, String color) {
        super();
        this.nom = nom;
        this.color = color;
        this.existeix = false;
        //////////////////////////////////////////////////////////////////////////////////////////////////
        /////////////////AQUI FEM QUE LES CASELLES DE L'AVANÇ DE L'EMRESA SIGUI UN ESPAI/////////////////
        for (int i = 0; i < taulerEmpresa.length; i++) {
            taulerEmpresa[i] = ' ';
            for (int j = 0; j < casellesEspecial.length; j++) {
                if (casellesEspecial[j] == i)
                    taulerEmpresa[i] = '/';
                if (i == 0) taulerEmpresa[i] = '*';
            }
        }
    }


    private String nom, color;

    public boolean isPotAvancar() {

        return potAvancar;
    }

    public void setPotAvancar(boolean potAvancar) {

        this.potAvancar = potAvancar;

    }

    private boolean potAvancar = true, existeix;

    public boolean isExisteix() {
        return existeix;
    }

    public void setExisteix(boolean existeix) {
        this.existeix = existeix;
    }

    public JugadorGUI president;
    int marcador = 0; //AQUESTA VARIABLE ES PER VEUERE LO AVANÇADA QUE ESTA LA EMPRESA

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMarcador() {
        return marcador;
    }

    public void setMarcador(int marcador) {
        this.marcador = marcador;
    }

    public void avancarMarcador() {
        if (isPotAvancar()) {
            this.setMarcador(getMarcador() + 1);
            taulerEmpresa[getMarcador()] = '*';
            if (getMarcador() == 4 || getMarcador() == 6)
                taulerEmpresa[getMarcador() - 1] = '/';
            else
                taulerEmpresa[getMarcador() - 1] = ' ';
        }
    }

    /**
     *
     *  @param jugador jugador a qui interactua
     *  @param jugadors llista de tots el jugador
     *  @return retornem el numero de las accions
     */
    public int posarAccio(JugadorGUI jugador, ArrayList<JugadorGUI> jugadors) {
        accions.add(jugador);
        jugador.setNumAccions(jugador.getNumAccions() + 1);
        cambiPresi(jugadors);
        return accions.size();
    }

    /**
     *
     * @param jugador jugador de qui treu la accio
     * @param jugadors array de tots els jugadors
     */
    public void treureAccio(JugadorGUI jugador, ArrayList<JugadorGUI> jugadors) {
        int numAccio = 0;
        for (int i = 0; i < accions.size(); i++) {
            if (jugador.getId() == accions.get(i).getId()) {
                numAccio = i;
            }
        }
        accions.remove(numAccio);
        cambiPresi(jugadors);
        jugador.setNumAccions(jugador.getNumAccions() - 1);
    }

    /**
     *
     * @param jugadors array de tots els jugadors
     */
    //CAMBIAR DE PRESIDENT
    public void cambiPresi(ArrayList<JugadorGUI> jugadors) {
        int contador = 0;
        JugadorGUI nouPresi = null;//PRESIDENT AUXILIAR
        for (int i = 0; i < jugadors.size(); i++){
            if(contador < jugadors.get(i).getNumAccions()){
              nouPresi = jugadors.get(i);
            }
        }
        president = nouPresi;

}

}


