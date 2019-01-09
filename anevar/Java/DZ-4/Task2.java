package by.pvt.dz4.start;

public class Task2 {

	public static void main(String[] args) {
		// В целочисленной последовательности есть нулевые элементы. Создать
		// массив из номеров этих элементов.

		int n = 0;

		System.out.println("Задайте длину массива");

		n = Helper.readInt();

		int[] a = new int[n];

		System.out.println("Заполните массив " + n + " натуральными числами через ентер");

		for (int i = 0; i < a.length; i++) {
			a[i] = Helper.readInt();
		}

		int count0 = 0;
		int[] count00;

		for (int i : a) {

			if (i == 0) {
				count0++;
			}
		}
		
		count00 = new int [count0];
		    int i=0;	
			for (int j = 0; j < a.length; j++) {
				
				if (a[j] == 0) {
					
					count00[i]=j;
					i++;
				}
			}
		
		System.out.println("Получился массив: ");
		for (int y = 0; y < count00.length; y++) {
			System.out.println(count00[y]);
		}
		
	}

}
