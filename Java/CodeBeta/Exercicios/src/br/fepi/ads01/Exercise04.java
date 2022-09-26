package br.fepi.ads01;

import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {
		
Scanner input = new Scanner (System.in);

int N;

System.out.println("Entre com um valor: ");
N = input.nextInt();

if((N > -10) && (N < 10))
	System.out.println(N+" Está dentro da faixa.");
input.close();


	}

}
