package dz1;

import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
		//   Вычислить периметр и площадь прямоугольного треугольника по длинам а и b  двух катетов. 

		double x,y;
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите первый катет:");
		x=sc.nextDouble();
		System.out.println("Введите второй катет:");
		y=sc.nextDouble();
		System.out.println("Периметр: "+(x+y+(Math.sqrt(Math.pow(x,2)+Math.pow(y,2))))+
				" Площадь: "+(x*y/2));
		
	}

}
