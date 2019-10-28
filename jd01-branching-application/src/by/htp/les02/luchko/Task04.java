package by.htp.les02.luchko;

import java.util.Scanner;

public class Task04 {

	// —оставить программу: равны ли два числа а и b?

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		int a;
		System.out.print("¬ведите число aэ: ");
		a = sc.nextInt();

		int b;
		System.out.print("¬ведите число b: ");
		b = sc.nextInt();

		if (a == b) {
			System.out.println("„исла равны");
		} else {
			System.out.println("„исла не равны");
		}

	}

}
