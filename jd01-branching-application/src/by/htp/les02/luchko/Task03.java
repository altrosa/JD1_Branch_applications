package by.htp.les02.luchko;

import java.util.Scanner;

public class Task03 {

	/*
	 * Составить программу сравнения введенного числа а и цифры 3. Вывести на экран
	 * слово «yes», если число а меньше 3; если больше, то вывести слово «no».
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите число: ");

		int b = 3;
		int a;
		a = sc.nextInt();

		if (a < b) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}
