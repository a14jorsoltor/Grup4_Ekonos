package com.example.BaseDades.Capa_Domini;

public class Tiene {
    int Id;
    int Id_Partida ;
    int NumeroAssocioAlpha ;
    int NumeroAssocioOmega ;
    int NumeroAssocioDelta;
    int NumeroAssocioOmicron ;
    int NumeroAssocioBeta;
    int NumeroAssocioGama ;
    int NumMonedas ;

    public Tiene(int id, int id_Partida, int numeroAssocioAlpha, int numeroAssocioOmega, int numeroAssocioDelta, int numeroAssocioOmicron, int numeroAssocioBeta, int numeroAssocioGama, int numMonedas) {
        Id = id;
        Id_Partida = id_Partida;
        NumeroAssocioAlpha = numeroAssocioAlpha;
        NumeroAssocioOmega = numeroAssocioOmega;
        NumeroAssocioDelta = numeroAssocioDelta;
        NumeroAssocioOmicron = numeroAssocioOmicron;
        NumeroAssocioBeta = numeroAssocioBeta;
        NumeroAssocioGama = numeroAssocioGama;
        NumMonedas = numMonedas;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
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

    public int getNumeroAssocioOmega() {
        return NumeroAssocioOmega;
    }

    public void setNumeroAssocioOmega(int numeroAssocioOmega) {
        NumeroAssocioOmega = numeroAssocioOmega;
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

    public int getNumMonedas() {
        return NumMonedas;
    }

    public void setNumMonedas(int numMonedas) {
        NumMonedas = numMonedas;
    }

    @Override
    public String toString() {
        return "Tiene{" +
                "Id=" + Id +
                ", Id_Partida=" + Id_Partida +
                ", NumeroAssocioAlpha=" + NumeroAssocioAlpha +
                ", NumeroAssocioOmega=" + NumeroAssocioOmega +
                ", NumeroAssocioDelta=" + NumeroAssocioDelta +
                ", NumeroAssocioOmicron=" + NumeroAssocioOmicron +
                ", NumeroAssocioBeta=" + NumeroAssocioBeta +
                ", NumeroAssocioGama=" + NumeroAssocioGama +
                ", NumMonedas=" + NumMonedas +
                '}';
    }
}
