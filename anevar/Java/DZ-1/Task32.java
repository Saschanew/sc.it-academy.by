package dz1;

import java.util.Scanner;

public class Task32 {

	public static void main(String[] args) {
		//  Текущее показание электронных часов: m ч (0 ≤ m ≤23) п мин (0 ≤ п ≤59) к с (0 ≤ k ≤59). 
		// Какое время будут показывать часы через р ч q мин r с? 
		int m=0,n=0,k=0;
		int p=0,q=0,r=0;
		
		System.out.println("Введите время через пробел");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		if (sc.hasNextInt()) {
			m=sc.nextInt();
			n=sc.nextInt();
			k=sc.nextInt();
		}
		
		System.out.println("Введите добавочное время через пробел");
		
		if (sc.hasNextInt()) {
			p=sc.nextInt();
			q=sc.nextInt();
			r=sc.nextInt();
		}
		
		int second=m*3600+n*60+k;
		int secondPlus=p*3600+q*60+r;
		
		int secondTotal = second+secondPlus;
		
		int m2=secondTotal/3600%24;
		int n2=(secondTotal-m2*3600)/60%60;
		int k2=(secondTotal-m2*3600-n2*60)%60;
		
		System.out.println("Новое ыремя: "+m2+"часов "+n2+"минут "+k2+"секунд");
		
	}

}
