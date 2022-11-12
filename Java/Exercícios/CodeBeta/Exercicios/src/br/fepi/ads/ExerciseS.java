package br.fepi.ads;

import java.util.Scanner;

public class ExerciseS {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double Aaux,Baux,Caux,Daux;
		double A , B;
		
		System.out.println("Inserir valor de A = ");
		A = input.nextDouble();
		System.out.println("Inserir valor de B = ");
		B = input.nextDouble();
		
		Aaux = A + B;
		Baux = A - B;
		Caux = A / B;
		Daux = A * B;
		
		System.out.println("Valor final: " +Aaux);
		System.out.println("Valor final: " +Baux);
		System.out.println("Valor final: " +Caux);
		System.out.println("Valor final: " +Daux);
		
		input.close();
		
		
		

	}

}
