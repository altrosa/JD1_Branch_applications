package by.htp.les02.luchko;

import java.util.Scanner;

public class Task16 {

	/*
	 * �� ��������� ��Y ������ ������ ������������ ����� �. �������, ��� ���
	 * ����������� (�� ����� ��� ��� � ����� ������������ ����).
	 */

	public static void main(String[] args) {

		double x, y;

		x = enterFromConsole("Enter x ");
		y = enterFromConsole("Enter y ");

		if ((x == 0) & (y == 0)) {
			System.out.println("� ������ ���������");
		} else if ((x == 0) & (y != 0)) {
			System.out.println("�� ��� Y");
		} else if ((x != 0) & (y == 0)) {
			System.out.println("�� ��� X");
		} else if ((x > 0) & (y > 0)) {
			System.out.println("I ��������");
		} else if ((x < 0) & (y > 0)) {
			System.out.println("II ��������");
		} else if ((x < 0) & (y < 0)) {
			System.out.println("III ��������");
		} else
			System.out.println("IV ��������");

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
