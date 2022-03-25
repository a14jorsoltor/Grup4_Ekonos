package com.example.BaseDades.Capa_Domini;

public class Partida {

    int NumFilialAlpha ;

    int NumFilialDelta ;
    int NumFilialOmicron;
    int NumFilialBeta ;
    int NumFilialGama ;
    int NumFilialEpsilon;

    public Partida( int numFilialAlpha, int numFilialDelta, int numFilialOmicron, int numFilialBeta, int numFilialGama, int numFilialEpsilon) {

        NumFilialAlpha = numFilialAlpha;
        NumFilialDelta = numFilialDelta;
        NumFilialOmicron = numFilialOmicron;
        NumFilialBeta = numFilialBeta;
        NumFilialGama = numFilialGama;
        NumFilialEpsilon = numFilialEpsilon;
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
                ", NumFilialAlpha=" + NumFilialAlpha +
                ", NumFilialDelta=" + NumFilialDelta +
                ", NumFilialOmicron=" + NumFilialOmicron +
                ", NumFilialBeta=" + NumFilialBeta +
                ", NumFilialGama=" + NumFilialGama +
                ", NumFilialEpsilon=" + NumFilialEpsilon +
                '}';
    }
}
