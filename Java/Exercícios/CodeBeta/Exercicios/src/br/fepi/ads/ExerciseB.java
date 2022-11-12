package br.fepi.ads;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExerciseB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double c,f;
		//objetos
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.0");
		//entrada
		System.out.println("conversão de temperaturas");
		System.out.println("Digite a temperatura em celsius: ");
		c = teclado.nextDouble();
		f = (9 * (c + 160)) / 5;
		//saida
		System.out.println("temperatura em fahrenheit: " + formatador.format(f) + "°F");
		teclado.close();

	}

}
