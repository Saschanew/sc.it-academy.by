package by.pvt.dz3.start;

import java.util.Random;

public class Task31 {

	public static void main(String[] args) {
		// Компьютер генерирует пять чисел в диапазоне от 1 до 15 включительно.
		// Человек пытается их угадать. Программа должна выводить угаданные и
		// неугаданные числа из тех,
		// что сгенерировала программа, а также ошибочные числа пользователя.
		System.out.println("Введите пять чисел от 1 до 15 через enter");
		
		int[] userNumbers = new int[5];
		
		for (int i : userNumbers) {
			userNumbers[i]=(int)Helper.readInt();
		}
		
		int[] mas = new int[5];
		
		System.out.println("Случайные числа:");
		createRandom(mas);

		for (int i = 0; i < mas.length; i++) {
			System.out.println(mas[i]);
		}
		
		compare(userNumbers, mas);

	}

	public static int[] createRandom(int[] mas) {
		Random random = new Random();

		for (int i = 0; i < mas.length; i++) {
			int x = random.nextInt(15)+1;
			mas[i] = x;
		}

		return mas;

	}
	
	public static void compare(int[]x,int[]y){	
		boolean yes = false;
		for (int i : x) {
			for (int j : y) {
				if (i == j) {
					System.out.println("Совпадающее число: " + i);
					yes=true;
			}
			}
		}
		if (yes==false) {
			System.out.println("Нет совпадающих чисел");
		}
	}
		
}
