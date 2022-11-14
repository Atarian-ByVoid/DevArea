package br.fepi.sistemas.modelo;

public class Circulo {

	public int raio;
	private final float PI = 3.1415f;
	
	public int diametro() {
		return 2 * raio;
	}
	
	public float circunferencia() {
		return 2 * PI * raio;
	}
	
	public float area() {
		return PI * raio * raio;
	}
}
