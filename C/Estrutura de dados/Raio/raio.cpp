//1.Criar um programa que o usu�rio 
//entre com raio de uma circunfer�ncia e calcule a �rea e mostre o resultado. (a =PI . r2).

#include<stdlib.h>
#include<stdio.h>
int main(){
	float pi=3.14,raio,a;
	printf("digite a circunferencia do raio: ");
	scanf("%f",&raio);
	a =  (pi * (raio*raio));

	printf("resultado %.2f",a);
	
	return 0;
	system("pause");
	
	
}
