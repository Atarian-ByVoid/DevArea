package br.fepi.ads;

import java.util.Scanner;

public class ExerciseL {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Valor que deseja converter");
		double total = entrada.nextDouble();

		System.out.println("Qual é o tipo de moeda do seu valor? \n Real (1) \n dólar (2)\n Euro (3)");
		double moeda = entrada.nextDouble();

		if (moeda == 1) {
			double contard = total * 0.24;
			System.out.println("O real que voce digitou em dolar:" + contard + " $");
			double contare = total * 0.22;
			System.out.println("O real que voce digitou em euro:" + contare + "€");
		}
		if (moeda == 2) {
			double contadr = total * 5.17;
			System.out.println("O doólar que voce digitou em real:" + contadr + "R$");
			double contade = total * 0.91;
			System.out.println("O dolar que voce digitou em euro:" + contade + " €");
		}if (moeda == 3) {
			double contaer = total * 6.14;
			System.out.println("O euro que voce digitou em real:" +contaer+"R$");
			double contaed = total *1.09;
			System.out.println("O euro que voce digitou em dolar:"+contaed+"$");
			entrada.close();

		}

	}

}
