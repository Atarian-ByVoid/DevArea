package br.fepi.ads;

import java.util.Random;

public class Carta {

	public static void main(String[] args) {

		String[] faces = new String[] { "As", "2", "3", "4", "5", "6", "7", "8", "9", "10", 
				"Valete", "Dama", "Rei" };

		String[] nipes = new String[] { "Espadas", "Paus", "Copas", "Ouros" };
		
		
		System.out.println("ESCOLHA DETERMINADA - A carta "
				+ "escolhida sera " + faces[8] + " de " + nipes[2]);
		
		Random r = new Random();
		System.out.println("ESCOLHA ALEATORIA 01 ( Índice = "
		+ r.nextInt(10) + " )");
		
		int i = r.nextInt(faces.length);
String face = faces[i];

System.out.println("ESCOLHA ALEATORIA 02 ( " + face + " de "
+ nipes[0] + " )");

int j = r.nextInt(nipes.length);
String nipe = nipes[j];

System.out.println("ESCOLHA ALEATORIA 03 ( " + face + " de "
+ nipe + " )");



	}
				                           

}
