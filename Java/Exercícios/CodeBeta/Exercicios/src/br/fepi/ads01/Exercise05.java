package br.fepi.ads01;

import java.util.Scanner;

public class Exercise05 {

	public static void main(String[] args) {
Scanner input = new Scanner (System.in);

String nome;
int idade;
char sexo;

System.out.println("Nome: ");
nome = input.nextLine();
System.out.println("Idade: ");
idade = input.nextInt();
System.out.println("Sexo: ");
sexo = input.next().charAt(0);

if ((sexo == 'M') && (idade >= 18))
System.out.println(nome+"Faça o alistamento: ");
else
	System.out.println(nome+" dispensado");
input.close();


	}

}
