package by.pvt.java.dz2;

import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {
		// 9. Составить программу, которая определит по трем введенным сторонам, 
		// является ли данный треугольник равносторонним.

		double a, b, c;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите a число");

		while (!sc.hasNextDouble() && sc.nextDouble()>0) {
			System.out.println("Это не число! или оно отрицательное");
			sc.next();
		}

		a = sc.nextDouble();

		System.out.println("Введите b число");
		
		while (!sc.hasNextDouble() && sc.nextDouble()>0) {
			System.out.println("Это не число! или оно отрицательное");
			sc.next();
		}
		
		b = sc.nextDouble();
		
		System.out.println("Введите c число");
		
		while (!sc.hasNextDouble() && sc.nextDouble()>0) {
			System.out.println("Это не число! или оно отрицательное");
			sc.next();
		}
		
		c = sc.nextDouble();
		
		if(a==b && a==c && b==c) {
			System.out.println("Прямоугольник равносторонний");
		} else {
			System.out.println("Прямоугольник не равносторонний");
		}
		
	}

}
