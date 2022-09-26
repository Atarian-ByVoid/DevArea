package br.fepi.ads;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {

double valor=0,total=0;

do {
	System.out.println("Entre com um valor: ");
	valor=extracted().nextDouble();
	total+=valor;
	
}while (total<=1000);

System.err.println("Limite estourado");

	}

	private static Scanner extracted() {
		return new Scanner(System.in);
	}

}
