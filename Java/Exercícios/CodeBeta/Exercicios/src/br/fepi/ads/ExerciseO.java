package br.fepi.ads;

import java.util.Scanner;

public class ExerciseO {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int A , B ,C , D;
		double P , S;
		
		System.out.println("Inserir valor de A");
		A = input.nextInt();
		System.out.println("Inserir valor de B");
		B = input.nextInt();
		System.out.println("Inserir valor de C");
		C = input.nextInt();
		System.out.println("Inserir valor de D");
		D = input.nextInt();
		
		P = A * C;
		S = B + D;
		
		System.out.println("Valor do produto: "+ P);
		System.out.println("Valor da soma: "+ S);
		
		input.close();
		
		
		
		
		
	}

}
