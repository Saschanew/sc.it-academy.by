package by.pvt.dz4.start;

public class Task4 {

	public static void main(String[] args) {
		// Дана последовательность действительных чисел а1 а2 ,..., аn . Выяснить, будет ли она возрастающей. 

		int n = 0;

		System.out.println("Задайте длину массива");

		n = Helper.readInt();

		int[] a = new int[n];

		System.out.println("Заполните массив " + n + " числами через ентер");

		for (int i = 0; i < a.length; i++) {
			a[i] = Helper.readInt();
		}
		
		boolean rapid=false;
		
		for (int i = 0; i < a.length-1; i++) {
			if (a[i]<a[i+1]) {
				rapid=true;
			} else{
				rapid=false;
			}
		}
		
		if (rapid==true) {
			System.out.println("Последовательнось возрастающая");
		} else {
			System.out.println("Последовательнось не возрастающая");
		}
	}

}
