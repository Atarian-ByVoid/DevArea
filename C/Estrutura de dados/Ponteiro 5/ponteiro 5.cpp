#include <stdio.h>
#include<stdlib.h>
// 2- trocar duas variaveis inteiras e duas reais. 
void troca (int *a, int *b) {
     int aux;
    
     aux = *a;  
     *a  = *b;  
     *b  = aux; 
 }
     
void troca2 (float *c,float *d) {

 	 float aux2;
     aux2 = *c;
     *c = *d;
     *d = aux2;        
}

int main() {
    int a = 90;
    int b = 70;
    float c = 2.5;
    float d = 4.5;
   
    troca(&a, &b);
    troca2(&c, &d);
    
    printf ("troca a %d \n",a);
    printf ("troca b %d \n",b);
    printf ("troca c %f \n",c);
    printf ("troca d %f \n",d);
    
    return 0;
}
