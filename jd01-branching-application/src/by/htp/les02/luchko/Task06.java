package by.htp.les02.luchko;

import java.util.Scanner;

public class Task06 {

	// ��������� ���������: ����������� ����������� �� ���� ����� � � b.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("������� ����� a: ");
		int a = sc.nextInt();

		System.out.print("������� ����� b: ");
		int b = sc.nextInt();

		if (a > b) {
			System.out.println("������� �����: " + a);
		} else {
			if (a < b) {
				System.out.println("������� �����: " + b);
			} else {
				System.out.println("����� �����");
			}

		}

	}
}