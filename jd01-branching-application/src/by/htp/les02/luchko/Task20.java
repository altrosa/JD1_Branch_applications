package by.htp.les02.luchko;

import java.util.Scanner;

public class Task20 {

	// ќпределить, делителем каких чисел а, b, с €вл€етс€ число k

	public static void main(String[] args) {
		double a, b, c, k;

		a = enterFromConsole("Enter a ");
		b = enterFromConsole("Enter b ");
		c = enterFromConsole("Enter c ");
		k = enterFromConsole("Enter k ");

		if ((a % k) == 0) {
			System.out.println("k €вл€етс€ делителем a");
		} else if ((b % k) == 0) {
			System.out.println("k €вл€етс€ делителем b");
		} else if ((c % k) == 0) {
			System.out.println("k €вл€етс€ делителем c");
		} else {
			System.out.println("„исло k не €вл€етс€ делителем введенных чисел");
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
