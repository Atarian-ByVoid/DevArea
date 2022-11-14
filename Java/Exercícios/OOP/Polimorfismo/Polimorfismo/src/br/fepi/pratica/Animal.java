package br.fepi.pratica;

public class Animal {
	
	private String nome;
	private String raça;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRaça() {
		return raça;
	}
	public void setRaça(String raça) {
		this.raça = raça;
	}
	
	public Animal(){
		
	}
	
	public Animal(String nome) {
		this.nome = nome;
	}
	
	public void caminha() {
		System.out.println("O animal caminhou");
	}
}
