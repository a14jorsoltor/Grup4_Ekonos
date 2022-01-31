package com.example.LogicaParaGUI;

import java.util.ArrayList;

public class Baralla {
	public Baralla() {
		super();
		midaBaralla = 36;  //AQUI DEIEM EL MAXIM DE CARTES QUE FEM
	}

	ArrayList<Carta> baralla = new ArrayList<>();
	static int midaBaralla;

	//AQUEST METODE ES PER PODER OMPLIR LA BARALLA DE CARTES
	public void omplirBaralla() {

		for (int i = 0; i < midaBaralla; i++) {
			Carta novaCarta = new Carta();
			novaCarta.crearCarta(i + 1);
			baralla.add(novaCarta);
		}
	}
	//METODE PER REPARTIR LES CARTES A LA MA DELS JUGADORS
	public void repartirMa(ArrayList<Jugador> player, int midaMa) {

		for (int i = 0; i < midaMa; i++) {
			for (int j = 0; j < player.size(); j++) {
				player.get(j).ma.add(baralla.get(0));
				baralla.remove(0);
			}
		}

	}

}
