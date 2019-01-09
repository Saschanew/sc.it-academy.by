package dz1;

import java.util.Scanner;

public class Task35 {

	public static void main(String[] args) {
		// 35. Даны натуральные числа М и N. Вывести старшую цифру дробной части
		// и
		// младшую цифру целой части числа M/N.
		int m = 0, n = 0;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите два числа");
		if (sc.hasNextInt()) {
			m = sc.nextInt();
			n = sc.nextInt();
		}

		double a = (double) m / (double) n;
		System.out.println("Получилось число: "+a);
		int cel = (int) a;
		double drob = a - cel;
		
		char[] chStr1 = (String.valueOf(cel).toCharArray());
		int[] mas1 = new int[chStr1.length];

		for (int i = 0; i < chStr1.length; i++) {
			mas1[i] = Integer.parseInt(chStr1[i] + "");
		}
		
		int min;
		min=mas1[0];
		for (int c : mas1) {
			if (c<min) {
				min=c;
			}
		}
		
		char[] chStr2 = (String.valueOf(drob).split("\\.")[1]).toCharArray();
		int[] mas2 = new int[chStr2.length];

		for (int i = 0; i < chStr2.length; i++) {
			mas2[i] = Integer.parseInt(chStr2[i] + "");
		}

		int max = 0;

		for (int c : mas2) {
			if (c>max) {
				max=c;
			}
		}
		System.out.println("Минимальное значение целой части: "+min
				+" Максимальное значение дробной: "+max);
	}

}
