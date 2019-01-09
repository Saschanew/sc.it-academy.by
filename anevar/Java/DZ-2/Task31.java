package by.pvt.java.dz2;

import java.util.Scanner;

public class Task31 {

	public static void main(String[] args) {
		// 31. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. 
		// Определить, пройдет ли кирпич через отверстие. 
		System.out.println("Введите три параметра кирпича");
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		double x=sc.nextDouble(); double y=sc.nextDouble(); double z=sc.nextDouble(); 
		
		controlKirpich(x, y, z);
		
	}
	public static void controlKirpich (double x, double y, double z){
		double a = 5, b = 4;
		
		if ((x<a && y<b)  || (y<a && x<b) || (z<a && x<b) || (x<a && z<b) 
			|| (y<a && z<b) || (z<a && y<b)){
			System.out.println("кирпичь пройдет");
		} else {
			System.out.println("кирпичь не пройдет");
		}
		
	}
}
