//3. Criar um programa que o usuário entre 2 valores e calcule e mostre a média
#include<stdlib.h>
#include<stdio.h>
int main(){
	float nota1,nota2,media;
	printf("digite a primeira nota: ");
	scanf("%f",&nota1);
	printf("digite a segunda nota: ");
	scanf("%f",&nota2);
	media = (nota1+nota2)/2;

	printf("sua media foi %.2f", media);
	
	return 0;
	system("pause");	
	
}
