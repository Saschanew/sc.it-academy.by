package by.pvt.dz3.start;

public class Task_28 {

	public static void main(String[] args) {
		// Написать программу, в которой вводятся два операнда Х и Y и знак
		// операции (+, –, /, *).
		// Вычислить результат Z в зависимости от знака. Предусмотреть реакции
		// на возможный неверный знак
		// операции, а также на ввод Y=0 при делении. Организовать возможность
		// многократных вычислений без
		// перезагрузки программа (т.е. построить цикл). В качестве символа
		// прекращения вычислений принять ‘0’
		double x,y,z=0;
		char operator;
		
		do {
			System.out.println("Введите первое число: ");
			x = Helper.readDouble();
			
			System.out.println("Задайте второе число: ");
			y = Helper.readDouble();
						
			System.out.println("Введите оператор +,-,*,/: или ноль для прекращения");
			operator = Helper.readChar();
			
			if (operator == '/' && y == 0) {
				System.out.println("Нельзя делить на ноль!");
				continue;
			}
			
			if (operator == '0') {
				System.out.println("Программа закончена. Последний результат z= "+z);
				break;
			}
			if (operator != '0' && operator != '+' && operator != '-' && operator != '*' && operator != '/') {
				System.out.println("Невозможный оператор!");
				continue;
			}

			switch (operator) {
			case ('+'):
				z = Helper.summ(x, y);
			    System.out.printf("Результат: %.2f %n", +z);
				break;
			case ('-'):
				z = Helper.minus(x, y);
			    System.out.printf("Результат: %.2f %n", +z);
				break;
			case ('*'):
				z = Helper.multipl(x, y);
				System.out.printf("Результат: %.2f %n", +z);
				break;
			case ('/'):
				z = Helper.del(x, y);
			 	System.out.printf("Результат: %.2f %n", +z);
				break;
			}
		} while (operator != '0');

		
	}

}
