package dz1;

import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		// Дан прямоугольник, ширина которого в два раза меньше длины. Найти площадь прямоугольника
		double dlina;
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите длину:");
		dlina=sc.nextDouble();
		System.out.println("площадь прямоугольника: "+(dlina*dlina/2));
		
	}

}
