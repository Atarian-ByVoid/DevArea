package br.fepi.ads;

import java.util.Scanner;

public class ExerciseA {

	public static void main(String[] args) {
Scanner input =new Scanner(System.in);

int a,b;


System.out.println("Insira valor de A: ");
a=input.nextInt();
System.out.println("Insira valor de B: ");
b=input.nextInt();


if(a>b)
	System.out.println("O valor será "+(a-b));

else
    System.out.println("O valor será "+(b-a));

input.close();
	}

}
