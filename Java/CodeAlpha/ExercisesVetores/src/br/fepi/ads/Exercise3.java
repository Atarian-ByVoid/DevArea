package br.fepi.ads;

import java.util.Scanner;

public class Exercise3 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		String[] personagens = 
			{ "Peppa", "Suzy", "Candy Cat" };
		String busca = "", resultado  = "";

		for (int i = 0; i < 3; i++) {
			System.out.println(personagens[i]);
		}
		
		System.out.print("Pesquisa: ");
		busca = new Scanner(System.in).nextLine();
		//Laço para comparação
		for (int i = 0; i < 3; i++) {			
			if (personagens[i].toUpperCase().
					equals(busca.toUpperCase())) 
				resultado = "Cadastrado! " + i;				
		}	
		
		if (resultado.isEmpty()) {
			System.out.println("Não Cadastrado.");
		}else {
			System.out.println(resultado);
		}
		
	}

}

