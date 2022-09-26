package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Regra3 {

	public static void main(String[] args) {
      //variaveis
		double x, y, valor;
      //objetos
		Scanner input = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.00");
	  // entrada
		System.out.println("Regra de 3");
		System.out.println("x% de y = valor");
		System.out.print("Digite o valor de x: ");
		x = input.nextDouble();
		System.out.print("Digite o valor de y: ");
		y = input.nextDouble();
		//preocessamento
		valor = (x * y) / 100;
		//saida
		System.out.println(x + "% de" + y + " = " + formatador.format(valor));
		
		input.close();
		

	}

}
