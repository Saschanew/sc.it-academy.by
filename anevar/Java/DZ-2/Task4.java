package by.pvt.java.dz2;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		// 4. Составить программу: равны ли два числа а и b?

		double a, b;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите первое число");

		while (!sc.hasNextDouble()) {
			System.out.println("Это не число!");
			sc.next();
		}

		a = sc.nextDouble();

		System.out.println("Введите второе число");
		
		while (!sc.hasNextDouble()) {
			System.out.println("Это не число!");
			sc.next();
		}
		
		b = sc.nextDouble();

		if (a == b) {
			System.out.println("числа равны");
		} else {
			System.out.println("числа не равны");
		} 

	}

}
