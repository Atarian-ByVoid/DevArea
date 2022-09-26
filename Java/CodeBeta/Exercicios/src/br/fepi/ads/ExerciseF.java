package br.fepi.ads;

import java.util.Scanner;

public class ExerciseF {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int A , B , aux;
		
		System.out.print("A = ");
		A = input.nextInt();
		System.out.print("B = ");
		B = input.nextInt();
		
		aux = A;
		A = B;
		B = aux;
		
		System.out.print("A = " + A);
		
		System.out.print(" B = " + B);
		
		input.close();
		
	}

}
