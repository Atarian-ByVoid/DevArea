package br.fepi.ads01;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int A;
		int B;

		System.out.println("Valor de A: ");
		A = input.nextInt();
		System.out.println("Valor de B: ");
		B = input.nextInt();

		if (A != B)
			
			System.out.printf("A<> de B" + A, B);
input.close();
	}

}
