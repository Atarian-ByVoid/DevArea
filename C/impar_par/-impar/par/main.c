#include <stdio.h>
#include <stdlib.h>

int main()
{

int num;
printf("Digite um valor: ");
scanf("%d",&num);

while (num>0){

    if(num%2==0){
        printf("Par \n");
    }else{
    printf("Impar \n");
    }
    printf("Digite um valor: ");
    scanf("%d",&num);
}

printf("\n");
    return 0;
}
