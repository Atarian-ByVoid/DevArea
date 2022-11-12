package br.fepi.ads;

import java.util.Scanner;

public class ExerciseE {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double total = 0;
		double valor = 0;
		double taxa = 0;
		double tempo = 0;
		
		System.out.println("Informe o preço base");
		valor = entrada.nextDouble();
		
		System.out.println("Informe a taxa de hora extra");
		taxa = entrada.nextDouble();
		
		System.out.println("Informe a quantidade de horas");
		tempo = entrada.nextDouble();
		
		 total = valor + (valor *(taxa/100) * tempo);
		  System.out.println("total a pagar:" + total);
		
		  entrada.close();

	}

}
