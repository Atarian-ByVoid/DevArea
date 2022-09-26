package hi;

public class JavaCurso {

	public static void main(String[] args) {
		String Planet;
		Planet = "Icarus";
		double Temperature = 238.23;
		System.out.println("Planet:" + Planet);
		System.out.println("Temperature:" + Temperature);

		String Nome;
		String descrição;
		Nome = "Seth";
		descrição = "Depois da queda de Centaurion,o protector,Seth cai em um planeta até então desconheçido";

		char sexo = 'M';
		boolean sistemas = true;
		int idade = 51;
		System.out.println("idade:" + idade);
		System.out.println("Nome:" + Nome);
		System.out.println("descrição:" + descrição);
		System.out.println("sistemas:" + sistemas);
		System.out.print("sexo:" + sexo);

		System.out.println("____________________________________________________");
		System.out.println("");

		double i = 10;
		System.out.println("operadores");
		System.out.println(" exemplos:");
		System.out.println("i =" + i);
		System.out.println("i =" + i + " + 5 |i = " + (i + 5));
		System.out.println("i =" + i + " - 5 |i = " + (i - 5));
		System.out.println("i =" + i + " * 5 |i = " + (i * 5));
		System.out.println("i =" + i + " / 5 |i = " + (i / 5));
		System.out.println("i =" + i + " % 5 |i = " + (i % 5));
		System.out.println("i += 5   | i = " + (i += 5));
		System.out.println("i -= 5   | i = " + (i -= 5));
		System.out.println("i *= 5   | i = " + (i *= 5));
		System.out.println("i /= 5   | i = " + (i /= 5));
		i++;
		System.out.println("i ++     | i  = " + i);
		i--;
		System.out.println("i --     | i  = " + i);

		System.out.println("____________________________________________________");
		System.out.println("");

		System.out.println("Estruturas de controles");
		System.out.println("");
		System.out.println("Estruturas de controle condicional");
		System.out.println("");
		System.out.println("Exemplo 1 - Uso do 'if' ");
		if (sexo == 'M') {
			System.out.println("Alistamento militar obrigatorio");
		}
		 System.out.println("");
		 System.out.println("exemplo 2 - uso do 'if - else '");
		 if (idade < 18) {
		 System.out.println("Menor de idade");
	} else {
		System.out.println("Maior de idade");
	}
		 System.out.println("");
		 System.out.println("Exemplo 3 - Uso do 'else -if'");
	if (idade < 16) { 
		System.out.println("PROBIDO VOTAR");
	}else if (idade >= 18 && idade <= 70) {
		System.out.println("VOTO OBRÍGATORIO");
	}else if (idade ==16 || idade == 17 || idade >70) {
		System.out.println("VOTO FACULTATIVO");
	}
		System.out.println("");
		 System.out.println("Exemplo 4 - 'Uso do switch case'");
		 System.out.println("1. Cadastro de clientes");
		 System.out.println("2. Cadastro de usuarios");
		 System.out.println("3. Relatorios");
		 int opcao = 1;
		 switch (opcao) {
		 case 1:
		 System.out.println("CLIENTES");
		 break;
		 case 2:
		 System.out.println("USUARIOS");
		 break;
		 case 3:
		 System.out.println("Relatórios");
		 break;
		 default:
			 System.out.println("Opção invalida");
			 break;
			 
			 }
			 System.out.println("");
			 System.out.println("Estruturas de repetiçoes");
			 System.out.println("");
			 System.out.println("Exemplo 5 - uso do 'for'");
		for (int j = 10; j > 0; j--) {
			System.out.println("Hello Hell");
				 
			 }
		System.out.println("");
		System.out.println("Exemplo 6 - tabuada");
		for (int tabuada = 0; tabuada <= 10; tabuada++) {
			System.out.println("");
			for (int valor = 0; valor <= 10; valor++) {
				System.out.println(tabuada + " x "+ valor + " = " +(tabuada * valor));
			}
		}
				System.out.println("Exemplo 7 - uso da estrutura while");
				int contador= 1;
				while (contador <= 10 ) {
					System.out.println(contador); 
					contador++;
					
				}
				System.out.println("");
				System.out.println("Exemplo 9 - Uso da extrutura do 'while'");
			char novoJogo;
			do {
			System.out.println("Deseja jogar novamente(s/n");
			novoJogo = 'n';
			}while (novoJogo == 's');
			System.out.println("GAME OVER");
			
			}
		}		


