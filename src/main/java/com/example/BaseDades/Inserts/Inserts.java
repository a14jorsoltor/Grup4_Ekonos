package com.example.BaseDades.Inserts;

import com.example.ekonos_logica.Main.Jugador;


import java.sql.SQLException;

public class Inserts {
/**
 * @param NumFilialAlpha Numero d'afilials que te la empresa alpha.
 * @param NumFilialDelta Numero d'afilials que te la empresa delta.
 * @param NumFilialOmicron Numero d'afilials que te la empresa omicron.
 * @param NumFilialBeta Numero d'afilials que te la empresa beta.
 * @param NumFilialEpsilon Numero d'afilials que te la empresa epsilon.
 * @param NumFilialGama Numero d'afilials que te la empresa gama
 */
    public void insertPartida( int NumFilialAlpha,int NumFilialDelta, int NumFilialOmicron, int NumFilialBeta, int NumFilialGama,int NumFilialEpsilon) throws SQLException, SQLException {
        System.out.println();
        com.example.BaseDades.Capa_Dades.Persistencia.insereixPartida(  NumFilialAlpha,  NumFilialDelta, NumFilialOmicron, NumFilialBeta, NumFilialGama,NumFilialEpsilon);

    }

    /**
     *
     * @param nom Nom del jugador.
     * @param posicio posicio de la partida
     * @param numeroJugadors numero de jugadrdos que hi havia en la partida
     * @param id id de la partda
     * @param NumeroAssociacioAlpha Numero d'asosiacion de la empres alpha
     * @param NumeroAssociacioDelta Numero d'asosiacion de la empres delta
     * @param NumeroAssociacioOmicron Numero d'asosiacion de la empres omicron
     * @param NumeroAssociacioBeta Numero d'asosiacion de la empres beta
     * @param NumeroAssociacioGama Numero d'asosiacion de la empres gama
     * @param NumeroAssociacoEpsilon Numero d'asosiacion de la empres epsilon
     * @param monedas monedas del jugador.
     */
    public void insertTiene( String nom,int posicio,int numeroJugadors, int id, int NumeroAssociacioAlpha,  int NumeroAssociacioDelta, int NumeroAssociacioOmicron, int NumeroAssociacioBeta, int NumeroAssociacioGama,int NumeroAssociacoEpsilon, int monedas) throws SQLException {
        com.example.BaseDades.Capa_Dades.Persistencia.insereixTiene(nom,posicio,numeroJugadors, id, NumeroAssociacioAlpha,  NumeroAssociacioDelta, NumeroAssociacioOmicron, NumeroAssociacioBeta, NumeroAssociacioGama,NumeroAssociacoEpsilon, monedas);
    }

    /**
     * @param jugador objecta jugador
     */
    public static void insertJugador(Jugador jugador) throws SQLException {

        com.example.BaseDades.Capa_Dades.Persistencia.insereixJugadors(jugador.getNom());

    }

}
