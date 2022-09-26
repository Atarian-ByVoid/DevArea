package br.fepi.ads;

import java.util.Scanner;

public class ExerciseH {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		double Volume  = 0;
		double Comprimento = 0;
		double Largura = 0;
		double Altura = 0;
		
		System.out.println("Informe o comprimento");
		Comprimento = teclado.nextDouble();
		
		System.out.println("Informe a  largura");
		Largura = teclado.nextDouble();
		
		System.out.println("Informe a altura");
		Altura = teclado.nextDouble();
		
		Volume = Comprimento * Largura * Altura;
		System.out.println("Valor do volume:" + Volume);
		
		teclado.close();
		
				

		
	}

}
