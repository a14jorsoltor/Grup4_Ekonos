package com.example.BaseDades.Capa_Domini;

public class Partida {
    int Id_partida;
    int NumFilialAlpha ;

    int NumFilialDelta ;
    int NumFilialOmicron;
    int NumFilialBeta ;
    int NumFilialGama ;
    int NumFilialEpsilon;

    public Partida(int id_partida, int numFilialAlpha, int numFilialDelta, int numFilialOmicron, int numFilialBeta, int numFilialGama, int numFilialEpsilon) {
        Id_partida = id_partida;
        NumFilialAlpha = numFilialAlpha;
        NumFilialDelta = numFilialDelta;
        NumFilialOmicron = numFilialOmicron;
        NumFilialBeta = numFilialBeta;
        NumFilialGama = numFilialGama;
        NumFilialEpsilon = numFilialEpsilon;
    }

    public int getId_partida() {
        return Id_partida;
    }

    public void setId_partida(int id_partida) {
        Id_partida = id_partida;
    }

    public int getNumFilialAlpha() {
        return NumFilialAlpha;
    }

    public void setNumFilialAlpha(int numFilialAlpha) {
        NumFilialAlpha = numFilialAlpha;
    }

    public int getNumFilialDelta() {
        return NumFilialDelta;
    }

    public void setNumFilialDelta(int numFilialDelta) {
        NumFilialDelta = numFilialDelta;
    }

    public int getNumFilialOmicron() {
        return NumFilialOmicron;
    }

    public void setNumFilialOmicron(int numFilialOmicron) {
        NumFilialOmicron = numFilialOmicron;
    }

    public int getNumFilialBeta() {
        return NumFilialBeta;
    }

    public void setNumFilialBeta(int numFilialBeta) {
        NumFilialBeta = numFilialBeta;
    }

    public int getNumFilialGama() {
        return NumFilialGama;
    }

    public void setNumFilialGama(int numFilialGama) {
        NumFilialGama = numFilialGama;
    }

    public int getNumFilialEpsilon() {
        return NumFilialEpsilon;
    }

    public void setNumFilialEpsilon(int numFilialEpsilon) {
        NumFilialEpsilon = numFilialEpsilon;
    }

    @Override
    public String toString() {
        return "Partida{" +
                "Id_partida=" + Id_partida +
                ", NumFilialAlpha=" + NumFilialAlpha +
                ", NumFilialDelta=" + NumFilialDelta +
                ", NumFilialOmicron=" + NumFilialOmicron +
                ", NumFilialBeta=" + NumFilialBeta +
                ", NumFilialGama=" + NumFilialGama +
                ", NumFilialEpsilon=" + NumFilialEpsilon +
                '}';
    }
}
