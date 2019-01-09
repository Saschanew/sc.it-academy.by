package by.pvt.java.dz2;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		// Составить программу сравнения введенного числа а и цифры 3. 
		// Вывести на экран слово «yes», если число а меньше 3; если больше, то вывести слово «no». 

		double a;
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Введите число");	
			
		while (!sc.hasNextDouble()) {
	        System.out.println("Это не число!");
	        sc.next(); 
	    }			
		
		 a=sc.nextDouble();
			if (a<3) {
				System.out.println("yes");	
			} else if(a==3){
				System.out.println("Непонятно");
			} else {
				System.out.println("no");
			}
	
		
	}

}
