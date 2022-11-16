#include<stdio.h>
#include<conio.h>
int main(void)
{
  int i;
  float notas[5] = {7, 8, 9.5, 9.9, 5.2},media;
  
  // declarando e inicializando o vetor notas 8 pontos para ser aprovado 
  // se não o aluno será reprovado 
  
  printf("Exibindo os Valores do Vetor \n\n");
  
  for( i = 0 ; i <= 4; i++)
  {
    printf("notas[%d] = %.1f\n",i, notas[i]);
    
  }
  media = (notas[0]+notas[1]+notas[2]+notas[3]+notas[4])/ 5;
  if (media >=8){
  	printf("Aprovado");
  	
  	}
  else{
 
  printf("reprovado");
	}
  getch();
  return 0;
}
