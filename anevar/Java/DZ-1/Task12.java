package dz1;

import static java.lang.Math.*;
import java.util.Scanner;

public class Task12 {

	public static void main(String[] args) {
		//  Вычислить расстояние между двумя точками с данными координатами (х1, у1)и (x2, у2).

		double x1=0,y1=0,x2=0,y2=0;
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("введите первые координаты:");
		if (sc.hasNextDouble()) {
			x1 = sc.nextDouble();
			y1 = sc.nextDouble();
		}
		
		System.out.println("введите вторые координаты:");
		if (sc.hasNextDouble()) {
			x2 = sc.nextDouble();
			y2 = sc.nextDouble();
		}
		System.out.println("Расстояние: "+(sqrt(pow(abs(x2)-abs(x1), 2))+
				(pow(abs(y2)-abs(y1), 2))));
		
	}

}
