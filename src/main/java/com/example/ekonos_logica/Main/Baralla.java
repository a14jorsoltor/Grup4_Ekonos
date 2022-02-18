package com.example.ekonos_logica.Main;

import java.util.ArrayList;
/**
 * @author Jordi Solé i Adria Lopez
 *  */

public class Baralla {

	/**
	 * @param baralla es una ArrayList de objectes Carta on son totes les cartes generades per jugar.
	 * @param midaBaralla Diem la mida de la baralla
	 * */
	ArrayList<Carta> baralla = new ArrayList<>();
	static int midaBaralla;
	public Baralla() {

		super();
		midaBaralla = 36;
	}



	public void omplirBaralla() {
	/**
	 * Aquest metode es per omplir la baralla de cartes
	 * */

		for (int i = 0; i < midaBaralla; i++) {
			Carta novaCarta = new Carta();
			novaCarta.crearCarta(i + 1);
			baralla.add(novaCarta);
		}
	}
	//METODE PER REPARTIR LES CARTES A LA MA DELS JUGADORS
	public void repartirMa(ArrayList<Jugador> player, int midaMa) {
/**
 * Aquest metode es per repartir les cartes a la ma dels jugadors
 * @param player pasem la ArrayList de jugadors per identificar de jugadors
 * @param midaMa aqui diem la mida de la ma es a dir les cartes que els hi toca a casa jugador
 * */
		for (int i = 0; i < midaMa; i++) {
			for (int j = 0; j < player.size(); j++) {
				player.get(j).ma.add(baralla.get(0));
				baralla.remove(0);
			}
		}

	}

}
