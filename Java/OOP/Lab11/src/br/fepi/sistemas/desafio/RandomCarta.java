package br.fepi.sistemas.desafio;

import java.util.Random;
public class RandomCarta {
	
	
	public static void main(String[]args) {
		Random aleatorizar = new Random();
		
		int indiceNaipe =aleatorizar.nextInt(4);
		int indiceValor =aleatorizar.nextInt(13);

		
		
		
		String naipe[]={"Paus","Espada","Copas","Ouros"};
				String valor[]= {"A","1","2","3","4","5","6","7","8","9","J","Q","K"};
				
				System.out.println(naipe[indiceNaipe]+" de " +valor[indiceValor]);
				
		

	}
	
	
	

}
