package br.fepi.ads;

import java.util.Scanner;

public class ExerciseZ {

	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
		double A , B;
		
		System.out.println("Valor de A = ");
		A = input.nextInt();
		System.out.println("Valor de B =");
		B = input.nextInt();
		
		
		Math.sqrt(A / B);

		System.out.println(Math.sqrt(A / B));
		
	input.close();
		
	


	}

}
