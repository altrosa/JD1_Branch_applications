package by.htp.les02.luchko;

import java.util.Scanner;

public class Task15 {

	/*
	 * Даны действительные числа х и у, не равные друг другу. Меньшее из этих двух
	 * чисел заменить половиной их суммы, а большее — их удвоенным произведением.
	 */

	public static void main(String[] args) {

		double a, b;

		a = enterFromConsole("Enter a ");
		b = enterFromConsole("Enter b ");

		if (a < b) {
			a = (a + b) / 2;
			b = (a * b) * 2;
			System.out.println("a = " + a + ", b =  " + (int) b);
		}
		if (a > b) {
			b = (a + b) / 2;
			a = (a * b) * 2;
			System.out.println("a = " + (int) a + ", b =  " + b);

		} else if (a == b) {
			System.out.println("Числа равны");
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
