package br.fepi.ads;

import java.util.Scanner;

public class Exercisek {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);

int x;

System.out.println("Valor do numero: ");
x=input.nextInt();


if(x<=9)
	System.out.println("Ele está dentro do limite");
else
	System.out.println("Passou do limite");

input.close();
	}

}
