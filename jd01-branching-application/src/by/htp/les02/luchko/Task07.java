package by.htp.les02.luchko;

import java.util.Scanner;

/*
 * Составить программу нахождения модуля выражения a*x*x + b*x + c при заданных
 * значениях a, b, c и х
 */

public class Task07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите число a: ");
		int a = sc.nextInt();
		System.out.print("Введите число b: ");
		int b = sc.nextInt();
		System.out.print("Введите число c: ");
		int c = sc.nextInt();
		System.out.print("Введите число x: ");
		int x = sc.nextInt();

		int r = (int) (a * x * x + b * x + c);

		if (r < 0) {
			r = r * (-1);
			System.out.println(r);
		}

	}

}
