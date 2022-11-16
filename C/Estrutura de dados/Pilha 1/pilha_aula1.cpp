#include<stdio.h>
int calcula_dobro(int n){
	return n*2;
}
int calcula_triplo(int n){
	return n*3;
}
void imprime_dados(int f) {
	int x,y;
	x = calcula_dobro(f);
	y = calcula_triplo(f);

	printf("dobro: %d \n",x);
	printf("triplo: %d \n",y);
}
int main(){
	imprime_dados(10);
	
	return 0;
}
