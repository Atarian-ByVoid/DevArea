package br.fepi.ads;

import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] faltas = { 5, 10, 6, 9, 3 };
		int total = 0;
		double media = 0;

		for (int i = 0; i < 5; i++) {
			total += faltas[i];
		}
		media = total / 5.0;
		System.out.println("Média de faltas = " + media);

		input.close();

	}
}
