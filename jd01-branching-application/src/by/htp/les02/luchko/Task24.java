package by.htp.les02.luchko;

import java.util.Scanner;

public class Task24 {

	/*
	 * Составить программу, определяющую результат гадания на ромашке — «любит—не
	 * любит», взяв за исходное данное количество лепестков п.
	 */

	public static void main(String[] args) {
		
		int n;
		
		n = enterFromConsole("Сколько лепестков?  ");
		
		lubit(n);
	}
	
	public static void lubit (int n) {
		
		if ((n % 2) == 0) {
				System.out.println("Любит");
			} else {
				System.out.println("Не любит");
			}
		}
 
	public static int enterFromConsole (String message) {

		int value;
		
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
