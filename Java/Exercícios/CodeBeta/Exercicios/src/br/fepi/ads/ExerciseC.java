package br.fepi.ads;

import javax.swing.JOptionPane;

public class ExerciseC {

	public static void main(String[] args) {

		Double V;
		Double pi = 3.14;
		Double r;
		Double altura;

		System.out.println("Informe o raio da circunferencia");
		r = Double.parseDouble(JOptionPane.showInputDialog("Informe o raio"));

		System.out.println("Informe a altura");
		altura = Double.parseDouble(JOptionPane.showInputDialog("altura"));

		V = pi * (r * r) * altura;
		System.out.println("O valor do volume de uma lata de óleo é " + V);

	}

}
