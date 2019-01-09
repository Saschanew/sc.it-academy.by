package by.pvt.java.dz2;

import java.util.Scanner;

public class Task12 {

	public static void main(String[] args) {
		// Даны три действительных числа. Возвести в квадрат те из них, значения которых неотрицательны, 
		// и в четвертую степень — отрицательные. 
		double a, b, c;

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
		
		double [] numbers = new double[3];
		numbers[0]=a; numbers[1]=b; numbers[2]=c;
		
		for (double d : numbers) {
			if (d>=0) {				
				System.out.println(Math.pow(d, 2));
			} else {				
				System.out.println(Math.pow(d, 4));
			}
		}
		
	}

}
