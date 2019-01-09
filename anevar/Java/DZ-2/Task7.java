package by.pvt.java.dz2;

import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		// 7. Составить программу нахождения модуля выражения a*x*x + b*x + c 
		// при заданных значениях a, b, c и х 
		
		double a, b, c, x;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите a число");

		while (!sc.hasNextDouble()) {
			System.out.println("Это не число!");
			sc.next();
		}

		a = sc.nextDouble();

		System.out.println("Введите b число");
		
		while (!sc.hasNextDouble()) {
			System.out.println("Это не число!");
			sc.next();
		}
		
		b = sc.nextDouble();
		
		System.out.println("Введите c число");
		
		while (!sc.hasNextDouble()) {
			System.out.println("Это не число!");
			sc.next();
		}
		
		c = sc.nextDouble();
		
		System.out.println("Введите x число");
		
		while (!sc.hasNextDouble()) {
			System.out.println("Это не число!");
			sc.next();
		}
		
		x = sc.nextDouble();
		
		System.out.println("Модуль выражения: "+Math.abs(a*x*x + b*x + c));

	}

}
