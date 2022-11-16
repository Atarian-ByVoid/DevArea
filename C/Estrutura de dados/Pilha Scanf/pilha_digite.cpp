//faça uma algoritmo que o usuario digite o valor.
#include<stdio.h>

int calcula_dobro(int n){
	return n*2;	
}
int calcula_triplo(int n){
	return n*3;
}
int digite(){
	int f;
	printf("digite um valor:");
	scanf("%d",&f);
	return f;
}
void imprime_dados(int f) {
	int x,y;
	x = calcula_dobro(f);
	y = calcula_triplo(f);

	printf("dobro: %d \n",x);
	printf("triplo: %d \n",y);
}
int main(){
	int a;
	printf ("digite o valor");
	scanf("%d",&a),
	imprime_dados(a);
	
	return 0;
}
