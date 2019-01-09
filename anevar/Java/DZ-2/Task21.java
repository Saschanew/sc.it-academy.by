package by.pvt.java.dz2;

import java.util.Scanner;

public class Task21 {

	public static void main(String[] args) {
		// Программа — льстец. На экране высвечивается вопрос «Кто ты: мальчик или девочка? 
		// Введи Д или М». В зависимости от ответа на экране должен появиться текст «Мне нравятся девочки!» 
		// или «Мне нравятся мальчики!». 
		
		System.out.println("Введите буквы д или м");
		String str = read();
		
		if (str.equals("д") || str.equals("Д")) {
			System.out.println("Мне нравятся девочки!");
		} else if (str.equals("м") || str.equals("М")) {
			System.out.println("Мне нравятся мальчики!");
		}

	}
	public static String read (){
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String str = "";
		while (!sc.hasNextLine()) {
			System.out.println("Введите буквы Д или М");
			sc.next();
		}
		str=sc.nextLine();
		return str;
	}
}
