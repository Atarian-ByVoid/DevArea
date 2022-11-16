#include<stdio.h>
#include<stdlib.h>

int main(){
	// primeiro passo definir as variaveis e constantes
	int num1, num2, num3=7,soma;
	
	printf("digite um valor inteiro \n");
	scanf("%d",&num1);
	printf("digite outro valor inteiro \n");
	scanf("%d",&num2);
	soma = num1+num2+num3;
	printf("O resultado da soma: %d",soma);

	return 0;
	system("pause");
}
