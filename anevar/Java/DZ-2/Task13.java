package by.pvt.java.dz2;

import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {
		// Даны две точки А(х1, у1) и В(х2, у2). Составить алгоритм, 
		// определяющий, которая из точек находится ближе к началу координат. 
		double x1, y1, x2, y2;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите x1");

		while (!sc.hasNextDouble()) {
			System.out.println("Это не число!");
			sc.next();
		}

		x1 = sc.nextDouble();

		System.out.println("Введите y1");
		
		while (!sc.hasNextDouble()) {
			System.out.println("Это не число!");
			sc.next();
		}
		
		y1 = sc.nextDouble();
		
		System.out.println("Введите x2");
		
		while (!sc.hasNextDouble()) {
			System.out.println("Это не число!");
			sc.next();
		}
		
		x2 = sc.nextDouble();
		
		System.out.println("Введите y2");
		
		while (!sc.hasNextDouble()) {
			System.out.println("Это не число!");
			sc.next();
		}
		
		y2 = sc.nextDouble();
		
		if (Math.sqrt(Math.pow(x1, 2)+Math.pow(y1, 2))>Math.sqrt(Math.pow(x2, 2)+Math.pow(y2, 2))) {
			System.out.println("Расстояние а больше");	
		} else if(Math.sqrt(Math.pow(x1, 2)+Math.pow(y1, 2))==Math.sqrt(Math.pow(x2, 2)+Math.pow(y2, 2))){
			System.out.println("расстояния равны");
		} else {
			System.out.println("Расстояние b больше");
		}

	}

}
