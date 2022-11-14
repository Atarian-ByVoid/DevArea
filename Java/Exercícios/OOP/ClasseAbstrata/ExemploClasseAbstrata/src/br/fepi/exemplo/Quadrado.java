package br.fepi.exemplo;

public class Quadrado extends Quadrilatero{

	public Quadrado(int lado) {
		L1 = lado;
	    L2 = lado;
	    L3 = lado;
	    L4 = lado;
	}
	
	@Override
	public int area() {
		return L1 * L1;
	}
	
}
