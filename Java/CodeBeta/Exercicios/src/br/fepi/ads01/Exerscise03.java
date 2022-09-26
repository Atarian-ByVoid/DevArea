package br.fepi.ads01;

import java.util.Scanner;

public class Exerscise03 {

	public static void main(String[] args) {
Scanner input = new Scanner (System.in);

int N;

System.out.println("Digite o valor do numero: ");
N = input.nextInt();

if(N%2==0)
	System.out.println("O numero é par");
else
	System.out.println("O numero é impar");

input.close();
}
	}


