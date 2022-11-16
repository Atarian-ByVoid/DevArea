
#include<stdio.h>
#include<conio.h>
int main (){
	int a=50;
	int *ptr, **ptrp;
	
	ptrp = &ptr;
	ptr = &a;
	
	
	printf("utilizando ponteiros\n");
	
	printf("conteudo da variavel de a, %d\n",a);
	printf("conteudo da variavel de a  %x,  \n ",&a);
	printf("conteudo da variavel de ponteiro %x, %x ", ptr, ptrp);
	
	getch();
	return 0;
}
