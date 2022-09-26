package br.fepi.sistemas.model;

public class Circulo {

	private final float PI= 3.1415f;
	public int raio;
	
	public int diametro() {
		
		return 2 * raio;
		}
	
	
	public float circunfierencia() {
		
		return 2 *PI* raio;
		}
	
	
	public float area() {
		
		return 2 * raio *raio;
		}
}
