package br.fepi.ads;

import java.util.Scanner;

public class ExerciseB {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);

int mult=0;
int tabuada;
double result;

for(int x=0;x<10;x++) {
	
	System.out.println("Digite um valor de 0 a 10: ");
	tabuada=input.nextInt();
	
	System.out.println("");
	result=tabuada* ++mult;
	
	System.out.println(tabuada+" X "+mult+" = "+result);
	
	
	
}
	input.close();
	}

}
