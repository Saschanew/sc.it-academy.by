package dz1;

import static java.lang.Math.*;
import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {
		//  Заданы координаты трех вершин треугольника  
		// (х1 у2),(х2, у2) ),(х3, у3). Найти его периметр и площадь.
		
double x1=0,y1=0,x2=0,y2=0,x3=0,y3=0;
		
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
		System.out.println("введите третьи координаты:");
		if (sc.hasNextDouble()) {
			x3 = sc.nextDouble();
			y3 = sc.nextDouble();
		}
	
		double site_12=(sqrt((pow(abs(x2)-abs(x1), 2))+
				(pow(abs(y2)-abs(y1), 2))));
		double site_13=(sqrt((pow(abs(x3)-abs(x1), 2))+
				(pow(abs(y3)-abs(y1), 2))));
		double site_23=(sqrt((pow(abs(x3)-abs(x2), 2))+
				(pow(abs(y3)-abs(y2), 2))));
		
		double perimetr = site_12+site_13+site_23;
	
		System.out.println("Периметр: "+perimetr+
				" Площадь: "+sqrt(perimetr*(perimetr-site_12)*(perimetr-site_13)*(perimetr-site_23)));
	}

}
