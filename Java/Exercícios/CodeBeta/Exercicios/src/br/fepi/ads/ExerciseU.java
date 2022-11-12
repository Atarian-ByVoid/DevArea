package br.fepi.ads;

import java.util.Scanner;
public class ExerciseU {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double V;
		double R;	
		double PI = 3.14159;
		
		System.out.println("Informe o raio");
        R = entrada.nextDouble();
        
        V = (4.0 / 3)* PI* (R * R * R);
 
        System.out.printf("V = %.3f\n",V);
     
        entrada.close();
        
        
   
	}

}
