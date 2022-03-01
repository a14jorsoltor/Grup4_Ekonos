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








    public static void conexioBase() {

        try {
            connection = DriverManager.getConnection(fitxerUrl(), fitxerUsuari(),fitxerPass());
            System.out.println("Connecio realitzada usant" + "DriverManager");
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
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
                Jugadors jugador = new Jugadors( nom);
                Jugador.add(jugador);
            }
        } catch (SQLException e) {

        }
    }


    public static void insereixJugadors(String nom) throws SQLException {
        conexioBase();

        String sentenciaSql = "INSERT INTO " + Taula_Jugadors + " VALUES("+nom + "); ";
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


    public static void insereixPartida(int id_Partda,int NumFilialAlpha,int NumFilialOmega,int NumFilialDelta,int NumFilialOmicron,int NumFilialBeta,int NumFilialGama) throws SQLException {
    conexioBase();
        String sentenciaSql = "INSERT INTO " + Taula_Partida + " VALUES("+id_Partda+","+NumFilialAlpha+","+NumFilialOmega+","+NumFilialDelta+","+NumFilialOmicron+","+NumFilialBeta+","+NumFilialGama+  ") ";
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
                int NumFilialOmega = rs.getInt(3);
                int NumFilialDelta = rs.getInt(4);
                int NumFilialOmicron = rs.getInt(5);
                int NumFilialBeta = rs.getInt(6);
                int NumFilialGama = rs.getInt(7);
                Partida part = new Partida(Id_partida, NumFilialAlpha, NumFilialOmega, NumFilialDelta, NumFilialOmicron, NumFilialBeta, NumFilialGama);
                partida.add(part);
            }
        } catch (SQLException e) {
        }
    }

    public static void insereixTiene(String nom,int id,int NumeroAssociacioAlpha,int NumeroAssociacioOmega,int NumeroAssociacioDelta,int NumeroAssociacioOmicron,int NumeroAssociacioBeta, int NumeroAssociacioGama ,int monedas) throws SQLException {
        conexioBase();
        String sentenciaSql = "INSERT INTO " + Taula_Tiene + " VALUES("+nom+","+id+","+NumeroAssociacioAlpha+","+NumeroAssociacioOmega+","+NumeroAssociacioDelta+","+NumeroAssociacioOmicron+","+NumeroAssociacioBeta+","+NumeroAssociacioGama+","+monedas+ "); ";
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

        String query = "select * from Tiene";
        try (Statement stmt = con.createStatement()) {
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                String nombre = rs.getString(1);
                int Id_partida = rs.getInt(2);
                int NumeroAssocioAlpha = rs.getInt(3);
                int NumeroAssocioOmega = rs.getInt(4);
                int NumeroAssocioDelta = rs.getInt(5);
                int NumeroAssocioOmicron = rs.getInt(6);
                int NumeroAssocioBeta = rs.getInt(7);
                int NumeroAssocioGama = rs.getInt(8);
                int monedas = rs.getInt(9);
                Tiene tiene = new Tiene(nombre,Id_partida, NumeroAssocioAlpha, NumeroAssocioOmega, NumeroAssocioDelta, NumeroAssocioOmicron, NumeroAssocioBeta, NumeroAssocioGama, monedas);
                tener.add(tiene);

            }
        } catch (SQLException e) {

        }
    }
    public static String fitxerUsuari() throws IOException {
        File archivo = new File("fitxUsuari");
        FileReader fr = new FileReader(archivo);
        BufferedReader br = new BufferedReader(fr);
        String linea = br.readLine();
        return linea;
    }

    public static String fitxerPass() throws IOException {
        File archivo = new File("fitxPass");
        FileReader fr = new FileReader(archivo);
        BufferedReader br = new BufferedReader(fr);
        String linea = br.readLine();
        return linea;
    }
    public static String fitxerUrl() throws IOException {
        File archivo = new File("fitxerUrl");
        FileReader fr = new FileReader(archivo);
        BufferedReader br = new BufferedReader(fr);
        String linea = br.readLine();
        return linea;
    }

}