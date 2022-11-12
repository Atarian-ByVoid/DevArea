package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Desafio3 {

	public static void main(String[] args) {

        //variaveis
		double total, desconto, totalDesconto, valorPago,troco;
		// objetos
		Scanner input = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.00");
		//entrada1
		System.out.println("PDV");
		System.out.println("Valor total: " );
		total = input.nextDouble();
		System.out.println("Desconto(%): ");
		desconto = input.nextDouble();
		//processamento1
		totalDesconto = total - (desconto * total ) / 100;
		//saida
		System.out.println("Total com descontos: R$" + formatador.format(totalDesconto));
		//entrada2
		System.out.println("____________________________________________________________");
		System.out.print("Valor pago em dinheiro: ");
		valorPago = input.nextDouble();
		//processamento2
		troco = valorPago - totalDesconto;
		//saida2
		System.out.println("Troco: R$ " + formatador.format(troco));
		input.close();
		
		
	}

}
