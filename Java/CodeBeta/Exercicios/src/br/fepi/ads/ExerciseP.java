package br.fepi.ads;

import java.util.Scanner;

public class ExerciseP {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
double SM , PR , NV;

System.out.println("Sálario mensal: ");
SM = input.nextDouble();
System.out.println("Percentual: ");
PR = input.nextDouble();

NV = SM +(SM* PR /100);

System.out.printf("Sálario antigo R$%.2f%n", SM);
System.out.printf("Aumento: %.1f%% %n" , PR);
System.out.printf("Salario novo R$%.2f",NV);






input.close();
	}

}
