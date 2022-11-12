package br.fepi.ads;

import java.util.Scanner;

public class ExerciseB {

	public static void main(String[] args) {
Scanner input = new Scanner (System.in);

double n;

System.out.println("Valor a ser inserido: ");
n=input.nextDouble();


if(n>0)
	System.out.println(""+n);
else
System.out.println(""+n*-1);

input.close();

	}

}
