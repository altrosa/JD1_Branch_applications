package by.htp.les02.luchko;

import java.util.Scanner;

public class Task21 {

	/*
	 * Программа — льстец. На экране высвечивается вопрос «Кто ты: мальчик или
	 * девочка? Введи Д или М». В зависимости от ответа на экране должен появиться
	 * текст «Мне нравятся девочки!» или «Мне нравятся мальчики!»
	 */

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Кто вы? ");
		char a = sc.next().charAt(0);
		
		if ((a == 'д')|(a == 'Д')) {
			System.out.println("Мне нравятся девочки");
		} else if ((a == 'м')|(a == 'М')) {
			System.out.println("Мне нравятся мальчики");
		} else {
			System.out.println("Что вы такое?!");
		}
		
				
	}
}
