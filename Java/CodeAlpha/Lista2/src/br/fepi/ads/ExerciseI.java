package br.fepi.ads;

import java.util.Scanner;

public class ExerciseI {

	public static void main(String[] args) {
Scanner input = new Scanner (System.in);

int a,b,c,d;

System.out.println("Valor de A");
a=input.nextInt();
System.out.println("Valor de B");
b=input.nextInt();
System.out.println("Valor de C");
c=input.nextInt();
System.out.println("Valor de D");
d=input.nextInt();

//////Maior teste

	if(a>b && a>c && a>d) {
	System.out.println("Maior valor é A");
	//////////////////////////////////////
	}else if(b>c && c>d) {
	System.out.println("Maior valor é B");
	//////////////////////////////////////
	}else if(c>d) {
	System.out.println("Maior valor é C");
	//////////////////////////////////////
	}else {
	System.out.println("Maior valor é D");
	//////////////////////////////////////
	
	}
	
	////////////////////////////////////////////////////////////////////////////

	////////Menor teste
	
	if(a<b && a<c && a<d) {
	System.out.println("Menor valor é A");
	//////////////////////////////////////
	}else if(b<c && c<d) {
	System.out.println("Menor valor é B");
	//////////////////////////////////////
	}else if(c<d) {
	System.out.println("Menor valor é C");
	//////////////////////////////////////
	}else {
	System.out.println("Menor valor é D");
	//////////////////////////////////////

	}
	
	
input.close();
}
	}
