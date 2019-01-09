package by.pvt.java.dz2;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		// 6. Составить программу: определения наибольшего из двух чисел а и b. 
		
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

		if (a<b) {
			System.out.println("Наибольшее число b");	
		} else if(a==b){
			System.out.println("числа равны");
		} else {
			System.out.println("Наибольшее число a");
		}

	}

}
