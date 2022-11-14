package br.fepi.teste;

import java.util.ArrayList;

import br.fepi.heranca.Anfibio;
import br.fepi.heranca.Animal;
import br.fepi.heranca.Passaro;
import br.fepi.heranca.Peixe;

public class App {
	public static void main(String[] args) {
		
		Peixe p = new Peixe();
		Passaro pa = new Passaro();
		Anfibio anf = new Anfibio();
	
		ArrayList<Animal> listaAnimais = new ArrayList<Animal>();
		
		listaAnimais.add(p);
		listaAnimais.add(pa);
		listaAnimais.add(anf);
		
		for (Animal animal : listaAnimais) {
			animal.mover();
		}
		
	}
}
