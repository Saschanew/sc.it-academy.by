package by.pvt.dz4.start;

public class Task10 {

	public static void main(String[] args) {
		// Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i. 
		
		int n = 0;

		System.out.println("Задайте длину массива");

		n = Helper.readInt();

		int[] a = new int[n];

		System.out.println("Заполните массив " + n + " числами через ентер");

		for (int i = 0; i < a.length; i++) {
			a[i] = Helper.readInt();
		}
		
		for (int i = 0; i < a.length; i++) {
			if (a[i]>i) {
				System.out.println(a[i]);				
			}
		}

	}

}
