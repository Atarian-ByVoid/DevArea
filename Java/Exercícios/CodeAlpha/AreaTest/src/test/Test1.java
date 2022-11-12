package test;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		
			double[] notas = new double[5];
			String[] estados = new String[4];
			int[] faltas = { 5, 10, 6, 9, 3 };
			int total = 0;
			double media = 0;
			Scanner entrada = new Scanner(System.in);
			int i;
			for (i = 0; i < 5; i++) {
				total += faltas[i];
			}
			media = (total / (double) i);
			System.out.printf("Média de faltas = %.2f", media);

			for (i = 0; i < 4; i++) {
				System.out.print("Estado [" + i + "]:");
				estados[i] = entrada.nextLine();
			}
			for (i = 0; i < 4; i++) {
				System.err.println(estados[i]);
			}
	}

}
