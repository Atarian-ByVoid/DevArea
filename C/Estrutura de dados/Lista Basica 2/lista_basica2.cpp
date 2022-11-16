#include<stdio.h>
#include <stdlib.h>

struct no { //nesse no colocamos todos os elementos nescessario
	int valor; struct no *proximo; // ponteiro chamado de proximo aponta para outro valor alocadoem algum 
	//lugar da memoria (neste caso, o ponteiro apontara para um proximo nó
	};

int main(){
	struct no *primeiroNo =(struct no*)malloc(sizeof(struct no)); //ajuda a acessar algum nó criado (primeiro ponteiro criado) -
	struct no *segundoNo =(struct no*)malloc(sizeof(struct no));
	struct no *terceiroNo =(struct no*)malloc(sizeof(struct no));	
	// malloc é a realocação de memoria (O proprio programa não consegue fazer isso) sinzeof verifica o tamanho de memoria do no.
	//struct no*  chamando o no no tamanho da sizeof
	primeiroNo->valor = 3; //primeiroNo acessa valor 3
	segundoNo->valor = 80;
	terceiroNo ->valor = 50;
	
	primeiroNo ->proximo = segundoNo;
	segundoNo ->proximo = terceiroNo;
	
	printf("%d\n", primeiroNo->valor);
	printf("%d\n", primeiroNo->proximo->valor);
	printf("%d\n", segundoNo->proximo->valor);
	
	
	system("pause");
	
	
	
	return 0;
	
}

