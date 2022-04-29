package com.example.BaseDades.Capa_Dades;

import com.example.BaseDades.Capa_Domini.Jugadors;
import com.example.BaseDades.Capa_Domini.Partida;
import com.example.BaseDades.Capa_Domini.Tiene;
//
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;

public class Persistencia {
    static final String Taula_Jugadors = "Jugadors";
    static final String Taula_Partida = "Partida";
    static final String Taula_Tiene = "Tiene";
    private static final Obrir_Tancar_BD OTDB = new Obrir_Tancar_BD();
    public static boolean semaforo;
    static ArrayList<Jugadors> Jugador = new ArrayList<Jugadors>();
    static ArrayList<Partida> partida = new ArrayList<Partida>();
    static ArrayList<Tiene> tener = new ArrayList<Tiene>();
    static Connection connection;
    static Statement sta = null;

public Persistencia(){

    connection = OTDB.conexioBase(connection);
}



    public static void obtenirNomJugadors(Connection con) throws SQLException {

        String query = "select *from Jugadors";
        try (Statement stmt = con.createStatement()) {
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                String nom = rs.getString(1);
                Jugadors jugador = new Jugadors(nom);
                Jugador.add(jugador);


            }
        } catch (SQLException e) {

        }
    }

    public static void estadistica1(Connection con) throws SQLException {
        int posicion = 6;
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        for (int i = 0; i < Jugador.size(); i++) {
            for (int j = 0; j < posicion; j++) {
                String query = "Select count(*) From Tiene t join Partida p on t.Id_Partida=p.Id_partida where p.numeros_jugadores=" + i + "and t.posicion= " + j + "and nom='adrian'";
                try (Statement stmt = con.createStatement()) {
                    ResultSet rs = stmt.executeQuery(query);
                    while (rs.next()) {
                        int numero = rs.getInt(1);
                        numeros.add(numero);
                    }
                }
            }
        }
    }


    public static void insereixJugadors(String nom) throws SQLException {

        String sentenciaSql = "INSERT INTO " + Taula_Jugadors + " VALUES(" + nom + "); ";

        try {
            sta = connection.createStatement();
            sta.executeUpdate(sentenciaSql);
            semaforo = true;
        } catch (SQLException e) {
            System.out.println("Error");
            semaforo = false;
        } finally {
            sta.close();
            OTDB.cerrarbase(connection);
        }
    }


    public static void insereixPartida( int numerosJUgadors,int NumFilialAlpha, int NumFilialDelta, int NumFilialOmicron, int NumFilialBeta, int NumFilialGama, int NumFilialEpsilon) throws SQLException {

        String sentenciaSql = "INSERT INTO " + Taula_Partida + " VALUES(" + numerosJUgadors+"," + NumFilialAlpha + "," + NumFilialDelta + "," + NumFilialOmicron + "," + NumFilialBeta + "," + NumFilialGama + NumFilialEpsilon + ") ";

        try {
            sta = connection.createStatement();
            sta.executeUpdate(sentenciaSql);
            semaforo = true;
        } catch (SQLException e) {
            System.out.println("Error");
            semaforo = false;
        } finally {
            sta.close();
            OTDB.cerrarbase(connection);
        }
    }


    public static void obtenirPartida(Connection con) throws SQLException {


            String query = "select * from Partida";
            try (Statement stmt = con.createStatement()) {

                ResultSet rs = stmt.executeQuery(query);
                while (rs.next()) {
                    int Id_partida = rs.getInt(1);
                    int NumFilialAlpha = rs.getInt(2);
                    int NumFilialDelta = rs.getInt(3);
                    int NumFilialOmicron = rs.getInt(4);
                    int NumFilialBeta = rs.getInt(5);
                    int NumFilialGama = rs.getInt(6);
                    int NumFilialEpsilon= rs.getInt(7);
                    Partida part = new Partida( NumFilialAlpha, NumFilialDelta, NumFilialOmicron, NumFilialBeta, NumFilialGama,NumFilialEpsilon);
                    partida.add(part);
                }


        } catch(SQLException e){
        }
    }

    public static void insereixTiene(String nom, int posicion, int NumeroAssociacioAlpha, int NumeroAssociacioDelta, int NumeroAssociacioOmicron, int NumeroAssociacioBeta, int NumeroAssociacioGama, int NumeroAssociacoEpsilon, int monedas, int numeroAssociacoEpsilon, int i) throws SQLException {

        String sentenciaSql = "INSERT INTO " + Taula_Tiene + " VALUES(" + nom + "," + posicion +"(SELECT Id_partida FORM Partida WHERE Id_partida=(SELECT Max(Id_partida) FORM Partida))"+ "," + NumeroAssociacioAlpha + "," + NumeroAssociacioDelta + "," + NumeroAssociacioOmicron + "," + NumeroAssociacioBeta + "," + NumeroAssociacioGama + "," + NumeroAssociacoEpsilon + "," + monedas + "); ";

        try {
            sta = connection.createStatement();
            sta.executeUpdate(sentenciaSql);
            semaforo = true;
        } catch (SQLException e) {
            System.out.println("Error");
            semaforo = false;
        } finally {
            sta.close();
            OTDB.cerrarbase(connection);
        }
    }

    public static void obtenirTiene(Connection con) throws SQLException {
        int i=1;
         String query = "select * from Tiene";
         try (Statement stmt = con.createStatement()) {
             while(i<=6) {
                 ResultSet rs = stmt.executeQuery(query);

                 while (rs.next()) {
                     String nombre = rs.getString(1);
                     int  posicion=rs.getInt(2);
                     int numeroJugadores=rs.getInt(3);
                     int Id_partida = rs.getInt(4);
                     int NumeroAssocioAlpha = rs.getInt(5);
                     int NumeroAssocioDelta = rs.getInt(6);
                     int NumeroAssocioOmicron = rs.getInt(7);
                     int NumeroAssocioBeta = rs.getInt(8);
                     int NumeroAssocioGama = rs.getInt(9);
                     int NumeroAssociacoEpsilon= rs.getInt(10);
                     int monedas = rs.getInt(11);
                     Tiene tiene = new Tiene(nombre, posicion,numeroJugadores,Id_partida, NumeroAssocioAlpha, NumeroAssocioDelta, NumeroAssocioOmicron, NumeroAssocioBeta, NumeroAssocioGama, NumeroAssociacoEpsilon, monedas);
                     tener.add(tiene);

                 }
             }
         } catch (SQLException e) {

         }
     }


}