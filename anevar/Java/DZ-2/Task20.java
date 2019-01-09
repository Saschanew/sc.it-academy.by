package by.pvt.java.dz2;

import java.util.Scanner;

public class Task20 {

	public static void main(String[] args) {
		// 20. Определить, делителем каких чисел а, b, с является число k. 
		int a, b, c, k;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите a");

		while (!sc.hasNextDouble()) {
			System.out.println("Это не число!");
			sc.next();
		}

		a = sc.nextInt();

		System.out.println("Введите b");
		
		while (!sc.hasNextDouble()) {
			System.out.println("Это не число!");
			sc.next();
		}
		
		b = sc.nextInt();
		
		System.out.println("Введите c");
		
		while (!sc.hasNextDouble()) {
			System.out.println("Это не число!");
			sc.next();
		}
		
		c = sc.nextInt();
		
		System.out.println("Введите k");
		
		while (!sc.hasNextDouble()) {
			System.out.println("Это не число!");
			sc.next();
		}
		
		k = sc.nextInt();		
		
        int [] numbers = new int [3];
		
		numbers[0]=a; numbers[1]=b; numbers[2]=c;
		int counter = 0;
		for (int d : numbers) {
			
			if (((double)d/k)%1==0) {
				System.out.println("k является делителем для числа: "+numbers[counter]);
			}
			counter++;
			
		}
	}

}
