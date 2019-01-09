package dz1;

import java.util.Scanner;

public class Task33 {

	public static void main(String[] args) {
		// Ввести любой символ и определить его порядковый номер, а также указать 
		// предыдущий и последующий символы. 
		
		char[] simvol=new char[5];
		
		System.out.println("Введите символы через пробел");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		if (sc.hasNext()) {
			String a=sc.next();
			simvol=a.toCharArray();
		}
		
		System.out.println("Введите символ, порядковый номер которого хотите узнать");
	
		String sim = sc.next();
		System.out.println(sim);
		for (int i = 0; i < simvol.length; i++) {
			if (String.valueOf(simvol[i]).equals(sim)) {
				System.out.println("Порядковый номер "+(i+1));
			}
		}
	}

}
