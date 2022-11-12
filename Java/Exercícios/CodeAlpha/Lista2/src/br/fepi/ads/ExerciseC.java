package br.fepi.ads;

import java.util.Scanner;

public class ExerciseC {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);

double n1,n2,n3,n4,md;

System.out.println("Nota 1: ");
n1=input.nextDouble();
System.out.println("Nota 2: ");
n2=input.nextDouble();
System.out.println("Nota 3: ");
n3=input.nextDouble();
System.out.println("Nota 4: ");
n4=input.nextDouble();

md=n1+n2+n3+n4;

if(md>=5)
	System.out.println("Aprovado ;)   nota="+md);
else
	System.out.println("Reprovado :(  nota="+md);

input.close();
	}

}
