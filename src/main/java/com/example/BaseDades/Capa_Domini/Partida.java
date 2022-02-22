package com.example.BaseDades.Capa_Domini;

public class Partida {
    int Id_partida;
    int NumFilialAlpha ;
    int NumFilialOmega;
    int NumFilialDelta ;
    int NumFilialOmicron;
    int NumFilialBeta ;
    int NumFilialGama ;

    public Partida(int id_partida, int numFilialAlpha, int numFilialOmega, int numFilialDelta, int numFilialOmicron, int numFilialBeta, int numFilialGama) {
        Id_partida = id_partida;
        NumFilialAlpha = numFilialAlpha;
        NumFilialOmega = numFilialOmega;
        NumFilialDelta = numFilialDelta;
        NumFilialOmicron = numFilialOmicron;
        NumFilialBeta = numFilialBeta;
        NumFilialGama = numFilialGama;
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

    public int getNumFilialOmega() {
        return NumFilialOmega;
    }

    public void setNumFilialOmega(int numFilialOmega) {
        NumFilialOmega = numFilialOmega;
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

    @Override
    public String toString() {
        return "Partida{" +
                "Id_partida=" + Id_partida +
                ", NumFilialAlpha=" + NumFilialAlpha +
                ", NumFilialOmega=" + NumFilialOmega +
                ", NumFilialDelta=" + NumFilialDelta +
                ", NumFilialOmicron=" + NumFilialOmicron +
                ", NumFilialBeta=" + NumFilialBeta +
                ", NumFilialGama=" + NumFilialGama +
                '}';
    }
}
