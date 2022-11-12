#include <stdio.h>
#include <conio.h>
#include <stdlib.h>


int main()
{

    float notas,total,media;
    char nomeAluno[50]="string";
    char cod;

    total=0;
    cod='c';
    while(cod!='F')
    {

        for(int i=0; i<4 ; i++)
        {

            printf("Notas[%d]=",i);
            scanf("%f",&notas);
            total=total+notas;
        }
  printf("Digite o nome do aluno: ");
        scanf("%s",nomeAluno);
        media=total/4;
        if(media<20)

        {
            printf("Reprovado! ");
        }else
        printf("Aprovado! ");


printf("Nome do aluno: %s ",nomeAluno);
        printf("Media do aluno:%.2f\n  ",media);
        total=0;
        notas=0;
        printf("Para continuar tecle qualquer tecla, para sair tecle F\n");
        cod=getche();


    }
    return 0;
}

