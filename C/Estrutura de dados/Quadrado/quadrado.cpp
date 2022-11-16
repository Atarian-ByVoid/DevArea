/*2. Criar um programa que o usuário entre valor do lado do quadrado e calcular o perímetro 
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
