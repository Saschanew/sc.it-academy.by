package by.pvt.java.dz2;

import java.util.Scanner;

public class Task15 {

	public static void main(String[] args) {
		//  Даны действительные числа х и у, не равные друг другу. 
		// Меньшее из этих двух чисел заменить половиной их суммы, а большее — их удвоенным произведением.
		double x, y;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите x число");

		while (!sc.hasNextDouble()) {
			System.out.println("Это не число!");
			sc.next();
		}

		x = sc.nextDouble();
		
		System.out.println("Введите y число");
		
		while (!sc.hasNextDouble()) {
			System.out.println("Это не число!");	
			sc.next();
		}
		
		y = sc.nextDouble();
	
			
		if (x>y) {
		   double ynew=(x+y)/2;
			x=x*y*2;
			y=ynew;
			System.out.println("х: "+x+" y: "+y);
		}else {
			double xnew=(x+y)/2;
			y=x*y*2;
			x=xnew;
			System.out.println("х: "+x+" y: "+y);
		}
		
	}

}
