package br.fepi.ads;

import java.util.Scanner;

public class ExerciseG {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int a,b,c,d;

		System.out.println("Valor de A: ");
		a=input.nextInt();
		System.out.println("Valor de B: ");
		b=input.nextInt();
		System.out.println("Valor de C: ");
		c=input.nextInt();
		System.out.println("Valor de D: ");
		d=input.nextInt();


			if((a % 2==0) && (a % 3==0)) 
			System.out.println("A é divisivel por 2 ou 3 \n  Valor de A: "+a);
			if((b % 2==0) && (b % 3==0)) 
			System.out.println("B É divisivel por 2 ou 3 \n  Valor de B: "+b);
			if((c % 2==0) && (c % 3==0)) 
			System.out.println("C É divisivel por 2 ou 3 \n  Valor de C: "+c);
			if((d % 2==0) && (d % 3==0)) 
			System.out.println("D É divisivel por 2 ou 3 \n  Valor de D: "+d);
			
			else
				System.out.println("Nenhum numero é divisivel por 2 ou 3");	
			
			input.close();
			

	}

}


