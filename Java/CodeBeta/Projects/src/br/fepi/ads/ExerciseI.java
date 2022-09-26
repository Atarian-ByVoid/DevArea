package br.fepi.ads;

public class ExerciseI {

	public static void main(String[] args) {
		
		int A = 10;
		int Quad;
		
		for (Quad = 1; Quad<= 15; Quad ++) {
			double pow = Math.pow(A , Quad);
			
			System.out.println("O expoente de:" + A +  "Elevadao a:" + Quad +" É " + pow);
			
		}

	}

}
