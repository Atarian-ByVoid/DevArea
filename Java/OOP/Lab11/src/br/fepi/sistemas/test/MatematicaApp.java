package br.fepi.sistemas.test;

import br.fepi.sistemas.model.Circulo;
import br.fepi.sistemas.model.Matematica;

public class MatematicaApp {
	
	public static void main(String[] args) {//m�todo main roda o programa
		Matematica mat = new Matematica();//cria��o do objeto
		//////////////////		
		
		float soma;
		soma=mat.soma(22, 22);
		System.out.println("A soma � "+soma);
		
		
		int result; //Cria��o de uma variavel inteira
		result= mat.maior(40, 512); //Execu��o da classe
		System.out.println("O resultado � "+result);
		
		
		Circulo c= new Circulo();
	    c.raio=10;
		System.out.println("Diametro = "+c.diametro());
		System.out.println("Diametro = "+c.circunfierencia());
		System.out.println("Diametro = "+c.area());

		
	}

}
