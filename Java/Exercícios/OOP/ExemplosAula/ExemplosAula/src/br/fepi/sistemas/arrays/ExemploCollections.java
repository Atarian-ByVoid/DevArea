package br.fepi.sistemas.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;

public class ExemploCollections {
	public static void main(String[] args) {
		
		ArrayList<String> cores = new ArrayList<>();
		cores.add("azul");
		cores.add("vermelho");
		cores.add("verde");
		cores.add("roxo");
		cores.add("branco");
		cores.add("amarelo");
		System.out.println(cores.toString());
		cores.remove("vermelho");
		System.out.println(cores.toString());
		System.out.println(cores.size());
		
		
		ArrayList<Float> notas = new ArrayList<>();
		notas.add(90.0f);
		notas.add(92.0f);
		notas.add(93.0f);
		notas.add(94.0f);
		System.out.println(notas.toString());
		
		HashMap<String, Integer> notasAlunos = new HashMap<>(); 
		notasAlunos.put("Delleon", 90);
		notasAlunos.put("Nadine", 91);
		notasAlunos.put("Monalisa", 92);
		notasAlunos.put("Rafael", 93);
		
		System.out.println(notasAlunos.containsKey("Delleon"));
		System.out.println(notasAlunos.containsValue(92));
		
		System.out.println(notasAlunos.get("Delleon"));
		
		System.out.println(notasAlunos.toString());
		
		LinkedList<String> paises = new LinkedList<>(); 
		paises.add("Brasil");
		paises.add("Japão");
		paises.offer("EUA");
		paises.add("Itália");
		
		
		System.out.println("\n\n"+paises.toString());
		paises.poll();
		
		Collections.sort(paises);
		
		System.out.println("\n\n"+paises.toString());
		
		Collections.shuffle(cores);
		
		System.out.println(cores.toString());
		
		
		
	}
}
