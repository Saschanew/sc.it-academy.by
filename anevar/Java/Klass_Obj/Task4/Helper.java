package by.pvt.klass.start.Task4;

import java.util.Scanner;

public class Helper {

	static double readDouble() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		double x = 0;
		while (!sc.hasNextDouble()) {
			System.out.println("Введите число");
			sc.next();
		}
		x = sc.nextDouble();
		return x;
	}
	
	static int readInt() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int x = 0;
		while (!sc.hasNextInt()) {
			System.out.println("Введите число");
			sc.next();
		}
		x = sc.nextInt();
		return x;
	}

	public static char readChar() {
		char ret = ' ';
		String temp;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		temp = sc.nextLine();
		ret = temp.charAt(0);
		return ret;
	}

	public static String readString() {
		String num = "";
		@SuppressWarnings({ "resource" })
		Scanner sc = new Scanner(System.in);

		if (sc.hasNextLine()) {
			num = sc.nextLine();

		}
		return num;
	}

	static double summ(double numb1, double numb2) {

		numb1 += numb2;
		return numb1;
	}

	static double minus(double numb1, double numb2) {

		numb1 -= numb2;
		return numb1;
	}

	static double multipl(double numb1, double numb2) {

		numb1 *= numb2;
		return numb1;
	}

	static double del(double numb1, double numb2) {

		numb1 /= numb2;
		return numb1;
	}

}
