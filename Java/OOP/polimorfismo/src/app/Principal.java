package app;

import java.util.ArrayList;

import polimorfismo.Anfibio;
import polimorfismo.Animal;
import polimorfismo.Passaro;
import polimorfismo.Peixe;

public class Principal {

	public static void main(String[] args) {
		Peixe p = new Peixe();
		Passaro pa = new Passaro();
		Anfibio anf = new Anfibio();

		ArrayList<Animal>listaAnimais = new ArrayList<Animal>();
		
		for (Animal animal: listaAnimais) {
			animal.mover();
			
		}

		
	}

}
