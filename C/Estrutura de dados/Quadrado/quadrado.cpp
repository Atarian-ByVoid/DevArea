/*2. Criar um programa que o usu�rio entre valor do lado do quadrado e calcular o per�metro 
e mostre o resultado. (p= 4 . L).*/

#include<stdlib.h>
#include<stdio.h>
int main(){
	float q,l;
	printf("digite o valor do lado do quadrado: ");
	scanf("%f",&l);
	q =  l * 4;

	printf("resultado %.2f",q);
	
	return 0;
	system("pause");
	
	
}
