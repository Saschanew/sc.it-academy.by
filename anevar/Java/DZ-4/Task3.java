package by.pvt.dz4.start;

public class Task3 {

	public static void main(String[] args) {
		//  Дана последовательность целых чисел а1 а2,..., аn . Выяснить, 
		// какое число встречается раньше - положительное или отрицательное. 

		int n = 0;

		System.out.println("Задайте длину массива");

		n = Helper.readInt();

		int[] a = new int[n];

		System.out.println("Заполните массив " + n + " числами через ентер");

		for (int i = 0; i < a.length; i++) {
			a[i] = Helper.readInt();
		}
		
		if (a[0]>=0) {
			System.out.println("Первое число положительное");
		} else {
			System.out.println("Первое число отрицательное");
		}
		
	}

}
