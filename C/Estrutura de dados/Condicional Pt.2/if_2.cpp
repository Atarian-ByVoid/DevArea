#include<stdio.h>
#include<locale.h>
int main (){
	setlocale(LC_ALL, "Portuguese");
	int num;
	printf("digite um valor inteiro: ");
	scanf("%d",&num);
		if(num % 2 == 0){
			printf("PAR");	
		}
		else {
			printf("ÍMPAR");
		}
return 0;
}
