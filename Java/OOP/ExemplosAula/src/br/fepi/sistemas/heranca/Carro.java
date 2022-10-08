package br.fepi.sistemas.heranca;

public class Carro extends Veiculo{

	private int portas;
	private boolean portaMalaAberto;
	

	public Carro() {
		
	}
	
	

	public Carro(String nome, String cor, String marca, int velocimetro, int portas, boolean portaMalaAberto) {
		super(nome, cor, marca, velocimetro);
		
		this.portas = portas;
		this.portaMalaAberto = portaMalaAberto;
	}



	public Carro(int portas, boolean portaMalaAberto) {
		super();
		this.portas = portas;
		this.portaMalaAberto = portaMalaAberto;
	}
	
	public int getPortas() {
		return portas;
	}
	public void setPortas(int portas) {
		this.portas = portas;
	}
	public boolean isPortaMalaAberto() {
		return portaMalaAberto;
	}
	public void setPortaMalaAberto(boolean portaMalaAberto) {
		this.portaMalaAberto = portaMalaAberto;
	}
	
	public void imprimeDados() {
		
	}
	
}
