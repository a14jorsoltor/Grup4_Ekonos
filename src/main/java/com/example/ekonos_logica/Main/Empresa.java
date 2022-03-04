package com.example.ekonos_logica.Main;

import java.util.ArrayList;



public class Empresa {



    final int[] casellesEspecial = new int[]{3, 5};
    final int numMarcador = 6;
    public ArrayList<Jugador> accions = new ArrayList<>();
    public char[] taulerEmpresa = new char[numMarcador];


    /**
     * @param nom Nom de la empresa.
     * @param color Color amb la cual es definira.
     */
    public Empresa(String nom, String color) {
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

    public Jugador president;
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

    /**
     * avancarMarcador es una funcio per avançar el marcador de la empres i actualitzar la taula
     */
    public void avancarMarcador() {
        if (isPotAvancar()) {
            this.setMarcador(getMarcador() + 1);
            taulerEmpresa[getMarcador()] = '*';
            if (getMarcador() == 4 || getMarcador() == 6)
                taulerEmpresa[getMarcador() - 1] = '/';
            else
                taulerEmpresa[getMarcador() - 1] = ' ';
        } else
            com.example.ekonos_logica.Missatges.Errors.errorNoPotsAvancar(this.getNom());
    }

    /**
     * Aquesta funcio es per posar una acico a la taula d'accions
     * @param jugador pasem el jugador el qual ficarem la accio
     * @param jugadors pasem tots el jugador per la funcio de cambiPresi
     * @param color Pasem el color de la empresa
     * @return Retornem el numero d'accios que te despres de posar la accio.
     */
    //
    public int posarAccio(Jugador jugador, ArrayList<Jugador> jugadors, String color) {

        accions.add(jugador);
        switch (color) {
            case "red":
                jugador.setNumAccionsAlpha(jugador.getNumAccionsAlpha() + 1);
                break;
            case "green":
                jugador.setNumAccionsDelta(jugador.getNumAccionsDelta() + 1);
                break;
            case "dBlue":
                jugador.setNumAccionsBeta(jugador.getNumAccionsBeta() + 1);
                break;
            case "lBlue":
                jugador.setNumAccionsGamma(jugador.getNumAccionsGamma() + 1);
                break;
            case "pink":
                jugador.setNumAccionsOmicron(jugador.getNumAccionsOmicron() + 1);
                break;
            case"yellow":
                jugador.setNumAccionsEpsilon(jugador.getNumAccionsEpsilon() + 1);
                break;
            default:
                com.example.ekonos_logica.Missatges.Errors.colorIncorrecte();
                break;
        }
        jugador.setNumAccions(jugador.getNumAccions() + 1);

        cambiPresi(jugadors);
        return accions.size();
    }

    /**
     * @param jugador pasem el jugador el qual ficarem la accio
     * @param jugadors pasem tots el jugador per la funcio de cambiPresi
     */
    public void treureAccio(Jugador jugador, ArrayList<Jugador> jugadors) {

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
     * @param jugadors per comparar totes les accions que tenen.
     */
    //CAMBIAR DE PRESIDENT
    public void cambiPresi(ArrayList<Jugador> jugadors) {

        int contador = 0;
        Jugador nouPresi = null;//PRESIDENT AUXILIAR
        for (int i = 0; i < jugadors.size(); i++) {
            if (contador < jugadors.get(i).getNumAccions()) {
                nouPresi = jugadors.get(i);
            }
        }
        president = nouPresi;

    }


    //TREURE TAULER DE ACCIONS
    public void taulerAccions() {
        com.example.ekonos_logica.Missatges.Taulers.TaulerAvancamentEmpresa(this);

    }
    //////////////////////////////////////////////////////////////////////////

    public void taulerMarcador() { // FUNCIO PER IMPRIMIR EL TAULER
        com.example.ekonos_logica.Missatges.Taulers.taulerMarcador(this);

    }
//////////////////////////////////////////////////////////////////////////
}


