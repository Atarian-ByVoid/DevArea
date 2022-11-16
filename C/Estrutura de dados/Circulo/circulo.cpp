#include<stdio.h>

#include<stdio.h>

float calcula_raio(float n){
	
	return n * 3.14 ;
	
}
int calcula_triplo(int n){
	return n*3;
}

float digite(){
	int f;
	printf("digite um valor");
	scanf("%f",&f);
	return f;
}
void imprime_dados(float f) {
	int x,y;
	x = calcula_raio(f);
	y = calcula_triplo(f);

	printf("dobro: %d \n",x);
	printf("triplo: %d \n",y);
}
int main(){
	imprime_dados(digite());
	
	return 0;
}
