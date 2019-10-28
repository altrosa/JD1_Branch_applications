package by.htp.les02.luchko;

import java.util.Scanner;

public class Task14 {

	/*
	 * ���� ��� ���� ������������ (� ��������). ����������, ���������� �� �����
	 * �����������, � ���� ��, �� ����� �� �� �������������.
	 */

	public static void main(String[] args) {

		int a, b;

		a = enterFromConsole("������� ������ ����: ");
		b = enterFromConsole("������� ������ ����: ");

		if ((a + b) < 180) {
			System.out.println("��� �����������");
			System.out.println("���� ����������� �� �������������");
		} else {
			System.out.println("��� �� �����������");
		}

		if ((a + b) == 90) {
			System.out.println("���� ����������� �������������");
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
