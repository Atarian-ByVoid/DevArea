#include<stdio.h>
#include<locale.h>
int main (){
	setlocale(LC_ALL, "Portuguese");
	int idade;
	
	printf("digite sua idade");
	scanf("%d",&idade);
	if(idade >=18){
		printf("voc� � maior de idade");
	}
	else{
		printf("voc� � menor de idade");
	}
	return 0;
}
