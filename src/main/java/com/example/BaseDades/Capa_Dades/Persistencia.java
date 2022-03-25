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
    public static boolean semaforo;
    static ArrayList<Jugadors> Jugador = new ArrayList<Jugadors>();
    static ArrayList<Partida> partida = new ArrayList<Partida>();
    static ArrayList<Tiene> tener = new ArrayList<Tiene>();
    static Connection connection;

public Persistencia(){
    Obrir_Tancar_BD OYDB = new Obrir_Tancar_BD();
    connection = OYDB.conexioBase(connection);
}


    public static void cerrarbase() {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
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


    public static void insereixJugadors(String nom) throws SQLException {

        String sentenciaSql = "INSERT INTO " + Taula_Jugadors + " VALUES(" + nom + "); ";
        Statement sta = null;
        try {
            sta = connection.createStatement();
            sta.executeUpdate(sentenciaSql);
            semaforo = true;
        } catch (SQLException e) {
            System.out.println("Error");
            semaforo = false;
        } finally {
            sta.close();
        }
    }


    public static void insereixPartida( int NumFilialAlpha, int NumFilialDelta, int NumFilialOmicron, int NumFilialBeta, int NumFilialGama, int NumFilialEpsilon) throws SQLException {

        String sentenciaSql = "INSERT INTO " + Taula_Partida + " VALUES(" + "," + NumFilialAlpha + "," + NumFilialDelta + "," + NumFilialOmicron + "," + NumFilialBeta + "," + NumFilialGama + NumFilialEpsilon + ") ";
        Statement sta = null;
        try {
            sta = connection.createStatement();
            sta.executeUpdate(sentenciaSql);
            semaforo = true;
        } catch (SQLException e) {
            System.out.println("Error");
            semaforo = false;
        } finally {
            sta.close();
            cerrarbase();
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

    public static void insereixTiene(String nom, int id, int NumeroAssociacioAlpha, int NumeroAssociacioDelta, int NumeroAssociacioOmicron, int NumeroAssociacioBeta, int NumeroAssociacioGama, int NumeroAssociacoEpsilon, int monedas, int numeroAssociacoEpsilon, int i) throws SQLException {

        String sentenciaSql = "INSERT INTO " + Taula_Tiene + " VALUES(" + nom + "," + id + "," + NumeroAssociacioAlpha + "," + NumeroAssociacioDelta + "," + NumeroAssociacioOmicron + "," + NumeroAssociacioBeta + "," + NumeroAssociacioGama + "," + NumeroAssociacoEpsilon + "," + monedas + "); ";
        Statement sta = null;
        try {
            sta = connection.createStatement();
            sta.executeUpdate(sentenciaSql);
            semaforo = true;
        } catch (SQLException e) {
            System.out.println("Error");
            semaforo = false;
        } finally {
            sta.close();
            cerrarbase();
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