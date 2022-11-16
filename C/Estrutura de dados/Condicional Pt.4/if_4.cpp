#include<stdio.h>
#include<locale.h>
int main (){
	setlocale(LC_ALL, "Portuguese");
	float num1,num2,media;
	printf("digite a nota do 1º e 2º bimestre, respectivamente: ");
	scanf("%f %f",&num1,&num2);
	media = ((num1 * 2) + (num2 * 3))/5;
	printf("resultado: %f \n", media);
	
	if(media >= 70) {
		printf("Você foi aprovado");
	}
	else if (media >= 50){
		printf("você está de recuperação");
	}
	else {
		printf("você está reprovado");
	}
	return 0;	
}
