package by.pvt.dz3.start;

public class Task_29 {

	public static void main(String[] args) {
		// Даны два числа. Определить цифры, входящие в запись как первого так и второго числа. 
		
		double x,y;
				
		System.out.println("Введите первое число: ");
		x = Helper.readDouble();
		
		System.out.println("Задайте второе число: ");
		y = Helper.readDouble();
		
		String num1 = String.valueOf(x);
		String num2 = String.valueOf(y);
		StringBuffer buffer1 = new StringBuffer(num1);
		StringBuffer buffer2 = new StringBuffer(num2);
		num1 = null;
		num2 = null;
		
		char[] ch1 = new char[buffer1.length()];
		char[] ch2 = new char[buffer2.length()];

		for (int i = 0; i < ch1.length; i++) {
			ch1[i] = buffer1.charAt(i);
		}
		
		for (int i = 0; i < ch2.length; i++) {
			ch2[i] = buffer2.charAt(i);
		}
		
		for (char c : ch2) {
			for (char c2 : ch1) {
				if(c2 == c){
					if(c2 == '.' || c == '.'){
						continue;
					}
					System.out.println("Одинаковая цифра: "+c);
				}
			}
		}

	}

}
