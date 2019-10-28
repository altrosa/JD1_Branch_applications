package by.htp.les02.luchko;

import java.util.Scanner;

public class Task09 {

	/*
	 * Составить программу, которая определит по трем введенным сторонам, является
	 * ли данный треугольник равносторонним.
	 * 
	 */

	public static void main(String[] args) {

		double a, b, c;

		a = enterFromConsole("Enter a: ");
		b = enterFromConsole("Enter b: ");
		c = enterFromConsole("Enter c: ");

		if (a == b & b == c) {
			System.out.println("Треугольник равносторонний");
		} else {
			System.out.println("Треугольник не равносторонний");
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
