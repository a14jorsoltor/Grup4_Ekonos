package com.example.BaseDades.Inserts;

import java.sql.Connection;
import java.sql.SQLException;

public class Inserts {

    public void insertPartida(int id_Partda, int NumFilialAlpha,int NumFilialDelta, int NumFilialOmicron, int NumFilialBeta, int NumFilialGama,int NumFilialEpsilon) throws SQLException, SQLException {
        System.out.println();
        com.example.BaseDades.Capa_Dades.Persistencia.insereixPartida( id_Partda, NumFilialAlpha,  NumFilialDelta, NumFilialOmicron, NumFilialBeta, NumFilialGama,NumFilialEpsilon);

    }

    public void insertTiene( String nom, int id, int NumeroAssociacioAlpha,  int NumeroAssociacioDelta, int NumeroAssociacioOmicron, int NumeroAssociacioBeta, int NumeroAssociacioGama,int NumeroAssociacoEpsilon, int monedas) throws SQLException {
        com.example.BaseDades.Capa_Dades.Persistencia.insereixTiene(nom, id, NumeroAssociacioAlpha,  NumeroAssociacioDelta, NumeroAssociacioOmicron, NumeroAssociacioBeta, NumeroAssociacioGama,NumeroAssociacoEpsilon, monedas);
    }


    public void insertJugador( String nom) throws SQLException {

        com.example.BaseDades.Capa_Dades.Persistencia.insereixJugadors( nom);

    }

}
