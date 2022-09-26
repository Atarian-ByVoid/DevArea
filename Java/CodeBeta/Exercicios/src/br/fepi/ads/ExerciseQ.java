package br.fepi.ads;

import javax.swing.JOptionPane;
public class ExerciseQ {

	public static void main(String[] args) {
		
		double A;
		double R;
		double PI = 3.14;
		
		System.out.println("Informe área circunferência");
		A = Double.parseDouble(JOptionPane.showInputDialog("Informe a area"));
		System.out.println("Informe o raio da circunferência ");
		R = Double.parseDouble(JOptionPane.showInputDialog("Informe o raio"));
		
		A = PI * (R * R);
		System.out.println("Resultado da Área : " + A);
		
		
		
		
		

	}

}
