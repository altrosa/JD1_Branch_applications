package by.htp.les02.luchko;

import java.util.Scanner;

public class Task13 {

	/*
	 * Даны две точки А(х1, у1) и В(х2, у2). Составить алгоритм, определяющий,
	 * которая из точек находится ближе к началу координат.
	 */

	public static void main(String[] args) {

		double x1, x2, y1, y2;

		x1 = enterFromConsole("Enter x1 (A): ");
		y1 = enterFromConsole("Enter y1 (A): ");
		x2 = enterFromConsole("Enter x2 (B): ");
		y2 = enterFromConsole("Enter y2 (B): ");

		if (x1 < 0) {
			x1 = x1 / (-1);
		}
		if (y1 < 0) {
			y1 = y1 / (-1);
		}
		if (x2 < 0) {
			x2 = x2 / (-1);
		}
		if (y2 < 0) {
			y2 = y2 / (-1);
		}

		double a = x1 + y1;
		double b = x2 + y2;

		if (a > b) {
			System.out.println("Точка B ближе");
		}
		if (b > a) {
			System.out.println("Точка A ближе");
		} else {
			System.out.println("На равном расстоянии");
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
