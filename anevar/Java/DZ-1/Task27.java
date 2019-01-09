package dz1;

import java.util.Scanner;

public class Task27 {

	public static void main(String[] args) {
		// Дано значение a. Не используя никаких функций и никаких операций, 
		// кроме умножения, получить значение а8 за три операции и  а10 за четыре операции. 

		int a=0; int a2,a4;
		
		System.out.println("Введите число");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		if (sc.hasNextInt()) {
			a=sc.nextInt();
		}
		
		a2=a*a;
		a4=a2*a2;
		
		System.out.println(" a8: "+a4*a4+" a10: "+a4*a4*a2);
		
	}

}
