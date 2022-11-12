package exercicios;

import java.util.Scanner;

public class JoKenPo {

	public static void main(String[] args) {

		int player, CPU;
		Scanner input = new Scanner(System.in);
		System.out.println("___JoKenPo___");
		System.out.println("");
		System.out.println("1. Pedra");
		System.out.println("2. Papel");
		System.out.println("3. tesoura");
		System.out.print("Digite a opçao desejada");

		// Lógica do jogador
		player = input.nextInt();
		System.out.println("");
		switch (player) {
		case 1:
			System.out.println("Jogador escolheu PEDRA");
			break;
		case 2:
			System.out.println("Jogador escolheu PAPEL");
			break;
		case 3:
			System.out.println("Jogador escolheu TESOURA");
			break;
		default:
			System.out.println("Opção inválida");
			break;
		}
		// Lógica do computador
		CPU = (int) (Math.random() * 3 + 1);
		input.close();
		switch (CPU) {

		case 1:
			System.out.println("CPU escolheu PEDRA");
			break;
		case 2:
			System.out.println("CPU escolheu PAPEL");
			break;
		case 3:
			System.out.println("CPU escolheu TESOURA");
			break;
		}
		//Lógica para determinar o vencedor
		System.out.println("");
		if (player == CPU) {
			System.out.println("EMPATE");
		}else {
			if ((player == 1 && CPU == 3 ) || (player == 2 && CPU == 1) || (player == 3 && CPU ==2)) {
			System.out.println("PlAYER VENCEU");
		} else {
			System.out.println("CPU VENCEU");
	 		
	    }			
 
       }
	}
}
