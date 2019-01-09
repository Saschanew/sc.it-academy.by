package dz1;

import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {
		
		double a,b,c,d, rez;
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите первое число:");
		a=sc.nextDouble();
		System.out.println("Введите второе число:");
		b=sc.nextDouble();
		System.out.println("Введите третье число:");
		c=sc.nextDouble();
		System.out.println("Введите четвертое число:");
		d=sc.nextDouble();
		
		if (c != 0 && d !=0) {    
			rez = ((a/c)*(b/d))-((a*b-c)/c*d);   
		} else {    
		System.out.println("Знаменатель равен нулю.");    
		rez = Double.NaN;   
		}
			
		System.out.println("Результат: "+rez);
		

	}

}
