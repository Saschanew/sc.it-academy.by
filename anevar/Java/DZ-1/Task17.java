package dz1;

import java.util.Scanner;

public class Task17 {

	public static void main(String[] args) {
		// Даны два числа. Найти среднее арифметическое кубов этих чисел 
		// и среднее геометрическое модулей этих чисел. 
		
double a,b;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите первое число:");
		a=sc.nextDouble();
		System.out.println("Введите второе число:");
		b=sc.nextDouble();
		sc.close();
		
		System.out.println("Среднее арифметическое кубов: "+((Math.pow(a, 3)+Math.pow(b, 3))/2));
		System.out.println("Среднее геометрическое модулей: "+(Math.sqrt(Math.abs(a)*Math.abs(b))));
	}

}
