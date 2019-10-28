package by.htp.les02.luchko;

import java.util.Scanner;

public class Task18 {

	// Подсчитать количество отрицательных среди чисел а, b, с.

	public static void main(String[] args) {
		int a, b, c;
		int d = 0;

		a = enterFromConsole("Enter a ");
		b = enterFromConsole("Enter b ");
		c = enterFromConsole("Enter c ");

		if (a < 0) {
			d++;
		}
		if (b < 0) {
			d++;
		}
		if (c < 0) {
			d++;
		}

		if ((a > 0) & (b > 0) & (c > 0)) {
			System.out.println("Отрицательных чисел нет");
		} else {

			System.out.println("Отрицательных чисел: " + d);
		}

	}

	public static int enterFromConsole(String message) {

		int value;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print(message);
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.print(message);
		}
		value = sc.nextInt();
		return value;
	}
}
