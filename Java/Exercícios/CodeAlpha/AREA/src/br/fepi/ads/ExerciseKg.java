package br.fepi.ads;

import java.util.Scanner;

public class ExerciseKg {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);

int t=0;
double soma=0,media=0;
System.out.print("Valor da amostra: ");
t=input.nextInt();


double[] alturas = new double[t];

for(int i=0;i<t;i++) {
	System.out.print("["+i+"]: ");
	alturas[i]= input.nextDouble();
	soma+=alturas[i];
	
}
media= (soma/t);
System.out.print("Média: "+media);
input.close();
	}

}
