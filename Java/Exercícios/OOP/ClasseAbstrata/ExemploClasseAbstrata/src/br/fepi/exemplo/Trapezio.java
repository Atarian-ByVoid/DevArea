package br.fepi.exemplo;

public class Trapezio extends Quadrilatero{

	private int altura;
	
	@Override
	public int area() {
		return (L1+L2)*altura/2;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

}
