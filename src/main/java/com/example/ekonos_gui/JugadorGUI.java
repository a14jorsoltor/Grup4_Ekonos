package com.example.ekonos_gui;

import java.util.ArrayList;

public class JugadorGUI {

    public JugadorGUI(String nom, int id) {
        super();
        this.nom = nom;
        this.id = id;
        this.tokens = 0;
    }

    private String nom, fitxa;
    private int id;

    public int getNumAccions() {
        return numAccions;
    }

    public void setNumAccions(int numAccions) {
        this.numAccions = numAccions;
    }

    private int numAccions = 0;
    private int tokens;
    public ArrayList<CartaGUI> ma = new ArrayList<>();


    public int getTokens() {
        return tokens;
    }
    public void setTokens(int tokens) {
        this.tokens = tokens;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getFitxa() {
        return fitxa;
    }

    public void setFitxa(String fitxa) {
        this.fitxa = fitxa;
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
