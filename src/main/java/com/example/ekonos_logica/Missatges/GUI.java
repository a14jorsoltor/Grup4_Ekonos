package com.example.ekonos_logica.Missatges;

public class GUI {

    public static String TutorialCarta(){
       return  "La carta esta divida en 3 funcions:\n\n" +
                "Funcio 1: Es la opcio mes a dalt de la carta, serveix per ficar la filial\n(distinguida per el color de la funcio) al tauler d'europa.\n\n" +
                "Funcio 2 i 3: Aquestes funcions volen dir que la empresa avançi";
    }

    public static String TutorialJoc(){
        return "EKKONOS es un joc de 3 a 6 jugadors en el que cada jugado\nintentara tenir " +
                            "la major puntuacio mitjançant la inversio a bosa i\nla direccio de companyies";

    }

    public static String turnJoc(){
      return "El torn el podem estructurar en tres parts:\n\n" +
                "Tirar una carta: Es on el jugador ha de tirar una carta aquesta part sera obligatoria\nper avançar torn \n\n" +
                "Compra accions: El jugador nomes pot comprar accios de la empresa si la empresa te una\nfilial al mapa. El cost de la accio sera el numero d'accion totals mes un\n\n" +
                "Vendre accions: El jugador, si te accions, les pot vendre per el nombre d'accions\nque hi ha a la empresa en aquell moment";
    }
    public static String infoPresidencia(){
      return"El jugador que compri la primera accio d'una companyia sera el seu president.\n\n" +
                           "Pero si despres algun altre jugador, el supera en nombre d'accions\nla presidencia es cedera al jugador.\n\n" +
                           "CAS ESPECIAL: si en una companyia el seu president te las mateixes\naccions que varis jugadors i ven una participacio, decideix quin\nd'aquestos sera el nou president";
    }
    public static String infoPuntuacio(){
       return"Al final de l'ultim torn es calcula la putuacio de la seguent forma:\n" +
                           "Primer es calcula el valor de cada companyia.\nUna companyia val el numero de marcadors de mercat que te en el tauler\n\n" +
                           "Despues es calcula la puntuacio dels jugador.\nPer aixo es multiplicar las paricipacions que tenen en cada companyia\nper el valor d'aquesta\n\n" +
                           "La puntuacio total d'un jugador es la suma de la seva puntuacio en cada\ncompanyia mes les unitats monetaries que poseeixi al final\n\n" +
                           "El jugador amb major puntacio guanya";
    }

}
