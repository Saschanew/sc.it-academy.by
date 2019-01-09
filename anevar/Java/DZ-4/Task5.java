package by.pvt.dz4.start;

public class Task5 {

	public static void main(String[] args) {
		// Дана последовательность натуральных чисел а1 , а2 ,..., ап. 
		// Создать массив из четных чисел этой последовательности. Если таких чисел нет, 
		// то вывести сообщение об этом факте. 

		int n = 0;

		System.out.println("Задайте длину массива");

		n = Helper.readInt();

		int[] a = new int[n];

		System.out.println("Заполните массив " + n + " числами через ентер");

		for (int i = 0; i < a.length; i++) {
			a[i] = Helper.readInt();
			
		}
		
		int count0 = 0;
		int[] count00;

		for (int i : a) {

			if (i%2==0) {
				count0++;
			}
		}
		
		if (count0==0) {
			System.out.println("четных чисел нет");
		}else{
		
		count00 = new int [count0];
		    int i=0;	
			for (int j = 0; j < a.length; j++) {
				
				if (a[j]%2== 0) {
					
					count00[i]=a[j];
					i++;
				}
			}
		
		System.out.println("Получился массив четных чисел: ");
		for (int y = 0; y < count00.length; y++) {
			System.out.println(count00[y]);
		}
		}
	}

}
