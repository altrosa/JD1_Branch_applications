package by.htp.les02.luchko;

import java.util.Scanner;

public class Task10 {

	/*
	 * Составить программу, которая определит площадь какого круга меньше.
	 */

	public static void main(String[] args) {

		double s1, s2;

		s1 = enterFromConsole("Enter S1: ");
		s2 = enterFromConsole("Enter S2: ");

		if (s1 > s2) {
			System.out.println("Площадь круга S2 меньше");
		} else {
			System.out.println("Площадь круга S1 меньше");
		}
	}

	public static double enterFromConsole(String message) {

		double value;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print(message);
		while (!sc.hasNextDouble()) {
			System.out.print(message);
		}
		value = sc.nextDouble();

		return value;
	}
}
