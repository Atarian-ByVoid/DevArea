package br.fepi.exemplo;

public class Retangulo extends Quadrilatero{

	public Retangulo(int base, int altura) {
		super.L1 = base;
		super.L2 = altura;
		super.L3 = base;
		super.L4 = altura;
	}
	
	@Override
	public int area() {
		return L1 * L2;
	}
	
	@Override
	public void setL1(int l1) {
		L1 = l1;
		L3 = l1;
	}
	@Override
	public void setL2(int l2) {
		L2 = l2;
		L4 = l2;
	}
	
	@Override
	public void setL3(int l3) {
	   L1 = l3;
	   L3 = l3;
	}
	
	@Override
	public void setL4(int l4) {
	   L2 = l4;
	   L4 = l4;
	}
}
