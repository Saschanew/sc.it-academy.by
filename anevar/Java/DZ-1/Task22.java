package dz1;

import java.util.Scanner;

public class Task22 {

	public static void main(String[] args) {
		// Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. 
		// Вывести данное значение длительности в часах, минутах и секундах в следующей форме: ННч ММмин SSc. 

		int second=0;
		
		System.out.println("Введите секунды");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		if (sc.hasNextInt()) {
			second=sc.nextInt();
		}
		
		System.out.println(second/3600+"ч "+ second/60+"мин "+second%60+"сек ");
		
	}

}
