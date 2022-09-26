package br.fepi.ads;

import java.util.Scanner;

public class ExerciseD {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double n1,n2,n3,n4,md1,md2,ne;

		System.out.println("Nota 1: ");
		n1=input.nextDouble();
		System.out.println("Nota 2: ");
		n2=input.nextDouble();
		System.out.println("Nota 3: ");
		n3=input.nextDouble();
		System.out.println("Nota 4: ");
		n4=input.nextDouble();

		md1=(n1+n2+n3+n4)/4;
	   
		if(md1>=7)
			System.out.println("Aprovado ;)   nota="+md1);
		else
			System.out.println("Nota do exame: ");
		    ne=input.nextDouble(); 
		    md2=(md1+ne)/2;
			System.out.println("Nota final "+ne);
		
	
		if(md2>=5)
			System.out.println("Aprovado no exame "+md2);
		else
		System.out.println("Reprovado no exame"+md1);
		
	
		input.close();
		
	}

}
