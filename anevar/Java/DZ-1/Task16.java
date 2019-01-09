package dz1;

import java.util.Scanner;

public class Task16 {

	public static void main(String[] args) {
		// ����� ������������ ���� ��������� ��������������� �����. 
		
        int number;
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� �������������� �����:");
		number=sc.nextInt();
	
		int number1=Math.abs(number/1000);
		System.out.println("����� 1: "+number1);
		int number2=(number-(Math.abs(number/1000)*1000))/100;
		System.out.println("����� 2: "+number2);
		int number3=(number-number1*1000-number2*100)/10;
		System.out.println("����� 3: "+number3);
		int number4=number-number1*1000-number2*100-number3*10;		
		System.out.println("����� 4: "+number4);

	}

}
