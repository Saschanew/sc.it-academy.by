package by.pvt.dz4.start;

public class Task6 {

	public static void main(String[] args) {
		//  Дана последовательность чисел а1 ,а2 ,..., ап. 
		// Указать наименьшую длину числовой оси, содержащую все эти числа. 

		int n = 0;

		System.out.println("Задайте длину массива");

		n = Helper.readInt();

		double[] a = new double[n];

		System.out.println("Заполните массив " + n + " числами через ентер");

		for (int i = 0; i < a.length; i++) {
			a[i] = Helper.readDouble();
		}
		
		double min=a[0];
		for (int j = 0; j < a.length; j++) {
			
			if (a[j]<min) {
				min=a[j];
			}
		}
		
		double max=a[0];
		for (int j = 0; j < a.length; j++) {
			
			if (a[j]>max) {
				max=a[j];
			}
		}
		
		System.out.println("Длина часовой оси: "+(max-min));
		
		}
		
}
