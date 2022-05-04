package com.example.BaseDades.Capa_Domini;

/**
 * Aquesta classe 
 */
public class Jugadors {

String nom;

    public Jugadors( String nom) {

        this.nom = nom;
    }




    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Jugadors{" +
                ", nom='" + nom + '\'' +
                '}';
    }
}
