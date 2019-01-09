package by.pvt.java.dz2;

import java.util.Scanner;

public class Task18 {

	public static void main(String[] args) {
		// 18. Подсчитать количество отрицательных среди чисел а, b, с. 
		
		double a, b, c;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите a");

		while (!sc.hasNextDouble()) {
			System.out.println("Это не число!");
			sc.next();
		}

		a = sc.nextDouble();

		System.out.println("Введите b");
		
		while (!sc.hasNextDouble()) {
			System.out.println("Это не число!");
			sc.next();
		}
		
		b = sc.nextDouble();
		
		System.out.println("Введите c");
		
		while (!sc.hasNextDouble()) {
			System.out.println("Это не число!");
			sc.next();
		}
		
		c = sc.nextDouble();
		
		double [] numbers = new double [3];
		
		numbers[0]=a; numbers[1]=b; numbers[2]=c;

		int counter=0;
		
		for (double d : numbers) {
			if (d<0) {
				counter++;
			} 
		}
		System.out.println("Количество отрицательных:"+counter);
	}

}
