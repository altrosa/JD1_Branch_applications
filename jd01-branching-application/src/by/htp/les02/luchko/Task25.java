package by.htp.les02.luchko;

import java.util.Scanner;

public class Task25 {
	
	/*
	 * �������� ��������� � ������ ������� ��������� ������� � ���������, �������
	 * ������� ��������� �������������� �������� �, ���� ����������� � �������
	 * ��������� 60� �.
	 */

	public static void main(String[] args) {
		
		double t;
		
		t = Enter("������� �����������: ");

		danger (t);
		
	}
	public static void danger (double c) {
		
		if (c > 60) {
			System.out.println("������������� ��������!");
			} else {
				System.out.println("����������� � �����");
			}
	}
	

	public static double Enter (String message) {
		
		double value;
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

