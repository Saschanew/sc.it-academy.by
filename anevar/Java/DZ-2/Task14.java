package by.pvt.java.dz2;

import java.util.Scanner;

public class Task14 {

	public static void main(String[] args) {
		// Даны два угла треугольника (в градусах). 
		// Определить, существует ли такой треугольник, и если да, то будет ли он прямоугольным. 
		double a, b;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите первый угол в градусах");

		while (!sc.hasNextDouble()) {
			System.out.println("Это не число!");
			sc.next();
		}

		a = sc.nextDouble();

		System.out.println("второй угол в градусах");
		
		while (!sc.hasNextDouble()) {
			System.out.println("Это не число!");
			sc.next();
		}
		
		b = sc.nextDouble();
		
		if ((a+b)>180) {
			System.out.println("Такой треугольник не может существовать");
		} else if(a==90 || b==90 || (a+b)==90){
			System.out.println("Треугольник прямоугольный");
		} else {
			System.out.println("Треугольник не прямоугольный");
		}
	
	}

}
