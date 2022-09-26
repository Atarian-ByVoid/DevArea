package br.fepi.ads;

import java.util.Scanner;

public class ExerciseN {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);

int a,b,c,soma;

System.out.println("Valor de A: ");
a=input.nextInt();
System.out.println("Valor de B: ");
b=input.nextInt();
System.out.println("Valor de C: ");
c=input.nextInt();

soma=a+b+c;

if(soma>=100)
	System.out.println("Está dentro");
else
	System.out.println("Não está dentro");

input.close();







  }
}
