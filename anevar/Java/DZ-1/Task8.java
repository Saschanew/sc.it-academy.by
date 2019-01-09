package dz1;

import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		
		double a,b,c, rez;
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите первое число:");
		a=sc.nextDouble();
		System.out.println("Введите второе число:");
		b=sc.nextDouble();
		System.out.println("Введите третье число:");
		c=sc.nextDouble();
		
		double temp;   
		temp = 2*a;   
		if (temp != 0) {    
		rez = (b+Math.sqrt(Math.pow(b,2)+4*a*c))/2*a-(Math.pow(a,3)*c)+
				Math.pow(b,-2);   
		} else {    
		System.out.println("Знаменатель равен нулю.");    
		rez = Double.NaN;   }
		
		System.out.println("Результат: "+rez);
		
		

	}

}
