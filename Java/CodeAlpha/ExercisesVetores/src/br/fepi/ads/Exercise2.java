package br.fepi.ads;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		
		double[]valores=new double[4];
		double soma=0,somaPar=0;
		
		for(int i=0;i<4;i++) {
			System.out.print("Valor: ["+i+"]: ");
			
			valores[i]= new Scanner (System.in).nextDouble();
			soma+=valores[i];
			
			if(valores[i] %2==0)
				somaPar+=valores[i];
		}
		
		System.out.println("Soma total: "+soma);
		System.out.println("Soma total: "+somaPar);
	
	}

}
