package fepi;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);

int a,b,valor;
int opcao;

System.out.println("Escolha uma opção");
opcao=input.nextInt();

		switch (opcao) {
		case 0:
			System.out.println("Saindo");
			break;
		case 1: 
			
			System.out.println("Escolha valor  de A: ");
			a=input.nextInt();
			System.out.println("Escolha valor  de B: ");
			b=input.nextInt();
			
			valor=a+b;
			System.out.println("Resultado de A+B :"+valor);
			
			break;
			
		case 2:
			
			System.out.println("Escolha valor  de A: ");
			a=input.nextInt();
			System.out.println("Escolha valor  de B: ");
			b=input.nextInt();
			
			valor=a-b;
			System.out.println("Resultado de A-B :"+valor);
			
			break;
			
		case 3:
			
			System.out.println("Escolha valor  de A: ");
			a=input.nextInt();
			System.out.println("Escolha valor  de B: ");
			b=input.nextInt();
			
			valor=a*b;
			System.out.println("Resultado de A*B :"+valor);
	
			break;
			
		case 4:
			
			System.out.println("Escolha valor  de A: ");
			a=input.nextInt();
			System.out.println("Escolha valor  de B: ");
			b=input.nextInt();
			
			valor=a/b;
			System.out.println("Resultado de A/B :"+valor);
			
			break;
			
			default:
				System.out.println("Opção  inexistente :( ");
			
	}
input.close();
}
}
