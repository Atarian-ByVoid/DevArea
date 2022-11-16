#include <stdio.h>
#include <stdlib.h>



int calcula_dobro(int n){
return n * 2;
}



int calcula_triplo(int n){
return n * 3;
}



void imprimeDados(){

int x;
int y;

// Solicita para o usuário informar os valores
printf("Digite o primeiro valor: ");
scanf("%d",&x);
printf("Digite o segundo valor: ");
scanf("%d",&y);
system("cls");

// Apenas mostra para o usuário quais os valores ele digitou
printf("Numero informado antes de dobrar: %d \n", x);
printf("Numero informado antes de triplicar: %d \n", y);
printf("\n");

// Chama a função e passa pra ela os valores informados e 
//depois o resultado sobreescreve a variavel X e Y
x = calcula_dobro(x);
y = calcula_triplo(y);

// Informa o resultado final ao usuário
printf("Numero dobrado: %d \n", x);
printf("Numero triplicado: %d \n", y);
printf("\n");
}

int main(){
imprimeDados();
return 0;
}
