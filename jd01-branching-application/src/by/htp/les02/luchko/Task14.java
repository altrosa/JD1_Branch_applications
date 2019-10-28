package by.htp.les02.luchko;

import java.util.Scanner;

public class Task14 {

	/*
	 * Даны два угла треугольника (в градусах). Определить, существует ли такой
	 * треугольник, и если да, то будет ли он прямоугольным.
	 */

	public static void main(String[] args) {

		int a, b;

		a = enterFromConsole("Введите первый угол: ");
		b = enterFromConsole("Введите второй угол: ");

		if ((a + b) < 180) {
			System.out.println("Это треугольник");
			System.out.println("Этот треугольник не прямоугольный");
		} else {
			System.out.println("Это не треугольник");
		}

		if ((a + b) == 90) {
			System.out.println("Этот треугольник прямоугольный");
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
