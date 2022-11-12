import java.util.Scanner;

public class Welcome1 {

	public static void main(String[] args) {

		System.out.print("Welcome to ");
System.out.println("Java Progamming");
System.out.println("");
System.out.println("Welcome\nto\nJava\nProgamming!");
System.out.println("");
System.out.printf("%s%n%s%n" , "Welcome to" , "Java progamming");
System.out.println("");
System.out.println("");

Scanner input = new Scanner(System.in);
int n1;
int n2;
System.out.print("digite o primeiro valor");
n1 = input.nextInt();
n2 = input.nextInt();

if (n1 == n2)
System.out.printf("%d == %d%n" , n1 , n2);
if (n1 != n2)
System.out.printf("%d != %d%n" ,n1 , n2);
if (n1 < n2)
System.out.printf("%d < %d%n" ,n1 , n2);
if (n1 > n2)
System.out.printf("%d > %d%n" ,n1 , n2);
if (n1 <= n2)
System.out.printf("%d <= %d%n" ,n1 , n2);
if (n1 >= n2)
System.out.printf("%d >= %d%n" ,n1 , n2);
input.close();	}

}
