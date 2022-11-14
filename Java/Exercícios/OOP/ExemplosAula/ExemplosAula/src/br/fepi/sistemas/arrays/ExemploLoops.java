package br.fepi.sistemas.arrays;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ExemploLoops {
	public static void main(String[] args) {
					
		ArrayList<String> lista = new ArrayList<>();
		String palavra = "";
		
		do {
			palavra = JOptionPane.showInputDialog("Digite a palavra");		
			lista.add(palavra);
	
			JOptionPane.showMessageDialog(null, lista.toString());
		}while(!palavra.equals("FIM"));
	}
}
