package dz1;

import static java.lang.Math.*;
import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		
		double x,y, rez;
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите первое число:");
		x=sc.nextDouble();
		System.out.println("Введите второе число:");
		y=sc.nextDouble();
		
		if (cos(x) != 0 && cos(y) !=0) {    
			rez = ((sin(x)+sin(y))/(sin(x)-sin(y)))
					*tan(x*y);   
		} else {    
		System.out.println("Знаменатель равен нулю.");    
		rez = Double.NaN;   
		}
			
		System.out.println("Результат: "+rez);		

	}

}
