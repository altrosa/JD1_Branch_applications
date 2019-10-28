package by.htp.les02.luchko;

import java.util.Scanner;

public class Task08 {

	// Составить программу нахождения наименьшего из квадратов двух чисел а и b.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("Введите число a: ");
		int a = sc.nextInt();
		System.out.println("Квадрат числа a: " + Math.pow(a, 2));

		System.out.print("Введите число b: ");
		int b = sc.nextInt();
		System.out.println("Квадрат числа b: " + Math.pow(b, 2));

		if (a > b) {
			System.out.println("Наименьший квадрат: " + Math.pow(b, 2));
		} else {
			if (a < b) {
				System.out.println("Наименьший квадрат: " + Math.pow(a, 2));
			} else {
				System.out.println("Числа равны");
			}

		}

	}

}
