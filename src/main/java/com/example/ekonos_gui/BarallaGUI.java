package com.example.ekonos_gui;

import java.util.ArrayList;

public class BarallaGUI {
	public BarallaGUI() {
		super();
		midaBaralla = 36;  //AQUI DEIEM EL MAXIM DE CARTES QUE FEM
	}

	ArrayList<CartaGUI> baralla = new ArrayList<>();
	static int midaBaralla;

	//AQUEST METODE ES PER PODER OMPLIR LA BARALLA DE CARTES
	public void omplirBaralla() {

		for (int i = 0; i < midaBaralla; i++) {
			CartaGUI novaCarta = new CartaGUI();
			novaCarta.crearCarta(i + 1);
			baralla.add(novaCarta);
		}
	}
	//METODE PER REPARTIR LES CARTES A LA MA DELS JUGADORS

	/**
	 *
	 * @param player Array list de jugadors
	 * @param midaMa mida de la ma
	 */
	public void repartirMa(ArrayList<JugadorGUI> player, int midaMa) {

		for (int i = 0; i < midaMa; i++) {
			for (int j = 0; j < player.size(); j++) {
				player.get(j).ma.add(baralla.get(0));
				baralla.remove(0);
			}
		}

	}

}
