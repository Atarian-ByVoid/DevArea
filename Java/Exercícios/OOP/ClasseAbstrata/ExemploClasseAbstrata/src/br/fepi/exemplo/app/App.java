package br.fepi.exemplo.app;

import br.fepi.exemplo.Quadrado;
import br.fepi.exemplo.Quadrilatero;
import br.fepi.exemplo.Retangulo;
import br.fepi.exemplo.Trapezio;

public class App {
	public static void main(String[] args) {
		
		Retangulo q = new Retangulo(10, 20);
		
		System.out.println("Retângulo");
		System.out.println("Área: "+q.area());
		System.out.println("Perímetro: "+ q.perimetro());
		
		Quadrado quadrado = new Quadrado(20);
		
		System.out.println("\nQuadrado");
		System.out.println("Área: "+quadrado.area());
		System.out.println("Perímetro: "+quadrado.perimetro());
		
		
		Trapezio t = new Trapezio();
		t.setL1(10);
		t.setL2(20);
		t.setL3(20);
		t.setL4(15);
		t.setAltura(12);
		
		System.out.println("\nTrapézio");
		System.out.println("Área: "+t.area());
		System.out.println("Perímetro: "+t.perimetro());
		
		
	}
}
