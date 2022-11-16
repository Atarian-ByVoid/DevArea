#include<stdio.h>
#include<locale.h>
int main (){
	setlocale(LC_ALL, "Portuguese");
	int num;
	printf("digite um valor inteiro: ");
	scanf("%d",&num);
	if(num == 0){
		printf("numero igual a zero");
	}
	else if(num > 0){
		printf("numero positivo");
	}
	else {
		printf("numero negativo");
	}
return 0;
}
