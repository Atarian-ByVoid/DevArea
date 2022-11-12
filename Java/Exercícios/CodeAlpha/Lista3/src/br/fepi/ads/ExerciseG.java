 package br.fepi.ads;

import java.util.Scanner;

public class ExerciseG {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);

	int base,expo,result=1;
	
	System.out.println("Informe a base: ");
	base=input.nextInt();
	System.out.println("Informe o expoente: ");
	expo=input.nextInt();
	
	for(int i=expo;i>=1;i--) {
		result=result*base;
	System.out.println("Res: "+result);
	System.out.println("____________");
	}
		System.out.println("Resultado: "+result);
		input.close();
	}

}
