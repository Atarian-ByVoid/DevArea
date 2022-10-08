package br.fepi.sistemas.modelo;

public class Carro {
	private String marca;
	private String cor;
	private boolean motorLigado;
	private int numRodas;
	
	public Carro(){
		System.out.println("O objeto foi criado");
	}
	
	public Carro(String m, String c, boolean mligado, int n) {
		this.marca = m;	
		this.cor = c;
		this.motorLigado = mligado;
		this.numRodas = n;
	}
	
	public void ligaMotor() {
		this.motorLigado = true;
	}
	
	public void mostraAtributos() {
		System.out.println("Marca: " + marca);
		System.out.println("Cor: " + cor);
		System.out.println("Numero de Rodas: "+ numRodas);
		
		if(motorLigado) {
			System.out.println("O motor está ligado");
		}else {
			System.out.println("O motor está desligado");
		}
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getMarca() {
		return this.marca;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public boolean isMotorLigado() {
		return motorLigado;
	}

	public void setMotorLigado(boolean motorLigado) {
		this.motorLigado = motorLigado;
	}
	
	public int getNumRodas() {
		return numRodas;
	}

	public void setNumRodas(int numRodas) {
		this.numRodas = numRodas;
	}

	public int rodas() {
		return numRodas;
	}
	
	
	
}
