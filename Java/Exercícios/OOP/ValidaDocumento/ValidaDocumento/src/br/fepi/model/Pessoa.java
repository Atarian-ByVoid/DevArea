package br.fepi.model;

public abstract class Pessoa {
	private String nome;
	
	public void escreverNome() {
		System.out.println("O nome é: "+ this.nome);
	}

	public abstract boolean validarDocumento();
	
	public Pessoa() {
	
	}
	
	public Pessoa(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
