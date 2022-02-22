package com.example.BaseDades.Capa_Dades;

import com.example.BaseDades.Capa_Domini.Jugadors;
import com.example.BaseDades.Capa_Domini.Partida;
//
import java.sql.*;
import java.util.ArrayList;

public class Persistencia {
    static final String ip = "labs.inspedralbes.cat";
    static final String NOMBD = "a20adrlopcar_Ekonos";
    static final String url = "jdbc:mysql://" + ip + ":3306/" + NOMBD;
    static final String Usuari = "a20adrlopcar_us";
    static final String password = "Pedralbes*2020";
    static final String Taula_Jugadors= "Jugadors";
    static final String Taula_Partida= "Partida";
        public static boolean semaforo;
        static ArrayList<Jugadors> Jugador= new ArrayList<Jugadors>();
         static ArrayList<Partida> partida= new ArrayList<Partida>();

        static Connection connexio = null;

    public static void main(String[] args) throws SQLException {
        conexioBase();
        insereixJugadors(connexio);
        obtenirNomJugadors(connexio);
            for (Jugadors JUG :Jugador){
                System.out.println(JUG.toString());
            }
            insereixPartida(connexio);
            obtenirPartida(connexio);
            for(Partida partidass:partida){
                System.out.println(partidass.toString());
            }
        cerrarbase();
    }




        public static void conexioBase() {

            try {
                connexio = DriverManager.getConnection(url, Usuari, password);
                System.out.println("Connecio realitzada usant" + "DriverManager");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    public static void cerrarbase(){
        try {
            connexio.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void obtenirNomJugadors(Connection con) throws SQLException {

        String query = "select *from Jugadors";
        try (Statement stmt = con.createStatement()) {
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                int Id = rs.getInt("Id");
                String nom = rs.getString("Nom");

                Jugadors jugador = new Jugadors(Id, nom);
                Jugador.add(jugador);
            }
        } catch (SQLException e) {

        }
    }
    public static void insereixJugadors(Connection con) throws SQLException {

        String sentenciaSql = "INSERT INTO " +Taula_Jugadors+ " VALUES(3, 'Eric'"+ "); ";
        Statement sta = null;
        try {
            sta = con.createStatement();
            sta.executeUpdate(sentenciaSql);
            semaforo=true;
        } catch (SQLException e) {
            System.out.println("Error");
            semaforo=false;
        } finally {
            sta.close();
        }
    }



    public static void insereixPartida(Connection con) throws SQLException {

        String sentenciaSql = "INSERT INTO " +Taula_Partida+ " VALUES(2,1,1,1,1,1,1"+ "); ";
        Statement sta = null;
        try {
            sta = con.createStatement();
            sta.executeUpdate(sentenciaSql);
            semaforo=true;
        } catch (SQLException e) {
            System.out.println("Error");
            semaforo=false;
        } finally {
            sta.close();
        }
    }

   public static void obtenirPartida(Connection con) throws SQLException {

        String query = "select * from Partida";
        try (Statement stmt = con.createStatement()) {
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                int Id_partida = rs.getInt(1);
                int NumFilialAlpha = rs.getInt(2);
                int NumFilialOmega= rs.getInt(3);
                int NumFilialDelta = rs.getInt(4);
                int NumFilialOmicron = rs.getInt(5);
                int NumFilialBeta = rs.getInt(6);
                int NumFilialGama = rs.getInt(7);

                Partida part = new Partida( Id_partida ,NumFilialAlpha, NumFilialOmega,NumFilialDelta,NumFilialOmicron,NumFilialBeta,NumFilialGama);
                partida.add(part);
            }
        } catch (SQLException e) {

        }
    }
}