package com.example.BaseDades.Capa_Domini;

public class Tiene {
    String  nom;
    int posicion;
    int numeroJugadors;
    int Id_Partida ;
    int NumeroAssocioAlpha ;
    int NumeroAssocioDelta;
    int NumeroAssocioOmicron ;
    int NumeroAssocioBeta;
    int NumeroAssocioGama ;
    int NumerasoccioEpsilon;
    int NumMonedas ;


    /**
     * @param nom nom jugador
     * @param posicion posicio del jugador en la partda
     * @param numeroJugadors numero de jugadors en la partida
     * @param id_Partida id de la partida
     * @param numeroAssocioAlpha Numero d'asosiacion de la empres alpha
     * @param numeroAssocioDelta Numero d'asosiacion de la empres delta
     * @param numeroAssocioOmicron Numero d'asosiacion de la empres omicron
     * @param numeroAssocioBeta Numero d'asosiacion de la empres beta
     * @param numeroAssocioGama Numero d'asosiacion de la empres gama
     * @param numerasoccioEpsilon Numero d'asosiacion de la empres epsilon
     * @param numMonedas monedas del jugador.
     */
    public Tiene(String nom, int posicion, int numeroJugadors, int id_Partida, int numeroAssocioAlpha, int numeroAssocioDelta, int numeroAssocioOmicron, int numeroAssocioBeta, int numeroAssocioGama, int numerasoccioEpsilon, int numMonedas) {
        this.nom = nom;
        this.posicion = posicion;
        this.numeroJugadors = numeroJugadors;
        Id_Partida = id_Partida;
        NumeroAssocioAlpha = numeroAssocioAlpha;
        NumeroAssocioDelta = numeroAssocioDelta;
        NumeroAssocioOmicron = numeroAssocioOmicron;
        NumeroAssocioBeta = numeroAssocioBeta;
        NumeroAssocioGama = numeroAssocioGama;
        NumerasoccioEpsilon = numerasoccioEpsilon;
        NumMonedas = numMonedas;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public int getNumeroJugadors() {
        return numeroJugadors;
    }

    public void setNumeroJugadors(int numeroJugadors) {
        this.numeroJugadors = numeroJugadors;
    }

    public int getId_Partida() {
        return Id_Partida;
    }

    public void setId_Partida(int id_Partida) {
        Id_Partida = id_Partida;
    }

    public int getNumeroAssocioAlpha() {
        return NumeroAssocioAlpha;
    }

    public void setNumeroAssocioAlpha(int numeroAssocioAlpha) {
        NumeroAssocioAlpha = numeroAssocioAlpha;
    }

    public int getNumeroAssocioDelta() {
        return NumeroAssocioDelta;
    }

    public void setNumeroAssocioDelta(int numeroAssocioDelta) {
        NumeroAssocioDelta = numeroAssocioDelta;
    }

    public int getNumeroAssocioOmicron() {
        return NumeroAssocioOmicron;
    }

    public void setNumeroAssocioOmicron(int numeroAssocioOmicron) {
        NumeroAssocioOmicron = numeroAssocioOmicron;
    }

    public int getNumeroAssocioBeta() {
        return NumeroAssocioBeta;
    }

    public void setNumeroAssocioBeta(int numeroAssocioBeta) {
        NumeroAssocioBeta = numeroAssocioBeta;
    }

    public int getNumeroAssocioGama() {
        return NumeroAssocioGama;
    }

    public void setNumeroAssocioGama(int numeroAssocioGama) {
        NumeroAssocioGama = numeroAssocioGama;
    }

    public int getNumerasoccioEpsilon() {
        return NumerasoccioEpsilon;
    }

    public void setNumerasoccioEpsilon(int numerasoccioEpsilon) {
        NumerasoccioEpsilon = numerasoccioEpsilon;
    }

    public int getNumMonedas() {
        return NumMonedas;
    }

    public void setNumMonedas(int numMonedas) {
        NumMonedas = numMonedas;
    }

    @Override
    public String toString() {
        return "Tiene{" +
                "nom='" + nom + '\'' +
                ", posicion=" + posicion +
                ", numeroJugadors=" + numeroJugadors +
                ", Id_Partida=" + Id_Partida +
                ", NumeroAssocioAlpha=" + NumeroAssocioAlpha +
                ", NumeroAssocioDelta=" + NumeroAssocioDelta +
                ", NumeroAssocioOmicron=" + NumeroAssocioOmicron +
                ", NumeroAssocioBeta=" + NumeroAssocioBeta +
                ", NumeroAssocioGama=" + NumeroAssocioGama +
                ", NumerasoccioEpsilon=" + NumerasoccioEpsilon +
                ", NumMonedas=" + NumMonedas +
                '}';
    }
}
