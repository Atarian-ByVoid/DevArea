#include<stdio.h>
#include<conio.h>
int main (){
	int a=50,b=60;
	int *ptr1, *ptr2;
	
	ptr1 = &a;
	ptr2 = &b;
	
	printf("utilizando ponteiros\n");
	
	printf("conteudo da variavel de a e b %d, %d\n",a,b);
	printf("conteudo da variavel de a e b %x, %x \n ",&a,&b);
	printf("conteudo da variavel de ponteiro %x, %x ", ptr1, ptr2);
	
	getch();
	return 0;
}
