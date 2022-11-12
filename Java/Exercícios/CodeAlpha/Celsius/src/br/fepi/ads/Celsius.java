package br.fepi.ads;

public class Celsius {

	public static void main(String[] args) {
		
double f=0;
		for(int c=10; c<=100;c++) {
			
			f = c* (1.8 + 32);
		}
		
		System.out.println(f);
	}
}