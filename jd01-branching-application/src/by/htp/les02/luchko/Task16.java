package by.htp.les02.luchko;

import java.util.Scanner;

public class Task16 {

	/*
	 * На плоскости ХОY задана своими координатами точка А. Указать, где она
	 * расположена (на какой оси или в каком координатном угле).
	 */

	public static void main(String[] args) {

		double x, y;

		x = enterFromConsole("Enter x ");
		y = enterFromConsole("Enter y ");

		if ((x == 0) & (y == 0)) {
			System.out.println("В начале координат");
		} else if ((x == 0) & (y != 0)) {
			System.out.println("На оси Y");
		} else if ((x != 0) & (y == 0)) {
			System.out.println("На оси X");
		} else if ((x > 0) & (y > 0)) {
			System.out.println("I четверть");
		} else if ((x < 0) & (y > 0)) {
			System.out.println("II четверть");
		} else if ((x < 0) & (y < 0)) {
			System.out.println("III четверть");
		} else
			System.out.println("IV четверть");

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
