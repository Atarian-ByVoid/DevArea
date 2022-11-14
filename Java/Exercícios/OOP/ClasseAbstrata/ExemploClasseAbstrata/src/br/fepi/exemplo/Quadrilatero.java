package br.fepi.exemplo;

public abstract class Quadrilatero {
	protected int L1;
	protected int L2;
	protected int L3;
	protected int L4;
	
	public abstract int area();
	
	public int perimetro() {
		return L1 + L2 + L3 + L4;
	}

	public int getL1() {
		return L1;
	}

	public void setL1(int l1) {
		L1 = l1;
	}

	public int getL2() {
		return L2;
	}

	public void setL2(int l2) {
		L2 = l2;
	}

	public int getL3() {
		return L3;
	}

	public void setL3(int l3) {
		L3 = l3;
	}

	public int getL4() {
		return L4;
	}

	public void setL4(int l4) {
		L4 = l4;
	}
}
