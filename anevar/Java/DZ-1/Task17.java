package dz1;

import java.util.Scanner;

public class Task17 {

	public static void main(String[] args) {
		// ���� ��� �����. ����� ������� �������������� ����� ���� ����� 
		// � ������� �������������� ������� ���� �����. 
		
double a,b;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������� ������ �����:");
		a=sc.nextDouble();
		System.out.println("������� ������ �����:");
		b=sc.nextDouble();
		sc.close();
		
		System.out.println("������� �������������� �����: "+((Math.pow(a, 3)+Math.pow(b, 3))/2));
		System.out.println("������� �������������� �������: "+(Math.sqrt(Math.abs(a)*Math.abs(b))));
	}

}
