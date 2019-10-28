package by.htp.les02.luchko;

import java.util.Scanner;

public class Task06 {

	// Составить программу: определения наибольшего из двух чисел а и b.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("Введите число a: ");
		int a = sc.nextInt();

		System.out.print("Введите число b: ");
		int b = sc.nextInt();

		if (a > b) {
			System.out.println("Большее число: " + a);
		} else {
			if (a < b) {
				System.out.println("Большее число: " + b);
			} else {
				System.out.println("Числа равны");
			}

		}

	}
}