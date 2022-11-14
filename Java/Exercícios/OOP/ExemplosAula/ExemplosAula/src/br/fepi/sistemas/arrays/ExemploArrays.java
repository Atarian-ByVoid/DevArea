package br.fepi.sistemas.arrays;

import java.util.Random;

public class ExemploArrays {

	public static void main(String[] args) {
		
		String[] faces = {"A", "2", "3", "4", "5", "6", "7","8","9","10","J","Q","K"};
		String[] naipes = {"paus", "espada", "ouros","copas"};
		
		Random r = new Random();
		int indiceFace = r.nextInt(13);
		int indiceNaipe = r.nextInt(4);
		
		System.out.println(faces[indiceFace] + " de "+ naipes[indiceNaipe]);
		
	}
	
}
