#include<stdio.h>
#include<conio.h>
int main(void)
{
  int i;
  float notas[5],media,nota[5];
  
  // declarando e inicializando o vetor notas 8 pontos para ser aprovado 
  // se não o aluno será reprovado 
  
  printf("Exibindo os Valores do Vetor \n\n");
  
  for( i = 0 ; i <= 4; i++)
  {
    printf("notas[%d] = %.1f\n");
    scanf("%f",&notas[i]);
    
  }
 
  getch();
  return 0;
}
