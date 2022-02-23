package com.example.ekonos_logica.Main;

import java.util.ArrayList;

public class Jugador {

    /**
     * @param nom Dir el nom del jugador.
     * @param id Identifica el jugador.
     * @param numAccions Diu el numero d'accions te el jugador.
     * @param tokens El numero de diners / monedes que te el jugador actualment
     * @param ma Son les cartes que te el jugador a la ma.
     *
     */

    private String nom;
    private int id;
    private int numAccions = 0;

    private int numAccionsAlpha = 0;
    private int numAccionsDelta = 0;
    private int numAccionsBeta = 0;
    private int numAccionsGamma = 0;
    private int numAccionsOmicron = 0;
    private int numAccionsEpsilon = 0;

    public int getNumAccionsAlpha() {
        return numAccionsAlpha;
    }

    public void setNumAccionsAlpha(int numAccionsAlpha) {
        this.numAccionsAlpha = numAccionsAlpha;
    }

    public int getNumAccionsDelta() {
        return numAccionsDelta;
    }

    public void setNumAccionsDelta(int numAccionsDelta) {
        this.numAccionsDelta = numAccionsDelta;
    }

    public int getNumAccionsBeta() {
        return numAccionsBeta;
    }

    public void setNumAccionsBeta(int numAccionsBeta) {
        this.numAccionsBeta = numAccionsBeta;
    }

    public int getNumAccionsGamma() {
        return numAccionsGamma;
    }

    public void setNumAccionsGamma(int numAccionsGamma) {
        this.numAccionsGamma = numAccionsGamma;
    }

    public int getNumAccionsOmicron() {
        return numAccionsOmicron;
    }

    public void setNumAccionsOmicron(int numAccionsOmicron) {
        this.numAccionsOmicron = numAccionsOmicron;
    }

    public int getNumAccionsEpsilon() {
        return numAccionsEpsilon;
    }

    public void setNumAccionsEpsilon(int numAccionsEpsilon) {
        this.numAccionsEpsilon = numAccionsEpsilon;
    }

    private int tokens;
    public ArrayList<Carta> ma = new ArrayList<>();


    public Jugador(String nom, int id) {
        super();
        this.nom = nom;
        this.id = id;
        this.tokens = 0;
    }


    public int getNumAccions() {
        return numAccions;
    }

    public void setNumAccions(int numAccions) {
        this.numAccions = numAccions;
    }

    public int getTokens() {
        return tokens;
    }
    public void setTokens(int tokens) {
        this.tokens = tokens;
    }

    public String getNom() {
        return nom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String toString() {
        return "Jugador [nom=" + nom + ", id=" + id + "]";
    }


}
