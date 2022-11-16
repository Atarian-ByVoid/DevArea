#include<stdio.h>
#include<stdlib.h>

int digite(int f){
	printf("digite um valor:");
	scanf("%d",&f);
	return f;
}

void esvaziarVaso(int flores){
	if(flores> 0){
		printf("remova uma flor \n");
		esvaziarVaso(flores-1);		
	}
}
int main(){
    int f;

	esvaziarVaso(digite(f));
	return 0;
}

