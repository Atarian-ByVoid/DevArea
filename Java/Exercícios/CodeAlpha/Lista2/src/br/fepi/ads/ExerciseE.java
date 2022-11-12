package br.fepi.ads;

import java.util.Scanner;

public class ExerciseE {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a, b, c;
        double delta, x1, x2;
 
        System.out.println("Valor de A:");
        a=input.nextInt();
        System.out.println("Valor de A:");
        b=input.nextInt();
        System.out.println("Valor de A:");
        c=input.nextInt();
        		
        delta = (b * b) + (-4 * (a * c));
 
        System.out.println("Delta: " + delta);
 
        
        if (delta >= 0) {
 
            x1 = ((-(b) + Math.sqrt(delta)) / 2 * a);
            x2 = ((-(b) - Math.sqrt(delta)) / 2 * a);
 
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
 
        } else {
            System.out.println("Delta não possui raiz!");
            System.exit(0);
        }
input.close();
	}

}
