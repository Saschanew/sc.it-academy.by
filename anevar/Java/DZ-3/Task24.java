package by.pvt.dz3.start;

import java.util.Scanner;

public class Task24 {

	public static void main(String[] args) {
		// Вводится натуральное число. Найти сумму четных цифр, входящих в его
		// состав.
		// Преобразовать его в другое число, цифры которого будут следовать в
		// обратном порядке
		// по сравнению с введенным числом.

		System.out.println("Введите число");

		String num = "";
	
		@SuppressWarnings({ "resource" })
		Scanner sc = new Scanner(System.in);

		if (sc.hasNextLine()) {
			num = sc.nextLine();

		}

		StringBuffer buffer = new StringBuffer(num);

		num = null;
		int sum = 0;

		char[] ch = new char[buffer.length()];

		for (int i = 0; i < ch.length; i++) {
			ch[i] = buffer.charAt(i);
		}

		for (char c : ch) {
			if (Integer.valueOf(String.valueOf(c)) % 2 == 0) {
				sum = sum + Integer.valueOf(String.valueOf(c));
			}
		}

		System.out.println("Сумма четных: " + sum);

		StringBuffer bufferReverse = buffer.reverse();

		char[] chReverse = new char[bufferReverse.length()];

		for (int i = 0; i < chReverse.length; i++) {
			chReverse[i] = bufferReverse.charAt(i);
		}

		System.out.println("Обратное число: " + Integer.valueOf(String.valueOf(chReverse)));

	}

}
