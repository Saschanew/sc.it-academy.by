package by.pvt.dz4.start;

public class Task8 {

	public static void main(String[] args) {
		// Дан массив действительных чисел, размерность которого N. 
		// Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов. 

		int n = 0;

		System.out.println("Задайте длину массива");

		n = Helper.readInt();

		double[] a = new double[n];

		System.out.println("Заполните массив " + n + " числами через ентер");

		for (int i = 0; i < a.length; i++) {
			a[i] = Helper.readDouble();
		}
		
		int counterPlus=0; int counterMinus=0; int counter0=0;
		
		for (int i = 0; i < a.length; i++) {
			if (a[i]>0) counterPlus++; 
			if (a[i]<0) counterMinus++; 
			if (a[i]==0) counter0++; 
		}
		
		System.out.println("В массиве "+counterPlus+" положительных элемента, "+
				counterMinus+" отрицательных элемента, "+
				counter0+" нулевых элемента");
		
	}

}
