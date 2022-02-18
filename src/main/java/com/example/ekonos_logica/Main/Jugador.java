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
