package com.example.BaseDades.Inserts;

import java.sql.Connection;
import java.sql.SQLException;

public class Inserts {

    public void insertPartida(Connection con, int id_Partda, int NumFilialAlpha, int NumFilialOmega, int NumFilialDelta, int NumFilialOmicron, int NumFilialBeta, int NumFilialGama) throws SQLException, SQLException {
        System.out.println();
        com.example.BaseDades.Capa_Dades.Persistencia.insereixPartida(con, id_Partda, NumFilialAlpha, NumFilialOmega, NumFilialDelta, NumFilialOmicron, NumFilialBeta, NumFilialGama);

    }

    public void insertTiene(Connection con, String nom, int id, int NumeroAssociacioAlpha, int NumeroAssociacioOmega, int NumeroAssociacioDelta, int NumeroAssociacioOmicron, int NumeroAssociacioBeta, int NumeroAssociacioGama, int monedas) throws SQLException {
        com.example.BaseDades.Capa_Dades.Persistencia.insereixTiene(con, nom, id, NumeroAssociacioAlpha, NumeroAssociacioOmega, NumeroAssociacioDelta, NumeroAssociacioOmicron, NumeroAssociacioBeta, NumeroAssociacioGama, monedas);
    }


    public void insertJugador(Connection con, String nom) throws SQLException {

        com.example.BaseDades.Capa_Dades.Persistencia.insereixJugadors(con, nom);

    }

}
