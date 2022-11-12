package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ValorServico {

	public static void main(String[] args) {
        //variaveis
		double hora,remuneracao,custo,cargaHoraria;
		//objetos
		Scanner input = new Scanner (System.in);
		DecimalFormat formatador = new DecimalFormat("#0.00");
		//entrada
		System.out.println("Calculo do valor da hora de um seviço");
		System.out.print("Remuneraçao mensal pretendida: ");
		remuneracao = input.nextDouble();
		System.out.print("Custo operacional mensal: ");
		custo = input.nextDouble();
		System.out.print("Carga horaria mensal de trabalhos: ");
		cargaHoraria = input.nextDouble();
		//processamento
		hora = (remuneracao + (remuneracao * 0.3) + custo + (remuneracao * 0.2)) / cargaHoraria;
		//saida
		System.out.println("Valor da hora: " + formatador.format(hora));
		input.close();
		
	}

}
