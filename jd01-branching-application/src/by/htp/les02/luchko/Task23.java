package by.htp.les02.luchko;

import java.util.Scanner;

public class Task23 {
	/*
	 * ќпределить правильность даты, введенной с клавиатуры (число Ч от 1 до 31,
	 * мес€ц Ч от 1 до 12). ≈сли введены некорректные данные, то сообщить об этом.
	 */

	public static void main(String[] args) {

		int a, b;

		a = enterFromConsole("Enter Date (1 - 31): ");
		b = enterFromConsole("Enter Month (1 - 12): ");

		answer(a, b);

	}

	public static void answer(int a, int b) {

		if ((a <= 31) & (a > 0)) {
			System.out.println("Date correct");
		} else {
			System.out.println("Date incorrect");
		}

		if ((b <= 12) & (b > 0)) {
			System.out.println("Month correct");
		} else {
			System.out.println("Month incorrect");
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
