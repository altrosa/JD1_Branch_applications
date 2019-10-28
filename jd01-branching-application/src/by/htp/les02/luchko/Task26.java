package by.htp.les02.luchko;

import java.util.Scanner;

public class Task26 {

	/*
	 * �������� ��������� ���������� ����� �������� � �������� �� ���� �����.
	 */

	public static void main(String[] args) {
		int a, b, c;

		a = enterFromConsole("������� a: ");
		b = enterFromConsole("������� b: ");
		c = enterFromConsole("������� c: ");


		summ(a, b, c);

	}

	public static void summ(int a, int b, int c) {
		
		int min;
		int max;

		if (a >= b) {
			if (b >= c) {
				max = a;
				min = c;
			} else {
				if (a >= c) {
					max = a;
				} else {
					max = c;
				}
				min = b;
			}
		} else {
			if (b >= c) {
				if (a >= c) {
					min = c;
				} else {
					min = a;
				}
				max = b;
			} else {
				max = c;
				min = a;
			}
		}
		
		int sum;
		sum = min + max;
		System.out.println("����� �����: " + sum);
	}

	public static int enterFromConsole(String message) {

		int value;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print(message);
		while (!sc.hasNextInt()) {
			sc.hasNext();
			System.out.println(message);
		}
		value = sc.nextInt();
		return value;
	}
}