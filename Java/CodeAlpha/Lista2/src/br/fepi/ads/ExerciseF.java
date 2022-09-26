package br.fepi.ads;

import java.util.Scanner;

public class ExerciseF {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int a, b, c;

		System.out.print("Valor A: ");
		a = input.nextInt();
		System.out.print("Valor B: ");
		b = input.nextInt();
		System.out.print("Valor C: ");
		c = input.nextInt();

		if (a < b) {
			if (b < c) {
				System.out.println(a +"\n"+ b +"\n"+c);

			}

			else if (a < c) {
				System.out.println(a + "\n"+c + "\n"+b);

			}

			else {
				System.out.println(c + "\n"+a +"\n"+ b);
			}
		}

		else if (b < c) {
			if (a < c) {

				System.out.println(b + "\n"+a +"\n"+ c);
			} else {

				System.out.println(b +"\n" +c +"\n" +a);

			}
		} else {

			System.out.println(c +"\n"+b+"\n" + a);

		}
input.close();
		
	}
}
