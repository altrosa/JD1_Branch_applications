package by.htp.les02.luchko;

import java.util.Scanner;

public class Task21 {

	/*
	 * ��������� � ������. �� ������ ������������� ������ ���� ��: ������� ���
	 * �������? ����� � ��� ̻. � ����������� �� ������ �� ������ ������ ���������
	 * ����� ���� �������� �������!� ��� ���� �������� ��������!�
	 */

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("��� ��? ");
		char a = sc.next().charAt(0);
		
		if ((a == '�')|(a == '�')) {
			System.out.println("��� �������� �������");
		} else if ((a == '�')|(a == '�')) {
			System.out.println("��� �������� ��������");
		} else {
			System.out.println("��� �� �����?!");
		}
		
				
	}
}
