package com.example.BaseDades.Capa_Dades;

import com.example.BaseDades.Capa_Domini.Jugadors;
//
import java.sql.*;
import java.util.ArrayList;

public class Persistencia {
    static final String ip = "labs.inspedralbes.cat";
    static final String NOMBD = "a20adrlopcar_Coffie";
    static final String url = "jdbc:mysql://" + ip + ":3306/" + NOMBD;
    static final String Usuari = "a20adrlopcar_us";
    static final String password = "Pedralbes*2020";
        static final String Taula_Jugadors= "Jugadors";
        public static boolean semaforo;
        static ArrayList<Jugadors> Jugador= new ArrayList<Jugadors>();

        static Connection connexio = null;

    public static void main(String[] args) throws SQLException {
        conexioBase();
        obtenirNomJugadors(connexio);
        insereixJugadors(connexio);

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

        String query = "select COF_NAME, SUP_ID, PRICE, SALES, TOTAL from COFFEES";
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

        String sentenciaSql = "INSERT INTO " +Taula_Jugadors + " VALUES(1,'Adri'"+"); ";
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
}
