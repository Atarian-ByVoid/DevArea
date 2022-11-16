// faça um programa que leia o salario de um funcionario de calcule 15% de aumento.
#include<stdlib.h>
#include<stdio.h>

int main(){
	float salario,aum;
	printf("digite seu salario: ");
	scanf("%f",&salario);
	aum = (salario * 0.15) + salario;

	printf("resultado %.2f",aum);
	
	return 0;
	system("pause");
	
	
}
