package by.htp.les02.luchko;

import java.util.Scanner;

public class Task04 {

	// ��������� ���������: ����� �� ��� ����� � � b?

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		int a;
		System.out.print("������� ����� a�: ");
		a = sc.nextInt();

		int b;
		System.out.print("������� ����� b: ");
		b = sc.nextInt();

		if (a == b) {
			System.out.println("����� �����");
		} else {
			System.out.println("����� �� �����");
		}

	}

}
