package br.fepi.pratica;

public class Cachorro extends Animal{
	public void late() {
		System.out.println("Au au");
	}
	
	@Override
	public void caminha() {
		System.out.println("O cachorro deu uns pulos");
	}
}
