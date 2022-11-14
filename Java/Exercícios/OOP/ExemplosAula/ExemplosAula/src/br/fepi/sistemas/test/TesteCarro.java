package br.fepi.sistemas.test;

import br.fepi.sistemas.modelo.Carro;

public class TesteCarro {
	public static void main(String[] args) {
		Carro meuCarro = new Carro("Hyundai", "Cinza", false, 4);
		Carro carro2 = new Carro("Gol", "Cinza", true, 4);
		
		meuCarro.mostraAtributos();

		System.out.println("----------------------");
		carro2.mostraAtributos();
		
	}
}
