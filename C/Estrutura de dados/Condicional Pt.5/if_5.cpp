#include<stdio.h>
#include<locale.h>
int main (){
	setlocale(LC_ALL, "Portuguese");
	int a=40,b=50,c=60;
	if((a<b)&&(a>c)){
		printf("a variavel A � maior");
	}
	else if((b>a)||(b>c)){
		printf("A variavel B � maior");
	}
	else{
		printf("invalido");
	}
}
