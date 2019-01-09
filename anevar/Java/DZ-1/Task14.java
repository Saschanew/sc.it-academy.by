package dz1;

import java.util.Scanner;

public class Task14 {

	public static void main(String[] args) {
		// Вычислить длину окружности и площадь круга одного и того же заданного радиуса R. 
        double radius;
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� ������:");
		radius=sc.nextDouble();
		System.out.println("����� ����������: "+(2*Math.PI*radius)+" �������: "+Math.PI*Math.pow(radius, 2));
		
	}

}