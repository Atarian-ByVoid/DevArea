package br.fepi.sistemas.heranca;

public class Veiculo {

	private String nome;
	private String cor;
	private String marca;
	private int velocimetro;
	
	
	public Veiculo() {
		System.out.println("Construtor padrão");
	}
	
	public Veiculo(String nome) {
		this.nome = nome;
	}
	
	public Veiculo(String nome, String cor, String marca, int velocimetro) {
		this.nome = nome;
		this.cor = cor;
		this.marca = marca;
		this.velocimetro = velocimetro;
	}

	public void aumentaVelocidade() {
		if(velocimetro<200) {
			velocimetro++;
		}
	}
	
	public void diminuiVelocidade() {
		if(velocimetro>0) {
			velocimetro--;
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getVelocimetro() {
		return velocimetro;
	}

	public void setVelocimetro(int velocimetro) {
		this.velocimetro = velocimetro;
	}
	

	
	
}
