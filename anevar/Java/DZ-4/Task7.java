package by.pvt.dz4.start;

public class Task7 {

	public static void main(String[] args) {
		// Дана последовательность действительных чисел а1 ,а2 ,..., ап. 
		// Заменить все ее члены, большие данного Z, этим числом. Подсчитать количество замен. 
		
		int n = 0;

		System.out.println("Задайте длину массива");

		n = Helper.readInt();

		double[] a = new double[n];

		System.out.println("Заполните массив " + n + " числами через ентер");

		for (int i = 0; i < a.length; i++) {
			a[i] = Helper.readDouble();
		}
		
		System.out.println("Задайте число Z");
		
		double z=Helper.readDouble();
		
		int counter=0; 
		
		for (int i = 0; i < a.length; i++) {
			if (a[i]>z) {
				a[i]=z;
				counter++;
			}
		}
		System.out.println("Новый массив:");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("Замена "+counter+" раз");
		
	}

}
