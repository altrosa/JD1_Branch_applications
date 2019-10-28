package by.htp.les02.luchko;

import java.util.Scanner;

public class Task12 {

	/*
	 * Даны три действительных числа. Возвести в квадрат те из них, значения которых
	 * неотрицательны, и в четвертую степень — отрицательные.
	 * 
	 */

	public static void main(String[] args) {

		double a, b, c;

		a = enterFromConsole("Enter a: ");
		b = enterFromConsole("Enter b: ");
		c = enterFromConsole("Enter c: ");

		if (a > 0) {
			a = Math.pow(a, 2);
			System.out.println(a);
		}
		if (b > 0) {
			b = Math.pow(b, 2);
			System.out.println(b);
		}
		if (c > 0) {
			c = Math.pow(c, 2);
			System.out.println(c);

		}
		if (a < 0) {
			a = Math.pow(a, 4);
			System.out.println(a);
		}
		if (b < 0) {
			b = Math.pow(b, 4);
			System.out.println(b);
		}
		if (c < 0) {
			c = Math.pow(c, 4);
			System.out.println(c);
		}

	}

	public static double enterFromConsole(String message) {

		double value;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print(message);
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.print(message);
		}
		value = sc.nextDouble();

		return value;
	}
}
