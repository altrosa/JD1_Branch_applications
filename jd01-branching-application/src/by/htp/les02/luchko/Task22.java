package by.htp.les02.luchko;

import java.util.Scanner;

public class Task22 {

	/*
	 * Перераспределить значения переменных х и у так, чтобы в х оказалось большее
	 * из этих значений, а в y - меньшее.
	 */

	public static void main(String[] args) {

		double x, y;

		x = enterFromConsole("Enter x ");
		y = enterFromConsole("Enter y ");

		answer(x, y);

	}

	public static void answer(double x, double y) {

		if (y > x) {
			x = x + y;
			y = x - y;
			x = x - y;

			System.out.println("x = " + x + ", y = " + y);

		} else {

			System.out.println("x = " + x + ", y = " + y);
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
