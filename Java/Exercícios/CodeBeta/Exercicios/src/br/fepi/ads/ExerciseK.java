package br.fepi.ads;

import java.util.Scanner;

public class ExerciseK {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		double cotDol, valDol, valReal;

		System.out.print("Conversor de Real em dolar . \n\n");

		System.out.print("Digite a cotaçao em dolar: ");
		cotDol = entrada.nextDouble();

		System.out.println("Digite o valor em Real:");
		valDol = entrada.nextDouble();
		
		valReal= cotDol *  valDol;
		System.out.println("Valor em dolar é: "+ valReal +"\n");
		
		entrada.close();
				
	}

}
