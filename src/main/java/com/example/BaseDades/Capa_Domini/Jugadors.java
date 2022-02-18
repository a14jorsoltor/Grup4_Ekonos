package com.example.BaseDades.Capa_Domini;

public class Jugadors {
int id;
String nom;

    public Jugadors(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
                "id=" + id +
                ", nom='" + nom + '\'' +
                '}';
    }
}
