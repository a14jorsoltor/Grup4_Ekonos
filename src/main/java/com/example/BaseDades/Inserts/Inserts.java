package com.example.BaseDades.Inserts;

import com.example.ekonos_logica.Main.Jugador;


import java.sql.SQLException;


public class Inserts {

    /**
     * @param numJugador Numero de jugadros
     * @param NumFilialAlpha numero de afilials de la empresa alpha
     * @param NumFilialDelta numero de afilials de la empresa delta
     * @param NumFilialOmicron numero de afilials de la empresa omicron
     * @param NumFilialBeta numero de afilials de la empresa beta
     * @param NumFilialGama numero de afilials de la empresa gama
     * @param NumFilialEpsilon numero de afilials de la empresa epsilon
     */

    public void insertPartida(int numJugador, int NumFilialAlpha,int NumFilialDelta, int NumFilialOmicron, int NumFilialBeta, int NumFilialGama,int NumFilialEpsilon) throws SQLException, SQLException {

            com.example.BaseDades.Capa_Dades.Persistencia.insereixPartida(numJugador, NumFilialAlpha,  NumFilialDelta, NumFilialOmicron, NumFilialBeta, NumFilialGama,NumFilialEpsilon);

    }

    /**
     * @param nom Nom del jugador
     * @param posicio posicio que ha quedat
     * @param numeroJugadors numero de jugadors en la partida
     * @param id id de la partda
     * @param NumeroAssociacioAlpha numero de assosiacions de la empresa alpha
     * @param NumeroAssociacioDelta numero de assosiacions de la empresa delta
     * @param NumeroAssociacioOmicron numero de assosiacions de la empresa omicron
     * @param NumeroAssociacioBeta numero de assosiacions de la empresa beta
     * @param NumeroAssociacioGama numero de assosiacions de la empresa gama
     * @param NumeroAssociacoEpsilon numero de assosiacions de la empresa epsilon
     * @param monedas monedas del jugador al final de la partida

     */
    public void insertTiene( String nom,int posicio,int numeroJugadors, int id, int NumeroAssociacioAlpha,  int NumeroAssociacioDelta, int NumeroAssociacioOmicron, int NumeroAssociacioBeta, int NumeroAssociacioGama,int NumeroAssociacoEpsilon, int monedas) throws SQLException {
        com.example.BaseDades.Capa_Dades.Persistencia.insereixTiene(nom,posicio,numeroJugadors, id, NumeroAssociacioAlpha,  NumeroAssociacioDelta, NumeroAssociacioOmicron, NumeroAssociacioBeta, NumeroAssociacioGama,NumeroAssociacoEpsilon, monedas);
    }

    /**
     *
     * @param jugador jugador que volem inserir
     */
    public static void insertJugador(Jugador jugador) throws SQLException {

        com.example.BaseDades.Capa_Dades.Persistencia.insereixJugadors(jugador.getNom());

    }

}
