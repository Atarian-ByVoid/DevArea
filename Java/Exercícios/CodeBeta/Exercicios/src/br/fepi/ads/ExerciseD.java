package br.fepi.ads;

import java.util.Scanner;

public class ExerciseD {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float C = 0;
		float T = 0;
		float V = 0;
		float D = 0;
		
		System.out.println("Insira o tempo da viagem em horas):");
		T = entrada.nextFloat();
		System.out.println("Insira  a velocidade media(em km):");
		V = entrada.nextFloat();
		D = T   * V;
		C = D /12;
		
		System.out.println("Velocidade media:" + V +"\n tempo de viagem:"+ T + "\n distancia percorrida:" + D +"\n litros de combustivel consumido: " + C);
		
		entrada.close();
		

	}

}
