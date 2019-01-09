package by.pvt.dz4.start;

public class Task1 {

	public static void main(String[] args) {
		//  В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К. 
		
		int n=0;  int k;		
		
		System.out.println("Задайте длину массива");
		
		n=Helper.readInt();
		
		int[] a = new int [n];
		
		System.out.println("Заполните массив "+n+" натуральными числами через ентер");
		
		for (int i = 0; i < a.length; i++) {
			a[i]=Helper.readInt();
		}
				
		System.out.println("Введите число к");
		k=Helper.readInt();
		
		int sum=0;
				
		for (int i : a) {
			
			if(i%k==0){
				sum+=i;
			}
			
		}
		
		System.out.println("Сумма чисел без остатка делящихся на "+k+" равна: "+sum);
	}

}
