package br.fepi.ads;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExerciseA {

	public static void main(String[] args) {
		
double c,f;
//objetos
Scanner teclado = new Scanner(System.in);
DecimalFormat formatador = new DecimalFormat("#0.0");
//entrada
System.out.println("conversão de temperaturas");
System.out.println("Digite a temperatura em fahrenheit: ");
f = teclado.nextDouble();
c = (5 * (f - 32)) / 9;
//saida
System.out.println("temperatura em celsius: " + formatador.format(c) + "°C");
teclado.close();
		
		

	}


		
	}


