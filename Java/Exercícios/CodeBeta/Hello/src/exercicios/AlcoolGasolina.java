package exercicios;


import java.util.Scanner;

public class AlcoolGasolina {

	public static void main(String[] args) {
		// variaveis
		double alcool, gasolina;
		// objetos
		Scanner input = new Scanner(System.in);
		// entrada
		System.out.println("Alcool x gasolina");
		System.out.print("Digite o valor do alcool: ");
		alcool = input.nextDouble();
		System.out.println("Digite o valor da gasolina: ");
		gasolina = input.nextDouble();
		// processamento e saida
		if (alcool < 0.7 * gasolina) {
			System.out.println("Abastecer com alcool");
		} else {
			System.out.println("Abastecer com gasolina");
		}
		input.close();
	} 

}
