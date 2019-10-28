package by.htp.les02.luchko;

import java.util.Scanner;

public class Task27 {

	// Найти max{min(a, b), min(c, d)}.

	public static void main(String[] args) {

		int a, b, c, d;

		a = enterFromConsole("Enter a: ");
		b = enterFromConsole("Enter b: ");
		c = enterFromConsole("Enter c: ");
		d = enterFromConsole("Enter d: ");

		max(a, b, c, d);
	}

	public static void max(int a, int b, int c, int d) {

		int min1, min2, max;

		if (a < b) {
			min1 = a;
		} else {
			min1 = b;
		}
		if (c < d) {
			min2 = c;
		} else {
			min2 = d;
		}
		if (min1 > min2) {
			max = min1;
		} else
			max = min2;

		System.out.println("max = " + max);

	}

	public static int enterFromConsole(String message) {

		int value;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print(message);
		while (!sc.hasNextInt()) {
			sc.hasNext();
			System.out.println(message);
		}
		value = sc.nextInt();
		return value;
	}
}
