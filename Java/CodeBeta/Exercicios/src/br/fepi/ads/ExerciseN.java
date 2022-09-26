package br.fepi.ads;

import java.util.Scanner;

public class ExerciseN {

	public static void main(String[] args) {
		
Scanner input = new Scanner (System.in);

int A, B ,C;
double  Aaux,Baux,Caux; 

		System.out.println("Digite um numero");
		A = input.nextInt();
		System.out.println("Digite um numero");
		B = input.nextInt();
		System.out.println("Digite um numero");
		C = input.nextInt();
		
		Aaux = A * A;
		Baux = B * B;
		Caux = C * C;
		
		System.out.println(Aaux);
		System.out.println(Baux);
		System.out.println(Caux);
		
		
		input.close();
	}

}
