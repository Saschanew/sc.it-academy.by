package dz1;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		// Составить алгоритм нахождения среднего арифметического двух чисел 
		
		double a,b;
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите первое число:");
		a=sc.nextDouble();
		System.out.println("Введите второе число:");
		b=sc.nextDouble();
		System.out.println("алгоритм нахождения среднего арифметического двух чисел: "+((a+b)/2));
		
	}

}
