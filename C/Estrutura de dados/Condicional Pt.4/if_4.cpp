#include<stdio.h>
#include<locale.h>
int main (){
	setlocale(LC_ALL, "Portuguese");
	float num1,num2,media;
	printf("digite a nota do 1� e 2� bimestre, respectivamente: ");
	scanf("%f %f",&num1,&num2);
	media = ((num1 * 2) + (num2 * 3))/5;
	printf("resultado: %f \n", media);
	
	if(media >= 70) {
		printf("Voc� foi aprovado");
	}
	else if (media >= 50){
		printf("voc� est� de recupera��o");
	}
	else {
		printf("voc� est� reprovado");
	}
	return 0;	
}
