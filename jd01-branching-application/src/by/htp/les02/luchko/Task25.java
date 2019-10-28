package by.htp.les02.luchko;

import java.util.Scanner;

public class Task25 {
	
	/*
	 * Написать программу — модель анализа пожарного датчика в помещении, которая
	 * выводит сообщение «Пожароопасная ситуация », если температура в комнате
	 * превысила 60° С.
	 */

	public static void main(String[] args) {
		
		double t;
		
		t = Enter("Введите температуру: ");

		danger (t);
		
	}
	public static void danger (double c) {
		
		if (c > 60) {
			System.out.println("Пожароопасная ситуация!");
			} else {
				System.out.println("Температура в норме");
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

