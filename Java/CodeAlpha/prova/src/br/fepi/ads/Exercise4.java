package br.fepi.ads;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);

int a,b,c,d,e;

System.out.println("Valor de A: ");  
a=input.nextInt();
System.out.println("Valor de B: ");  
b=input.nextInt();
System.out.println("Valor de C: ");  
c=input.nextInt();
System.out.println("Valor de D: ");  
d=input.nextInt();
System.out.println("Valor de E: ");  
e=input.nextInt();

if (a>b && a>c && a>d && a>e) {
	System.out.println("Maior valor é A: " +a);
	//////////////////////////////////////////
}else if (b>c && b>d && b>e) {
	System.out.println("Maior valor é B: "+b);
	//////////////////////////////////////////
}else if (c>d && c>e) {
	System.out.println("Maior valor é C: "+c);
	//////////////////////////////////////////
}else if(d>e) {
	System.out.println("Maior valor é D: "+d);
	/////////////////////////////////////////
}else {
	System.out.println("Maior valor é E:" +e);
	/////////////////////////////////////////
}
		
input.close();
	}

}
