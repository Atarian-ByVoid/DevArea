package br.fepi.sistemas.test;

import java.util.Scanner;

import javax.swing.JOptionPane;

import br.fepi.sistemas.modelo.Circulo;
import br.fepi.sistemas.modelo.Matematica;

public class App {

	public static void main(String[] args) {
//		Matematica mat = new Matematica();
//
//		int resultado;
//		resultado = mat.maior(40, 50);
//		System.out.println("O resultado é " + resultado);
//
//		float resultSoma;
//		resultSoma = mat.soma(10, resultado);
//
//		System.out.println("A soma é " + resultSoma);

	    String raioTexto = JOptionPane.showInputDialog(null, "informe o raio");
	    int raioInteiro = Integer.parseInt(raioTexto);
		
		Circulo c = new Circulo();
		c.raio = raioInteiro;

		System.out.println("diametro = "+ c.diametro());
		System.out.println("circunferência = "+ c.circunferencia());
		System.out.println("area = "+ c.area());
		
		
	}

}
