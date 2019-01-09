package by.pvt.dz4.start;

public class Task9 {

	public static void main(String[] args) {
		// Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.

		int n = 0;

		System.out.println("Задайте длину массива");

		n = Helper.readInt();

		double[] a = new double[n];

		System.out.println("Заполните массив " + n + " числами через ентер");

		for (int i = 0; i < a.length; i++) {
			a[i] = Helper.readDouble();
			
		}
		
		bubbleSort(a);
		
		double min = a[0]; double max = a[a.length-1];
		
		a[0]=max;
		a[a.length-1]=min;
		
		System.out.println("Новый массив:");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
	}

	public static void bubbleSort(double[] arr) {   
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {     
				if (arr[j] > arr[j + 1]) {
					double t = arr[j];      
					arr[j] = arr[j + 1];      
					arr[j + 1] = t;     
	}    }   }  }
	
}
