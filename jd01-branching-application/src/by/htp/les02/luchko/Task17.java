package by.htp.les02.luchko;

import java.util.Scanner;

public class Task17 {

	/*
	 * Даны целые числа m, n. Если числа не равны, то заменить каждое из них одним и
	 * тем же числом, равным большему из исходных, а если равны, то заменить числа
	 * нулями.
	 * 
	 */

	public static void main(String[] args) {

		int m, n;

		m = enterFromConsole("Enter m ");
		n = enterFromConsole("Enter n ");

		if (m != n) {
			if (m > n) {
				n = m;
				System.out.println(m + " " + n);
			}
			if (m < n) {
				m = n;
				System.out.println(m + " " + n);

			}

		} else {
			m = 0;
			n = 0;
			System.out.println(m + " " + n);
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
