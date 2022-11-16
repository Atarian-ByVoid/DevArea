#include<stdio.h>
#include<stdlib.h>
#include<time.h>
#include<string.h>

#define TAM_NOME 50
#define NUM_ALUNOS 13

typedef enum{false, true} bool;

void inicializaMatrizDesordenada(char ordenado[][TAM_NOME], char desordenado[NUM_ALUNOS][TAM_NOME]);
void imprimeMatriz(char matriz[][TAM_NOME]);

int main(){

    char ordenado[][TAM_NOME]={
             "ANDRE LUIZ DE OLIVEIRA DALEFFI",
            "BRUNO HENRIQUE XAVIER",
            "CAIQUE CLEBER DIAS DE REZENDE",
            "FELIPE SILVA DE PAULA",
            "FELIPE TOSHIO HIKITA DA SILVA",
            "GABRIEL MARCOS CARDOSO AMORIM",
            "MATHEUS ALVARENGA DE CASTRO",
            "MAURICIO JORNADA BASTOS",
            "MAX WILLIAN MARCELINO DA SILVA",
            "REUDER MARCOS MOURA SANTANA",
            "ROMEU JOAQUIM GARCIA",
            "UDO DE LIMA ANDRADE",
            "VINICIUS BARROS MOURA"
    };
    char desordenado[NUM_ALUNOS][TAM_NOME];

    inicializaMatrizDesordenada(ordenado, desordenado);

    printf(">>> ORDENADO\n");
    imprimeMatriz(ordenado);

    printf("\n>>> DESORDENADO\n");
    imprimeMatriz(desordenado);
    system("pause");
}



void inicializaMatrizDesordenada(char ordenado[][TAM_NOME], char desordenado[][TAM_NOME])
{
    bool removidos[NUM_ALUNOS];
    int i=0, sorteio;

    for(i=0; i < NUM_ALUNOS; i++){
        removidos[i]=false;
    }

    srand(time(NULL));

    for(i=0; i < NUM_ALUNOS; i++){
        sorteio=rand()%NUM_ALUNOS;
        if(removidos[sorteio]==false){
            removidos[sorteio]=true;
            strcpy(desordenado[i], ordenado[sorteio]);
        }else{
            i--;
         }
    }
}// fecha inicializaMatrizDesordenada


void imprimeMatriz(char matriz[][TAM_NOME]){
    int i;
    for(i=0; i < NUM_ALUNOS; i++){
        printf("[%02d] %s\n", i, matriz[i]);
    }
}// fecha imprimeMatriz
