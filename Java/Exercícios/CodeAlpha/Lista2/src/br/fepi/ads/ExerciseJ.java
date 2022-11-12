package br.fepi.ads;

import java.util.Scanner;

public class ExerciseJ {

	public static void main(String[] args) {
Scanner input = new Scanner (System.in);

double x;

System.out.println("Valor do numéro: ");
x=input.nextDouble();

if (x % 2==0)
	System.out.println("É par");
else
	System.out.println("É impar");

input.close();

	
	}

}
