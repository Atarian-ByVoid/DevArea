package br.fepi.ads;

import java.util.Scanner;

public class ExerciseI {

	public static void main(String[] args) {
		
		Scanner numero = new Scanner(System.in);	
		
		 int entrada;
		 double resultado;
		 
		 
		 System.out.println("Digite um numero");
		 entrada = numero.nextInt();
		 resultado = entrada * entrada;
		 System.out.println(resultado);
		 
		 numero.close();
		 
		
		
		
	}

}
