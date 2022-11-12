package br.fepi.ads;

import java.util.Scanner;

public class ExerciseM {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);

		int A ,B ,C;
		double aux;
		
		System.out.println("Digite um numero");
		A = input.nextInt();
		System.out.println("Digite um numero");
		B = input.nextInt();
		System.out.println("Digite um numero");
		C = input.nextInt();
		
		aux = (A * A)+(B * B)+(C * C);
		
		System.out.println(aux);
		
		input.close();
	
		
	}

}
