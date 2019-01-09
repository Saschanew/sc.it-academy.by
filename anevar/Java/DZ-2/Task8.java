package by.pvt.java.dz2;

import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		// 8. Составить программу нахождения наименьшего из квадратов двух чисел а и b.
		
		double a, b;

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

		if (Math.pow(a, 2)<Math.pow(b, 2)) {
			System.out.println("Наименьшмй квадрат у а");	
		} else if(Math.pow(a, 2)==Math.pow(b, 2)){
			System.out.println("квадраты равны равны");
		} else {
			System.out.println("Наименьшмй квадрат у b");
		}

	}

}
