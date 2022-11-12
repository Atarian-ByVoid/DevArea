package br.fepi.ads;

import java.util.Scanner;

public class ExerciseL {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);


int x;

System.out.println("Valor do numero: ");
x=input.nextInt();

if(x>3)
	System.out.println();
if(x!=3)
	System.out.println(+x);

input.close();
	}

}
