package com.example.BaseDades.Inserts;

import com.example.ekonos_logica.Main.Jugador;


import java.sql.SQLException;

public class Inserts {

    public void insertPartida( int NumFilialAlpha,int NumFilialDelta, int NumFilialOmicron, int NumFilialBeta, int NumFilialGama,int NumFilialEpsilon) throws SQLException, SQLException {
        System.out.println();
        com.example.BaseDades.Capa_Dades.Persistencia.insereixPartida(  NumFilialAlpha,  NumFilialDelta, NumFilialOmicron, NumFilialBeta, NumFilialGama,NumFilialEpsilon);

    }

    public void insertTiene( String nom,int posicio,int numeroJugadors, int id, int NumeroAssociacioAlpha,  int NumeroAssociacioDelta, int NumeroAssociacioOmicron, int NumeroAssociacioBeta, int NumeroAssociacioGama,int NumeroAssociacoEpsilon, int monedas) throws SQLException {
        com.example.BaseDades.Capa_Dades.Persistencia.insereixTiene(nom,posicio,numeroJugadors, id, NumeroAssociacioAlpha,  NumeroAssociacioDelta, NumeroAssociacioOmicron, NumeroAssociacioBeta, NumeroAssociacioGama,NumeroAssociacoEpsilon, monedas);
    }


    public static void insertJugador(Jugador jugador) throws SQLException {

        com.example.BaseDades.Capa_Dades.Persistencia.insereixJugadors(jugador.getNom());

    }

}
